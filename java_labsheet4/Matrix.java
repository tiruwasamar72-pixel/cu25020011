class Matrix {
    int[][] a = {{1, 2}, {3, 4}};
    int[][] b = {{5, 6}, {7, 8}};
    static String matrixType = "2x2 Matrix";

    void calculate() {
        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                difference[i][j] = a[i][j] - b[i][j];
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println(matrixType);
        m.calculate();
    }
}