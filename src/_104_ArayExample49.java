/****************************************************************************
Klavyeden n'e göre belirtilen deseni ekrana yazdıran program.
 *
 * *
 * * *
 * * * *
 * * * * *

 *******************************************************************************/
public class _104_ArayExample49 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner(System.in);
        int i, n, k;

        System.out.print("n : ");
        n = kb.nextInt();

        for( i = 1; i <= n ; i = i +1) {
            for (k = 0; k < i; k = k + 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
