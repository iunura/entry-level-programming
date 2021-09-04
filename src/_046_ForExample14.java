/*
Klavyeden girilen n den küçük çift sayıları ekrana yazdıran program.
0 bir çift sayı olarak kabul edilir.

*/

public class _046_ForExample14 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n;

        System.out.println("n değerini giriniz: ");
        n = kb.nextInt();

        for (i = 0; i < n; i = i + 2)
            System.out.println(i);

    }
}
