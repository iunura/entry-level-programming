/*

Klavyeden a ve b giriliyor. a > b. a dan b ye kadar olan sayıları ekrana yazdıran program.
örnek a = 8 , b = 5 girilidğinde çıktı 8765 0lacak.

*/

public class _043_ForExample11 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int i, a, b;

        System.out.print("a değerini giriniz:");
        a = kb.nextInt();

        System.out.print("b değerini giriniz:");
        b = kb.nextInt();

        for (i = a; i >= b; i = i - 1)
            System.out.println(i);
    }
}
