/******************************************************************************
 a dizisindeki tek sayıları b dizisinin başına , çift sayıları b dizinin sonuna taşıyan program.




 0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
 int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

 *******************************************************************************/

public class _085_ArayExample31 {
    public static void main(String[] args) {
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };
        int b[] = new int[10];

        int i, po, pe, size;
        size = 10;
        pe = size -1;
        po = 0;

        for (i = 0; i < size; i = i + 1)
            if (a[i] % 2 == 0){
                b[pe] = a[i];
                pe = pe -1;
            }else {
                b[po] = a[i];
                po = po + 1;
            }

        for(i = 0; i < size; i = i + 1)
            System.out.print(b[i] + " ");

    }
}
