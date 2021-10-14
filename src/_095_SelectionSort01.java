/******************************************************************************
 Dizinin en küçük elemanını dizinin ilk elemanıyla yer değiştiren program.

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _095_SelectionSort01 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, k ,  size, min, p;
        size = 10;

        for (k = 0; k < size -1; k = k + 1) {
            min = a[k];
            p = k;

            for (i = k + 1; i < size; i = i + 1)
                if (a[i] < min) {
                    min = a[i];
                    p = i;
                }
            a[p] = a[k];
            a[k] = min;
        }

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");



    }
}
