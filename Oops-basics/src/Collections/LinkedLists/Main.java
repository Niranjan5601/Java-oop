package Collections.LinkedLists;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(89);
        ll.add(29);
        ll.add(90);
        ll.add(11);
        ll.add(87);
        ll.forEach(a-> System.out.println(a));
        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);
        System.out.println(ll.get(4));
    }
}
