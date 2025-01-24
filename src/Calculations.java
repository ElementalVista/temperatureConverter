public class Calculations {
    static double fahrenheitToCelsius(double input) {
        return (input - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double input) {
        return (input * 9 / 5) + 32;
    }

    static double kelvinToFahrenheit(double input) {
        return (input - 273.15) * 9 / 5 + 32;
    }

    static double kelvinToCelsius(double input) {
        return input - 273.15;
    }

    static double celsiusToKelvin(double input) {
        return input + 273.15;
    }

    static double fahrenheitToKelvin(double input) {
        return (input - 32) * 5 / 9 + 273.15;
    }
}