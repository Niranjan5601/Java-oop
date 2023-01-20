package abstractdemo;

public abstract class Parent {

int age;
int VALUE;

public Parent(int age){
  this.age = age;
  this.VALUE =345353 ;
}

void normal(){
    System.out.println("Normal method");
}
   static void hello(){
       System.out.println("Hello from parent");
   }

    abstract void career();
    abstract void school();
}
