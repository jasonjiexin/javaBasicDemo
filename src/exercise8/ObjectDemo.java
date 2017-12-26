package exercise8;

/**
 * Object:是所有对象的直接后者间接父类，传说中的上帝。
 * 该类中定义的肯定是所有对象都具备的功能。
 * Object类中已经提供了对对象是否相同的比较方法。
 * 如果自定义类中也有比较相同的功能，没有必要重新定义。
 * 只要沿袭父类中的功能，建立自己特有比较内容即可。这就是覆盖。
 */

class Demo //extends Object
{
        private int num;
        Demo(int num){
            this.num = num;
        }

        public boolean equals(Object obj)  //Object obj = new Demo()
        {
                if (!(obj instanceof Demo))
                    return false;
                Demo d = (Demo) obj;
                return this.num == d.num;
        }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        System.out.println(d1.toString());
    }
}
