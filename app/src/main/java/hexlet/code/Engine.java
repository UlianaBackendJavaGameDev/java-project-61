package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3; // Максимальное число раундов

    public static void run(String gameDescription, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        // ИСПРАВЛЕНИЕ: используем nextLine().trim(), чтобы съесть лишний enter
        String userName = scanner.nextLine().trim();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameDescription);

        // Игровой цикл на 3 раунда
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = questionsAndAnswers[i][0];
            String correctAnswer = questionsAndAnswers[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            // ИСПРАВЛЕНИЕ: здесь тоже используем nextLine()
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return; // Завершаем программу при ошибке
            }
        }

        // Если все 3 раунда пройдены
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}