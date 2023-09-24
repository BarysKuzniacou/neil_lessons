package arrays_pack;

public class ArrayClass {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 33},
                        {4, 5, 6},
                        {7, 8, 9, 99, 999}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
