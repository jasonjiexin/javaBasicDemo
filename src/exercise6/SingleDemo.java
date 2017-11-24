package exercise6;
/**
 * 设计模式：解决某一类问题最行之有效的方法
 * java有23种设计模式
 * 单例设计模式：解决一个类在内存只存在一个对象
 *
 * 保证对象的唯一性：
 * 1，为了避免其他程序过多建立该类对象，先禁止其他程序建立该对象
 * 2，还为了让其他程序可以访问到该类对象，只好在本类中，自定义一个对象
 * 3，为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式
 *
 * 实现：
 * 1，将构造函数私有化
 * 2，在本类中创建一个本类的对象
 * 3，提供一个方法可以获取到该对象
 *
 *
 * 应用：对于事物该怎么描述，还怎么描述
 * 当需要将该事物的对象保证在内存中唯一时，就将以上的三步加上即可
 *
 * 在画图的时候，栈内存中为程序准备要运行的变量和方法，堆内存中主要是对象和成员变量，方法区中主要是静态变量、静态方法、实例方法
 * */
public class SingleDemo {
    public static void main(String[] args){

        //通过Single.getInstance()得到的对象都是一致的
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        //给对象进行赋值
        s1.setNum(23);
        //s1与s2对象是一个地址，因此s2的值为23
        System.out.println(s2.getNum());

        Student st = Student.getStudent();
        Student st1 = Student.getStudent();
        st.setAge(18);
        System.out.println(st1.getAge());
    }
}

class Single{
    private int num;

    //构造函数私有化，防止外部的功能来新建对象
    private Single(){}
   //创建本类的对象
    private static Single s = new Single();
   //提供一个方法能够获取到对象
    public static Single getInstance(){
          return s;
    }
   //赋值函数
    public void setNum(int num){
             this.num = num;
    }
    //取值函数
    public int getNum(){
           return num;
    }
}

class Student{
    private int age;

    //类中创建一个本类的对象
    private static Student s = new Student();
    //构造函数私有化
    private Student(){}
    //获取本类的对象
    public static Student getStudent(){
        return s;
    }

    public void setAge(int age){
        this.age =age;
    }

    public int getAge(){

        return age;
    }
}













