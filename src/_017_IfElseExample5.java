public class _017_IfElseExample5 {
    public static void main(String[] args) {
        //Klavyeden girilen iki sayının birbirine eşit olup olmadığını söyleyen program

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b;

        System.out.print("a'nın değerini giriniz : ");
        a = kb.nextInt();

        System.out.print("b'nin değerini giriniz :");
        b = kb.nextInt();

        if (a==b)
            System.out.println("a ve b birbirine eşittir...");
        else
            System.out.println("a ve b birbirine eşit değildir...");



    }
}
