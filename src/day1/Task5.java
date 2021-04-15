package day1;

/** Повторить задание 4, но используя цикл for.
 */

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        for (int i = year; i <= 2020; i += 4) {
            System.out.println("Олимпиада " + i + " года");
        }
    }
}
