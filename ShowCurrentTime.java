//Exercise 2.8

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        byte offset = input.nextByte();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + offset;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " " + offset + " GMT");
    }
}