/****************************************************************************
 5'e 5 lik bir matriste aşağıdaki şekilde atayn program

 1 0 0 0 0
 2 3 0 0 0
 4 5 6 0 0
 7 8 9 10 0
 11 12 13 14 15
 *******************************************************************************/
public class _129_MatrisExample19 {
    public static void main(String[] args) {
        int m[][] = new int [5][5];
        int i, k, row, col, cnt;

        row = 5;
        col = 5;
        cnt = 0;

        for (i = 0; i < row; i = i +1)
            for (k = 0; k < i +1; k = k + 1) {
                cnt = cnt + 1;
                m[i][k] = cnt;
            }

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }


    }
}
