/****************************************************************************
 1 5 9
 2 6 10
 3 7 11
 4 8 12

 4'e 3'lük bir matrisi yukarıdaki şekle göre yazan program.
 *******************************************************************************/
public class _116_MatrisExample06 {
    public static void main(String[] args) {
        int m[][] = new int [4][3];

        int i, k, col, row, cnt;
        row = 4;
        col = 3;

        cnt = 0;

        for (i = 0; i < col; i = i + 1)
            for (k = 0; k < row; k = k + 1) {
                cnt = cnt + 1;
                m[k][i] = cnt;
            }

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
    }
}
