/****************************************************************************
 1 2 3
 1 2 3
 1 2 3
 1 2 3

 4'e 3'lük bir matrisi yukarıdaki şekle göre yazan program.
 *******************************************************************************/
public class _117_MatrisExample07 {
    public static void main(String[] args) {
        int m[][] = new int [4][3];

        int i, k, col, row, cnt;
        row = 4;
        col = 3;


        for (i = 0 ; i < row; i = i + 1) {
            cnt = 0;
            for (k = 0; k < col; k = k + 1) {
                cnt = cnt + 1;
                m[i][k] = cnt;
            }
        }

        for (i = 0 ; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }



    }
}
