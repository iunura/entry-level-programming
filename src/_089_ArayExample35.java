/******************************************************************************
 Klavyeden s ve n giriliyor. Dizinin s nolu elemanından başlayarak n adet elemanını kendi içinde
 bir öne kaydıran program.
 s, 5 gitilecek, n 4

              0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/


public class _089_ArayExample35 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, s, n, size, temp;

        size = 10;

        System.out.print (" s = ");
        s = kb.nextInt();
        System.out.print (" n = ");
        n = kb.nextInt();

        temp = a[s];

        for(i = s + 1; i < s + n; i = i + 1)
            a[i - 1] = a[i];

        a [s + n -1] = temp;

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
    }
}
