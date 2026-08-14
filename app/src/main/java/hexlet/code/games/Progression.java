package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final Random RANDOM = new Random();

    // Максимальная длина прогрессии (рекомендация из задания)
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    // Чтобы шаг и начало не были слишком большими
    private static final int MAX_START = 20;
    private static final int MAX_STEP = 10;

    public static void startGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            // 1. Генерируем случайные параметры прогрессии
            int length = RANDOM.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = RANDOM.nextInt(MAX_START) + 1;
            int step = RANDOM.nextInt(MAX_STEP) + 1;

            // 2. Выбираем случайный индекс, который мы скроем (от 0 до length-1)
            int hiddenIndex = RANDOM.nextInt(length);

            // 3. Создаем саму прогрессию и правильный ответ
            String[] progression = new String[length];
            int hiddenAnswer = 0;

            // Заполняем массив числами (используя формулу из подсказки: start + index * step)
            for (int j = 0; j < length; j++) {
                int currentValue = start + j * step;

                // Если это индекс, который нужно скрыть
                if (j == hiddenIndex) {
                    progression[j] = "..";
                    hiddenAnswer = currentValue;
                } else {
                    progression[j] = String.valueOf(currentValue);
                }
            }

            // 4. Склеиваем массив в строку через пробел (например: "5 7 9 11 .. 17")
            String question = String.join(" ", progression);

            // 5. Записываем данные для движка
            roundsData[i][0] = question;
            roundsData[i][1] = String.valueOf(hiddenAnswer);
        }

        // Запускаем игру через движок
        Engine.run(DESCRIPTION, roundsData);
    }
}