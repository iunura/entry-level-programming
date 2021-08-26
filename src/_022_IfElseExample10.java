public class _022_IfElseExample10 {
    public static void main(String[] args) {
        // Klavyeden girilen a ve b değerlerinin aralarındaki büyüklük ilişkisini ekrana yazdıran program
        // a > b ise a büyüktür b'den
        // a = b ise a ve b birbirine eşittir.
        // a < b ise a küçüktür b'den.

        java.util.Scanner kb = new java.util.Scanner(System.in);

        int a, b;

        System.out.print("a'nın değerini giriniz : ");
        a = kb.nextInt();

        System.out.print("b'nin değerini giriniz : ");
        b = kb.nextInt();

        if (a > b)
            System.out.println(a + " > " + b);
        else {
            if (a < b)
                System.out.println(a + " < " + b);
            else
                System.out.println(a + " == " + b);
        }


    }
}
