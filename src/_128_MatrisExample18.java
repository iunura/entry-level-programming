/****************************************************************************
 5'e 5 lik bir matriste aşağıdaki şekilde atayn program

 0 0 0 0 1
 0 0 0 1 0
 0 0 1 0 0
 0 1 0 0 0
 1 0 0 0 0
 *******************************************************************************/
public class _128_MatrisExample18 {
    public static void main(String[] args) {
        int m[][] = new int [5][5];
        int i, k, row, col;

        row = 5;
        col = 5;

        for (i = 0; i < row; i = i +1)
            m[i][col - 1 - i] = 1;

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }


    }
}
