/*
n klavyeden girilen pozitif bir sayıdır. n çift ise 0 dan n e kadar (n dahil) olan çift sayıları,
tek ise 1 den n e kadar olan (n dahil) tek sayıları ekrana yazdıran program.
Örneğin n=8 girildiğinde 0,2,4,6,8 olacak 8 dahil
n =9 girildiğinde 1,3,5,7,9 olacak 9 dahil.
*/

public class _047_ForExample15 {
    public static void main(String[] args) {
        java.util.Scanner kb =new java.util.Scanner(System.in);
        int i, n;

        System.out.println("n değerini giriniz:");
        n = kb.nextInt();

        System.out.println("n % 2 = " + n % 2);

        if (n % 2 == 0)
            for (i = 0; i <= n; i = i + 2)
                System.out.println(i);
        else
            for (i = 1; i <= n; i = i + 2)
                System.out.println(i);
    }
}
