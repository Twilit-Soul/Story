package story;

import java.util.*;
import java.util.concurrent.ExecutorService;

/**
 * Prompts user. Processes input.
 * Created by Mitchell on 9/24/2015.
 */
public abstract class Prompt {
    final private String prompt;
    protected final List<String> responses;
    private Scanner scanner;
    private ExecutorService executorService;
    HashSet<Prompt> activePrompts;

    protected Prompt(String prompt, String... responses) {
        this.prompt = prompt;
        this.responses = Arrays.asList(responses);
    }

    public void execute(Scanner scanner, ExecutorService executorService, HashSet<Prompt> activePrompts) {
        this.scanner = scanner;
        this.executorService = executorService;
        this.activePrompts = activePrompts;
        prompt();
        processAnswer();
        activePrompts.remove(this);
        Thread.currentThread().interrupt();
    }

    private void prompt() {
        System.out.println(prompt+"\n");
        for (int i = 0; i < responses.size(); i++) {
            System.out.println((i +1)+") "+ responses.get(i));
        }
    }

    protected abstract void processAnswer();

    protected int getAnswer() {
       try {
           return Integer.parseInt(scanner.nextLine());
       } catch (NumberFormatException e) {
           //Just return 0 at the bottom
       } catch (NoSuchElementException e) {
           //We done here
           System.exit(0);
       }
        return 0;
    }

    protected void handleInvalidAnswer() {
        System.out.println("Pretty sure that wasn't a choice.");
        processAnswer();
    }

    /**
     * This will print out the message, and then restate the prompt to the user.
     */
    protected void oneOff(String message) {
        System.out.println(message);
        processAnswer();
    }

    /**
     * I don't want the stack trace extending forever, so each prompt gets its own tiny thread.
     * Each prompt will live in its thread, kick off a new prompt if appropriate, and die off.
     */
    protected void kickOff(Prompt toKick) {
        activePrompts.add(toKick);
        executorService.execute(() -> toKick.execute(scanner, executorService, activePrompts));
    }
}
