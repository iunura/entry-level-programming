public class _020_IfElseExample8 {
    public static void main(String[] args) {
        //Klavyeden girilen sayının 10'dan büyük olup olmadığını söyleyen program. 20 girildiğinde büyüktür,
        // 5 girildiğinde küçüktür.
        java.util.Scanner kb = new java.util.Scanner (System.in);

        int n;

        System.out.print("Bir sayı giriniz :");
        n = kb.nextInt();

        if (n >10)
            System.out.println("Büyüktür..");
        else
            System.out.println("Küçük veya eşittir..");
    }
}
