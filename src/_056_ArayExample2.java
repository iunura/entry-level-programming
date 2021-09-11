/*
5 elemanlı bir dizi tanımlayın. Her bir elemanına 9 atayıp ardından
dizinin bütün elemanlarını ekrana yazdıran program
*/

public class _056_ArayExample2 {
    public static void main(String[] args) {
        int a[] = new int[5];

        int i;

        for (i = 0; i < 5; i = i +1)
            a[i] = 9;

        for (i = 0; i < 5; i = i+ 1)
            System.out.println(a[i]);

    }
}
