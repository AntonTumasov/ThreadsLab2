package herzen;

class Racer1 extends Thread{
    public void run(){

    }
}
class Racer2 extends Thread{
    public void run(){

    }
}
public class Race {

    public static void main(String[] args) {
        Racer1 r1 = new Racer1();
        Racer2 r2 = new Racer2();
        r1.start();
        r2.start();
    }
}
