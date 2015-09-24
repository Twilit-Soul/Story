package story.nodes.chapterOne.sceneZero;

import story.nodes.Node;
import story.nodes.chapterOne.originBedroom.OriginBedroomNode1;

import static messages.TextEnglish.PROMPT_ORIGIN;
import static messages.TextEnglish.RESPONSE_ORIGIN_BEDROOM;

/**
 * "The Beginning"
 * Created by Mitchell on 9/24/2015.
 */
public class NodeZero extends Node {

    public NodeZero() {
        super(PROMPT_ORIGIN, RESPONSE_ORIGIN_BEDROOM);
    }

    @Override
    public void processAnswer() {
        switch (saveAnswer()) {
            case RESPONSE_ORIGIN_BEDROOM:
                kickOff(new OriginBedroomNode1());
                break;
            default:
                handleInvalidAnswer();
                break;
        }
    }
}
