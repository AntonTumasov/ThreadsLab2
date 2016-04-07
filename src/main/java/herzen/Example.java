package herzen;


public class Example {


    public static void main(String[] args) throws Exception {
        final Object resource1 = "resource1";
        final Object resource2 = "resource2";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread1: locked resource1");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                    synchronized (resource2){
                        System.out.println("Thread1: locked resource2");
                    }
                }
            }
        };
        Thread th2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Thread2: locked resource2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {}
                    synchronized (resource1){
                        System.out.println("Thread2: locked resource1");
                    }
                }
            }
        };
        t1.start();
        th2.start();

    }
}