/**
 *
 * 声明病人 Patient 类，此类对象包括 name(String)、sex(char)、age(int)、weight(float)、allergies(boolean)。 声明 setName 存取及修改方法。在一个单独的类中，声明测试方法，并生成两个 Patient 对象，设置其 状态并将其信息显示在屏幕上。声明并测试 toString()方法，显示一个病人 age、sex、name 及 allergies 属性
 *
 * 声明人Patient 类
 */
class Patient {

    String name;
    char sex;
    int age;
    float weight;
    boolean allergies;

    void setName(String str) {
        name = str;
    }

    void setSex(char s) {
        sex = s;
    }

    void setWeight(float w) {
        weight = w;
    }

    void setAge(int a) {
        age = a;
    }

    void setAllergies(boolean t) {
        allergies = t;
    }

    String getName() {
        return name;
    }

    /**
     * 获取年龄
     * @return
     */
    int getAge(){
        return age;
    }

    /**
     * 重写toString 方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "姓名:" + name + ",性别:" + sex + ",年龄:" + age + ",weight:" + weight + ",allergies:" + allergies;
    }
}

/**
 * @author Luke
 */
public class Ex2 {

    /**
     * @param args
     */

    public static void main(String[] args) {
        Patient p = new Patient();
        p.setName("Luke");
        p.setSex('M');
        p.setAge(30);
        //p.setWeight(60);
        //p.setAllergies(true);
        //System.out.println(p.toString());
        System.out.println("姓名："+p.getName());
        System.out.println("年龄："+p.getAge());
    }
}