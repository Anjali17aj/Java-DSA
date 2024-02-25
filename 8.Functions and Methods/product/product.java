import java.util.*;

public class product {

    public static int prod(int num1, int num2) {
        int p = num1 * num2;
        return p;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int multiplication = prod(a, b);
        System.out.println("Product is:" + multiplication);

    }
}
