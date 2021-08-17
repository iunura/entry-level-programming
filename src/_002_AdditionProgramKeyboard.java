public class _002_AdditionProgramKeyboard {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b ,c;

        System.out.print("a'nın değerini giriniz :");
        a = kb.nextInt();

        System.out.print("b'nin değerni giriniz : ");
        b = kb.nextInt();

        c = a + b;
        System.out.print("Toplam = " + c);

    }
}
