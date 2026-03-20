package Multithreading;

class threadins extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread ");

        }
    }
}
class threadin1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("jeetu");
        }
    }
}
class threadin2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("the end");
        }
    }
}
public class sameobject {
    public static void main(String[] args) {
        threadins t1 = new threadins();
        threadins t2 = new threadins();
        threadins t3 = new threadins();
        t1.start();
        t2.start();
        t3.start();
    }
}
