package day4.material;

public class MultiArrays {
    public static void main(String[] args) {
        int [][] matrix =   {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        System.out.println(matrix[2][2]);

        String[][] str = new String[2][3];
        str[0][2] = "Hello";
        System.out.println(str[0][1]);
        System.out.println(str[0][2]);
        System.out.println();

        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
