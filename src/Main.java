public class Main {
    public static void main(String[] args) {
        /*
             8208
            /2 = 0
            /3 = 0
            /5 = 3
            /7 = 4
            /11 = 2
        */

        int rows_A = 4;
        int colomns_A = 3;
        int rows_B = 4;
        int colomns_B = 3;
        long[][] C = new long[rows_A + rows_B][colomns_A + colomns_B];
        long[][] A = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 8, 9},
                {4, 2, 4}
        };
        long[][] B = {
                {9, 8, 7},
                {2, 5, 6},
                {3, 8, 9},
                {4, 2, 4}
        };

        // Show A matrix
        System.out.println("A matrix: ");

        for (int i = 0; i < rows_A; i++) {
            for (int j = 0; j < colomns_A; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Show B matrix
        System.out.println("\nB matrix: ");

        for (int i = 0; i < rows_B; i++) {
            for (int j = 0; j < colomns_B; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //  C = A ⨁ B
        for (int i = 0; i < rows_A; i++) {
            for (int j = 0; j < colomns_A; j++) {
                C[i][j] = A[i][j];
                C[i+rows_B][j]=0;
            }
        }
        for (int i = 0; i < rows_B; i++) {
            for (int j = 0; j < colomns_B; j++) {
                C[i+rows_B][j+colomns_B] = B[i][j];
                C[i][j+colomns_B]=0;
            }
        }

        // Show С matrix
        System.out.println("\nС(A ⨁ B) matrix: ");
        for (int i = 0; i < rows_B+rows_A; i++) {
            for (int j = 0; j < colomns_B+colomns_A; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        //sum of min numbers
        long sum = 0;
        for (int i = 0; i < colomns_A+colomns_B; i++) {
            long max_temp = 0;
            for (int j = 0; j < rows_A+rows_B; j++) {
                long temp = C[j][i];
                if(j == 0){
                    max_temp = temp;
                }
                if(max_temp < temp){
                    max_temp = temp;
                }
            }
            sum += max_temp;
        }

        System.out.println("\nSum of max numbers = " + sum);
    }
}
