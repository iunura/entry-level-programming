public class _028_IfElseExample16_2 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c, max;

        System.out.println("a değerini giriniz:");
        a = kb.nextInt();
        System.out.println("b değerini giriniz:");
        b = kb.nextInt();
        System.out.println("c değerini giriniz:");
        c = kb.nextInt();

        max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        System.out.println("Maximum =" +max);


    }


}
