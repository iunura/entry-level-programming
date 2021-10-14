// Bilgisayara 1 milyon defa yazı tura attırıp kaç yazı kaç tura gelmiş bakan program.



public class _134_WhileExample05 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int n, i, size, countyazi, counttura;
        size = 1_000_000;
        countyazi = 0;
        counttura = 0;

        for (i = 1; i < size; i = i + 1) {
            n = generator.nextInt(100);
            if (n % 2 == 0)
                countyazi = countyazi + 1;
            else
                counttura = counttura + 1;
        }
        System.out.print("Yazı adedi : " + countyazi + " " + "Tura adedi : " + counttura);

    }
}