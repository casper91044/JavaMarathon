package day18.material;

public class Test {
    public static void main(String[] args) {
        System.out.println(fac(4));

    }

    private static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }

}
