package exercise9;

/**
 * 内部类的访问规则
 * 1.内部类可以直接访问外部类中的成员，包括私有
 * 之所以可以直接访问外部类中的成员，是因为内部类中持有一个外部类的引用。格式   外部类.this
 * 2.外部类要访问内部类,必须建立内部类对象
 */

class Outer {
    private int x = 3;

    //在内部类在类的成员位置上是可以用private做修饰的
    private class Inner {

        int x = 4;

        void function() {
            int x = 6;
            //同名变量的值访问顺序也是从内到外
            //Inner=6
            System.out.println("Inner:" + x);
            //Inner=4
            System.out.println("Inner:" + this.x);
            //Inner=3
            //之所以可以直接访问外部类中的成员，是因为内部类中持有一个外部类的引用    格式   外部类.this.变量
            System.out.println("Inner:" + Outer.this.x);
        }
    }

    void method() {
        Inner in = new Inner();
        in.function();
    }
}


public class InnerClassDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();

        //直接访问内部类中的成员
        //为防止不同的类中有相同名称的内部类，调用内部类以一下格式为主
        //Outer.Inner in = new Outer().new Inner();
        //in.function();
    }
}
