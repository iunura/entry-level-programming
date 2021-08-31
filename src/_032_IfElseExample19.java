/* Klavyeden girilen 3 faarklı sayının ortancasını ekrana yazdıran program.
 3-4-5 girdiğimde ekrana 4 ayzdıralıacak. 3-2-1 girdiğinde ekrana 2 yazdırılacak.
*/
public class _032_IfElseExample19 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int a, b, c;

        System.out.print("a değerini giriniz :");
        a = kb.nextInt();
        System.out.print("b değerini giriniz :");
        b = kb.nextInt();
        System.out.print("c değerini giriniz :");
        c = kb.nextInt();

        if (b > a)
            if (b < c)
                System.out.println("b değeri ortancadır.");
            else
                if (a > c)
                    System.out.println("a değeri ortancıdır.");
                else
                    System.out.println("c değeri ortancıdır.");
        else
            if (a < c)
                System.out.println("a değeri ortancadır...");
            else
                if (c > b)
                    System.out.println("c değeri ortancıdır...");
                else
                    System.out.println("b değeri ortancıdır. ");



    }
}
