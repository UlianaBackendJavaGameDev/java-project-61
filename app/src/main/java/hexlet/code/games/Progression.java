package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 50;
    private static final int MIN_STEP = 2;
    private static final int MAX_STEP = 10;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int start = random.nextInt(MAX_START) + MIN_START;
            int step = random.nextInt(MAX_STEP) + MIN_STEP;

            String[] progression = makeProgression(start, step, LENGTH);

            int hiddenIndex = random.nextInt(LENGTH);
            String correctAnswer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

    public static String[] makeProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + (i * step));
        }
        return progression;
    }
}
