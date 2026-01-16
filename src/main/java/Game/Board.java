package Game;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private static final int SIZE = 60;
    private Map<Integer, Step> steps;

    public Step getStep(int position) {

        return steps.get(position);
    }

    public void initializeSteps() {
        steps = new HashMap<>();
        for(int i = 0; i <= SIZE; i++) {
            steps.put(i, new NormalStep(i));
        }
    }

    public void initializeSpecialSteps() {
        steps.put(6, new MoveForwardStep(6, 6));
        steps.put(19, new StayStep(19, 0));
        steps.put(58, new MoveToStartStep(58, 0));
        steps.put(31, new MoveForwardStep(31, 3));
        steps.put(42, new MoveBackwardStep(42, 3));
        steps.put(52, new StayStep(52, 0));
    }
}
