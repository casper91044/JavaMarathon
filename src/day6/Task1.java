package day6;

/** В классах Автомобиль и Мотоцикл реализовать два метода:
 info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 yearDifference() - принимает на вход число (год), и возвращает разницу между
 переданным годом и годом выпуска транспортного средства. */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Yellow");
        car.setModel("Citroen");
        car.setYear(2001);

        Motorbike motorbike = new Motorbike(1999, "Green", "Kawasaki");

        car.info();
        motorbike.info();

        int carYear = car.yearDifference(2021);
        System.out.println(carYear);

        int bikeYear = motorbike.yearDifference(2020);
        System.out.println(bikeYear);
    }

}
