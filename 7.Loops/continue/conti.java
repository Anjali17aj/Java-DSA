import java.util.*;

public class conti {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the num:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was:" + n);
        } while (true);
    }

}
