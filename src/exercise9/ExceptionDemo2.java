package exercise9;

class Demo2 {
    //将声明描述的更加具体
    int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a / b;
    }
}

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        try {
            int x = d.div(3, 1);
            System.out.println("x=" + x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("被零除了！");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("角标越界了！");
        } catch (Exception e) {
            System.out.println("程序有误");
        }
        //catch(Exception e) 放在最后，函数中有异常发出就会立刻终止函数
        //方法中详细描述了异常方法，处理的时候分开详细处理，因此有了多个catch语句，抛出几个异常就会有几个catch，如果超出预估的可以用catch（Exception e）处理

        System.out.println("over");
    }
}
