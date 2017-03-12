package guessgame;

import java.util.Random;

/**
 * Created by gyukebox on 2017. 3. 12..
 */
public class NumberGenerator {
    private static final NumberGenerator generator = new NumberGenerator();
    private final Random random = new Random();

    private NumberGenerator() {

    }

    public static NumberGenerator getInstance() {
        return generator;
    }

    public int generate() {
        int result = random.nextInt(10) + 1;
        return result;
    }

}
