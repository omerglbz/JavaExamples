public class MinimumMaximumSecondMaximum {
    /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
       */
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, secMax = Integer.MIN_VALUE;
        for (int w:
             arr) {
            if (w > max){
                max = w;
            } else if (w < min) {
                min = w;
            }
            for (int j:
                 arr) {
                if (j > secMax && j < max){
                    secMax = j;
                }
            }
        }
        System.out.println(" " + max + " " + min + " " + secMax);
    }
}
