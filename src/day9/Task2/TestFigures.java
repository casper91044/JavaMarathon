package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red",10,10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Yellow", 10, 20, 15),
                new Rectangle(5, 10, "Red"),
                new Rectangle(54, 13, "Orange"),
                new Circle(3, "Red"),
                new Circle(6, "Red"),
                new Circle(9, "Red"),
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;

        for (Figure figure: figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;

        for (Figure figure: figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();
        }
        return sum;
    }
}
