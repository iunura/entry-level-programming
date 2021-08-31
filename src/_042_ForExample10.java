/*

Klavyeden a ve b giriliyor. a < b. A'dan B'ye kadar olan sayıları ekrana yazdıran program.
örnek a = 5 , b = 8 girilidğinde çıktı 5,6,7,8 0lacak.

*/

public class _042_ForExample10 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int i, a, b;

        System.out.print("a değerini giriniz:");
        a = kb.nextInt();

        System.out.print("b değerini giriniz:");
        b = kb.nextInt();

        for (i = a; i <= b; i = i + 1)
            System.out.println(i);
    }
}
