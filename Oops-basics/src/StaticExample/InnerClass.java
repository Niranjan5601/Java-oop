package StaticExample;

public class InnerClass {
  static  class Test{
        String name;

        public  Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("hello");
        Test b = new Test("Ninja");
        System.out.println(a.name);
        System.out.println(b.name);
    }

}
