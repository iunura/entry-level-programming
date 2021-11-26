/****************************************************************************
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }
 klavyeden girilen sayının dizide olup olmadığını söyleyen program.

 *******************************************************************************/
public class _150_LieneerSearchExample {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i, n, size, flag;
        size = 10;
        flag = 0;

        System.out.print(" n değerini giriniz : " );
        n = kb.nextInt();

        for(i = 0; i < size; i = i + 1)
            if (n == a[i]) {
                flag = 1;
                break;
            }


        if (flag == 1)
            System.out.println(n + " dizide vardır. ");
        else
             System.out.println(n + " dizide yoktur.");
    }
}
