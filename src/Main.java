import java.util.Scanner;

public class Main extends Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set default values
        int defaultChoice = 1; // Default: Fahrenheit to Celsius
        double defaultNumber = 100.0; // Default temperature value

        // Automatically process the default input
        System.out.println("Default Conversion:");
        System.out.println("Input: " + defaultNumber + "°F");
        processConversion(defaultChoice, defaultNumber);

        // Prompt the user for input
        System.out.println("\nWould you like to perform another conversion? (1 for Yes, 0 for No)");
        int continueInput = input.nextInt();

        while (continueInput == 1) {
            System.out.println("\nChoose a conversion:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Fahrenheit to Kelvin");
            System.out.println("4. Celsius to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");

            int userNum1Input = input.nextInt();
            System.out.println("Enter the number to convert:");
            double userNum2Input = input.nextDouble();

            processConversion(userNum1Input, userNum2Input);

            System.out.println("\nWould you like to perform another conversion? (1 for Yes, 0 for No)");
            continueInput = input.nextInt();
        }

        System.out.println("Goodbye!");
    }

    private static void processConversion(int choice, double number) {
        switch (choice) {
            case 1 -> System.out.printf("Fahrenheit to Celsius: %.2f°F -> %.2f°C%n", number, fahrenheitToCelsius(number));
            case 2 -> System.out.printf("Celsius to Fahrenheit: %.2f°C -> %.2f°F%n", number, celsiusToFahrenheit(number));
            case 3 -> System.out.printf("Fahrenheit to Kelvin: %.2f°F -> %.2fK%n", number, fahrenheitToKelvin(number));
            case 4 -> System.out.printf("Celsius to Kelvin: %.2f°C -> %.2fK%n", number, celsiusToKelvin(number));
            case 5 -> System.out.printf("Kelvin to Celsius: %.2fK -> %.2f°C%n", number, kelvinToCelsius(number));
            case 6 -> System.out.printf("Kelvin to Fahrenheit: %.2fK -> %.2f°F%n", number, kelvinToFahrenheit(number));
            default -> System.out.println("Invalid choice.");
        }
    }
}
