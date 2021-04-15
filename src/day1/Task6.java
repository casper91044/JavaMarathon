package day1;

/**Объявите переменную типа int, имя переменной - k. Присвойте этой переменной
 какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение (for или while),
 выведите в консоль таблицу умножения для этой цифры*/

public class Task6 {
    public static void main(String[] args) {
        int k = 7;
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " x " + k + " = " + i * k);
        }
    }
}
