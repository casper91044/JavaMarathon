package day17.material;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal);

        switch (animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
                break;
        }

        Season season = Season.SUMMER;
        System.out.println(season);
        switch (season) {
            case SUMMER:
                System.out.println("Warm");
                break;
            case WINTER:
                System.out.println("Cold");
                break;
        }
    }
}
