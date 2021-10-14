/****************************************************************************
Diziyi 1000 defa karıştır , dizide kaçının yer değiştirdiğini bakmamız gerekiyor.
 *******************************************************************************/
public class _141_MethodExample03 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int b[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        java.util.Random generator = new java.util.Random();

        int i , size,n, z,temp, count, total;
        size = 10;
        count = 0;
        temp = 0;
        total = 1000;

        for (i = 1; i <= total; i = i + 1) {
            n = generator.nextInt(10);
            z = generator.nextInt(10);
            temp = a[n];
            a[n] = a[z];
            a[z] = temp;
        }
        for(i = 0; i < size; i = i + 1)
            if (a[i] != b[i])
                count = count + 1;

        System.out.println(count +  " adet yer değiştirmiş " );

        for (i=0; i <size; i = i+1)
            System.out.print(a[i] + " ");



    }
}
