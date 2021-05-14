package day12;

import java.util.ArrayList;
import java.util.List;

/** Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 из списка. Распечатать список.
 */

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("BMW");
        list.add("Mercedes");
        list.add("KIA");
        list.add("Toyota");

        System.out.println(list);

        list.add(2, "Tesla");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
