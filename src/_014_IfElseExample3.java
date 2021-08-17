public class _014_IfElseExample3 {
    public static void main(String[] args) {

        boolean kosul1 = false;
        boolean kosul2 = false;
        boolean kosul3 = true;
        boolean kosul4 = false;


        if (kosul1) {
            if (kosul2) {
                System.out.println("Deyim A");
            } else {
                System.out.println("Deyim B");
                System.out.println("Deyim C");
            }

            if (kosul3)
                System.out.println("Deyim D");
            else
                ;

            System.out.println("Deyim E");
        } else {
            if (kosul3)
                System.out.println("Deyim F");
            System.out.println("Deyim G");

            if (kosul4)
                ;
            else {
                System.out.println("Deyim H");
                System.out.println("Deyim I");
            }

        }
    }
}

/*

1-

        boolean kosul1 = true;
        boolean kosul2 = true;
        boolean kosul3 = true;
        boolean kosul4 = false;

oldugunda sonuc ne cikar? A,D,E




2-

boolean degerlerini oyle bir duzenleyinki ciktisi

B
C
D
E

        boolean kosul1 = true;
        boolean kosul2 = false;
        boolean kosul3 = true;
        boolean kosul4 = false;

3-

A
B
C
D
E

ciktisinin cikmasi mümkun mu?
Mümkün değil.

4-

boolean degerlerini oyle bir duzenleyinki ciktisi

G

        boolean kosul1 = false;
        boolean kosul2 = false;
        boolean kosul3 = false;
        boolean kosul4 = true;




5-

boolean degerlerini oyle bir duzenleyinki ciktisi

F
G
H
I

        boolean kosul1 = false;
        boolean kosul2 = false;
        boolean kosul3 = true;
        boolean kosul4 = false;



*/

