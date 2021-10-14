/******************************************************************************
 ÖDEV : Dizinin en küçük ve en büyük elamanını bulan program

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _093_ArayExample39 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, min, max, p;
        size = 10;
        p = 0;

        min = a[0];
        max = a[0];

        for (i = 1; i < size; i = i + 1) {
            if (a[i] > max)
                max = a[i];
            else
                if (a[i] < min)
                    min = a[i];
        }

        System.out.println("Dizinin en büyük elemanı = " + max);
        System.out.println("Dizinin en küçük elemanı = " + min);

    }
}
