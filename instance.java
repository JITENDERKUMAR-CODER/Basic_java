class instance {

    String name;

    void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        instance s1 = new instance();  // instance 1
        instance s2 = new instance();  // instance 2

        s1.name = "Jitender";
        s2.name = "Rahul";

        s1.show();
        s2.show();
    }
}
