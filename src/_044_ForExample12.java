/*
Klavyeden a ve b giriliyor.
a < b.. 5,6,7,8
a == b... 5
a > b... 8,7,6,5
Her durumda a'dan b'ye kadar olan sayılar yazılacak
*/

public class _044_ForExample12 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, a, b;

        System.out.print("a değerini giriniz:");
        a = kb.nextInt();

        System.out.print("b değerini giriniz:");
        b = kb.nextInt();

        if (a < b)
            for (i = a; i <= b; i = i + 1)
                System.out.println(i);
        else
            for (i =a; i >=b; i = i - 1 )
                System.out.println(i);


       }
    }

