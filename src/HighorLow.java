import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean validInput;
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer value.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);
        System.out.println("The random number was: " + randomNumber);
        if (userGuess == randomNumber) {
            System.out.println("Congratulations! Your guess was on the money!");
        } else if (userGuess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was too high.");
        }

        scanner.close();
    }
}
