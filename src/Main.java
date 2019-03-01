public class Main {
    public static void main(String[] args) {
        /*
             8206
            /2 = 0
            /3 = 1
            /5 = 1
            /7 = 2
            /11 = 0
        */

        short rows = 4;
        short colomns = 3;
        short[][] nums_2 = new short[colomns][rows];
        short[][] nums = {
                {1, 2, 3},
                {2, 5, 6},
                {3, 8, 9},
                {4, 2, 4}
        };

        // Show matrix

        System.out.println("Main matrix: ");

        for (short i = 0; i < rows; i++) {
            for (short j = 0; j < colomns; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println(" ");
        System.out.println("New matrix:");


        //Changes C = A^t
        for (short i = 0; i < rows; i++) {
            for (short j = 0; j < colomns; j++) {
                short temp = nums[i][j];
                nums_2[j][i] = temp;
            }
        }

        //sout new matrix
        for (short i = 0; i < colomns; i++) {
            for (short j = 0; j < rows; j++) {
                System.out.print(nums_2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(" ");

        short sum = 0;
        for (short i = 0; i < rows; i++) {
            short min_temp = 0;
            for (short j = 0; j < colomns; j++) {
                short temp = nums_2[j][i];
                if(j == 0){
                    min_temp = temp;
                }
                if(min_temp > temp){
                    min_temp = temp;
                }
            }
            sum += min_temp;
        }

        System.out.println("Sum of min numbers = " + sum);


    }
}
