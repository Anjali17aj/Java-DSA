public class reverseNum {
    public static void main(String args[]) {
        int n = 234567;
        while (n > 0) {
            int ld = n % 10;
            System.out.print(ld + " ");
            n = n / 10;
        }
        System.out.println();
    }
}
