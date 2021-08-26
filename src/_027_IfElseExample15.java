//Klavyeden girilen 3 kenar uzunluğunun eşkanar üçgen olup olmadığını yazdıran program.

public class _027_IfElseExample15 {
    public static void main(String[] args) {
        java.util.Scanner kb =new java.util.Scanner(System.in);
        int a, b, c;

        System.out.print("a kenarını giriniz:");
        a = kb.nextInt();
        System.out.print("b kenarını giriniz:");
        b = kb.nextInt();
        System.out.print("c kenarını giriniz:");
        c = kb.nextInt();

        if (a == b)
            if (b == c)
                System.out.println("Eşkenar üçgendir..");
            else
                System.out.println("Eşkenar üçgen değildir..");
        else
            System.out.println("Eşkenar üçgen değildir...");

    }
}
