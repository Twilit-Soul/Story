package storyTeller.implementations;

import messages.Prompt;
import story.nodes.StoryRunner;
import storyTeller.iStoryTeller;

import java.util.Scanner;

/**
 * Default implementation.
 * Created by Mitchell on 9/23/2015.
 */
public class StoryTeller implements iStoryTeller {
    //Player gives name, gender
    //Player selects origin
    //Exposition given to player
    //First NPC appears, talks to player
    //Player responds, selects emotion as well
    //NPC notes their response/emotion, talks to them
    //Flow

    //worldState could be stored as part of some HashMap
    //a set of Constants or an Enum would be used to ask about the world state

    //TODO: store these somewhere special to them.
    String name = null;
    String gender = null;

    @Override
    public void initialize() {
        //Screw it. I need to get a functioning prototype to break my inertia. Then I'll scrap it into something that makes sense.
        Scanner scanner = new Scanner(System.in);

        //TODO: create prompts that allow custom-typed responses for things such as this.
        System.out.println(Prompt.PROMPT_NAME);

        name = scanner.nextLine();

        System.out.println(Prompt.PROMPT_GENDER);

        gender = scanner.nextLine();

        StoryRunner storyRunner = new StoryRunner();

        storyRunner.begin(scanner);
    }
}
