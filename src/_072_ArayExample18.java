/*
Klavyeden girilen sayıdan küçük, tek ve çift dizi elemanlarının adetlerini ve toplamlarını ekrana ay ayrı
yazdıran program.

            0 ,1, 2, 3, 4,  5, 6,  7,  8, 9
int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 }

*/
public class _072_ArayExample18 {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util. Scanner (System.in);
        int a[] = { 4, 8, 3, 1, 18, 9, 21, 20, 5, 17 };

        int i, size, n, sumOdd,sumEven, countOdd, countEven;
        size = 10;

        sumEven =0;
        sumOdd =0;
        countEven = 0;
        countOdd = 0;


        System.out.print("n'yi giriniz :");
        n = kb.nextInt();

        for (i = 0; i < size; i = i+ 1)
            if (a[i] % 2 == 0) {
                countEven = countEven + 1;
                sumEven = sumEven + a[i];
            }else {
                countOdd = countOdd + 1;
                sumOdd = sumOdd + a[i];
            }
        System.out.println("Toplam : " + sumEven  +" " + "Adet : " + countEven );
        System.out.println("Toplam : " + sumOdd  +" " + "Adet : " + countOdd);




    }



}
