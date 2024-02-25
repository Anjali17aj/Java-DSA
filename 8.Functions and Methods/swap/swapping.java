import java.util.*;

public class swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is:" + a);
        System.out.println("b is:" + b);
    }
}