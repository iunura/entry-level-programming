public class _019_IfElseExample7 {
    public static void main(String[] args) {
        //Klavyeden girilen sayının mutlak değerini alan program. Bir sayı negatif olduğunda kendisi nega
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int k;

        System.out.print("k'nın değerini giriniz:");
        k = kb.nextInt();

        if (k < 0)
            k = k * -1;


        System.out.println("k = " +k);
    }
}
