/****************************************************************************
 Dizinin 1.elemanını 1 kez, 2.elemanını 2.kere 3.elemanını 3 kere yazdıran program.

 0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/
public class _103_ArayExample48 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int i, size, k;
        size = 10;

        for (i = 0; i < size; i = i + 1) {
            for (k = 0; k <= i; k = k + 1)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}

