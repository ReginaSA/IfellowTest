package org.example;

import java.util.Scanner;

public class HourHand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        while (hours < 0 || hours > 23  || minutes < 0 || minutes > 59) {
            System.out.println("Неправильный ввод. Пожалуйста, введите часы и минуты в диапазоне 0-23 и 0-59 соответственно.");
            System.out.print("Введите часы (0-23): ");
            hours = scanner.nextInt();
            System.out.print("Введите минуты (0-59): ");
            minutes = scanner.nextInt();
        }

        double angle = calculateAngle(hours, minutes);
        System.out.println("Угол между часовой и минутной стрелками: " + angle + " градусов");
    }

    public static double calculateAngle(int hours, int minutes) {
        double hourAngle = (hours % 12 + minutes / 60.0) * 30;
        double minuteAngle = minutes * 6;
        double angle = Math.abs(hourAngle - minuteAngle);
        return angle > 180? 360 - angle : angle;
    }

}
