package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/** С клавиатуры вводится число n - размер массива. Необходимо создать
 массив указанного размера и заполнить его случайными числами от 0 до 10.
 Затем вывести содержимое массива в консоль, а также вывести в консоль
 информацию о:
 а) Длине массива
 б) Количество чисел больше 8
 в) Количество чисел равных 1
 г) Количество четных чисел
 д) Количество нечетных чисел
 е) Сумме всех элементов массива
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array= new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Длинна массива: " + arrayLength);

        int count8 = 0;
        for (int i = 0; i < arrayLength; i++){
            if (array[i] > 8){
                count8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + count8);

        int count1 = 0;
        for (int i = 0; i < arrayLength; i++){
            if (array[i] == 1) {
                count1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + count1);

        int countEven = 0;
        for (int i = 0; i < arrayLength; i++){
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Количество четных чисел: " + countEven);

        int countOdd = 0;
        for (int i = 0; i < arrayLength; i++){
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Количество четных чисел: " + countOdd);

        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
