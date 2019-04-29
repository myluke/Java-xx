/**
 * 声明一个类People，成员变量有姓名、出生日期、性别、身高、体重等;生成10个People (可使用 for 循环)，并放在一维数组中，编写方法按身高进行排序。
 */


class Birth {
    int year, month, day;

    Birth(int m, int d, int y) {
        year = y;
        month = m;
        day = d;
    }
}

enum sex {MAIL, FEMAIL}

class People {

    String name;
    Birth birth;
    sex s;
    float height;
    float weight;

    People(String name,Birth birth,sex s, float h, float w) {
        this.name = name;
        this.birth = birth;
        this.s=s;
        this.height=h;
        this.weight=w;

    }

    @Override
    public String toString(){
        return this.name+'\t'+this.birth+'\t'+this.s+'\t'+this.height+'\t'+this.weight+'\t';
    }
}

public class Ex8 {

    public static void main(String[] args) {
        //声明数据 3个元素
        People[] p=new People[4];
        p[0]= new People("Wang",new Birth(2,2,2),sex.MAIL,1.82f,120f);
        p[1]= new People("Zhang",new Birth(3,3,3),sex.MAIL,1.75f,150f);
        p[2]= new People("Li",new Birth(5,5,5),sex.FEMAIL,1.62f,110f);
        p[3]= new People("LiLi",new Birth(5,5,5),sex.FEMAIL,1.92f,110f);

        for(int i=0;i<p.length;i++){

            for(int j=0; j<p.length;j++){
                People t=p[i];

                if(t.height>p[j].height){
                    System.out.println(i+"|"+j);
                    p[i]=t;
                }
            }
        }
        for(People people:p){
            //System.out.println(people);
        }
    }
}