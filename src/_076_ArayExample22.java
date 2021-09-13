/******************************************************************************
 Dizinin son n adet elemanını dizinin başına atayan ve sondaki elemanları sıfırlayan program.
 n = 7 girildiğinde sonuç ; 1,18,9,21,20,5,17,0,0,0

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/

public class _076_ArayExample22 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, n;
        size = 10;

        System.out.print ("n'yi giriniz : ");
        n = kb.nextInt ();

        for ( i = 0; i < n ; i = i +1)
            a[i] = a[size-n+i];

        for ( i = n; i < size ; i = i +1)
            a[i] = 0;

        for ( i = 0; i < size ; i = i +1)
            System.out.print(a[i] + " ");



    }
}
