/*
Klavyeden a ve b giriliyor.

a < b .. a ile b nin arasındaki 10'in katlarını ekrana yazdıran program.

a ve b dahil değil.
Örnek :
7 22 girildiğinde -> 10-20
10 22 girildiğibde ->20
10 30 girildiğinde ->20
*/
public class _054_ForExample22 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, a, b;

        System.out.print("a değerini giriniz : ");
        a = kb.nextInt();
        System.out.print("b değerini giriniz : ");
        b = kb.nextInt();

        for ( i = a + (10 - a % 10); i < b; i = i + 10)
            System.out.println(i);



    }
}
