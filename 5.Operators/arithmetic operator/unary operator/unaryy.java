
public class unaryy {
    public static void main(String args[]) {
        // pre increment - ++a = a+1
        System.out.println(" pre increment:");
        int a = 17;
        System.out.println(a);
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("pre decrement:");
        int z = 9;
        System.out.println(z);
        int w = --z;
        System.out.println(z);
        System.out.println(w);

        // post increment - a++
        System.out.println("post increment:");
        int c = 20;
        System.out.println(c);
        int d = c++; // d=20 then c++ so value of is 21
        System.out.println(c);
        System.out.println(d);
        System.out.println(c);
        System.out.println(c);

        System.out.println("post decrement:");
        int o = 200;
        System.out.println(o);
        int p = o--;
        System.out.println(o);
        System.out.println(p);

    }
}
