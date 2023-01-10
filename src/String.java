import java.util.Arrays;
import java.util.Scanner;

public class String {
     /*
    INTERWIEW QUESTIONS
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            aaacln
            abaa   ==> a=3  b=1
            aaab
    */
     public static void main(java.lang.String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Kelime giriniz...");
         java.lang.String str = input.next().toLowerCase();
         java.lang.String[] arr = str.split("");
         Arrays.sort(arr);
         int counter = 0;
         for (int i = 1; i < arr.length; i++){
             if (arr[i].equals(arr[i-1])){
                 counter++;
             }else {
                 System.out.println(arr[i-1] + " " + (counter+1));
                 counter = 0;
             }
             if (i == arr.length-1){
                 System.out.println(arr[i] + " " + (counter+1));
             }

         }

     }
}
