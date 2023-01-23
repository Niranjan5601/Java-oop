package ObjectCloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws  CloneNotSupportedException {
        Human human = new Human(55,"Human name");
       // Human twin = new Human(human);
        Human twin = (Human)human.clone();
        System.out.println(twin.age+" "+ twin.name);
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(human.arr));

        //shallow copy makes new copy if the variable is primitive else
        //it will point to the value of the one which is being cloned

        //Deep copy does'nt point instead it will copy all the contents of the cloned  object

    }



}
