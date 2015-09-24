package story.nodes;

import java.util.*;
import java.util.concurrent.ExecutorService;

/**
 * Prompts user. Processes input.
 * Created by Mitchell on 9/24/2015.
 */
public abstract class Node {
    final private String prompt;
    private ArrayList<String> responses;
    private Scanner scanner;
    private ExecutorService executorService;
    private HashSet<String> messagesSaidOrHeard;
    private HashSet<Node> activeNodes;
    private String lastThingSaidByPlayer = "";

    protected Node(String prompt, String... responses) {
        this.prompt = prompt;
        this.responses = new ArrayList<>(Arrays.asList(responses));
    }

    public void execute(Scanner scanner, ExecutorService executorService, HashSet<Node> activeNodes, HashSet<String> messagesSaidOrHeard) {
        this.scanner = scanner;
        this.executorService = executorService;
        this.activeNodes = activeNodes;
        this.messagesSaidOrHeard = messagesSaidOrHeard;
        promptWithResponses();
        processAnswer();
        activeNodes.remove(this);
        Thread.currentThread().interrupt();
    }

    private void promptWithResponses() {
        messagesSaidOrHeard.add(prompt);
        System.out.print("\n"+prompt);
        showResponses();
    }

    private void showResponses() {
        System.out.println("\n");
        for (int i = 0; i < responses.size(); i++) {
            System.out.println((i +1)+") "+ responses.get(i));
        }
        System.out.print("\n");
    }

    protected abstract void processAnswer();

    /**
     * Remembers the response said.
     * @return Response that was saved.
     */
    protected String saveAnswer() {
       try {
           int index = Integer.parseInt(scanner.nextLine());
           String message = responses.get(index - 1);
           lastThingSaidByPlayer = message;
           rememberMessage(message);
           return message;
       } catch (NumberFormatException e) {
           //Just return 0 at the bottom
       } catch (NoSuchElementException e) {
           //We done here
           System.exit(0);
       }
        return "";
    }

    private void rememberMessage(String message) {
        messagesSaidOrHeard.add(message);
    }

    protected void handleInvalidAnswer() {
        System.out.println("Pretty sure that wasn't a choice.");
        processAnswer();
    }

    /**
     * This will print out the message, and then restate the prompt to the user.
     */
    protected void oneOff(String output, String... replacementResponses) {
        System.out.print("\n"+output);
        responses.remove(lastThingSaidByPlayer);

        for (String response: replacementResponses) {
            if (!responses.contains(response)) {
                responses.add(response);
            }
        }

        showResponses();
        processAnswer();
    }

    /**
     * I don't want the stack trace extending forever, so each prompt gets its own tiny thread.
     * Each prompt will live in its thread, kick off a new prompt if appropriate, and die off.
     */
    protected void kickOff(Node toKick) {
        activeNodes.add(toKick);
        executorService.execute(() -> toKick.execute(scanner, executorService, activeNodes, messagesSaidOrHeard));
    }
}
