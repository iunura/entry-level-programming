/*
5 elemanlı a dizisine 2 den başlayan çift sayıları atayan program.

Sonuç olarak

a[0] = 2
a[1] = 4
a[2] = 6
a[3] = 8
a[4] = 10

*/

public class _058_ArayExample4 {
    public static void main(String[] args) {
        int a[] = new int[5];

        int i;

        for (i = 0; i < 5; i = i +1)
            a[i] = (i + 1) * 2;

        for (i = 0; i < 5; i =i + 1)
            System.out.println("a[" + i + "] = " + a[i]);


    }
}
