/*
Dizinin ilk n adet elemanını dizinin sonuna atayan ve baştaki elemanları sıfırlayan program.
n = 7 girildiğinde 0,0,0,4, 8, 3, 1, 18, 9, 21 olacak.
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _073_ArayExample19 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, n, size;
        size = 10;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 1)
          a[size-1-i] = a[n-1-i];

        for (i =0; i < size - n; i = i +1)
            a[i] = 0;


        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");


    }
}
