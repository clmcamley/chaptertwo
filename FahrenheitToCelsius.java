//Listing 2.6

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " in Celsius");
    }
}
