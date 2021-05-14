package day11.interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

        info1.showInfo();
        info2.showInfo();

        outInfo(info1);
        outInfo(info2);
    }

    public static void outInfo(Info info) {
        info.showInfo();
    }
}
