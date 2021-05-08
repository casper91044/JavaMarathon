package day4;

import java.util.Arrays;
import java.util.Random;

/** Создать новый массив размера 15 и заполнить его случайными числами
  из диапазона от 0 до 10000.
 Найти максимум среди сумм трех соседних элементов.
 Для найденной тройки с максимальной суммой выведите значение
 суммы и индекс первого элемента тройки.*/

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i +3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }
        }
        System.out.println("максимум среди сумм трех соседних элементов: " + maxSum);
        System.out.println("индекс первого элемента тройки: " + maxSumIdx);
    }
}
