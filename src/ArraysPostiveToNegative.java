public class ArraysPostiveToNegative {
    //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // input : 1,2,-3,4,-5,-6
    //output :-1,-2,3,-4,5,6
    public static void main(String[] args) {
        int[] input ={1, 2, -3, 4, -5, -6};
        for (int w:
             input) {
            System.out.print((w*-1) + " ");
        }
    }
}
