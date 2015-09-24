package main;

import storyTeller.iStoryTeller;
import storyTeller.implementations.StoryTeller;

/**
 * Kick off the program.
 * Created by Mitchell on 9/23/2015.
 */
public class Main {

    public static void main(String[] args) {
        iStoryTeller storyTeller = new StoryTeller();
        storyTeller.initialize();
    }
}
