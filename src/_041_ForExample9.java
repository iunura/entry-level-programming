/*

Klavyeden girilen n kadar * ekrana basan program.
5 girildiğinde ***** olacak.

*/

public class _041_ForExample9 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);

        int i, n;

        System.out.println("N değerini giriniz:");
        n = kb.nextInt();


        for (i = 1; i <= n; i = i + 1)
            System.out.print("*");

    }
}
