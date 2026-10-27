package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = random.nextInt(MAX_VALUE) + MIN_VALUE;
            int number2 = random.nextInt(MAX_VALUE) + MIN_VALUE;

            String question = number1 + " " + number2;
            int gcd = getGcd(number1, number2);
            String correctAnswer = Integer.toString(gcd);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
