//Hıcanın yöntemi Bilgisayara 1 milyon defa yazı tura attırıp kaç yazı kaç tura gelmiş bakan program.


public class _135_WhileExample06 {
    public static void main(String[] args) {
        java.util.Random generator = new java.util.Random();

        int n, i, total, head,tail;
        total = 1_000_000;
        head = 0;


        for (i = 1; i <= total; i = i + 1) {
            n = generator.nextInt(2);
                head= head + n;
        }
        tail = total - head ;
        System.out.print("Yazı adedi : " + tail+ " " + "Tura adedi : " + head);

    }
}
