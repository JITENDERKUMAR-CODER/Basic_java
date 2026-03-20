package Multithreading;
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable");
    }
}
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread using Thread1");
    }
}
public class inter_face {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyThread1());
        t1.start();
        t2.start();
    }
}

