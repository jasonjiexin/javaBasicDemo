package exercise6;

/**
 * 类中代码的执行顺序：1）静态代码块（初始化类）、2）构造函数代码块（初始化对象）、3）构造函数（初始化对象）
 * */
public class StaticCodeDemo {
    static{
        System.out.println("e");
    }

    public static void main(String[] args){
        //当对象建立两次的情况下类只加载一次，因此只被打印一次
        //new StaticCode();
        //new StaticCode();

        //首先会加载StaticDemo类，这时候会运行静态代码块static,之后直接用类名访问show方法
        //StaticCode.show();

        //没有对象的建立因此StaticCode类没有加载
        StaticCode s = null;

        //加载StaticCode类并且创建对象
        s = new StaticCode();

    }
}

class StaticCode{

    //构造函数，对对象进行初始化,创建对象的时候进行运行
    StaticCode(){
        System.out.println("b");
    }

    //静态代码块，对类进行初始化,类加载的时候进行运行，优先于构造函数代码块
    static {
        System.out.println("a");
    }

    //构造函数代码块，对对象进行初始化，创建对象的时候进行运行，优先于构造函数
    {
        System.out.println("c");
    }

    //构造函数，对特定的元素进行初始化
    StaticCode(int x){
        System.out.println("d");
    }

    public static void show(){
        System.out.println("show run");
    }



}
