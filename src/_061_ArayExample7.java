/*
Dizinin elemanlarının ortalamalarını ekrana yazdıran program
            0 1 2 3 4  5 6  7  8 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _061_ArayExample7 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9 ,21, 20, 5, 17 };

        int i, sum, avg, size;

        sum = 0;
        size = 10;

        for (i =0 ; i < size; i = i+1)
            sum = sum + a[i];

        System.out.println("Toplam = " + sum);

        avg = sum / size;
        System.out.println("Ortalama = " + avg);



    }
}