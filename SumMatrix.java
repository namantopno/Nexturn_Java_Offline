public class SumMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] s = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print the result
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}
