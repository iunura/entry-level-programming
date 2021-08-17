public class _007_UseAndAssign {
    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int x;

        System.out.print("x değerini giriniz :");
        x = kb.nextInt();

        x = x * x;
        System.out.print("Karesi ="+ x );
    }


}
