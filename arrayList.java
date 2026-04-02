package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        Iterator<Integer> it = list.iterator();

        print(it);
    }


    static void print(Iterator<Integer> it) {
        if (it.hasNext()) {
            System.out.println(it.next());
            print(it);   // recursive call
        }
    }
}