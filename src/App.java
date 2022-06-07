/**
 * First way: Inheriting from the Thread class.
 */
class CustomThread extends Thread{
    public void run(){
        System.out.println("Hello from the custom thread");
    }
}
/**
 * Second way: Implementing the Runnable interface.
 */
class CustomThread2 implements Runnable{
    public void run(){
        System.out.println("Hello from the custom thread 2");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // It's not an ordered operation, see the output for below code.
        System.out.println("Main thread");
        System.out.println("Main thread");
        CustomThread custThread = new CustomThread();
        // Min priority is 1, max is 10 and the default priority is 5.
        custThread.setPriority(1);
        Thread custThread2 = new Thread(new CustomThread2());
        custThread2.setPriority(10);
        custThread.start();
        custThread2.start();
        System.out.println("Main thread");
        System.out.println("Main thread");
    }
}
