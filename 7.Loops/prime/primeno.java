import java.util.*;

public class primeno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("PRIME NUMBER");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is a prime");
            } else {
                System.out.println("n is not a prime number");
            }
        }
    }
}
