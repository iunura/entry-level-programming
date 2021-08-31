/*1'den 10'a kadar olan sayıları ekrana yazdıran program.
 */

public class _033_ForExample1 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 10; i = i + 1)
            System.out.println(i);

        System.out.println("i en sonunda " + i + "'dir");
    }
}
