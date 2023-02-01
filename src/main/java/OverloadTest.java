import java.util.Arrays;

public class OverloadTest {
    public static void main(String[] args) {
        System.out.println(myOverLoad(4));
        System.out.println(myOverLoad(4, 5));
        System.out.println(myOverLoad("x"));

        System.out.println(max(5, 7));
        System.out.println(max(5.12, 7.2121));
        System.out.println(max(5, 7, 123.213));
        System.out.println(max(123, 124, 56, 768, 12, 46, 68, 79, 23523, 21));

        Datafield df = new Datafield();
        df.a = 4;
        df.b = 5;
        System.out.println("调整前a和b的值分别是" + df.a + "和" + df.b);
        swab(df);
        System.out.println("调整后a和b的值分别是" + df.a + "和" + df.b);
        System.out.println(recursion(3));
        System.out.println(fb(10));
    }

    public static int myOverLoad(int a) {
        int res = a * a;
        return res;
    }

    public static int myOverLoad(int a, int b) {
        int res = a * a + b * b;
        return res;
    }

    public static String myOverLoad(String a) {
        return a;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double max(double a, double b, double c) {
        double max = a > b ? a : b;
        max = max > c ? max : max;
        return max;
    }

    public static int max(int... args) {
        Arrays.sort(args);
        int max = args[args.length - 1];
        return max;
    }

    public static void swab(Datafield df) {
        int temp;
        temp = df.a;
        df.a = df.b;
        df.b = temp;
        System.out.println("在swab内，a和b的值分别是" + df.a + "和" + df.b);
    }

    public static int recursion(int x) {
        if (x >= 1) {

            return x * recursion(x - 1);
        } else {
            return 1;
        }
    }

    public static int fb(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return fb(n + 2) - 2 * fb(n + 1);
        }
    }

}

class Datafield {
    int a;
    int b;
}
