public class _008_FormulaCalculate {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int a, b , c, d;

        System.out.print("a'nın değerini giriniz: ");
        a = kb.nextInt();

        System.out.print("b'nin değerini giriniz:");
        b = kb.nextInt();

        System.out.print("c'nin değerini giriniz:");
        c = kb.nextInt();

        d = 3 * a * a * a + 4 * b * b + 3 * c ;
        System.out.print("Toplam = " + d );

    }
}
