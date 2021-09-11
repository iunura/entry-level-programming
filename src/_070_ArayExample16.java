/*
Dizideki çift sayıları ve çift sayıların adedini toplamını ve ortalamasını ekrana yazdıran program
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/


public class _070_ArayExample16 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i, count, sum, avg , size;
        count = 0;
        sum = 0;
        size = 10;


        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 == 0) {
                count = count + 1;
                sum = sum + a [i];
                System.out.println("Dizideki çift sayılar : " + a[i]);
            }
        System.out.println(count);

        System.out.println("Toplam : " + sum );

        avg = sum / count;
        System.out.println("Ortalama : " + avg);

    }
}
