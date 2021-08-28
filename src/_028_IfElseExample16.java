/*
Klavyeden girilen 3 farklı sayının en büyüğünü ekrana yazdıran program. Sayıların farklı
girildiğini kabul ediyoruz.

2 farklı şekilde çözün.


*/
public class _028_IfElseExample16 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;

        System.out.println("a değerini giriniz:");
        a = kb.nextInt();
        System.out.println("b değerini giriniz:");
        b = kb.nextInt();
        System.out.println("c değerini giriniz:");
        c = kb.nextInt();

        if (a > b)
            if (a >c)
                System.out.println("a değeri büyüktür");
            else
                System.out.println("c değeri büyüktür");
        else
            if (b > c)
                System.out.println("b değeri büyüktür");
            else
                System.out.println("c değeri büyüktür...");




    }
}
