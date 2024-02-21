import java.util.*;

public class print {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int ranger = sc.nextInt();
        int counter = 1;

        while (counter <= ranger) {
            System.out.println(counter + " ");
            counter++;
        }
    }
}
