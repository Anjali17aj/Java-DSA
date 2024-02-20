import java.util.*;

public class pf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS");
        int marks = sc.nextInt();
        String s = marks >= 33 ? "Pass" : "Fail";
        System.out.println(s);
    }
}
