/*
Klavyeden girilen  10 sayının toplamını ekrana yazan program.
*/

public class _054_ForExample23 {
    public static void main(String[] args) {
        int i, n, sum;

        sum = 0;

        java.util.Scanner kb = new java.util.Scanner (System.in);
        for (i = 0; i < 10; i = i+1) {
            System.out.print("n'in değerini giriniz:");
            n = kb.nextInt();
            sum = sum + n;
        }

        System.out.println(sum);


    }
}
