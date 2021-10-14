/****************************************************************************
 Klavyeden girlen sayının basamaklarını ayıran program.

 7 2 3 5 girildiğinde ekrana sırasıyla 5 3 2 7 yazılacak
 *******************************************************************************/
public class _133_WhileExample04 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner(System.in);

        int n;

        System.out.print("n değeri giriniz : ");
        n = kb.nextInt();

        while (n!= 0) {
            System.out.print(n % 10 + " ");
            n = n / 10;
        }
    }
}
