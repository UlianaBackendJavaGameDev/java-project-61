package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER = 100; // Максимальное генерируемое число

    // --- МЕТОД-ПРЕДИКАТ ДЛЯ ПРОВЕРКИ ПРОСТОТЫ ЧИСЛА ---
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        // Проверяем делители от 2 до корня из числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Если нашли делитель, число не простое
            }
        }
        return true; // Если делителей нет, число простое
    }

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            // Генерируем случайное число от 2 до MAX_NUMBER
            int number = RANDOM.nextInt(MAX_NUMBER - 1) + 2;

            // Вопрос — это само число (например: "7")
            roundsData[i][0] = String.valueOf(number);

            // Вычисляем правильный ответ, используя метод isPrime
            roundsData[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(DESCRIPTION, roundsData);
    }
}