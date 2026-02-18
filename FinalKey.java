class animal {
   String dog;
   String cat;
  static final String lion="very Danger";

       void animal(String d,String c){
           cat=c;
           dog=d;
            lion="not danger";
        }
    public static void main(String[] args){
        animal a1= new animal("normal","cute");
        a1.lion();
    }
}
