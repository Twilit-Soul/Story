package story.nodes;

import messages.Message;
import messages.Prompt;
import messages.Response;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static messages.Prompt.*;
import static messages.Response.*;

//TODO: Find a better way to break this stuff up than I had before.
//For now, I'm just creating more story. I need to drive the story forward a bit,
//and I'll discover my needs/desires as it goes. Then I can actually implement those,
//as opposed to adding things now and realizing I don't like them later on.

/**
 * Prompts user. Processes input.
 * Created by Mitchell on 9/24/2015.
 */
public class StoryRunner {
    final private Prompt prompt;
    private ArrayList<Response> responses;
    private Scanner scanner;
    public static HashSet<Message> messagesSaidOrHeard = new HashSet<>();

    public StoryRunner() {
        this.prompt = PROMPT_ORIGIN;
        this.responses = new ArrayList<>(10);
        responses.add(RESPONSE_ORIGIN_BEDROOM);
    }

    public void begin(Scanner scanner) {
        this.scanner = scanner;
        System.out.print("\n" + prompt);
        rememberMessage(prompt);
        showResponses();
        while (!responses.isEmpty()) {
            processResponse();
        }
        scanner.close();
    }

    private void showResponses() {
        System.out.print("\n\n");
        for (int i = 0; i < responses.size(); i++) {
            System.out.print((i + 1) + ") " + responses.get(i) + "\n");
        }
    }

    private void clearExclusives(Response message) {
        responses.removeAll(message.getExclusiveWith());
    }

    private void rememberMessage(Message message) {
        messagesSaidOrHeard.add(message);
    }

    private void handleInvalidAnswer() {
        System.out.print("Pretty sure that wasn't a choice.\n");
    }

    /**
     * Note: will not add duplicates.
     */
    private void addResponses(Response[] responses) {
        for (Response response : responses) {
            if (!this.responses.contains(response) && response.conditionsMet()) {
                this.responses.add(response);
            }
        }
    }

    private void removeResponse(Response response) {
        responses.remove(response);
    }

    private void clearResponses() {
        responses.clear();
    }

    private Response getResponse() {
        try {
            int index = Integer.parseInt(scanner.nextLine());
            return responses.get(index - 1);
        } catch (NumberFormatException e) {
            //Just return 0 at the bottom
        } catch (NoSuchElementException e) {
            //We done here
            System.exit(0);
        }
        return INVALID_RESPONSE;
    }

    public void processResponse() {
        Response response = getResponse();
        rememberMessage(response);
        clearExclusives(response);
        if (response.doesClearOtherResponses()) {
            clearResponses();
        } else {
            removeResponse(response);
        }
        Prompt prompt = response.getPrompt();
        System.out.print("\n" + prompt);
        rememberMessage(prompt);
        addResponses(prompt.getResponses());
        showResponses();
    }

}
