/*

n klavyeden girilen pozitf bir sayı. n > 0
1'den n' kadar olan sayıları ekrana yazdıran program. (n dahil)

*/

public class _040_ForExample8 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, n;

        System.out.print("n değerini giriniz:");
        n = kb.nextInt();

        for (i = 1; i <= n; i = i + 1)
            System.out.println(i);
    }
}
