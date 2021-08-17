public class _015_DigitExample {
    public static void main(String[] args) {
        // Klavyeden girilen çift basamaklı bir sayının basamaklarının karelerinin toplamını hesaplayan program
        // örnek 75 girildiğinde  7*7 = 49 , 5*5 = 25 ,  49+25 =74

        java.util.Scanner kb = new java.util. Scanner(System.in);
        int x, y, z, t;

        System.out.print("Çift basamaklı bir sayı giriniz : ");
        x = kb.nextInt();

        y = x / 10;
        z = x % 10;

        System.out.println ("Y'nin değeri= " + y );
        System.out.println ("Z'nin değerini giriniz :" + z);

        t = y * y + z * z;

        System.out.println("Toplam =" + t );





    }
}
