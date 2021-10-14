/****************************************************************************
Klavyeden sürekli sayı giriliyor. o girince program çalışmasını sonlandırıyor.

 n == 0 ise çıkılacak eşit  değil ise dön
 *******************************************************************************/
public class _130_WhileExample01 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner(System.in);

        int n;

        System.out.print("n değeri giriniz : ");
        n = kb.nextInt();

        while(n != 0) {
            System.out.print("n değeri giriniz : ");
            n = kb.nextInt();
        }
    }
}
