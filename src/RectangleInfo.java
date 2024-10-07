import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean validInput;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive value.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive value.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("The area of the rectangle is: %.2f%n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal of the rectangle is: %.2f%n", diagonal);
        scanner.close();
    }
}
