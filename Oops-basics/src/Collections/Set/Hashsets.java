package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(101);
        hs.add(88);
        hs.remove(101);
        hs.add(56);
        hs.forEach(s->System.out.print(s+" "));
        System.out.println();
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
