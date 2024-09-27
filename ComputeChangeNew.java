//Exercise 2.22

import java.util.Scanner;

public class ComputeChangeNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in integer, for example 1156 for $11.56: ");
        int remainingAmount = input.nextInt();

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + remainingAmount + " consists of:");
        System.out.println("    " + numberOfOneDollars + " dollars,");
        System.out.println("    " + numberOfQuarters + " quarters,");
        System.out.println("    " + numberOfDimes + " dimes,");
        System.out.println("    " + numberOfNickels + " nickels,");
        System.out.println("and " + numberOfPennies + " pennies.");
    }
}