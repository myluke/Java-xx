/**
 * 编写一个矩形类 Rect，包含两个 protected 属性:宽 width;高 height。 一个带有两个参数的构造器方 法，用于将 width 和 height 属性初化;一个不带参数的构造器，将矩形初始化为宽和高都为 10。 两个 方法: (1) 求矩形面积的方法 area() (2 )求矩形周长的方法 perimeter()
 */

class Rect {

    protected int width, height;

    /**
     * 构造函数
     * @param w
     * @param h
     */
    Rect(int w, int h) {
        width = w;
        height = h;
    }

    /**
     * 矩形面积
     * @return
     */
    public int areaRect() {
        return width * height;
    }

    /**
     * 矩形周长
     * @return
     */
    public int permeterRect() {
        return 2 * (width + height);
    }

    /**
     * 重写toString 方法
     *
     * @return
     */
    @Override
    public String toString() {
        String s = "the Rectangle is ";
        s += width + "," + height + " the permeter is " + permeterRect();
        return s;
    }
}

/**
 * @author Luke
 *
 */

public class Ex3 {

    public static void main(String[] args) {
        Rect r = new Rect(2, 2);
        System.out.println(r);
    }
}