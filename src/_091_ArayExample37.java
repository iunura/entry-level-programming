/******************************************************************************
 ÖDEV : Dizinin en büyük elamanını ekrana yazdıran program.

             0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/


public class _091_ArayExample37 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, max;
        size = 10;

        max = a[0];

        for (i = 1; i < size; i = i +1)
            if(a[i] > max)
                max = a[i];

        System.out.print("Maximum = " + max);
    }
}
