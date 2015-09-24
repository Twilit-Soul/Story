package messages;

/**
 * Right now these are just hard-coded constants, but I'll make a small utility at some point
 * to put these into a .properties file, and implement localization using that.
 * Created by Mitchell on 9/24/2015.
 */
public abstract class TextEnglish {
    //Kickoff
    public static final String PROMPT_NAME = "What's your name?";
    public static final String PROMPT_GENDER = "Are you a he, or a she?";
    public static final String PROMPT_ORIGIN = "Where does your story begin?";

    //Origins
    public static final String PROMPT_ORIGIN_BEDROOM = "Sleeping in my bedroom.";

    //Origin - Bedroom
    //Origin:Bedroom:1
    //TODO: make exposition prompts in italics. And somehow distinct code-wise. (isExposition)
    public static final String PROMPT_ORIGIN_BEDROOM_AWAKENING = "*You wake up with your heart pounding. You don't know why. As you look around your room, you realize there are two red eyes looking at you. It's a man. He speaks.*\n" +
            "\n" +
            "\"Is this it, then? Is this your life?\"\n";

    public static final String RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU = "Who are you?";
    public static final String RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM = "What are you doing in my bedroom?";
    public static final String RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG = "Is something wrong with it?";

    public static final String MESSAGE_ORIGIN_BEDROOM_ONE_WHO_GIVES_MEANING = "The one who will give you meaning.";
    public static final String MESSAGE_ORIGIN_BEDROOM_ONE_WHO_INQUIRES = "Inquiring about your life, obviously.";

    //Origin:Bedroom:1_1
    public static final String PROMPT_ORIGIN_BEDROOM_I_WISH = "No. I wish there were. It might be more interesting.";

    public static final String RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING = "It is kind of boring, isn't it?";
    public static final String RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING = "I happen to like my life.";

    //Origin:Bedroom:1_2
    private static final String PROMPT_ORIGIN_MEDIOCRITY = "You settle for mediocrity, where there could be so much more.";
    public static final String PROMPT_ORIGIN_TOO_EASY = "Then you are too easily satisfied. "+PROMPT_ORIGIN_MEDIOCRITY;
    public static final String PROMPT_ORIGIN_UNDERSTATEMENT = "That is an understatement. "+PROMPT_ORIGIN_MEDIOCRITY;


    //Common
    public static final String RESPONSE_SILENCE = "Remain silent.";
    public static final String RESPONSE_SHOW_ME_THEN = "Show me, then.";
    public static final String RESPONSE_YOU_CAN_DO_BETTER = "You can do better?";
    public static final String RESPONSE_PISS_OFF = "Piss off.";

    public static final String MESSAGE_ONE_WHO_IS_PATIENT = "*He does not move.*";
}
