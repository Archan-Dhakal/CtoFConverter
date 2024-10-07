import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        boolean validInput;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsInTank = scanner.nextDouble();
                if (gallonsInTank > 0) {
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
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency > 0) {
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
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
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
        double costFor100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = gallonsInTank * fuelEfficiency;
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costFor100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.%n", maxDistance);
        scanner.close();
    }
}
