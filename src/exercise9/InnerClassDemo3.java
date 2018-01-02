package exercise9;

/**
 * 内部类定义在局部时，
 * 1，不可以被成员修饰符修饰
 * 2，可以直接访问外部类中的成员，因为还持有外部类中的引用。
 * 但是不可以访问它所在的局部中的变量。只能访问被final修饰的局部变量。
 */

class Outer3 {
    int x = 3;

    void method(final int a) {

        //当内部类不在成员位置上，访问局部变量的时候，该变量必须被final修饰过
        final int y = a;
        class Inner {
            void function() {
                System.out.println(y);
            }
        }

       new Inner().function();
    }
}


public class InnerClassDemo3 {
    public static void main(String[] args) {
        Outer3 out = new Outer3();
        out.method(7);
        out.method(8);
    }
}
