/******************************************************************************
 ÖDEV 1 : Dizinin en büyük elemanını ve indis numarasını bulan program.

              0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/

public class _096_ArayExample41 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, max, p;
        size = 10;
        max = a[0];
        p =0;


        for(i = 1; i < size; i = i + 1)
            if (a[i] > max) {
                max = a[i];
                p = i;
            }
        System.out.print("Dizinin en büyük elemanı : " + max + " " + "İndis no : " + p);

    }
}
