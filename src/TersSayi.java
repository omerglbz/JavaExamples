import java.util.Scanner;

public class TersSayi {
    //Kullanıcıdan bir tamsayı girmesini isteyen ve daha sonra rakamları ters çevrilmiş olarak veren bir program yazın.
    //Örneğin, giriş 12345 ise, çıkış 54321 olmalıdır.
    //12345 --> 54321

    public static void tersSayiStringBuilder(Integer sayi){
        String tersSayi = sayi.toString();
        StringBuilder stringBuilder = new StringBuilder(tersSayi);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }

    public static void tersSayiStringArray(Integer sayi){
        String tersSayi = sayi.toString();
        String[] arr = tersSayi.split("");
        for (int i = arr.length-1; i > -1; i--){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void tersSayi(int sayi){
        //12345
        int tersSayi = 0, temp;
        temp = sayi;

        while (sayi > 0){
            temp = sayi % 10;
            tersSayi = tersSayi*10 + temp;
            sayi /= 10;
        }
        System.out.println(tersSayi);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz...");
        int s = input.nextInt();
        tersSayiStringBuilder(s);
        tersSayiStringArray(s);
        tersSayi(s);
    }
}
