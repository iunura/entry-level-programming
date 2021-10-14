/******************************************************************************
 ÖDEV 1 : Dizinin en büyük elemanını dizinin sonundaki elemanıyla yer değiştiren prgram.

 0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
        public class _098_ArayExample43 {
            public static void main(String[] args) {
                int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
                int i, size, max, position;
                size = 10;
                max = a[0];

                position = 0;

                for ( i = 1; i < size; i = i + 1)
                    if( a[i] > max) {
                        max = a[i];
                        position = i;
                    }
                a[position] = a[size - 1];
                a[size - 1] = max;

                for ( i = 0; i < size; i = i + 1)
                    System.out.print(a[i] + " ");


    }
}
