package day18;

/**
 * Создайте рекурсивный метод, который принимает на вход единственный аргумент -
 * число, и возвращает количество цифр 7 в этом числе. Циклы использовать
 * запрещено, можно использовать только рекурсивные вызовы.
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(1727374757));
    }

    public static int count7(int number) {

        if (number == 0)
            return 0;

        if (number % 10 == 7)
            return 1 + count7(number / 10);
        else
            return count7(number / 10);
    }
}
