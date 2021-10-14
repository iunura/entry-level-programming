/****************************************************************************
 10'dan küçük üretilen 1000 adet rastegele sayının kaçının tek , kaçının çift olduğunu ekrana yazdıran program.
 *******************************************************************************/
public class _138_WhileExample09 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int i, n, total, cntOdd, cntEven ;

        total = 1000;
        cntEven = 0;
        cntOdd = 0;

        for (i = 1; i <= total; i = i + 1) {
            n = generator.nextInt(10);
            if (n % 2 == 0)
                cntEven = cntEven + 1;
            else
                cntOdd = cntOdd + 1;
        }
        System.out.print ("Çiflerin Sayısı : " + cntEven + " " + "Teklerin Sayısı : " + cntOdd );
    }
}
