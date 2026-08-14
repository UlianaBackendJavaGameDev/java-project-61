package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 100;

    // Метод для нахождения НОД (Алгоритм Евклида - самый быстрый и надежный)
    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = RANDOM.nextInt(MAX_NUMBER) + 1;
            int num2 = RANDOM.nextInt(MAX_NUMBER) + 1;

            // Формируем вопрос (например: "25 50")
            roundsData[i][0] = num1 + " " + num2;
            // Вычисляем правильный ответ с помощью нашего метода
            roundsData[i][1] = String.valueOf(findGcd(num1, num2));
        }

        // Отправляем данные в готовый движок
        Engine.run(DESCRIPTION, roundsData);
    }
}