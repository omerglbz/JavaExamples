import java.util.Scanner;

public class IsPrime {
    //Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın.
    //Daha sonra sayının asal sayı olup olmadığını belirten bir mesaj vermelidir.
    public static void isPrime(int sayi){
        boolean isPrime = true;
        for (int i = 2; i < sayi; i++){
            if (sayi % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println(sayi + " asaldir.");
        }else System.out.println(sayi + " asal degildir.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz...");
        int s = input.nextInt();
        isPrime(s);
    }
}
