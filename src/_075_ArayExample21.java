/*
Klavyeden s ve n giriliyor. Dizinin s nolu elemanından başlayarak n adet elemanı ekrana yazdıran program.
s = 5, n = 4 girildiğinde 9,21,20 ve 5 basılacak.

            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/
public class _075_ArayExample21 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, s, n;

        System.out.print("s'yi giriniz : ");
        s =kb.nextInt();
        System.out.print("n'yi giriniz : ");
        n =kb.nextInt();

        for(i = s; i < s+n; i = i + 1)
            System.out.print(a[i] + " ");


    }
}
