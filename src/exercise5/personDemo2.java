package exercise5;

public class personDemo2 {
    public static void main(String[] args){

    }
}

class person2{
    private String name;
    private int age;

    person2(){
        System.out.println("A:name="+name+",,age="+age);
    }

    person2(String n){
        name = n;
        System.out.println("B:name="+name+",,age="+age);
    }
}