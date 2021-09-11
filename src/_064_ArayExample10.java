/*
Dizideki çift sayıları ve çift sayıların adedini ekrana yazan program.
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _064_ArayExample10 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i,cnt;

        cnt = 0;

        for (i = 0; i < 10; i = i + 1)
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
                cnt = cnt + 1;
            }

        System.out.println("Çift adedi =" + cnt);



    }



}
