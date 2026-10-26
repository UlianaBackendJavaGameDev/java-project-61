package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String GAME_DESCRIPTION =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_NUMBER) + 1;
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.run(GAME_DESCRIPTION, roundsData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
