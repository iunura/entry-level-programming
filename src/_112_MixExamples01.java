/****************************************************************************
 ÖDEV: Klavyeden n'e göre belirtilen deseni ekrana yazdıran program.
 * * * * *
   * * * *
     * * *
       * *
         *
 *******************************************************************************/
public class _112_MixExamples01 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner(System.in);

        int i, n, k;

        System.out.print("n değeri giriniz : ");
        n = kb.nextInt();

        for (i = n ; i >= 1; i = i - 1) {
            for (k = 1; k <= n - i; k = k + 1)
                System.out.print(" ");

            for (k = 1; k <= i; k = k + 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
