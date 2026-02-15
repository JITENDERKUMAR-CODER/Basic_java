class Students {
    int ID;
    String name;

    // Constructor
    Students(int i, String s) {
        ID = i;        // assign value to class variable
        name = s;
    }

    // Method
    void display() {
        System.out.println(ID + " " + name);
    }

    public static void main(String[] args) {
        Students s1 = new Students(100, "jeetu");
        Students s2 = new Students(200, "jyoti");

        s1.display();
        s2.display();
    }
}
