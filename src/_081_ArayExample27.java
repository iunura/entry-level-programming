/******************************************************************************
 Klavyeden s ve n giriliyor. s nolu elemandan başlayarak , n adet kadar elemanı geriden başlayarak ekrana
 yazdıran progra.
 s 5 girildiğinde n 4 girildiğinde 9,18,1,3 olacak
              0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/

public class _081_ArayExample27 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, n, s, size;
        size = 10;

        System.out.print("s'yi giriniz : ");
        s = kb.nextInt();
        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for(i = s; i > s - n; i = i - 1)
            System.out.println(a[i] + " ");




    }
}
