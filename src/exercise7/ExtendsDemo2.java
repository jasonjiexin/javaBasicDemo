package exercise7;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.setNum(14);
        z.show();

    }
}

class Fu {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }
}

class Zi extends Fu {
    //int num = 5;
    void show() {
        //在类中定义中，方法调用类的属性中省略了这个this，这里的this还是谁（对象）调用就是谁的值
        System.out.println(super.getNum());
        //以下语句访问不到Fu类的num值，因为num为私有属性
        //System.out.println(super.getNum());
    }
}


