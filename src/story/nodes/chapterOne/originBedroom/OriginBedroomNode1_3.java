package story.nodes.chapterOne.originBedroom;

import story.nodes.Node;

import static messages.TextEnglish.*;

/**
 * "You can do better? Show me. And then piss off."
 * Created by Mitchell on 9/24/2015.
 */
public class OriginBedroomNode1_3 extends Node {

    OriginBedroomNode1_3(String prompt) {
        super(prompt,
                RESPONSE_ORIGIN_BEDROOM_QUIETLY_DO,
                RESPONSE_ORIGIN_BEDROOM_STAY);
    }

    @Override
    protected void processAnswer() {
        switch (saveAnswer()) {
            case RESPONSE_ORIGIN_BEDROOM_QUIETLY_DO:
                kickOff(new OriginBedroomNode1_4());
                break;
            case RESPONSE_ORIGIN_BEDROOM_STAY:
                oneOff(PROMPT_ORIGIN_BEDROOM_HE_RETURNS, RESPONSE_ORIGIN_BEDROOM_LOOK_BESIDE);
                break;
            case RESPONSE_ORIGIN_BEDROOM_LOOK_BESIDE:
                oneOff(MESSAGE_ORIGIN_BEDROOM_ALREADY_GONE);
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
