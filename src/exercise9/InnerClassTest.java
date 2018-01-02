package exercise9;

/**
 *内部类测试
 */

interface Inter {
    void method();
}

class Test {
    static class Inner implements Inter {
        public void method() {
            System.out.println("method run");
        }
    }

    //Inter 类型的对象才能够调用function方法
    static Inter function() {
        return new Inter() {
            @Override
            public void method() {
                System.out.println("method runing");
            }
        };
    }
}

public class InnerClassTest {
    public static void main(String[] args) {

        //Test.function():Test类中有一个静态的方法function。
        //.method():function这个方法运算后的结果是一个对象。而且是一个Inter类型的对象。
        //因为只有是Inter类型的对象，才可以调用method方法。
        Test.function().method();
        //与上面一句内容相同
        //引用指向Test.function()对象，也就是说Test.function()是一个Inter类型的对象
        //  Inter in = Test.function();
        //in.method();

        //传入一个Inter类型的对象
        show(new Inter() {
            public void method() {
                System.out.println("method show run");
            }
        });
    }


    public static void show(Inter in) {
        in.method();
    }
}

