import java.util.*;

public class typePro {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println(a);
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(b - a);

        short c = 5;
        byte d = 8;
        char e = 'c';
        byte bt = (byte) (c + d + e);
        System.out.println(bt);

        int p = 7;
        float f = 17.7f;
        long l = 9578;
        double dl = 623764;
        double ans = p + f + l + dl;
        System.out.println(ans);

        byte z = 5;
        z = (byte) (z * 2);
        System.out.println(z);

    }
}
