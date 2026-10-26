package hexlet.code;

import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.next();

        switch (choice) {
            case "1":
                Cli.greeting();
            case "2":
                Even.run();
            case "0":
                break;
            default:
                System.out.print("Invalid choice: " + choice);
        }
        scanner.close();
    }
}
