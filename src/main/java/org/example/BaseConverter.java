package org.example;

import enums.ConversionType;

import java.util.Scanner;

public class BaseConverter {


    public static void main(String[] args) {
        BaseConverter converter = new BaseConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите градусы Цельсия: ");
        double celsius = scanner.nextDouble();

        System.out.println("Выберите тип конвертации:");
        System.out.println("1. Кельвины");
        System.out.println("2. Фаренгейты");
        int choice = scanner.nextInt();

        ConversionType type = choice == 1? ConversionType.KELVIN : ConversionType.FAHRENHEIT;

        double result = converter.convert(celsius, type);

        System.out.printf("%.2f°C = %.2f%s%n", celsius, result, type == ConversionType.KELVIN? "K" : "F");
    }

    public double convert(double celsius, ConversionType type) {
        return type == ConversionType.KELVIN? celsius + 273.15 : celsius * 9 / 5 + 32;
    }
}
