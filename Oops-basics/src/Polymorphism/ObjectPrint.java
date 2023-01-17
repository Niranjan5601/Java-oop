package Polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num;
    }

   public String toString(){
    return "num:"+ num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj);
    }
}
