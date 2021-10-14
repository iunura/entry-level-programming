/****************************************************************************
 ÖDEV 1: Her satırın en büyük elemanını ekrana yazdıran program.
 *******************************************************************************/
public class _109_MatrisExample01 {
    public static void main(String[] args) {
        int m[][] ={{5, 7, 3},
                {15, 6, 10},
                {22, 9, 1},
                {11, 14, 18}};

        int i, k, row,col, max;

        row = 4;
        col = 3;


        for (i = 0; i < row; i = i +1) {
            max = m [0][0];
            for (k = 0; k < col; k = k + 1)
                if (m[i][k] > max)
                    max = m[i][k];
            System.out.println(i + " " + "no'lu satırın en büyük elemanı :" + max);
        }

    }
}
