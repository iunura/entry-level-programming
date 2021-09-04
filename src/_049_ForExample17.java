/*
1'den 10'a kadar olan sayıların toplamını yazan program
1+2+3+4+5+6+7+8+9+10 =55
*/


public class _049_ForExample17 {
    public static void main(String[] args) {
        int i, sum;

        sum = 0;

        for (i =1; i<=10; i = i + 1)
            sum = sum + i;

        System.out.println(sum);

    }
}
