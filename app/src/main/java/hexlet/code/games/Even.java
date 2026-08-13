package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int ROUNDS_COUNT = 3;

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine().trim().toLowerCase();

            boolean isEven = isEven(number);
            String correctAnswer = isEven ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", userName);
                return; // Завершаем игру при первой же ошибке
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    // Предикат проверки на чётность
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
