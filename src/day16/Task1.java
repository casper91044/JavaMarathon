package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Реализовать программу, которая на вход принимает txt файл с целыми числами
 (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 консоль среднее арифметическое этих чисел.
 Ответ будет являться вещественным числом. В консоль необходимо вывести полную
 запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
 (с 3 знаками после запятой). */

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            int sum = 0;
            for (String number: numbers) {
                sum += Integer.parseInt(number);
            }

            double result = (double) sum / numbers.length;

            System.out.printf(result + "--> %.3f", result);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
