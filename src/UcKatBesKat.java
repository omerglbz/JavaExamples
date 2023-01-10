import java.util.Scanner;

public class UcKatBesKat {
    /*
     Interview Question
          Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
          Ancak;
          - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
          - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
          - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("100'den kucuk bir sayi giriniz...");
        int s = sayiInput();
        for (int i = 1 ; i <= s; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(" ** Java Guzeldir **");
            } else if (i % 5 == 0) {
                System.out.print(" Guzeldir");
            } else if (i % 3 == 0) {
                System.out.print(" Java");
            } else System.out.print(" " + i);
        }

    }

    public static int sayiInput() throws Exception {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        if (s > 100 || s < 0){
            throw new Exception("100’den kucuk ve 0'dan buyuk bir tamsayi giriniz...");
        }
        return s;
    }
}
