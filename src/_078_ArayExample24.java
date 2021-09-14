/******************************************************************************
 Dizinin son n adet elemanını baştan sona doğru yazdıran program.
 n=4 girildiğinde dizinin son dört elemanı sırasıyla 21,20,5,17

              0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _078_ArayExample24 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, n, size;
        size = 10;

        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();

        for(i = size -n ; i < size ; i = i + 1)
        System.out.print(a[i] + " ");

    }
}
