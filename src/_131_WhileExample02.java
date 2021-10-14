/****************************************************************************
 Klavyeden sürekli sayı giriliyor ve bu sayılar toplanıyor.Toplan 1000'i geçince son toplam ekrana yazdırılıyor
 ve programın çalışması sonlandırılıyor.
 *******************************************************************************/
public class _131_WhileExample02 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner(System.in);

        int n, sum;

        sum = 0;


        while (sum < 1000 ) {
            System.out.print("n değeri giriniz : ");
            n = kb.nextInt();
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
