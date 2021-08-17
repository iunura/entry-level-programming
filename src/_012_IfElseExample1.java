public class _012_IfElseExample1 {
    public static void main(String[] args) {
        // klavyeden girilen bir sayının 5'in katının olup olmadığını söyleyen program

        java.util.Scanner kb = new java.util.Scanner (System.in);
        int x;

        System.out.print( "Klavyeden bir değer giriniz :");
        x = kb.nextInt();

        if ( x % 5 == 0)
            System.out.print("5'in katıdır");
        else
            System.out.print("5'in katı değildir");


    }
}
