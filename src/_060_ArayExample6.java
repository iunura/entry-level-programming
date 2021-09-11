/*
Dizinin elemanlarının toplamlarını ekrana yazdıran program
            0  1  2  3  4   5  6   7   8   9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/
public class _060_ArayExample6 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9 ,21, 20, 5, 17 };

        int i, sum;

        sum = 0;

        for (i =0 ; i < 10; i = i+1)
            sum = sum + a[i];

        System.out.println("Toplam = " + sum);




    }
}
