/******************************************************************************
 İkinci bir dizi yardımıyla a dizisini n defa kaydıran program.
 n = 4 girildiğinde a'nın ilk 4 elemanını yedeklemeye almak gerekiyor

 // b [] = 4,8,3,1
 a[]= 18,9,21,20,5,17,4,8,3,1

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/

public class _088_ArayExample34 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int b[] = new int[10];

        int i, size, n,  temp;
        size = 10;


        System.out.print (" n = ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 1)
            b[i] = a[i];
        for (i = n; i < size; i = i + 1)
            a[i - n] = a[i];
        for (i = 0; i < n;i = i + 1)
            a[size - n + i] = b[i];

        for(i = 0; i < size; i = i + 1)
        System.out.print(a[i] + " ");


    }
}
