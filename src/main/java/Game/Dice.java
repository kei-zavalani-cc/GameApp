package Game;

import java.util.Random;

public class Dice {
    private final int MIN_VALUE = 1;
    private final int MAX_VALUE = 6;
    Random r= new Random();
    public int roll() {
        return r.nextInt(MIN_VALUE, MAX_VALUE + 1);
    }
}
