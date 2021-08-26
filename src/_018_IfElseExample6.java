public class _018_IfElseExample6 {
    public static void main(String[] args) {
        //Klavyeden girilen a ve b değerlerinin a sayısının b'nin tam katı olup olmadığını ekrana yazdıran program
        // Örnek

        // a    b
        // 10   5   tam katıdır.
        //18   10   tam katı değildir.

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b;

        System.out.print("a'nın değerini giriniz : ");
        a = kb.nextInt();

        System.out.print("b'nin değerini giriniz :");
        b = kb.nextInt();

        if (a % b == 0)
            System.out.println("a, b'nin tam katıdır.");
        else
            System.out.println("a,b'nin tam katı değildir.");
    }
}
