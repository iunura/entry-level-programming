/****************************************************************************
 Her sütunun en  büyük elemanını ekrana yazdıran program.
 *******************************************************************************/
public class _124_MatrisExample14 {
    public static void main(String[] args) {
        int m[][] = {
                {5, 7, 3},
                {15, 6, 10},
                {22, 9, 1},
                {11, 14, 18}};
        int i, k, row, col, max;

        row = 4;
        col = 3;

        for (i = 0; i <col ; i = i + 1) {
            max = m[0][i];
            for (k = 0; k < row; k = k + 1)
                if (m[k][i] > max)
                    max = m[k][i];
            System.out.println(i + ". sütunun maximum değeri = " + max);
        }

    }
}
