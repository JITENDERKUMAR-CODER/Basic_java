enum Laptop{
    linovo,
    dell,hp,assus,
    rog;


}
public class SwitchWithEnum {
    public static void main(String[] args) {
        Laptop s=Laptop.dell;
//        System.out.println(s);
       switch (s){
           case linovo:
               System.out.println("linovo");
               break;
               case dell:
                   System.out.println("dell");
                   break;
               case rog:
                   System.out.println("rog");
          break;
           case assus:
               System.out.println("assus");
               break;
               case hp:
                   System.out.println("hp");
                   break;

       }
    }
}
