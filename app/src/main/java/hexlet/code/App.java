package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression; // ИМПОРТИРУЕМ НОВУЮ ИГРУ
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression"); // ДОБАВЛЯЕМ В МЕНЮ
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");

        int choice = -1;
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // ничего
            }
        }

        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Even game not implemented yet.");
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                Gcd.startGame();
                break;
            case 5: // ВЫЗЫВАЕМ НОВУЮ ИГРУ
                Progression.startGame();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Wrong choice. Please try again.");
        }

        scanner.close();
    }
}