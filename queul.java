package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queul {
    public static void main(String[] args) {
        Queue<String> l = new PriorityQueue<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.offer("z");
        l.isEmpty();
        l.poll();
        l.remove();
        l.size();
        Iterator<String> it = l.iterator();
        {
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}