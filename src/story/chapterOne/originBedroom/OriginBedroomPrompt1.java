package story.chapterOne.originBedroom;

import story.Prompt;

import static messages.TextEnglish.*;

/**
 * Beginning of bedroom origin.
 * Created by Mitchell on 9/24/2015.
 */
public class OriginBedroomPrompt1 extends Prompt {

    public OriginBedroomPrompt1() {
        super(PROMPT_ORIGIN_BEDROOM_AWAKENING,
                RESPONSE_ORIGIN_BEDROOM_WHO_ARE_YOU,
                RESPONSE_ORIGIN_BEDROOM_WHAT_IN_BEDROOM,
                RESPONSE_ORIGIN_BEDROOM_SOMETHING_WRONG,
                RESPONSE_SILENCE);
    }

    @Override
    public void processAnswer() {
        switch (getAnswer()) {
            case 1:
                oneOff(MESSAGE_ORIGIN_BEDROOM_ONE_WHO_GIVES_MEANING);
                break;
            case 2:
                oneOff(MESSAGE_ORIGIN_BEDROOM_ONE_WHO_INQUIRES);
                break;
            case 3:
                kickOff(new OriginBedroomPrompt1_1());
                break;
            case 4:
                oneOff(MESSAGE_ONE_WHO_IS_PATIENT);
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
