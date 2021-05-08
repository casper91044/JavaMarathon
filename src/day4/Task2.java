package day4;

import java.util.Arrays;
import java.util.Random;

/**Создать новый массив размера 100 и заполнить его случайными числами из
 диапазона от 0 до 10000.
 Затем, используя циклы for each вывести:
 - наибольший элемент массива
 - наименьший элемент массива
 - количество элементов массива, оканчивающихся на 0
 - сумму элементов массива, оканчивающихся на 0

 Использовать сортировку запрещено.*/

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int max = 0;
        for (int elements: array) {
            if (elements > max) {
                max = elements;
            }
        }
        System.out.println("наибольший элемент массива: " + max);

        int min = 10000;
        for (int elements: array) {
            if (elements < min) {
                min = elements;
            }
        }
        System.out.println("наименьший элемент массива: " + min);

        int count = 0;
        for (int elements: array) {
            if (elements % 10 == 0) {
                count++;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);

        int sum = 0;
        for (int elements:array) {
            if (elements % 10 == 0){
                sum += elements;
            }
        }
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);
    }
}
