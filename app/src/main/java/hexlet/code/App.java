package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Gcd");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.next();

        switch (choice) {
            case "1":
                Cli.greeting();
            case "2":
                Even.run();
            case "3":
                Calc.run();
            case "4":
                Gcd.run();
            case "5":
                Progression.run();
            case "6":
                Prime.run();
            case "0":
                break;
            default:
                System.out.print("Invalid choice: " + choice);
        }
        scanner.close();
    }
}
