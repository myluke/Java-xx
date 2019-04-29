import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 统计从键盘输入字符的个数，当输入字符“#”时中止输入。
 */

public class Ex7 {

    public static void main(String[] args) throws IOException {

        int i = 0, s = 0;
        System.out.println("Please input data:");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        char c = (char) (buff.read());

        while (c != '#') {
            s++;
            c = (char) (buff.read());
        }
        System.out.println(s);
    }

}