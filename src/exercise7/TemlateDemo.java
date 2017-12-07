package exercise7;
/***
 * 需求：获取一段程序运行的时间。
 原理：获取程序开始和结束的时间并相减即可。

 获取时间：System.currentTimeMillis();

 当代码完成优化后，就可以解决这类问题。

 这种方式，模版方法设计模式。

 什么是模版方法呢？
 在定义功能时，功能的一部分是确定的，但是有一部分是不确定，而确定的部分在使用不确定的部分，
 那么这时就将不确定的部分暴露出去。由该类的子类去完成。

 注：函数也是用于封装代码的
 *
 */
abstract class GetTime{
    public void getTime(){
        long start = System.currentTimeMillis();
        runcode();
        long end = System.currentTimeMillis();
       // System.out.println("start:"+start);
        //System.out.println("end:"+start);
        System.out.println("毫秒："+(end - start));
    }

    //将不确定的内容抽象出来
    public abstract void runcode();
}


class SubTime extends GetTime{
    //覆写抽象方法
    @Override
    public void runcode(){
        for(int x=0; x<4000; x++){
            System.out.println(x);
        }
    }
}

public class TemlateDemo {
    public static void main(String[] args) {
        SubTime gt = new SubTime();
        //获取程序运行的时间
        gt.getTime();
    }

}
