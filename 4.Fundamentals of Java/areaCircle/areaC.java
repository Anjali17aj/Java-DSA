import java.util.*;

public class areaC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area: pie * rad * rad");
        System.out.println("Enter the radius:");
        float rad = sc.nextFloat();
        float a = 3.14f * rad * rad;
        System.out.println("Area:" + a);

    }

}
