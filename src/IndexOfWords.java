import java.util.Scanner;

public class IndexOfWords {
    /*
    EX :Kullanicidan bir kelime isteyiniz
     alinan kelimenin karakter dizisinin her harfi ve
     bu harfin karakter dizisi içindeki indexini birer satıra yazdirin
             ORNEK
      Bir kelime giriniz:istanbul
       Karakter        Index
         i               0
         s               1
         t               2
         a               3
         n               4
         b               5
         u               6
         l               7
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String str = input.next();
        String[] arr = str.split("");
        int index = 0;
        System.out.println("Karakter\t\tIndex");
        for (String w:
             arr) {
            System.out.println(w+"\t\t\t\t"+index);
            index++;
        }
    }

}
