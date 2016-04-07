package herzen;



class FirstThread extends Thread {
    int counter = 0;

    synchronized public void run() {
        //synchronized (this) {
            for (int i = 0; i <= 100; i++) {
                counter += i;
                System.out.println(counter);

            }
            System.out.println("Counter1 = " + counter);
        }


    }
//}

class SecondThread extends Thread {
    int counter=0;
    synchronized public void run(){
        //synchronized (this){
            for(int i = 0; i <= 100; i++){
               counter+=i;
                System.out.println(counter);
            }
            System.out.println("Counter2 = " + counter);
        }
    }

//}



public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        firstThread.start();
        secondThread.start();




    }
}

