package exercise7;

/***
 * 子父类中的构造函数。

 现象：在对子类对象进行初始化时，父类的构造函数也会运行，
 那是因为子类的构造函数默认第一行有一条隐式的语句 super();
 super():会访问父类中空参数的构造函数。而且子类中所有的构造函数默认第一行都是super();
 this():调用本类构造函数

 为什么子类一定要访问父类中的构造函数。

 因为父类中的数据子类可以直接获取。所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的。
 所以子类在对象初始化时，要先访问一下父类中的构造函数。
 如果要访问父类中指定的构造函数，可以通过手动定义super语句的方式来指定。

 注意：super语句一定定义在子类构造函数的第一行。
 注意：构造函数不存在覆盖


 子类的实例化过程。

 结论：
 子类的所有的构造函数，默认都会访问父类中空参数的构造函数。
 因为子类每一个构造函数内的第一行都有一句隐式super();

 当父类中没有空参数的构造函数时，子类必须手动通过super语句形式来指定要访问父类中的构造函数。

 当然：子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数。
 子类中至少会有一个构造函数会访问父类中的构造函数。

 子类继承父类的时候都需要访问父类的构造函数，至于访问哪个函数要看你自己的选择
 注：this、super都需要写在第一行，因此不能够通知出现，初始化放在第一步

 注：this（）在构造函数中是不能够使用的
 */


public class ExtendsDemo4 {
    public static void main(String[] args){
        Zi1 z = new Zi1(13);
        System.out.println(z.num);

    }
}

class Fu1{
    int num;

    Fu1(){
        num = 60;
        System.out.println("fu run");
    }

    Fu1(int x){
        System.out.println("fu......."+x);
    }
}

class Zi1 extends Fu1{
    Zi1(){
        //在子类构造函数的第一行省略了super()
        super();
        //空参数的构造函数不能够访问自己
        //this();
        //super(4);
        System.out.println("zi run");
    }

    Zi1(int x){
        //访问空参数的子函数Zi1()
        this();
        //如果将super()放在非首行会出现报错
        //super()；
        //super(3)
        System.out.println("zi...." + x);
    }

}
