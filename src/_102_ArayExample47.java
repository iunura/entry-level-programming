/****************************************************************************
 Dizinin tek sayılarını 1 kere basan çift sayılarını 2 kere basan program

 0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _102_ArayExample47 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i , size, k;
        size = 10;

        for ( i = 0 ; i < size; i = i +1) {
            if (a[i] % 2 == 0)
                for (k = 1; k <= 2; k = k + 1)
                    System.out.print(a[i] + " ");
            else
                for (k = 1; k <= 1; k = k + 1)
                    System.out.print(a[i] + " ");
            System.out.println();
        }

    }
}
