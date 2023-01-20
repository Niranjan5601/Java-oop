package Interface.ExtendsDemo;

public interface B extends A {
   default void greet(){
       System.out.println("greet b" );
   };
}
