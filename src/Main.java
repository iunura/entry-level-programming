public class Main
{
    public static void main(String[] args) {
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        java.util.Random generator = new java.util.Random();
        int i, total, pos1, pos2, temp, size;

        total = 1000;
        pos1 = 0;
        pos2 = 0;
        temp = 0;
        size = 10;

        for (i = 0; i < total; i = i + 1) {
            pos1 = generator.nextInt(10);
            pos2 = generator.nextInt(10);
            temp = a[pos1];
            a[pos1]= a[pos2];
            a[pos2] = temp;
        }
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");

    }
}


