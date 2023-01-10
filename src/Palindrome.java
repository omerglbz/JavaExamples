import java.util.Scanner;

public class Palindrome {
    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz.");
        String str = input.next().toLowerCase();
        String tersStr = "";
        String[] arr = str.split("");
        for (int i = arr.length-1; i > -1; i--) {
            tersStr += arr[i];
        }
        if (str.equals(tersStr)){
            System.out.println(str + " palindromedur");
        }else System.out.println(str + " palindrome degildir.");
    }
}

