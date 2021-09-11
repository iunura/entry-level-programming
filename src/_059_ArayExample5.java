/*
5 elemanlı a dizisine 1 den başlayan tek sayıları atayan program.

Sonuç olarak

a[0] = 1
a[1] = 3
a[2] = 5
a[3] = 7
a[4] = 9

*/


public class _059_ArayExample5 {
    public static void main(String[] args) {
        int a[] = new int[5];

        int i;

        for (i = 0; i < 5; i = i +1)
            a[i] = (i * 2) + 1;

        for (i = 0; i < 5; i =i + 1)
            System.out.println("a[" + i + "] = " + a[i]);

    }

}
