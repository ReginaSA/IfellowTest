package org.example;

import java.util.Arrays;

public class RandomArray {

    //Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение
    public static void main(String[] args) {
        double [] array = generateRandomArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное значение: " + Arrays.stream(array).max().getAsDouble());
        System.out.println("Минимальное значение: " + Arrays.stream(array).min().getAsDouble());
        System.out.println("Среднее значение: " + Arrays.stream(array).average().getAsDouble());
    }

    public static double[] generateRandomArray(int size) {
        double [] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

}
