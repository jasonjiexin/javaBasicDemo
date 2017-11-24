package exercise6;

public class PersonDemo {
       public static void main(String[] args){
           //当初始化PersonCode()时候报错，显示PersonCode()空参数构造函数是私有的，不能够访问
           //PersonCode p = new PersonCode();
           PersonCode p = new PersonCode("zhangsan", 10);
          // p.setName("lisi");
           p.speak();
       }
}

class PersonCode{

    //构造函数禁止创建对象，自定义对象初始化
    private PersonCode(){}

    //成员变量
    private String name = "haha";
    private int age;
    private static String country = "CN";

    //有参数的构造函数
    PersonCode(String name, int age){
        this.age = age;
        this.name = name;
    }


    //构造代码块
    {
        System.out.println(name+"...."+age);
        System.out.println(country);
    }

    //属性值的获取
    public void setName(String name){
        this.name = name;
    }


    public void speak(){
        System.out.println(this.name+"...."+this.age);
    }

    public static void showCountry(){
        System.out.println("country="+PersonCode.country);
        PersonCode.method();
    }

    public static void method(){
        System.out.println("method run");
    }

}

/***
 * PersonCode p = new PersonCode("zhangsan", 20)
 * what happen?
 * 1)因为new用到了PersonCode.class,所以会先找到PersonCode..class文件并加载到内存中
 *2）执行该类中的static代码块，如果有的话，给PersonCode.class类进行初始化
 * 3)在堆内存中开辟空间，分配内存地址
 * 4）在堆内存中建立对象的特有属性，并进行默认初始化
 * 5）对属性进行显示初始化,     （System.out.println(country);  country值是在类中显示赋值的）
 * 6）对对象进行构造代码块初始化
 * 7）对对象进行对应的构造函数初始化
 * 8）将内存地址付给栈内存中的p变量
 */
