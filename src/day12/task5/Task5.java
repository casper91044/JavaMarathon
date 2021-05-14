package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick",54));
        members1.add(new MusicArtist("Marty Balint",54));
        members1.add(new MusicArtist("Paul Kant",23));
        members1.add(new MusicArtist("Jorma",12));
        members1.add(new MusicArtist("Jack Casady",78));
        members1.add(new MusicArtist("Spencer Dryden",34));

        MusicBandUpdate2 band1 = new MusicBandUpdate2("Jefferson", 1965, members1);

       List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Jhon Lennon",23));
        members2.add(new MusicArtist("Paul McCartney",45));
        members2.add(new MusicArtist("Ringo Starr",30));
        members2.add(new MusicArtist("George Harrison",45));

        MusicBandUpdate2 band2 = new MusicBandUpdate2("The Beatles", 1960, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBandUpdate2.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
