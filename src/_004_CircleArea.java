public class _004_CircleArea {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in) ;

        //Klavyeden yarıçapı girilen bir dairenin alanını hesaplayan program
        //(pi.r.r)

        int r;
        double t;

        System.out.print("Yarıçapı giriniz : ");
        r = kb.nextInt();

        t = r * r * 3.14159;
        System.out.print("Circle of Area =" + t);



    }
}
