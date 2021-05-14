package day12.task4;

import day12.task3.MusicBand;

import java.util.List;

public class MusicBandUpdate {
    private String name;
    private int year;
    private List<String> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public MusicBandUpdate(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBandUpdate a, MusicBandUpdate b) {
        for (String member: a.getMembers())
            b.getMembers().add(member);

        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
