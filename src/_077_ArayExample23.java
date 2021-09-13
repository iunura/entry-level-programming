/******************************************************************************
 Dizinin elemanlarını bir öne kaydıran ve ilk elemanı dizinin sonuna atayan progrram.

 8,3,1,18,9,21,20,5,17,4 olacak

 0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _077_ArayExample23 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, temp;
        size = 10;
        temp = a[0];


        for (i = 0; i < size-1; i = i + 1)
            a[i] = a[i + 1];
        a[size-1] = temp;

        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
    }
}
