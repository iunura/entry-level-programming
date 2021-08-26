public class _024_IfElseExample12 {
    public static void main(String[] args) {
        // klavyeden girilen bir sayının0 ile ilişkisini yazan program
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int n ;

        System.out.print("n değerni giriniz :");
        n = kb.nextInt();

        if (n > 0)
            System.out.println(n + " > " + 0);
        else {
            if (n < 0)
                System.out.println(n + " < " + 0);
            else
                System.out.println(n + " == " +0);
        }

    }
}
