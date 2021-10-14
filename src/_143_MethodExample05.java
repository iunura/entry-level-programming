/****************************************************************************
Bilgisayara 1 milyon defa yazı tura attırıp kaç yazı kaç tura geldiğini gösteren program.

 *******************************************************************************/
public class _143_MethodExample05 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int i, n, total, headcnt, tailcnt;

        total = 1000000;
        headcnt = 0;
        tailcnt = 0;

        for (i = 1; i <= total; i = i +1) {
            n = generator.nextInt(2);
            if (n == 1)
                headcnt = headcnt + 1;
            else
                tailcnt = tailcnt + 1;
        }
        System.out.print ("Yazı adedi : " + headcnt + " Tura adedi : " + tailcnt);
    }
}
