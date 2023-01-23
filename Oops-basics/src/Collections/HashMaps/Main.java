package Collections.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"ABC");
        hm.put(2,"DEF");
        hm.put(3,"GHI");
        hm.put(4,"PQR");
        //replace value if key already found
        hm.put(2,"XYZ");
        hm.remove(3);
        for(Map.Entry z: hm.entrySet()){
            System.out.println(z.getKey() +" "+ z.getValue());
        }

        HashMap<Integer, Human> hm2= new HashMap<>();
        hm2.put(1,new Human(18,"asdw"));
        hm2.put(2,new Human(22,"eam"));
        hm2.put(3,new Human(33,"jknkjn"));
        hm2.replace(3, new Human(30,"djasjd"));

        for(Map.Entry<Integer,Human> m: hm2.entrySet()){
            System.out.println(m.getKey());
            m.getValue().showDetails();
        }


    }
}
class Human{
    private int age;

    private String name;

    Human(int age, String name){
        this.age = age;
        this.name = name;

    }

    void showDetails(){
        System.out.println("Age: "+this.age);

        System.out.println("NAME: "+this.name);
    }
}
