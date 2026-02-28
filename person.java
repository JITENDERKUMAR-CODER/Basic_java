public class person  {
  static String firstName;
  static String lastName;
  person(String firstName,String lastName){
      this.firstName =firstName;
      this.lastName=lastName;
  }
  static void showName(){
    System.out.println("First Name: "+firstName);
    System.out.println("Last Name: "+lastName);
  }


}