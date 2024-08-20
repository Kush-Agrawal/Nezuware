import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the conversion options
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option (1-6): ");
        int option = scanner.nextInt();

        double inputTemp, convertedTemp;

        switch (option) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = celsiusToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = fahrenheitToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;

            case 3:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = celsiusToKelvin(inputTemp);
                System.out.println("Temperature in Kelvin: " + convertedTemp);
                break;

            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = kelvinToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;

            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = fahrenheitToKelvin(inputTemp);
                System.out.println("Temperature in Kelvin: " + convertedTemp);
                break;

            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = kelvinToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;

            default:
                System.out.println("Invalid option selected.");
                break;
        }

        // Close the scanner
        scanner.close();
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
