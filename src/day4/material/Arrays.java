package day4.material;

public class Arrays {
    public static void main(String[] args) {
        int num = 10; // примитивный тип
        int[] numbers = new int[5]; // numbers -> [массив] ссылочный тип данных
        System.out.println(numbers[0]); // 0 1 2 3 4
        //System.out.println(numbers[5]); - вышли за пределы массива

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*10;
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println();

        int[] numbers1 = {1,2,3,10};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }


    }
}
