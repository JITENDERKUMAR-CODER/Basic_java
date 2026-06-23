class A {
    public void a() {
        System.out.println("A");
    }
}

class B extends A {
    public void b() {
        System.out.println("B");
    }
}

public class DownCasting {
    public static void main(String[] args) {

        A obj = new B();  // Upcasting
        obj.a();

        B obj2 = (B) obj; // Downcasting
        obj2.b();
    }
}