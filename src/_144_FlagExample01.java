/****************************************************************************
Dizideki ilk tekten sonraki çift basamakları 2 ile çarpan program.

 *******************************************************************************/
public class _144_FlagExample01 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i, n, size, flag;

        size = 10;

        flag = 0;

        for(i = 0; i < size; i = i +1)
            if(flag == 0) {
                if (a[i] % 2 == 1)
                    flag = 1;
            }
        else
            if (a[i]  > 10)
               a[i] = a[i] * 2;

        for (i = 0; i < size; i = i+ 1)
            System.out.print (a[i] + " ");

    }
}
