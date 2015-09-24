package story.nodes.chapterOne.originBedroom;

import story.nodes.Node;

import static messages.TextEnglish.*;

/**
 * "I'm outside, bro."
 * Created by Mitchell on 9/24/2015.
 */
public class OriginBedroomNode1_4 extends Node {

    OriginBedroomNode1_4() {
        super(PROMPT_ORIGIN_BEDROOM_YOU_ARRIVE,
                RESPONSE_ORIGIN_BEDROOM_WAIT_WHAT,
                RESPONSE_ORIGIN_BEDROOM_QUIETLY_RIDE,
                RESPONSE_ORIGIN_BEDROOM_YEAH_NO);
    }

    @Override
    protected void processAnswer() {
        switch (saveAnswer()) {
            case RESPONSE_ORIGIN_BEDROOM_WAIT_WHAT:
                oneOff(MESSAGE_ORIGIN_BEDROOM_YES_ACTUALLY);
                break;
            case RESPONSE_ORIGIN_BEDROOM_QUIETLY_RIDE:
                kickOff(new OriginBedroomNode1_5(PROMPT_ORIGIN_BEDROOM_THANK_GOODNESS));
                break;
            case RESPONSE_ORIGIN_BEDROOM_YEAH_NO:
                kickOff(new OriginBedroomNode1_5(PROMPT_ORIGIN_BEDROOM_THIS_KID_MAN));
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
