/*
Klavyeden girilen sayıdan küçük dizi elemanlarını ekrana yazdıran program.
Klavyeden 6 girildiğinde 4,3,1,5 yazılacak
            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/

public class _071_ArayExample17 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i, size, n;
        size = 10;

        System.out.print("n'yi giriniz :");
        n = kb.nextInt();

        for (i = 0; i < size; i = i+ 1)
            if (a[i] < n)
                System.out.println(a[i]);



    }
}
