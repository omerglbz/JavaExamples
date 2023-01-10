import java.util.Arrays;
import java.util.Scanner;

public class Examples {
    // 18.11.2022
    static Scanner input = new Scanner(System.in);

    public static void ex01(){
        /*       Problem tanimi :
     *
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     *
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapin
     */
        int urunAdet, urunFiyat;
        double toplamfiyat;
        char choice;
        boolean musteriKart;
        System.out.println("Kac adet urun aldiniz ?");
        urunAdet = input.nextInt();
        System.out.println("Urunun fiyati nedir ?");
        urunFiyat = input.nextInt();
        System.out.println("Musteri Kartiniz var mi ? y/n");
        choice = input.next().charAt(0);
        musteriKart = choice == 'y';

        if (musteriKart){
            if (urunAdet > 10){
                toplamfiyat = urunFiyat*urunAdet*0.8;
                System.out.println(toplamfiyat);
            } else {
                toplamfiyat = urunFiyat*urunAdet*0.85;
                System.out.println(toplamfiyat);
            }
        }else {
            if (urunAdet > 10){
                toplamfiyat = urunFiyat*urunAdet*0.85;
                System.out.println(toplamfiyat);
            } else {
                toplamfiyat = urunFiyat*urunAdet*0.90;
                System.out.println(toplamfiyat);
            }
        }
    }
    static public void ex02(){
  /*
        Elinde karısık bir liste olcak.Listenin icinde 0 - 20 ye array olcak
        listenin içinde eksik elemanların var bu eksik elemanları bulan kodu yaziniz.
         */
        int[] dizi =  {4,7,8,1,5,6,2,9,11,3,12,18,13,14};
        int[] dizi0 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Arrays.sort(dizi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 18]
        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++){
            dizi0[dizi[i]] = 1;
        }
        for (int i = 0; i < dizi0.length; i++) {
            if(dizi0[i] == 0){
                System.out.print(i + " ");
            }
        }
    }
    static public void ex03(){
        //Klavyeden girilen herhangi bir sayının faktör değerini bulmak için bir program yazın.
        //Kullanıcı bir sayı girmesi lazım.
        //5 --> 5*4*3*2*1
        int num = input.nextInt();
        int result = 1;
        for (int i = 1; i < num+1; i++){
            result *= i;
        }
        System.out.println(result);
    }
    static public void ex04(){
        //Klavyeden iki sayı girilir. Bir sayının değerini diğerinin gücüne yükseltmek için bir program yazın. ( Java yerleşik yöntemini kullanmayın )
        int alt = input.nextInt();
        int ust = input.nextInt();
        int result = 1;

        for (int i = 0; i < ust; i++){
            result *= alt;
        }
        System.out.println(result);
    }
    static public void ex05(){
        //Kullanıcıdan bir tamsayı girmesini isteyen ve daha sonra rakamları ters çevrilmiş olarak veren bir program yazın. Örneğin, giriş 12345 ise, çıkış 54321 olmalıdır.
        //12345 --> 54321
        int sayi = input.nextInt();
        int tersSayi = 0;
        int temp;
        do {
            temp = sayi % 10;
            sayi /= 10;
            tersSayi = tersSayi*10 + temp;
        }while (sayi > 0);
        System.out.println(tersSayi);
    }
    static public void ex06(){
        //Bir tamsayı kümesi okuyan ve daha sonra çift ve tek tamsayıların toplamını yazdıran bir program yazın.
        int tekSayi = 0, ciftSayi = 0, sayi;
        boolean choice = true;
        char c;
        do {
            sayi = input.nextInt();
            if (sayi % 2 == 0){
                ciftSayi += sayi;
            }else {
                tekSayi += sayi;
            }
            c = input.next().charAt(0);
            choice = c == 'y';
        }while (choice);
        System.out.println(ciftSayi);
        System.out.println(tekSayi);
    }
    static public void ex07(){
        //Kullanıcıdan pozitif bir tamsayı girmesini isteyen bir program yazın. Daha sonra sayının asal sayı olup olmadığını belirten bir mesaj vermelidir.
        int sayi = input.nextInt();
        boolean asal = true;
        if (sayi > 0){
            for (int i = 2; i < sayi; i++){
                if (sayi % i == 0){
                    asal = false;
                }
            }
        }else {
            System.out.println("pozitif girin");
        }
        if (asal){
            System.out.println("asal");
        }else {
            System.out.println("asal degil");
        }
    }
    static public void ex08(){
         /*
        Kullanıcıdan iki sayı girmesini isteyen bir do-while döngüsü yazın.
        Sayılar eklenmeli ve toplam gösterilmelidir.
        Döngü kullanıcıya işlemi tekrar yapmak isteyip istemediğini sormalıdır.
        Eğer öyleyse, döngü tekrar etmelidir; aksi takdirde sona ermelidir.
         */
        int num01, num02,num03, result = 0;
        boolean cont;
        char c;
        num01 = input.nextInt();
        num02 = input.nextInt();
        result = num02 + num01;
        do {
            System.out.println("devam mi");
            c = input.next().charAt(0);
            cont = c == 'y';
            if (!cont){
                break;
            }
            num03 = input.nextInt();
            result += num03;
        }while (true);
        System.out.println(result);
    }
    static public void ex09(){
        //Kullanıcı isteyene kadar sayıları girmek için bir program yazın ve sonunda program girilen en büyük ve en küçük sayıları göstermelidir.
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sayi;
        boolean cont;
        char c;
        do {
            sayi = input.nextInt();
            if (sayi > max){
                max = sayi;
            }else {
                min = sayi;
            }
            System.out.println("devam mi");
            c = input.next().charAt(0);
            cont = c == 'y';
            if (!cont){
                break;
            }
        }while (true);
        System.out.println(max);
        System.out.println(min);
    }
    static public void ex10(){
         /*
        1 ile 500 arasındaki tüm Armstrong numaralarını yazdırmak için bir program yazın.
        Numaranın her basamağının küplerinin toplamı sayının kendisine eşitse, sayıya Armstrong numarası denir.
        Örneğin, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + (3 * 3 * 3)
         */
        int birler = 0, onlar = 0, yuzler = 0, armstrong;
        for (int i = 1; i < 501; i++){
            int temp = i;
            birler = temp % 10;
            temp /= 10;
            onlar = temp % 10;
            temp /= 10;
            yuzler = temp % 10;
            armstrong = ((birler*birler*birler) + (onlar*onlar*onlar) + (yuzler*yuzler*yuzler));
            if (armstrong == i){
                System.out.println(i);
            }
        }
    }
    static public void ex11(){
        /*
        N'nin kullanıcı tarafından girildiği Fibonacci serisi n terimlerini yazdırmak için bir program yazın :
        0 1 1 2 3 5 8 13 24 .....
         */
        int tkr = input.nextInt();
        int first = 0, second = 1, third;
        System.out.print(first + " " + second);
        for (int i = 0; i < tkr; i++){
            third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }
    public static void main(String[] args) {
        ex02();
    }
}
