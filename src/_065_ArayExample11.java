/*
Dizideki minimum sayıyı bulan program
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _065_ArayExample11 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i, min;

        min = a[0];

        for (i = 1; i < 10; i = i+1)
            if (min > a[i])
                min = a[i];
        System.out.println("minimum sayı = " + min);




    }
}
