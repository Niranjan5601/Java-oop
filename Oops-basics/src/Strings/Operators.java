package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//adding characters will convert them into ascii value and add them
        System.out.println("a"+"b"); //String concatenation takes place
        System.out.println("a"+1);
        //this will be similar to "a"+"1  "
        //Integer will be converted to its wrapper class tht will call toString()
        String ans = new Integer(56)+""+new ArrayList<>();
        System.out.println(ans);
        //+ can be used with primitives or with an expression which should contain atleast one string obj


    }
}
