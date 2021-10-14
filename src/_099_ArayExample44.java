/****************************************************************************
 Dizinin en büyük ve en küçük elemanının yerlerini değiştiren program

              0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _099_ArayExample44 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, max, min, positionMax, positionMin;

        size = 10;
        max = a[0];
        min =a[0];

        positionMax = 0;
        positionMin = 0;

        for(i = 1; i < size; i = i + 1 )
            if (a[i] > max) {
                max = a[i];
                positionMax = i;
            } else if (a[i] < min) {
                min = a[i];
                positionMin = i;
            }

        a[positionMin] = max;
        a[positionMax] = min;


        for ( i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");


    }
}
