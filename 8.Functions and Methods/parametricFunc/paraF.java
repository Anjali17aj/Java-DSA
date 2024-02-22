import java.util.*;

public class paraF {
    public static void calcSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        calcSum(a, b);
    }
}
