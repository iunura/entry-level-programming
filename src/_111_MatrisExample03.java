/****************************************************************************
 ÖDEV 2: Her satırın toplamını ve ortlamalasını ekrana ayrı ayrı yazdıran program
 *******************************************************************************/
public class _111_MatrisExample03 {
    public static void main(String[] args) {
        int m[][] ={{5, 7, 3},
                {15, 6, 10},
                {22, 9, 1},
                {11, 14, 18}};

        int i, k, row,col, max, sum, avg;

        row = 4;
        col = 3;


        for (i = 0; i < row; i = i + 1) {
            sum = 0;
            for (k = 0; k < col; k = k + 1)
                sum = sum + m[i][k];
            avg = sum / col;

            System.out.println(i + " no'lu satırın toplamı :" + sum + " " + "Ortalaması : " + avg);
        }




    }
}
