


public class Ext5 {

    public static void main(String[] args) {
// TODO Auto-generated method stub
        int max, min, s = 0, data[] = new int[100];
        data[0] = (int) (Math.random() * 100);
        max = min = data[0];
        for (int i = 1; i < 100; i++) {
            data[i] = (int) (Math.random() * 100);
            if (data[i] > max) {
                max = data[i];
            } else {
                min = data[i];
            }
            if (data[i] > 50) {
                s++;
            }
        }
        System.out.println("最大数是:" + max + "\r");
        System.out.println("最小数是:" + min + "\r");
        System.out.println("大于 50 的数是:" + s + "\r");
    }
}

