package guessgame;

public final class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        GuessGame game = new GuessGame();
        System.out.println("타겟 넘버는 " + game.getTargetNumber() + " 입니다"); //test
        System.out.println();

        game.startGame();

        while(game.isOver() == false) {
            game.makeGuess();
            game.printUsersGuess();

            System.out.println();

            game.checkGuess();
            game.printResult();

            System.out.println();
        }

        long end = System.currentTimeMillis();
        System.out.println("총 실행시간 = " + (end-start)/1000.0 + "초");
    }
}
