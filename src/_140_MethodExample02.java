/****************************************************************************
 *           0  1  2  3  4   5  6    7  8   9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 } 2 tane rastegele indis numarası bulunacak. Sonra bu bulduğumuz
 indislerin dizideki yerleri değişecek. ( 1000 defa yapılacak)
 *******************************************************************************/
public class _140_MethodExample02 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        java.util.Random generator = new java.util.Random();

        int i, size,n, z,  temp;
        size = 10;
        temp = 0;

        for (i = 1; i <= 1000; i = i + 1) {
            n = generator.nextInt(10);
            z = generator.nextInt(10);
            temp = a[n];
            a[n] = a[z];
            a[z] = temp;
        }

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}
