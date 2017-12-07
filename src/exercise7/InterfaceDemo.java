package exercise7;

/***
 * 接口：初期理解，可以认为是一个特殊的抽象类
 当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示,都是不确定的内容的时候。
 class用于定义类
 interface 用于定义接口。

 接口定义时，格式特点：
 1，接口中常见定义：常量，抽象方法。
 2，接口中的成员都有固定修饰符。
 常量：public static final
 方法：public abstract
 记住：接口中的成员都是public的。


 接口：是不可以创建对象的，因为有抽象方法。
 需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例化。
 否则子类是一个抽象类。

 接口可以被类多实现，也是对多继承不支持的转换形式。java支持多实现。
 接口和接口之间是存在多继承的，类与类之间是不存在多继承的

 */
interface Inter{
    public static final int NUM = 3;
    //抽象的方法没有方法体
    public abstract void show();
}

interface InterA{
    public abstract void show();
}

class Demo1{
    public void function(){}
}

class Test extends Demo1 implements Inter,InterA{
    //show方法的访问权限要与接口中定义的保持一致，public,当没有访问权限的时间在实现的时候实现类的权限要大于接口类的权限
    //在实现抽象类的过程中如果还是有部分功能不确定，该方法还可以是抽象类，但是要将该类更改为抽象类
    public void show(){}
}

interface A{
    //该方法没有方法体
    public abstract void methodA();
}

interface B{
    public abstract void methodB();
}

interface C extends B,A{
    //接口方法是不允许有方法体的
    //void  methodA(){}
    public abstract void methodC();
}

/***
 *interface A{
 public abstract void methodA();
 }

 interface B{
 public abstract void methodA();
 }

 interface C extends B,A{
 public abstract void methodA();
 }
 以上的这种状况是可以实现的，因为接口中的方法没有相关的具体方法体，所以当C继承的时候可以同时覆盖methodA和methodB


 interface A{
 public abstract int methodA();
 }

 interface B{
 public abstract String methodA();
 }

 interface C extends B,A{
 public abstract void methodA();
 }
 *以上的这种状况是不可以实现的，两个函数体之间的返回值不同
 *
 */
class D implements C{
    @Override
    public void methodA(){}
    public void methodB(){}
    public void methodC(){}

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.NUM);
        System.out.println(Test.NUM);
        System.out.println(Inter.NUM);
    }
}
