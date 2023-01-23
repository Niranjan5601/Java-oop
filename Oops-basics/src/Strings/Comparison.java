package Strings;

public class Comparison {
    public static void main(String[] args) {
//        String a = "Hello";
//        String b =  "Hello";
//        System.out.println(a==b);//will print true coz they point to same object


        String a =new String( "Hello");
        String b = new String(  "Hello");
        System.out.println(a==b);////will print false coz they point to diff object
        System.out.println(a.equals(b));
    }

}
