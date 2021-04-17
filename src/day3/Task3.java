package day3;

import java.util.Scanner;

/**Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
 *  Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
 *  Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
 *  мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
 *  Ключевое слово else использовать в этой программе нельзя.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (counter < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            counter++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(a / b);
        }
    }
}
