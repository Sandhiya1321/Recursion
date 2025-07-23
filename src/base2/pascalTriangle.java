package base2;

import java.util.Scanner;

public class pascalTriangle {
        public static void getRow(int n, int[] row) {
            if (n == 0) {
                row[0] = 1;
                return;
            }

            int[] prevRow = new int[n];
            getRow(n - 1, prevRow);

            row[0] = 1;
            row[n] = 1;


            for (int i = 1; i < n; i++) {
                row[i] = prevRow[i - 1] + prevRow[i];
            }
        }

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n = scan.nextInt();
            int[] row = new int[n + 1];
            getRow(n, row);
            for (int num : row) {
                System.out.print(num + " ");
            }
        }
}
