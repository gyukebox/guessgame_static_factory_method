package guessgame;

/**
 * Created by gyukebox on 2017. 3. 12..
 */
public class Player {
    private int guessedNumber;
    private boolean isRight;

    public void initialize() {
        this.guessedNumber = 0;
        this.isRight = false;
    }

    public int getGuessedNumber() {
        return this.guessedNumber;
    }

    public boolean isRight() {
        return this.isRight;
    }

    public void setGuessedNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }

    public void setRight(boolean isRight) {
        this.isRight = isRight;
    }
}
