/*
Dizinin elemanlarının toplamını ve ortalamasını ekraana yazdıran program.
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _067_ArayExample13 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, sum, avg;
        size = 10;
        sum = 0;

        for (i =0; i < 10; i = i+1)
            sum = sum + a[i];

        avg = sum / size;
        System.out.println("Toplam : " + sum + " " + "Ortalaması : " + avg);
    }
}
