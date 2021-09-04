/*
Klavyeden a ve b giriliyor.

a < b .. a ile b nin arasındaki 5'in katlarını ekrana yazdıran program.

a ve b dahil değil.
Örnek :
7 22 girildiğinde -> 10-15-20
10 22 girildiğibde ->15 20
10 20 girildiğinde -> 15
*/
public class _053_ForExample21 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int i, a, b;

        System.out.print("a değerini giriniz : ");
        a = kb.nextInt();
        System.out.print("b değerini giriniz : ");
        b = kb.nextInt();

        for (i = a + ( 5- a % 5); i < b; i = i + 5  )
            System.out.println(i);

    }
}
