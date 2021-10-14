/******************************************************************************
 ÖDEV : Dizinin en küçük elamanını ekrana yazdıran program.

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/


public class _092_ArayExample38 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, min;
        size = 10;

        min = a[0];

        for (i = 1; i < size; i = i +1)
            if(a[i] < min)
                min = a[i];

        System.out.print("Minimum = " + min);
    }
}
