package day7;

/**В классе Самолет создать статический метод compareAirplanes, который в
 качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2002,29,2000);
        Airplane airplane2 = new Airplane("S7", 2008,28,2090);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
