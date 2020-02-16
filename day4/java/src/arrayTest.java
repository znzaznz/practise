public class arrayTest {
    public static void main(String[] args) {
        int[][] a = {{11,22,34},{33,17}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(a[i][j]);
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(a[1][i]);
        }
    }
}
