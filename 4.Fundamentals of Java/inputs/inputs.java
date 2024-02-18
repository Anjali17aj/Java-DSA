import java.util.*;

public class inputs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next(); // input captured by sc goes to s
        System.out.println("The string is:" + s);

        System.out.println("Enter the num:");
        int num = sc.nextInt(); // input captured by sc goes to s
        System.out.println("The num is:" + num);

        System.out.println("Enter the Float num:");
        Float Fnum = sc.nextFloat(); // input captured by sc goes to s
        System.out.println("The num is:" + Fnum);

    }
}