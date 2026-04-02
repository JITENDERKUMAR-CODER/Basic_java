package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class foreachremaining {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        Iterator<String> it=l.iterator();{
            it.next();
            Object x;
            it.forEachRemaining(System.out::println);

        }
    }
}
