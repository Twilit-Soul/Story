package story.chapterOne.originBedroom;

import story.Prompt;

import static messages.TextEnglish.*;

/**
 * "I happen to like or be bored with my life."
 * Created by Mitchell on 9/24/2015.
 */
public class OriginBedroomPrompt1_2 extends Prompt {

    public OriginBedroomPrompt1_2(String prompt) {
        super(prompt, RESPONSE_SHOW_ME_THEN, RESPONSE_YOU_CAN_DO_BETTER, RESPONSE_PISS_OFF);
    }

    @Override
    protected void processAnswer() {
        switch (getAnswer()) {
            case 1:case 2:
                break;
            case 3:
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
