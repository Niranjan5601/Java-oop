package ExcetionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
           // divide(a,b);
            String name = "nsdjf";
            if (name.equals("nsdjf")){
                throw new MyException("name is "+ name);
            }

        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always run");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Dont divide by zero");

        }


        return a/b;
    }
}
