package messages;

import story.nodes.StoryRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static messages.Prompt.*;

/**
 * Need to localize eventually.
 * Created by Mitchell on 9/24/2015.
 */
public enum Response implements Message {
    INVALID_RESPONSE("") {
        public Prompt getPrompt() {
            return NOT_REAL_MAN;
        }
    },
    RESPONSE_ORIGIN_BEDROOM("Sleeping in my bedroom.", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_AWAKENING;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU("Who are you?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_ONE_WHO_GIVES_MEANING;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM("What are you doing in my bedroom?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_ONE_WHO_INQUIRES;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG("Is something wrong with it?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_I_WISH;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING("It is kind of boring, isn't it?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_UNDERSTATEMENT;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING("I happen to like my life.") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_TOO_EASY;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_QUIETLY_DO("(Get dressed and go outside)", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_YOU_ARRIVE;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_STAY("(Don't go anywhere)") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_HE_RETURNS;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_LOOK_BESIDE("(Look beside you)") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_ALREADY_GONE;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_WAIT_WHAT("Wait, you want me to just drive off with you?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_YES_ACTUALLY;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_QUIETLY_RIDE("(Walk towards the car, and get into the back seat)", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_THANK_GOODNESS;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_YEAH_NO("Oh. Yeah, I think I'm just gonna go back inside...", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_THIS_KID_MAN;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_SHOW_ME_THEN("Show me something better, then.", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_GLADLY;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_YOU_CAN_DO_BETTER("You can do better?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_LONG_TIME;
        }
    },
    RESPONSE_ORIGIN_BEDROOM_PISS_OFF("Piss off.", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_BEDROOM_DO_NOT_EVEN;
        }
    },
    RESPONSE_ORIGIN_ALL_EXIT_WHERE_WE_GOIN("Where are we going?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_ALL_EXIT_CAME_FROM;
        }
    },
    RESPONSE_ORIGIN_ALL_EXIT_STUPID_CAR("You realize this is kidnapping?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_EXIT_ALL_WELL_YEAH;
        }
    },
    RESPONSE_ORIGIN_ALL_EXIT_SILENCE("(Finish out the ride in silence)", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_WE_THERE_YO;
        }
    },
    RESPONSE_ORIGIN_ALL_EXIT_WHY_CRYPTIC("Must you always be so vague?") {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_ALL_EXIT_QUESTIONS;
        }
    },
    RESPONSE_CHAPTER_TWO_MIGHT_AS_WELL("(Follow the stranger into the apartment)", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_ENTER_THE_LOW_BUDGET;
        }
    },
    RESPONSE_CHAPTER_TWO_I_TRIED("(Allow the stranger to lead you into the apartment)", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_ENTER_THE_LOW_BUDGET;
        }
    },
    RESPONSE_CHAPTER_TWO_COME_ONNN("(Call out to the stranger) " +
            "Are you sure this is the place? This looks shady. " +
            "I think we should head back to my place.") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_WAA_WAA;
        }
    },
    RESPONSE_CHAPTER_TWO_RUN_AWAAAAY("(Wait a moment, and take off running from the stranger)", true) {
        public Prompt getPrompt() {
            return PROMPT_ORIGIN_EXIT_CUT_THIS_OUT;
        }
    },
    RESPONSE_CHAPTER_TWO_YEAH_THIS_NOT_WEIRD_AT_ALL("(Sit down across from the stranger)", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_LET_IT_BEGIN;
        }
    },
    //TODO: actually take the name in here? Skipping for now.
    RESPONSE_CHAPTER_TWO_COME_AGAIN("You're my...my what? You're a bit young to go by \"ancestor,\" don't you think?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_WELL_YOU_SEE;
        }
    },
    RESPONSE_CHAPTER_TWO_KINDA_SHABBY("Why did we have to come here?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_BECAUSE_IT_IS_MINE;
        }
    },
    RESPONSE_CHAPTER_TWO_WTF_MAN("You have absolutely no furniture in here.") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_ITS_CALLED_SPARTAN;
        }
    },
    RESPONSE_CHAPTER_TWO_WHY_ME("What do you want with me?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_I_WANT_EVERYTHING;
        }
    },
    RESPONSE_CHAPTER_TWO_ABOUT_THAT("What happened with the uh...with the car thing, back there? What did you do?") {
        @Override
        public boolean conditionsMet() {
            return StoryRunner.messagesSaidOrHeard.contains(PROMPT_ORIGIN_BEDROOM_THIS_KID_MAN);
        }

        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_I_AM_VERY_FAST;
        }
    },
    RESPONSE_CHAPTER_TWO_TELL_ME_MORE("Gift? This seems awfully involved for a late birthday present.") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_OH_MAN;
        }
    },
    RESPONSE_CHAPTER_TWO_OH("Oh. Immortality. That is kind of hard to send through the mail.", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_BUT_REALLY;
        }
    },
    RESPONSE_CHAPTER_TWO_WHAT_THE_SHIT("WAIT! NO! OH GOD. Did you just?! WHY are you STARING at me?!", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_TOLD_YOU_SO;
        }
    },
    RESPONSE_CHAPTER_TWO_THAT_WAS_SHOCKING("(Stare in stupified silence)", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_TOLD_YOU_SO;
        }
    },
    RESPONSE_CHAPTER_TWO_I_CAN_NOT_EVEN("That...you..umm. There is a dagger in your chest.", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_TOLD_YOU_SO;
        }
    },
    RESPONSE_CHAPTER_TWO_JUST_ONE_SECOND("Okay...uh. I just need a second to deal with this, please.") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_RIGHT_OKAY;
        }
    },
    RESPONSE_CHAPTER_TWO_OKAY_SOOOO("You're immortal. Got it. So...why do you want to make me immortal, exactly?", true) {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_ITS_LIKE_THIS;
        }
    },
    RESPONSE_CHAPTER_TWO_YAY_ME_I_GUESS("But...why me?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_CHOSEN_ONE;
        }
    },
    RESPONSE_CHAPTER_TWO_OKAY_WELL("(Deep breath) Alright. Immortal ancestor somehow enters my bedroom.\n" +
            "Drives me to a creepy apartment. Stabs himself in the chest. Says he wants me to die so he can live forever.\n" +
            "That about sum it up?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_PRETTY_MUCH;
        }
    },
    RESPONSE_CHAPTER_TWO_GIMME_A_BREAK("Ha! Good one.") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_SEE_MY_SERIOUS_FACE;
        }
    },
    RESPONSE_CHAPTER_TWO_I_MEAN_I_GUESS("You serious? I got nothing better to do.") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_TOTES_MAN;
        }
    },
    RESPONSE_CHAPTER_TWO_NO_CHOICE_HUH("I don't have a choice, do I?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_MAYBE_LATER;
        }
    },
    RESPONSE_CHAPTER_TWO_BUT_JOB("What about my job? My bills?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_WELL_OBVS;
        }
    },
    RESPONSE_CHAPTER_TWO_NO_TRUST("And I'm just supposed to believe that?") {
        public Prompt getPrompt() {
            return PROMPT_CHAPTER_TWO_YES;
        }
    },
    RESPONSE_CHAPTER_TWO_UGH_FINE("Well, I don't have an option anyway. Let's go.") {
        @Override
        public boolean conditionsMet() {
            return StoryRunner.messagesSaidOrHeard.contains(RESPONSE_CHAPTER_TWO_NO_CHOICE_HUH);
        }
    },
    RESPONSE_CHAPTER_TWO_ALRIGHT_ALREADY("Alright. Let's do it, then.") {
        @Override
        public boolean conditionsMet() {
            return !StoryRunner.messagesSaidOrHeard.contains(RESPONSE_CHAPTER_TWO_NO_CHOICE_HUH);
        }
    },;

    private final String text;
    /**
     * The user can only say one of these messages.
     */
    private Set<Response> exclusiveWith = new HashSet<>();
    /**
     * If this is true, when the user says this, it will remove their previous conversation choices.
     */
    private boolean clearsOtherResponses = false;

    Response(String text) {
        this.text = text;
    }

    Response(String text, boolean clearsOtherResponses) {
        this.text = text;
        this.clearsOtherResponses = clearsOtherResponses;
    }

    /**
     * If you construct a text with specified exlusives, they will all be marked exclusive with each other.
     */
    Response(String text, Response... exclusives) {
        //This should be used somewhere. I don't recall what happened.
        this.text = text;
        addExclusives(exclusives);
    }

    private void addExclusives(Response... exclusives) {
        ArrayList<Response> exclusivesList = new ArrayList<>(Arrays.asList(exclusives));
        exclusivesList.add(this);
        for (Response exclusive : exclusives) {
            exclusive.exclusiveWith.addAll(exclusivesList);
        }
    }

    @Override
    public String toString() {
        return text;
    }

    public boolean conditionsMet() {
        return true;
    }

    public Set<Response> getExclusiveWith() {
        return exclusiveWith;
    }

    public boolean doesClearOtherResponses() {
        return clearsOtherResponses;
    }

    /**
     * When the user selects this response, this is the prompt they will be given in return.
     */
    public Prompt getPrompt() {
        return NONE;
    }
}
