/*
Klavyeden girilen 0 ile 1000 arasında sayının 0 < n < 1000 basamak sayısını ekrana yazdıran program
Örneğin = 7 girildiğinde program 1 basamaklı
n= 52 girildiğinde program 2 abasamaklı
n = 417 girildiğinde program 3 abasamaklı diyecek


*/
public class _025_IfElseExample13 {

    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int x;

        System.out.print("x değerini giriniz : ");
        x = kb.nextInt();

        if (x < 10)
            System.out.println("Tek basamaklı");
        else
            if (x < 100)
                System.out.println("Çift basamaklı");
            else
                System.out.println("Üç basamaklıdır");


    }

}
