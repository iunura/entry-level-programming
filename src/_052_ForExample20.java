/*
n klavyeden girilen pozitif bir tam sayıdır. 1'den n' e kadar olan tek ve çift sayıların toplamlarını
ayrı ayrı hesaplayan

Örnek , klavyeden 8 girildiğinde

1+3+5+7 = 16
2+4+6+8 = 20

Sonuç olarak ekrana

Tekler toplam =16
Çifler toplamı = 20
*/


public class _052_ForExample20 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int n, i, sumEven, sumOdd;

        System.out.print("n değerini giriniz : ");
        n = kb.nextInt();

        sumEven= 0;
        sumOdd = 0;

        for (i = 1; i <= n; i = i +1)
            if (i % 2 == 0)
                sumEven = sumEven + i;

            else
                sumOdd = sumOdd + i;


          System.out.println("Çiftlerin Toplamı = " + sumEven);
          System.out.println("Teklerin Toplamı = " + sumOdd);

    }
}
