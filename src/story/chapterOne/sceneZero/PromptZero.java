package story.chapterOne.sceneZero;

import story.Prompt;
import story.chapterOne.originBedroom.OriginBedroomPrompt1;

import static messages.TextEnglish.PROMPT_ORIGIN;
import static messages.TextEnglish.PROMPT_ORIGIN_BEDROOM;

/**
 * "The Beginning"
 * Created by Mitchell on 9/24/2015.
 */
public class PromptZero extends Prompt {

    public PromptZero() {
        super(PROMPT_ORIGIN, PROMPT_ORIGIN_BEDROOM);
    }

    @Override
    public void processAnswer() {
        switch (getAnswer()) {
            case 1:
                kickOff(new OriginBedroomPrompt1());
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
