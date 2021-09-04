/*
Klavyeden girilen n den küçük tek sayıları ekrana yazdıran program.

*/

public class _045_ForExample13 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
           int i, n;

        System.out.println("n değerini giriniz: ");
        n = kb.nextInt();

        for (i = 1; i < n; i = i + 2)
            System.out.println(i);
    }
}
