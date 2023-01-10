import java.util.Scanner;

public class Fibonacci {
/*
   N'nin kullanıcı tarafından girildiği,
   Fibonacci serisi n terimlerini yazdırmak için bir program yazın
   0 1 1 2 3 5 8 13 21 .....
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tekrar olsun ?");
        int s = input.nextInt();
        int first = 0, second = 1,third;
        third = first + second;
        System.out.print(first + " " + second + " " + third);
        for(int i = 0; i < s;i++){
            first = second;
            second = third;
            third = first + second;
            System.out.print(" " + third);
        }
    }
}
