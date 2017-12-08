package exercise8;

/**
 *需求：
 基础班学生：
 学习，睡觉。
 高级班学生：
 学习，睡觉。
 可以将这两类事物进行抽取。
 *
 */

abstract class Student{
    public abstract void study();
    public void sleep(){
        System.out.println("躺着睡");
    }
}

//向上抽取转型，减少代码的重复性
class DoStudent{
    public void doStudent(Student s){
              s.sleep();
              s.study();
    }
}

class BaseStudent extends Student{
    public void study(){
        System.out.println("base study");
    }

    public void sleep(){
        System.out.println("坐着睡");
    }
}

class AdvStudent extends Student{
    public void study(){
        System.out.println("adv study");
    }
}

public class DuoTaiDemo2 {
    public static void main(String[] args) {
        //当不同的对象在使用这两个方法的时候，都需要初始化，代码出现很大的重复
        /*
        BaseStudent bs = new BaseStudent();
        bs.sleep();
        bs.study();
        */

        DoStudent ds = new DoStudent();
        //传入实例
        ds.doStudent(new AdvStudent());
        ds.doStudent(new BaseStudent());

    }
}
