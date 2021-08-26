// Klavyeden girilen 3 kenar uzunlupunu 3 gen olduğunu kabul ediyoruz. Bu bir ikizkenar üçgen midir ?
// 5,5,3-ikizkenar 5,5,5-ikizkenar değildir 5,3,5-ikizkenar 3,5,5-ikizkenar 3,4,5-ikizkenar değildir.

public class _026_IfElseExample14 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;

        System.out.print("a kenarını giriniz:");
        a = kb.nextInt();
        System.out.print("b kenarını giriniz:");
        b = kb.nextInt();
        System.out.print("c kenarını giriniz:");
        c = kb.nextInt();

        if (a == b)
            if (b != c)
                System.out.println("İkizkenar üçgendir");
            else
                System.out.println("İkizkenar üçgen değildir.");
        else
            if (a == c)
                System.out.println("İkizkenar üçgendir. ");
            else
                if (b == c)
                    System.out.println("İkizkenar üçgendir");
                else
                    System.out.println("İkizkenar üçgen değildir. ");

    }
}
