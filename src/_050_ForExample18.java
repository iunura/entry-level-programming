/*
n klavyeden girilen pozitif bir tam sayıdır. 1'den n' kadar olan sayıları toplamını ekrana yazan program.
n = 9 girlidğinde  toplamı olacak
*/

public class _050_ForExample18 {
    public static void main(String[] args) {
        java.util.Scanner kb =new java.util.Scanner(System.in);
        int i, n, sum;

        System.out.println("n değerini giriniz:");
        n = kb.nextInt();

        sum = 0;

        for (i = 1; i <= n; i = i+ 1)
            sum  = sum + i;

        System.out.println(sum);

    }
}
