import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EuroDolarToplami {
    /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
    Ornek:
     String str ="$1 $12 €34 €56 $45 €78";
      dolarToplami: 58
      euroToplami: 168
     */
    public static void main(String[] args) {
        String str ="$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");
        List<String> dolar = new ArrayList<>();
        List<String> euro = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (String w:
             arr) {
            if (w.contains("$")){
                w = w.replace("$","");
                dolar.add(w);
            } else if (w.contains("€")) {
                w = w.replace("€","");
                euro.add(w);
            }
        }
        System.out.print(dolar);
        int dolarToplam = 0;
        for (String w:
                dolar) {
            dolarToplam = dolarToplam + Integer.parseInt(w);
        }
        System.out.print(" Dolar :" + dolarToplam);
        System.out.println();
        System.out.print(euro);
        int euroToplam = 0;
        for (String w:
             euro) {
            euroToplam = euroToplam + Integer.parseInt(w);
        }
        System.out.print(" Euro :" + euroToplam);

    }
}
