package day4.material;

public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Java";
        strings[2] = "World";

        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();

        for (String string: strings) {
            System.out.println(string);
        }

        int[] numbers = {1,2,5,6,7};
        int sum = 0;
        for (int x: numbers) {
            sum += x;
        }
        System.out.println(sum);



    }
}
