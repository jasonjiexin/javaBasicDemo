package exercise5;
/*
* 当成员变量和函数为私有的时候如何进行访问
*
* */
public class personDemo {
    public static void main(String[] args){
        person p = new person();
        p.setAge(20);
        System.out.println( p.getAge());
    }
}

class person{
    private int age;

    //private 只能在本类中被访问
    private void speak(){
        System.out.println("age="+age);
    }

    public void setAge(int a){
        if (a>0 && a<130){
            //同个类中成员变量和成员函数的使用不需要对象进行使用
            age = a;//通过共公的方法给函数中成员变量进行赋值，因为成员变量已经私有化不能够直接访问
            speak();
        }else{
            System.out.println("you fail");
        }
    }

    public int getAge(){
        return age;
    }
}
