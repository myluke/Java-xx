import java.util.Scanner;

class deff {
    public int deff(int x, int y) {

        int t;
        if (x < y) {
            t = x;
            x = y;
            y = t;
        }
        while (y != 0) {
            if (x == y) {
                return x;
            } else {
                int k = x % y;
                x = y;
                y = k;
            }

        }
        return x;
    }
}

public class Ex6 {

    public static void main(String[] args) {

        int i, j, m;
        Scanner s = new Scanner(System.in);
        System.out.println("Please input the first data:\r");
        i = s.nextInt();
        System.out.println("Please input the second data:\r");
        j = s.nextInt();
        deff cd = new deff();
        m = cd.deff(i, j);
        int n = (i * j) / m;
        System.out.println("最大公约数是：" + m);
        System.out.println("最小公倍数是：" + n);
    }
}