/*
Klavyeden girilen 3 farklı sayının en küçüğünü ekrana yazdıran program.
Not: 2 farklı şekilde çözünüz.
* */

public class _029_IfElseExample17 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c, min;

        System.out.print("a değerini giriniz:");
        a = kb.nextInt();
        System.out.print("b değerini giriniz:");
        b = kb.nextInt();
        System.out.print("c değerini giriniz:");
        c = kb.nextInt();

        min = a ;

        if (b < min)
            min = b;
        if (c < min)
            min = c;


        System.out.println ("Minimum = " + min);


    }
}
