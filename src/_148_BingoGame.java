import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/****************************************************************************
Torbadan 1'den 90' kadar 90 tane top var. Oyuncu 90 taşın 3'ünü çekiyor.
Çekilen 3 taşın toplamı 101'e eşit ve 101'den küçükse oyuncu kazanıyor. Değilse kaybediyor.

 *******************************************************************************/
public class _148_BingoGame {
    public static void main(String[] args) {
        int a[] = new int[3];
        java.util.Random generator = new java.util.Random();

        int i, n,size, cnt, flag, sum,total, winCnt;

        cnt = 0;
        size = 3;
        sum = 0;
        total = 1_000_000;
        winCnt = 0;

        for(i = 1; i <= total; i = i +1) {
            while (cnt != size) {
                n = generator.nextInt(90) + 1;
                flag = 0;
                for (i = 0; i < cnt; i = i + 1)
                    if (a[i] == n)
                        flag = 1;

                if (flag == 0) {
                    a[cnt] = n;
                    cnt = cnt + 1;
                }
            }

            sum = a[0] + a[1] + a[2];

            if (sum <= 101)
                winCnt = winCnt + 1;
        }

        System.out.println(winCnt + " kadar kazandınız...");

    }
}
