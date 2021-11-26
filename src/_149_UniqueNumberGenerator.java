/****************************************************************************
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }
 klavyeden girilen sayının dizide olup olmadığını söyleyen program.

 *******************************************************************************/

public class _149_UniqueNumberGenerator {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        java.util.Scanner kb = new java.util.Scanner(System.in);


        int n, flag;

        flag = 0;

        System.out.print("n : ");
        n = kb.nextInt();



        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                flag = 1;
                break;
            }
        }

        if (flag==1)
            System.out.print("Dizide vardır");
        else
            System.out.print("dizide yoktur");


    }
}
