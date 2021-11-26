/****************************************************************************
 Bilgisayara 360_000 defa çift zar attırıyoruz. Kaç defa 6-6 gelmiştir.

 *******************************************************************************/
public class _147_DiceGame {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int i, dice1, dice2, total, count ;

        total = 360_000;
        count = 0;

        for (i = 1; i <= total; i = i + 1) {
            dice1 = generator.nextInt(6) + 1;
            dice2 = generator.nextInt(6) + 1;
            if (dice1 * dice2 == 36)
                count = count + 1;
        }
        System.out.print (count + " defa düşeş olmuştur..");

    }
}
