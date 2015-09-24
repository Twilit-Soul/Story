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
    public static final String RESPONSE_ORIGIN_BEDROOM = "Sleeping in my bedroom.";

    //Origin - Bedroom
    //Origin:Bedroom:1
    //TODO: make exposition prompts in italics. And somehow distinct code-wise. (isExposition)
    public static final String PROMPT_ORIGIN_BEDROOM_AWAKENING = "*You wake up with your heart pounding. You don't know why you've woken up. As you look around your room, you realize there are two red eyes looking at you.\nIt's a man. He speaks.*\n" +
            "\n" +
            "\"Is this it, then? Is this your life?\"";

    public static final String RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU = "Who are you?";
    public static final String RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM = "What are you doing in my bedroom?";
    public static final String RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG = "Is something wrong with it?";

    public static final String MESSAGE_ORIGIN_BEDROOM_ONE_WHO_GIVES_MEANING = "The one who will give you meaning.";
    public static final String MESSAGE_ORIGIN_BEDROOM_ONE_WHO_INQUIRES = "Inquiring about your life, obviously.";

    //Origin:Bedroom:1_1
    public static final String PROMPT_ORIGIN_BEDROOM_I_WISH = "No. I wish there were. It might be more interesting.";

    public static final String PROMPT_ORIGIN_BEDROOM_TOO_EASY = "Then you are too easily satisfied.";
    public static final String PROMPT_ORIGIN_BEDROOM_UNDERSTATEMENT = "That is an understatement.";

    public static final String RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING = "It is kind of boring, isn't it?";
    public static final String RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING = "I happen to like my life.";

    //Origin:Bedroom:1_3
    public static final String PROMPT_ORIGIN_BEDROOM_HE_LEAVES = "\n\n*The eyes disappear. You realize you can't see his outline anymore.*";
    public static final String PROMPT_ORIGIN_BEDROOM_GLADLY = "That is what I have come to do. Get dressed and meet me outside."+PROMPT_ORIGIN_BEDROOM_HE_LEAVES;
    public static final String PROMPT_ORIGIN_BEDROOM_LONG_TIME = "I have been. For a long time.";
    public static final String PROMPT_ORIGIN_BEDROOM_DO_NOT_EVEN = "*You hear a sigh.*\n\nGet dressed. Meet me outside. I am not asking."+PROMPT_ORIGIN_BEDROOM_HE_LEAVES;
    public static final String PROMPT_ORIGIN_BEDROOM_HE_RETURNS = "*You feel the air move next to you, and suddenly a powerful hand grips your arm.*\n\nGet. Up. Do as I have commanded you.\n\n*The hand releases you.*";


    public static final String RESPONSE_ORIGIN_BEDROOM_QUIETLY_DO = "(Get dressed and go outside)";
    public static final String RESPONSE_ORIGIN_BEDROOM_STAY = "(Don't go anywhere)";
    public static final String RESPONSE_ORIGIN_BEDROOM_LOOK_BESIDE = "(Look beside you)";

    public static final String MESSAGE_ORIGIN_BEDROOM_ALREADY_GONE = "*There is no one there.*";

    //Origin:Bedroom:1_4
    public static final String PROMPT_ORIGIN_BEDROOM_YOU_ARRIVE = "*You put some clothes on, and exit your home.*\n\nYou are so terribly slow, are you not? Come.\n\n*There is a sleek, black car in the street outside of your home. He motions towards it.*";

    public static final String RESPONSE_ORIGIN_BEDROOM_WAIT_WHAT = "Wait, you want me to just drive off with you?";
    public static final String RESPONSE_ORIGIN_BEDROOM_QUIETLY_RIDE = "(Walk towards the car, and get into the back seat)";
    public static final String RESPONSE_ORIGIN_BEDROOM_YEAH_NO = "Oh. Yeah, I think I'm just gonna go back inside...";

    public static final String MESSAGE_ORIGIN_BEDROOM_YES_ACTUALLY = "Yes. Was that not clear? I want you to get into the vehicle.";

    //Origin:Bedroom:1_5
    public static final String PROMPT_ORIGIN_BEDROOM_THIS_KID_MAN = "I understand that you do not trust me, but I will not have one of my own disrespect me so.\n\n*Before you can react, he grabs your shoulders tightly. You suddenly find yourself next to the car, and the door is open before you're able to protest.\nThe world seems to suddenly shift itself to the right, and you realize that you are inside the vehicle with the door closed.\nYou hear him cranking up the car in the front seat.*";
    public static final String PROMPT_ORIGIN_BEDROOM_THANK_GOODNESS = "*As you walk in, the stranger moves to the driver side and gets in with you.*\n\nI do appreciate your cooperation. So many of your generation do not understand what came before them.";

    //Origin:All:Exit
    public static final String RESPONSE_ORIGIN_ALL_EXIT_SILENCE = "(finish out the ride in silence)";

    //Common
    public static final String RESPONSE_SHOW_ME_THEN = "Show me something better, then.";
    public static final String RESPONSE_YOU_CAN_DO_BETTER = "You can do better?";
    public static final String RESPONSE_PISS_OFF = "Piss off.";

}
