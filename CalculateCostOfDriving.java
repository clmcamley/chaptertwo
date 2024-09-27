//Exercise 2.23

import java.util.Scanner;

public class CalculateCostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter fuel efficiency in miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter fuel cost in price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double costOfDriving = (int)(distance / milesPerGallon * pricePerGallon * 100);
        costOfDriving = (double)(costOfDriving / 100);

        System.out.println("The cost of driving is $" + costOfDriving);
    }
}
