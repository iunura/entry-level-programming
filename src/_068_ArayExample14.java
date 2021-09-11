/*
Dizideki çift sayıları ekrana yazdıran program
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _068_ArayExample14 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i;

        for (i = 0; i < 10; i = i + 1)
            if (a[i] % 2 == 0)
                System.out.println("Dizideki çift sayılar : " + a[i]);
    }

}
