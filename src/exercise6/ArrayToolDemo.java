package exercise6;
/*
* 静态的应用。

每一个应用程序中都有共性的功能，
可以将这些功能进行抽取，独立封装。
以便复用。


虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作。
发现了问题：
1，对象是用于封装数据的，可是ArrayTool对象并未封装特有数据。
2，操作数组的每一个方法都没有用到ArrayTool对象中的特有数据。

这时就考虑，让程序更严谨，是不需要对象的。
可以将ArrayTool中的方法都定义成static的。直接通过类名调用即可。

将方法都静态后，可以方便于使用，但是该类还是可以被其他程序建立对象的。
为了更为严谨，强制让该类不能建立对象。
可以通过将构造函数私有化完成。



接下来，将ArrayTool.class文件发送给其他人，其他人只要将该文件设置到classpath路径下，就可以使用该工具类。

但是，很遗憾，该类中到底定义了多少个方法，对方去不清楚。因为该类并没有使用说明书。

开始制作程序的说明书。java的说明书通过文档注释来完成。
* */
public class ArrayToolDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int maxData = ArrayTool.getMax(arr);
        int minData = ArrayTool.getMin(arr);
        System.out.println(maxData);
        System.out.println(minData);
        ArrayTool.printArray(arr);

        //ArrayTool a = new ArrayTool();对象建立失败


    }
}

//ArrayTool方法中所用到的元素都是用户传进来的，并不是类中特有的，因此可以将其作为static静态变量
class ArrayTool {

    //如果不想让用户建立对象，可以将其构造函数私有化，避免堆内存中出现大量不必要的对象
    private ArrayTool(){}

    public static int getMax(int[] arr) {
        int max = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[max])
                max = x;
        }

        return arr[max];

    }

    public static int getMin(int[] arr) {
        int min = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < arr[min])
                min = x;
        }
        return arr[min];
    }

    //选择排序
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    swap(arr,x,y);
                }
            }
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    swap(arr, y, y + 1);
                }
            }
        }
    }

    //数字之间的交换，这个不想让用户知道，所以也给他私有化
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    //按照数组的形式打印数组
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x=0; x<arr.length; x++){
            if (x!=arr.length-1)
                System.out.print(arr[x]+", ");
            else
                System.out.println(arr[x]+"]");
        }
    }
}
