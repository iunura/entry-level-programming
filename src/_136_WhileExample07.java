/****************************************************************************
 10'dan küçük 1000 adet rastgele sayıyı üreten ve bunları ekrana yanyana yazdıran program.
 *******************************************************************************/
public class _136_WhileExample07 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int i,n,total, count;

        total = 1000;


        for (i = 1; i <= total; i = i +1) {
            n = generator.nextInt(10);
            System.out.print(n + " ");
        }
    }
}
