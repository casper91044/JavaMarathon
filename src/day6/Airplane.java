package day6;

/**Создать класс Самолет (Airplane) с полями:
 - producer (изготовитель)
 - year (год выпуска)
 - length (длина)
 - weight (вес)
 - fuel (количество топлива в баке) + геттер для этого поля*/

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + " год выпуска: "
                + year + " длинна: " + length + " вес: " + weight +
                " количество топлива в баке: " + fuel);
    }

    public void fillUp(int x) {
        fuel += x;
    }
}
