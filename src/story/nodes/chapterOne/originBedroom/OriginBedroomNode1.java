package story.nodes.chapterOne.originBedroom;

import story.nodes.Node;

import static messages.TextEnglish.*;

/**
 * Beginning of bedroom origin.
 * Created by Mitchell on 9/24/2015.
 */
public class OriginBedroomNode1 extends Node {

    public OriginBedroomNode1() {
        super(PROMPT_ORIGIN_BEDROOM_AWAKENING,
                RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU,
                RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM,
                RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG);
    }

    @Override
    public void processAnswer() {
        switch (saveAnswer()) {
            case RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU:
                oneOff(MESSAGE_ORIGIN_BEDROOM_ONE_WHO_GIVES_MEANING);
                break;
            case RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM:
                oneOff(MESSAGE_ORIGIN_BEDROOM_ONE_WHO_INQUIRES);
                break;
            case RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG:
                oneOff(PROMPT_ORIGIN_BEDROOM_I_WISH, RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING, RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING);
                break;
            case RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING:
                oneOff(PROMPT_ORIGIN_BEDROOM_UNDERSTATEMENT, RESPONSE_SHOW_ME_THEN, RESPONSE_YOU_CAN_DO_BETTER, RESPONSE_PISS_OFF);
                break;
            case RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING:
                oneOff(PROMPT_ORIGIN_BEDROOM_TOO_EASY, RESPONSE_SHOW_ME_THEN, RESPONSE_YOU_CAN_DO_BETTER, RESPONSE_PISS_OFF);
                break;
            case RESPONSE_YOU_CAN_DO_BETTER:
                oneOff(PROMPT_ORIGIN_BEDROOM_LONG_TIME);
                break;
            case RESPONSE_SHOW_ME_THEN:
                kickOff(new OriginBedroomNode1_3(PROMPT_ORIGIN_BEDROOM_GLADLY));
                break;
            case RESPONSE_PISS_OFF:
                kickOff(new OriginBedroomNode1_3(PROMPT_ORIGIN_BEDROOM_DO_NOT_EVEN));
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
