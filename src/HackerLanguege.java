import java.util.Scanner;

public class HackerLanguege {
    /*
    Interwiew
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("java ile hersey guzel")
    j4v4 1l3 h3r53y guz3l
    İpucu harfleri değiştirin ve ekrana yazdırın.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cumle giriniz...");
        String[] arr = input.nextLine().toLowerCase().split("");
        for (String w:
             arr) {
            if (w.equals("s")){
                System.out.print("5");
            } else if (w.equals("a")){
                System.out.print("4");
            } else if (w.equals("e")){
                System.out.print("3");
            } else if (w.equals("i")){
                System.out.print("1");
            } else if (w.equals("o")){
                System.out.print("0");
            } else System.out.print(w);

        }
    }
}
