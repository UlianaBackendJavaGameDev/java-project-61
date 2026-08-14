package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final Random RANDOM = new Random();

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            // Генерируем 2 числа от 1 до 20
            int num1 = RANDOM.nextInt(20) + 1;
            int num2 = RANDOM.nextInt(20) + 1;

            // Выбираем случайную операцию (0 - +, 1 - -, 2 - *)
            int operationIndex = RANDOM.nextInt(3);
            char operator;
            int correctResult;

            switch (operationIndex) {
                case 0 -> {
                    operator = '+';
                    correctResult = num1 + num2;
                }
                case 1 -> {
                    operator = '-';
                    correctResult = num1 - num2;
                }
                default -> {
                    operator = '*';
                    correctResult = num1 * num2;
                }
            }

            // Записываем вопрос и правильный ответ в массив
            roundsData[i][0] = num1 + " " + operator + " " + num2;
            roundsData[i][1] = String.valueOf(correctResult);
        }

        // Передаем данные в движок
        Engine.run(DESCRIPTION, roundsData);
    }
}