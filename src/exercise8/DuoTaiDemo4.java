package exercise8;
/***
 *
 *
 *
 */

interface PCI{
    public void open();
    public void close();
}

class MainBoard{
    public void run(){
        System.out.println("mainboard run");
    }
    //PCI p = new NetCard() 接口型引用指向自己的子类对象
    public void usePCI(PCI p){
        if (p!=null){
            p.open();
            p.close();
        }
    }
}

class NetCard implements  PCI{
    public void open(){

    }
    public void close(){

    }
}



public class DuoTaiDemo4 {
}
