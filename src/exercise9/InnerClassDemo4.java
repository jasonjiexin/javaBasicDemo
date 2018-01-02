package exercise9;

/**
 * 匿名内部类:
 * 1，匿名内部类其实就是内部类的简写格式。
 * 2，定义匿名内部类的前提：
 * 内部类必须是继承一个类或者实现接口。
 * 3，匿名内部类的格式：  new 父类或者接口(){定义子类的内容}
 * 4，其实匿名内部类就是一个匿名子类对象。而且这个对象有点胖。	可以理解为带内容的对象。
 * 5，匿名内部类中定义的方法最好不要超过3个。
 */

abstract class AbsDemo {
    //抽象方法是没有主体的
    abstract void show();
}

class Outer4 {
    int x = 3;

    class Inner extends AbsDemo {
        int num = 90;

        void show() {
            System.out.println("show:" + num);
        }

        void abc() {
            System.out.println("hehe");
        }
    }

    public void function() {

       // AbsDemo a = new Inner();
       // Inner in = new Inner();
        //in.show();
       // in.abc();

        AbsDemo d = new AbsDemo() {
            int num = 9;

            void show() {
                System.out.println("num====" + num);
            }

            void abc() {
                System.out.println("haha");
            }
        };

        d.show();
        //abc 方法访问不到，是因为在类AbsDemo中没有abc（）方法
        //d.abc()不能够访问，理由上述所示

       //对象直接调用方法abc（）
     new AbsDemo() {
            int num = 9;

            void show() {
                System.out.println("num====" + num);
            }

            void abc() {
                System.out.println("haha");
            }
        }.abc();
    }




}


public class InnerClassDemo4 {
    public static void main(String[] args) {

        //外部类访问内部类对象的方法
        new Outer4().new Inner().show();

        new Outer4().function();



    }
}
