/*
5 elemanlı bir dizi tanımlanıyor. Dizinin elemanlarına sırasıyla 0,1,2,3,4 atayan program yazın.
Sonuç olarak

a[0] = 0
a[1] = 1
a[2] = 2
a[3] = 3
a[4] = 4

*/

public class _057_ArayExample3 {
    public static void main(String[] args) {
        int a[] = new int [5];

        int i;
        for (i = 0; i < 5; i =i + 1)
            a[i] = i;

        for (i = 0; i < 5; i =i + 1)
            System.out.println("a[" + i + "] = " + a[i]);


    }
}
