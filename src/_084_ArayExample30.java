/******************************************************************************
 Diziyi tersine çeviren program

17,5,20,21,9,18,1,3,8,4


 0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/

public class _084_ArayExample30 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, temp, size;
        size = 10;
        temp = 0;

       for (i = 0; i < size / 2; i = i + 1){
           temp = a[i];
           a[i] = a[size - 1 - i];
           a[size - 1 - i] = temp;
       }

       for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");


    }
}
