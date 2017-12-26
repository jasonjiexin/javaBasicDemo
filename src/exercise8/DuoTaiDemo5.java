package exercise8;

/**
 * 需求：模仿电脑主板的PCI插槽
 * PCI上面的具体插声卡还是网卡要根据具体情况而定
 */

interface PCI1 {
    public void open();

    public void close();
}

class Mainboard1 {
    public void run() {
        System.out.println("Mainboard run");
    }

    //父类引用指子类对象
    public void usePCI1(PCI1 p) {
        if (p != null) {
            p.open();
            p.close();
        }
    }
}


class Netcard implements PCI1 {
    @Override
    public void open() {
        System.out.println("netcard open");
    }

    @Override
    public void close() {
        System.out.println("netcard close");
    }
}

class SoundCard implements PCI1 {
    @Override
    public void open() {
        System.out.println("soundcard open");
    }

    @Override
    public void close() {
        System.out.println("soundcard close");
    }
}

public class DuoTaiDemo5 {
    public static void main(String[] args) {
        Mainboard1 mb = new Mainboard1();
        mb.run();
        mb.usePCI1(new SoundCard());
        mb.usePCI1(new Netcard());
        mb.usePCI1(null);
        ;
    }
}
