import java.util.Random;

/****************************************************************************
10 elemanlı bir diziye  10'dan küçük rastgele sayıyı diziye yerleştiren program.

 *******************************************************************************/

public class _151_RandomArayGenerator {
    public static void main(String[] args) {
        int a[] = new int[10];
        java.util.Random generator = new java.util.Random();

        int i, total, n, size;

        total = 10;
        size = 10;

        for (i = 0; i < size; i = i +1) {
            n = generator.nextInt(10);
            a[i] = n;
        }

        for(i = 0; i < size; i= i+ 1)
            System.out.print(a[i] + " ");

    }
}
