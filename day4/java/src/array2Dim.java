public class array2Dim {
    public static void main(String[] args) {
//        this is array which have two dims
        int[][] a = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(a[i][j]);
            }
        }

//        and this is the second ways to it
        int[][] arr = {{1,32,43,534},{2,343,43}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
