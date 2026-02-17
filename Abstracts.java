abstract class Vechile {
    abstract void start();
}

class car extends Vechile {
    void start() {
        System.out.println("The car is start with key");
    }
}

public class Abstracts {   // main method must be inside class

    public static void main(String[] args) {

        car c = new car();
        c.start();

    }
}
