/*
n klavyeden girilen pozitif bir sayıdır. n çift ise 0 dan n e kadar (n dahil) olan çift sayıları,
tek ise 1 den n e kadar olan (n dahil) tek sayıları ekrana yazdıran program.
Örneğin n=8 girildiğinde 0,2,4,6,8 olacak 8 dahil
n =9 girildiğinde 1,3,5,7,9 olacak 9 dahil.
*/

public class _048_ForExample16 {
    public static void main(String[] args) {
        java.util.Scanner kb =new java.util.Scanner(System.in);
        int i, n;

        System.out.println("n değerini giriniz:");
        n = kb.nextInt();

        for (i = n % 2; i <= n; i = i + 2)
            System.out.println(i);

    }
}
