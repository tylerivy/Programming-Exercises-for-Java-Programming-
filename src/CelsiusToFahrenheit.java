import java.util.*;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 40.0;
        double fahrenheit = 120.0;

        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("--------------------------------------------");
        while (celsius >= 31.0 && fahrenheit >= 30) {
            System.out.printf("%.1f\t%.1f\t\t|\t%.1f\t\t%.2f ", celsius, celsiusToFahrenheit(celsius), fahrenheit, FahrenheitToCelsius(fahrenheit));
            celsius -= 1.0;
            fahrenheit -= 10.0;
            System.out.println();
        }

    }


    public static double celsiusToFahrenheit(double celsius) {

        return (9.0 / 5) * celsius + 32;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

}
