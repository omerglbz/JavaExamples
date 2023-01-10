import java.util.Scanner;

public class CounterLetter {
    /*
     Kullanicidan bir cumle ve bir harf alin,
     Cumlede verilen harfin kac kere
     kullanildigini bulup, yazdirin
     ORNEK:
     INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
     OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Cumle giriniz...");
        String str = input.nextLine().toLowerCase();
        System.out.println("Harf giriniz...");
        String c = input.next();
        if(c.length() > 1){
            throw new Exception("Tek bir harf giriniz");
        }
        String[] arr = str.split("");
        for (String w:
             arr) {
            if (w.equals(c)){
                counter++;
            }
        }
        System.out.println(c + " harfi " + counter + " kez tekrarlanmistir.");
    }
}
