package hexlet.code;

public class App {
    public String getGreeting() {
        return "Welcome to the Brain Games!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}