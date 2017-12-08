package exercise8;

/**
 * 在多态中成员函数的特点：
 * 在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，编译通过，如果没有编译失败。
 * 在运行时期：参阅对象所属的类中是否有调用的方法。
 * Fu f （f为左边）= new Zi();（zi为右边）
 * 简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。
 * 在多态中，成员变量的特点：
 * 无论编译和运行，都参考左边(引用型变量所属的类)。
 * 在多态中，静态成员函数的特点：
 * 无论编译和运行，都参考左边(引用型变量所属的类)。
 */


class Fu {
    static int num = 5;

    void method1() {
        System.out.println("fu method_1");
    }

    void method2() {
        System.out.println("fu method_2");
    }

    static void method4() {
        System.out.println("fu method_4");
    }
}

class Zi extends Fu {
    static int num = 8;

    void method1() {
        System.out.println("zi method_1");
    }

    void method3() {
        System.out.println("zi method_3");
    }

    //静态的方法只能用静态的方法来覆写
    static void method4() {
        System.out.println("zi method_4");
    }
}

public class DuoTaiDemo3 {

    public static void main(String[] args) {

        Fu f = new Zi();
        //在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，编译通过，如果没有编译失败。
        // 在运行时期：参阅对象所属的类中是否有调用的方法。如果没有则调用父类
        f.method1();
        f.method2();


        Zi z = new Zi();
        System.out.println(z.num);
        //无论编译和运行，都参考左边(引用型变量所属的类)。
        Fu f1 = new Zi();
        System.out.println(f1.num);

        Fu f2 = new Zi();
        //论编译和运行，都参考左边(引用型变量所属的类)。
        f2.method4();
      /*  Zi z = new Zi();
      //子类覆写
        z.method1();
        //子类独有
        z.method3();
        //子类继承
        z.method2();*/
    }
}
