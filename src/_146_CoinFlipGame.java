/****************************************************************************
Bilgisayara 1milyon defa yazı tura attırılıp kaç yazı kaç tura gelmiş
 0 tura
 1 yazı
 *******************************************************************************/
public class _146_CoinFlipGame {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int i, n, total, countHead,countTail;

        total = 1_000_000;
        countHead = 0;
        countTail = 0;


        for (i = 1; i <= total; i = i + 1) {
            n = generator.nextInt(2);
            if (n == 0)
                countHead = countHead + 1;
            else
                countTail = countTail + 1;
        }
        System.out.print("Tura = " + countTail + " " + "Yazı = " + countHead);

    }
}
