package day12.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /**JAVA 5*/
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(0);
        System.out.println(animal);


        /**Появление Generics*/
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);


        /**JAVA 7*/
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat");
        animals3.add("dog");
        animals3.add("frog");

        String animal3 = animals3.get(2);
        System.out.println(animal3);
    }

}
