public class _023_IfElseExample11 {
    public static void main(String[] args) {
        //Kalvyeden girilen sayının o ile 100 arasında olup olmadığını ekrana yazdıran program
        // 0 girildiğinde dahil değil
        //52 girildiğinde arasında
        // 100 girildiğinde arasında değil
        // 110 girilidğinde arasında değil
        // -7 girildiğinde arasında değil

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int x;

        System.out.print("x'in değerini giriniz : ");
        x = kb.nextInt();

        if (x > 0) {

            if (x < 100)
                System.out.println("Arasında");
            else
                System.out.println("Arasında değil!");

        } else
            System.out.println("Arasında değil");


    }
}
