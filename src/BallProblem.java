import java.util.Scanner;

public class BallProblem {
    /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yukseklik giriniz...");
        double height = input.nextDouble();
        int counter = 0;
        double distance = 0;

        do {
            distance += height;
            height = height*0.75;
            counter++;
            distance += height;
        }while (height > 1);
        System.out.println("Top " + counter + " kere sekti. " + distance + " kadar yol aldi.");
    }
}
