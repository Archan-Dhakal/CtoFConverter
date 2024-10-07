import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        boolean Input = false;
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                Input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.next();
            }
        } while (!Input);
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F%n", fahrenheit);

        if (celsius == 0) {
            System.out.println("This is the freezing point of water.");
        } else if (celsius == 100) {
            System.out.println("This is the boiling point of water.");
        }

        scanner.close();
    }
}
