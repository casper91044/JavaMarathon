package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 (название музыкальной группы и год основания). Создать 10 или более экземпляров
 класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 список. Создать статический метод в классе Task3:
 public static List<MusicBand> groupsAfter2000(List<MusicBand>
 bands)
 Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 состоящий из групп, основанных после 2000 года. Вызвать метод
 groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 после 2000 года). */

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Tame impala", 2007);
        MusicBand band2 = new MusicBand("The Cure", 1976);
        MusicBand band3 = new MusicBand("THe Beatles", 1960);
        MusicBand band4 = new MusicBand("Skryptonite", 2018);
        MusicBand band5 = new MusicBand("Pompeya", 2006);
        MusicBand band6 = new MusicBand("Tiger", 2014);
        MusicBand band7 = new MusicBand("Jefferson", 1965);
        MusicBand band8 = new MusicBand("Jimi Hendrix ", 1966);
        MusicBand band9 = new MusicBand("Kedr", 2008);
        MusicBand band10 = new MusicBand("Kook", 2003);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        
        List<MusicBand> musicBandsAfter2000 = new ArrayList<>();
        for (MusicBand band: musicBands) {
            if (band.getYear() > 2000)
                musicBandsAfter2000.add(band);
        }
        System.out.println(musicBandsAfter2000);
    }
}
