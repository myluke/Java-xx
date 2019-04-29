/**
 * @author Luke
 */
class Fact {

    int n;

    Fact(int x) {
        n = x;
    }

    int fact() {

        int t = 1, i;
        for (i = 1; i <= n; i++) {
            t = t * i;
        }
        return t;
    }


}

/**
 * @author Luke
 */
public class Ex4 {
    public static void main(String[] args) {

        Fact N = new Fact(10);
        System.out.println(N.fact());
    }

}
