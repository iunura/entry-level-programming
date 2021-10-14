/******************************************************************************
 ÖDEV 1 : Dizinin en küçük elemanını dizinin ilk elemanıyla yer değiştiren program.

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _097_ArayExample42 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, min, position;
        size = 10;

        min = a[0];
        position = 0;

        for ( i = 1; i < size; i = i + 1)
            if( a[i] < min) {
                min = a[i];
                position = i;
            }

        a[position] = a[0];
        a[0] = min;

        for ( i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");



    }
}
