public class _013_IfElseExample2 {
    public static void main(String[] args) {
        // Klavyeden girilen bir sayının tek mi çift mi olduğunu söyleyen program

        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i;

        System.out.print("Klavyeden bir sayı giriniz : ");
        i = kb.nextInt();

        if(i % 2 == 0)
          System.out.println("Çifttir");
        else
           System.out.println("Tektir");
    }
}
