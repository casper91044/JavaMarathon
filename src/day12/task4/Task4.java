package day12.task4;

import java.util.ArrayList;
import java.util.List;

/**Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
 группу можно было добавлять и удалять участников. Под участником понимается
 строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
 метода: transferMembers. Этот метод принимает в качестве аргументов два
 экземпляра класса MusicBand. Реализовать метод printMembers (в классе
 MusicBand), выводящий список участников в консоль. Проверить состав групп после
 слияния.*/

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balint");
        members1.add("Paul Kant");
        members1.add("Jorma");
        members1.add("Jack Casady");
        members1.add("Spencer Dryden");

        MusicBandUpdate band1 = new MusicBandUpdate("Jefferson", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Jhon Lennon");
        members2.add("Paul McCartney");
        members2.add("Ringo Starr");
        members2.add("George Harrison");

        MusicBandUpdate band2 = new MusicBandUpdate("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBandUpdate.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
