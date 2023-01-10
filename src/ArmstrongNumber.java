import java.io.OutputStream;
import java.util.Scanner;

public class ArmstrongNumber {
/*
    1 ile 500 arasındaki tüm Armstrong numaralarını yazdırmak için bir program yazın.
    Numaranın her basamağının küplerinin toplamı sayının kendisine eşitse,
    sayıya Armstrong numarası denir.
    Örneğin, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + (3 * 3 * 3)
*/
    public static void armstrongNumber(int sayi){
        int b,o,y;
        int armstrong,temp;
        armstrong = sayi;

        if (sayi > 1 && sayi < 500){
            b = armstrong % 10;
            armstrong /= 10;
            o = armstrong % 10;
            armstrong /= 10;
            y = armstrong % 10;
            temp = (b*b*b) + (o*o*o) + (y*y*y);
            if (temp == sayi){
                System.out.println(sayi + " sayisi Armstrong sayisidir.");
            } else System.out.println(sayi + " sayisi Armstrong sayisi degildir.");
        } else System.out.println("Lutfen 1 ile 500 arasinda bir sayi giriniz.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz...");
        int s = input.nextInt();
        armstrongNumber(s);
        }
    }

