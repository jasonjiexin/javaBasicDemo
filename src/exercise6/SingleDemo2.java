package exercise6;
/***
 * 这个是先初始化对象，称为饿汉式子
 Single类一进内存，就已经创建好了对象。
 class Single
 {
 private static Single s = new Single();
 private Single(){}
 public static Single getInstance()
 {
 return s;
 }
 }
 */

//对象是方法被调用时才初始化，也叫做对象的延时加载，什么时候需要什么时候做。
//SingleCode类进内存，对象还没有存在，只有调用了getInstance()方法时，才建立对象。
//懒汉式，面试一般会使用这种形式
class SingleCode{
    //本类中创建该类的对象
        private static SingleCode s = null;
        private SingleCode(){}
        public static SingleCode getInstance(){
            if (s==null){
                synchronized (SingleCode.class){
                    if (s==null)
                        s = new SingleCode();
                }
            }
            return s;
        }
}
public class SingleDemo2 {
        public static void main(String[] args){
            System.out.println("单例模式");
        }
}



