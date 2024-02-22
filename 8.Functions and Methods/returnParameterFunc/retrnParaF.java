import java.util.*;

public class retrnParaF {
    public static int calculateDiffr(int n1, int n2) {
        int difference = n1 - n2;
        return difference;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int diff = calculateDiffr(a, b);
        System.out.println("Difference btw two nums:" + a + "-" + b + " " + "is" + ":" + " " + diff);
    }

}
