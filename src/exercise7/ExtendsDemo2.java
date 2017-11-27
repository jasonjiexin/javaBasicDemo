package exercise7;

/***
 * 子父类出现后，类成员的特点：

 类中成员：
 1，变量。
 2，函数。
 3，构造函数。

 变量
 如果子类中出现非私有的同名成员变量时，
 子类要访问本类中的变量，用this
 子类要访问父类中的同名变量，用super。

 super的使用和this的使用几乎一致。
 this代表的是本类对象的引用。
 super代表的是父类对象的引用。
 */

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.setNum(14);
        z.show();

    }
}

class Fu {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }
}

class Zi extends Fu {
    //int num = 5;
    void show() {
        //在类中定义中，方法调用类的属性中省略了这个this，这里的this还是谁（对象）调用就是谁的值
        System.out.println(super.getNum());
        //以下语句访问不到Fu类的num值，因为num为私有属性
        //System.out.println(super.getNum());
    }
}


