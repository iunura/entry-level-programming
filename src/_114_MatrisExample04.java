/****************************************************************************
3 e 3'lük bir matrisin orta elemanına 3 atayan program.
 *******************************************************************************/
public class _114_MatrisExample04 {
    public static void main(String[] args) {
        int m[][] = new int [3][3];

        int i, k;

        m [1][1] = 3;

        for (i = 0; i < 3; i = i + 1) {
            for (k = 0; k < 3; k = k + 1)
                System.out.print(m[i][k] + " ") ;
            System.out.println();
        }
    }
}
