class Stu {
    String name;
    int rollno;
    static String school = "SBV";


    Stu(String n, int r) {
        name = n;
        rollno = r;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + school);
    }

    public static void main(String[] args) {
        Stu s1 = new Stu("jeetu", 213);
        Stu s2 = new Stu("tanu", 543);
        s1.display();
        s2.display();
    }
}