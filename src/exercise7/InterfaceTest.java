package exercise7;

/***
 * 在理解接口定义的时候能够将其翻译为扩展功能
 */

abstract class Student2{
    abstract void study();
    public void  sleep(){
        System.out.println("sleep");
    }
}

interface Smoking{
    public abstract void smoke();
}

//问题少年除了学习以外还有一个拓展功能是抽烟
class QuestionBoy extends Student2 implements Smoking{
    void study(){}
    public void smoke(){}
}
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
