package guessgame;

/**
 * Created by gyukebox on 2017. 3. 12..
 */
public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;
    private boolean isOver;
    private static final NumberGenerator generator = NumberGenerator.getInstance();
    private static final int targetNumber = setTargetNumber();

    public static int setTargetNumber() {
        int target = generator.generate();
        return target;
    }

    public int getTargetNumber() {
        return this.targetNumber;
    }

    public void setOver(boolean isOver) {
        this.isOver = isOver;
    }

    public boolean isOver() {
        return isOver;
    }

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        p1.initialize();
        p2.initialize();
        p3.initialize();

        isOver = false;
    }

    public void makeGuess() {
        p1.setGuessedNumber(generator.generate());
        p2.setGuessedNumber(generator.generate());
        p3.setGuessedNumber(generator.generate());
    }

    public void printUsersGuess() {
        System.out.println("플레이어 1의 추측은 " + p1.getGuessedNumber() + " 입니다");
        System.out.println("플레이어 2의 추측은 " + p2.getGuessedNumber() + " 입니다");
        System.out.println("플레이어 3의 추측은 " + p3.getGuessedNumber() + " 입니다");
    }

    public void checkGuess() {
        if(p1.getGuessedNumber() == targetNumber) {
            this.setOver(true);
            p1.setRight(true);
        }
        if(p2.getGuessedNumber() == targetNumber) {
            this.setOver(true);
            p2.setRight(true);
        }
        if(p3.getGuessedNumber() == targetNumber) {
            this.setOver(true);
            p3.setRight(true);
        }
    }

    public void printResult() {
        if(p1.isRight() == true) {
            System.out.println("플레이어 1은 맞았습니다");
        } else {
            System.out.println("플레이어 1은 틀렸습니다");
        }

        if(p2.isRight() == true) {
            System.out.println("플레이어 2는 맞았습니다");
        } else {
            System.out.println("플레이어 2는 틀렸습니다");
        }

        if(p3.isRight() == true) {
            System.out.println("플레이어 3은 맞았습니다");
        } else {
            System.out.println("플레이어 3은 틀렸습니다");
        }
    }
}
