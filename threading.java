package Multithreading;

 class threadings extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread ");

        }
    }
}
class threading1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("jeetu");
        }
    }
}
class threading2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("the end");
        }
    }
}
public class threading {
     public static void main(String[] args) {
         threadings t1 = new threadings();
         threading1 t2 = new threading1();
         threading2 t3 = new threading2();
         t1.start();
         t2.start();
         t3.start();
     }
}
