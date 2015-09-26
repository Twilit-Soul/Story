package messages;

import static messages.Response.*;

/**
 * Prompts posed to the user, for them to respond to.
 * Created by Mitchell on 9/25/2015.
 */
public enum Prompt implements Message {
    NONE(""),
    NOT_REAL_MAN("Pretty sure that's not a real answer."),
    //TODO: this is not a prompt.
    PLAYER_ANCESTOR("Nyul"),
    PROMPT_NAME("What's your name?"),
    PROMPT_GENDER("Are you a he, or a she?"),
    PROMPT_ORIGIN("Where does your story begin?"),
    PROMPT_ORIGIN_BEDROOM_AWAKENING("*You wake up with your heart pounding. You don't know why you've woken up. As you look around your room, you realize there are two red eyes looking at you.\nIt's a man. He speaks.*\n" +
            "\n" +
            "\"Is this it, then? Is this your life?\"") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU, RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM, RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG};
        }
    },
    PROMPT_ORIGIN_BEDROOM_I_WISH("No. I wish there were. It might be more interesting.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING, RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING};
        }
    },
    PROMPT_ORIGIN_BEDROOM_ONE_WHO_GIVES_MEANING("The one who will give you meaning."),
    PROMPT_ORIGIN_BEDROOM_ONE_WHO_INQUIRES("Inquiring about your life, obviously."),
    PROMPT_ORIGIN_BEDROOM_TOO_EASY("Then you are too easily satisfied.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_SHOW_ME_THEN, RESPONSE_ORIGIN_BEDROOM_YOU_CAN_DO_BETTER, RESPONSE_ORIGIN_BEDROOM_PISS_OFF};
        }
    },
    PROMPT_ORIGIN_BEDROOM_UNDERSTATEMENT("That is an understatement.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_SHOW_ME_THEN, RESPONSE_ORIGIN_BEDROOM_YOU_CAN_DO_BETTER, RESPONSE_ORIGIN_BEDROOM_PISS_OFF};
        }
    },
    PROMPT_ORIGIN_BEDROOM_HE_LEAVES("\n\n*The eyes disappear. You realize you can't see his outline anymore.*"),
    PROMPT_ORIGIN_BEDROOM_ALREADY_GONE("*There is no one there.*"),
    PROMPT_ORIGIN_BEDROOM_GLADLY("That is what I have come to do. Get dressed and meet me outside." + PROMPT_ORIGIN_BEDROOM_HE_LEAVES) {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_QUIETLY_DO, RESPONSE_ORIGIN_BEDROOM_STAY};
        }
    },
    PROMPT_ORIGIN_BEDROOM_LONG_TIME("I have been. For a long time."),
    PROMPT_ORIGIN_BEDROOM_DO_NOT_EVEN("*You hear a sigh.*\n\nGet dressed. Meet me outside. I am not asking." + PROMPT_ORIGIN_BEDROOM_HE_LEAVES) {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_QUIETLY_DO, RESPONSE_ORIGIN_BEDROOM_STAY};
        }
    },
    PROMPT_ORIGIN_BEDROOM_HE_RETURNS("*You feel the air move next to you, and suddenly a powerful hand grips your arm.*\n\nGet. Up. Do as I have commanded you.\n\n*The hand releases you.*") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_BEDROOM_LOOK_BESIDE};
        }
    },
    PROMPT_ORIGIN_BEDROOM_YOU_ARRIVE("*You put some clothes on, and exit your home.*\n\nYou are so terribly slow, are you not? Come.\n\n*There is a sleek, black car in the street outside of your home. He motions towards it.*") {
        public Response[] getResponses() {
            return new Response[]{
                    RESPONSE_ORIGIN_BEDROOM_WAIT_WHAT,
                    RESPONSE_ORIGIN_BEDROOM_QUIETLY_RIDE,
                    RESPONSE_ORIGIN_BEDROOM_YEAH_NO};
        }
    },
    PROMPT_ORIGIN_BEDROOM_YES_ACTUALLY("Yes. Was that not clear? I want you to get into the vehicle."),
    PROMPT_ORIGIN_BEDROOM_THIS_KID_MAN("I understand that you do not trust me, but I will not have one of my own disrespect me so.\n\n" +
            "*Before you can react, he grabs your shoulders tightly. You suddenly find yourself next to the car, and the door is open before you're able to protest.\n" +
            "The world seems to suddenly shift itself to the right, and you realize that you are inside the vehicle with the door closed.\n" +
            "You hear him cranking up the car in the front seat.*") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_ALL_EXIT_SILENCE, RESPONSE_ORIGIN_ALL_EXIT_WHERE_WE_GOIN, RESPONSE_ORIGIN_ALL_EXIT_STUPID_CAR};
        }
    },
    PROMPT_ORIGIN_BEDROOM_THANK_GOODNESS("*As you walk in, the stranger moves to the driver side and gets in with you.*\n\n" +
            "I do appreciate your cooperation. So many of your generation do not understand what came before them.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_ALL_EXIT_SILENCE, RESPONSE_ORIGIN_ALL_EXIT_WHERE_WE_GOIN};
        }
    },
    PROMPT_ORIGIN_EXIT_ALL_WELL_YEAH("So it is."),
    PROMPT_CHAPTER_TWO_WE_THERE_YO("*You finally arrive at your destination, which appears to be...a small apartment complex, in a neighborhood halfway across town.\n" +
            "The stranger steps out of the vehicle.*\n\nCome along. We have much to discuss.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_MIGHT_AS_WELL, RESPONSE_CHAPTER_TWO_RUN_AWAAAAY, RESPONSE_CHAPTER_TWO_COME_ONNN};
        }
    },
    PROMPT_ORIGIN_EXIT_CUT_THIS_OUT("*You make it almost two steps before you find yourself facing the apartment again," +
            " with a hand keeping a firm grip on your shoulder, pushing you forward.*\n\n" +
            "I understand that I am being selfish, but you will at least hear me out.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_I_TRIED};
        }
    },
    PROMPT_CHAPTER_TWO_ENTER_THE_LOW_BUDGET("*You follow the stranger up a couple of floors, until you reach the apartment door. " +
            "He unlocks the door, and you follow him inside.\n\n" +
            "There are no furnishings immediately visible, but you do see two mats on the floor.\n\n" +
            "He sits on one, and gestures for you to sit on the other.*") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_YEAH_THIS_NOT_WEIRD_AT_ALL};
        }
    },
    PROMPT_CHAPTER_TWO_WAA_WAA("*The stranger ignores you.*"),
    PROMPT_CHAPTER_TWO_LET_IT_BEGIN("*You take your place on the mat opposite of the stranger, and make yourself comfortable. At least, as much as you can.*\n\n" +
            "Now, we may discuss things freely.\n\nI am your ancestor. You may call me " + PLAYER_ANCESTOR + ". What shall I call you? And what would you like to know?") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_COME_AGAIN,
                    RESPONSE_CHAPTER_TWO_KINDA_SHABBY,
                    RESPONSE_CHAPTER_TWO_WTF_MAN,
                    RESPONSE_CHAPTER_TWO_WHY_ME,
                    RESPONSE_CHAPTER_TWO_ABOUT_THAT};
        }
    },
    PROMPT_ORIGIN_ALL_EXIT_CAME_FROM("Hmm. I suppose you could say that I'm taking you home.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_ORIGIN_ALL_EXIT_WHY_CRYPTIC};
        }
    },
    PROMPT_ORIGIN_ALL_EXIT_QUESTIONS("Must you ask so many questions? In due time."),
    PROMPT_CHAPTER_TWO_WELL_YOU_SEE("I am not young at all. I am older than you can fathom. Too old."),
    PROMPT_CHAPTER_TWO_BECAUSE_IT_IS_MINE("I have secured this place against eavesdroppers and intruders. " +
            "I do not wish us to be disturbed until we are both...satisfied."),
    PROMPT_CHAPTER_TWO_ITS_CALLED_SPARTAN("Furniture is a luxury. Also, this is an extremely temporary residence."),
    PROMPT_CHAPTER_TWO_I_WANT_EVERYTHING("I want to give you a gift. I can only give it to you if you are willing to receive it, though.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_TELL_ME_MORE};
        }
    },
    PROMPT_CHAPTER_TWO_I_AM_VERY_FAST("Nothing special. Let's just say that I am extremely quick on my feet...compared to you, at least."),
    PROMPT_CHAPTER_TWO_OH_MAN("Birth...day. Should you accept my gift, I suspect you shall eventually cease to celebrate such a thing, if you even remember it.\n\n" +
            "You see, I am here to offer you a new kind of life. An everlasting one. Should you accept it, you shall be completely unable to die, by age or any other cause.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_OH};
        }
    },
    PROMPT_CHAPTER_TWO_BUT_REALLY("You are skeptical. That is expected. I am not interested in wasting any time, so allow me to...demonstrate.\n\n" +
            "*Nyul lifts one hand from his side, and you can clearly see an ornate dagger in it.\n\n" +
            "He promptly shoves the dagger into his own heart, and his eyes never leave yours," +
            "\n\neven as the blood begins to pour from his chest.*") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_WHAT_THE_SHIT, RESPONSE_CHAPTER_TWO_THAT_WAS_SHOCKING, RESPONSE_CHAPTER_TWO_I_CAN_NOT_EVEN};
        }
    },
    PROMPT_CHAPTER_TWO_TOLD_YOU_SO("*Nyul removes the dagger from his chest. He lays it next to him, and continues to look at you.*\n\n" +
            "I cannot die. And though I feel pain, it is not as intense as it once was.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_JUST_ONE_SECOND, RESPONSE_CHAPTER_TWO_OKAY_SOOOO};
        }
    },
    PROMPT_CHAPTER_TWO_RIGHT_OKAY("*Nyul nods.*") {
        public Response[] getResponses() {
            return new Response[]{};
        }
    },
    PROMPT_CHAPTER_TWO_ITS_LIKE_THIS("I have grown tired of this world. I have seen the rise and fall of civilizations.\n\n" +
            "I have loved and lost so many times, that I fear I am no longer capable of loving at all.\n\n" +
            "It has taken me the last few centuries to come to this decision, but I have come to it at last.\n\n" +
            "You see, I am not doing this for you. To make you immortal, I must pass it to you from myself. I am, at long last, ready to die.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_YAY_ME_I_GUESS};
        }
    },
    PROMPT_CHAPTER_TWO_CHOSEN_ONE("It can only be you. You are my descendant, and within a few months time,\n\n" +
            "you will reach the age at which I became frozen in time. Only on that day, can I pass this on to a descendant of mine.\n\n" +
            "...and only if you choose to accept it.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_OKAY_WELL};
        }
    },
    PROMPT_CHAPTER_TWO_PRETTY_MUCH("Almost. I also need you to come with me overseas. Tonight.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_GIMME_A_BREAK, RESPONSE_CHAPTER_TWO_I_MEAN_I_GUESS};
        }
    },
    PROMPT_CHAPTER_TWO_SEE_MY_SERIOUS_FACE("*Nyul stares at you blankly.*") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_NO_CHOICE_HUH};
        }
    },
    PROMPT_CHAPTER_TWO_MAYBE_LATER("Not about this, no.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_BUT_JOB};
        }
    },
    PROMPT_CHAPTER_TWO_WELL_OBVS("They will be taken care of.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_NO_TRUST};
        }
    },
    PROMPT_CHAPTER_TWO_TOTES_MAN("I usually am.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_BUT_JOB};
        }
    },
    PROMPT_CHAPTER_TWO_PEACE_OUT("*You and Nyul take a private flight overseas, to an island which Nyul states has no name.\n" +
            "He says this is for security purposes, but it's hard not to suspect there is a lack of creativity involved somewhere.\n" +
            "You both soon arrive at the base of a large hillside, and you see a simple, but well-defined entrance has been somehow carved into it.*") {
        public Response[] getResponses() {
            return new Response[]{};
        }
    },
    PROMPT_CHAPTER_TWO_YES("Yes.") {
        public Response[] getResponses() {
            return new Response[]{RESPONSE_CHAPTER_TWO_UGH_FINE, RESPONSE_CHAPTER_TWO_ALRIGHT_ALREADY};
        }
    };

    private final String text;

    Prompt(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }

    public Response[] getResponses() {
        return new Response[0];
    }
}
