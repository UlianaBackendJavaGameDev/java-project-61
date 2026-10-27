package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 20;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number1 = random.nextInt(MAX_VALUE) + MIN_VALUE;
            int number2 = random.nextInt(MAX_VALUE) + MIN_VALUE;
            char operators = OPERATORS[random.nextInt(OPERATORS.length)];

            String question = number1 + " " + operators + " " + number2;
            int result = calculate(number1, number2, operators);
            String correctAnswer = Integer.toString(result);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

    private static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new RuntimeException("Unknown operator:" + operator);
        }
    }
}
