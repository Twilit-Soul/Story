package story.chapterOne.originBedroom;

import story.Prompt;

import static messages.TextEnglish.*;

/**
 * "Is something wrong with it?"
 * Created by Mitchell on 9/24/2015.
 */
public class OriginBedroomPrompt1_1 extends Prompt {

    OriginBedroomPrompt1_1() {
        super(PROMPT_ORIGIN_BEDROOM_I_WISH,
                RESPONSE_ORIGIN_BEDROOM_IT_IS_BORING,
                RESPONSE_ORIGIN_BEDROOM_IT_IS_NOT_BORING);
    }

    @Override
    protected void processAnswer() {
        switch (getAnswer()) {
            case 1:
                kickOff(new OriginBedroomPrompt1_2(PROMPT_ORIGIN_UNDERSTATEMENT));
                break;
            case 2:
                kickOff(new OriginBedroomPrompt1_2(PROMPT_ORIGIN_TOO_EASY));
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
