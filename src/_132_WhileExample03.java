/****************************************************************************
Klavyeden bir sayı okunuyor. Klavyeden okunan sayının 10'dan bölümünden kalan sıfır olmadıça dönecek.
 *******************************************************************************/
public class _132_WhileExample03 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner(System.in);

        int n;

        System.out.print("n değeri giriniz : ");
        n = kb.nextInt();

        while (n != 0) {
            System.out.println(n);
            n = n /10;

        }

    }
}
