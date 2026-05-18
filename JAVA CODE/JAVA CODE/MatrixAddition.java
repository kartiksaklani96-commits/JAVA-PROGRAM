public class MatrixAddition {
    public static void main(String[] args) {
        // Define two 2x3 matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Resultant matrix
        int[][] result = new int[2][3];

        // Perform addition
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

