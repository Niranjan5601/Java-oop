package Polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;

    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
//order should be different
//    void sum(int a, String b){
//        System.out.println(b);
//    }
//
//    void sum(String b,int a){
//        System.out.println(a);
//    }


    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(4,5,6);
    }
}
