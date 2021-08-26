public class _016_IfElseExample4 {
    public static void main(String[] args) {
        //Klavyeden girilen 2 farklı sayının büyüğünü ekrana yazdıran program.

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int x, y;

        System.out.print("x'in değerini giriniz :");
        x = kb.nextInt();

        System.out.print("y'nin değerini giriniz : ");
        y = kb.nextInt();

        if (x>y)
            System.out.println("x büyüktür..");
        else
            System.out.println("y büyüktür..");




    }
}
