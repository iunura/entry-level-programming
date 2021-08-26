public class _021_IfElseExample9 {
    public static void main(String[] args) {
        // Klavyeden girilen x'e göre y'nin  ve z'nin değerini ekrana yazdıran program
        java.util.Scanner kb = new java.util.Scanner(System.in);
         int x, y, z;


        System.out.print("x'in değerini giriniz : ");
        x = kb.nextInt();

        if (x < 10) {
            y = x * x * x + 2 * x + 3;
            z = 2 * x * x;
        } else {
            y = x * x + 11;
            z = x;
        }

        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
