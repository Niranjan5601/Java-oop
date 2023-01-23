package LambdaFunction;

public class LambdaFunction {

    public static void main(String[] args) {


        Operation sum = (a,b)-> a+b;
        Operation mult = (a,b)-> a*b;
        Operation sub = (a,b)-> a-b;

        LambdaFunction myCalculator = new LambdaFunction();
        System.out.println(myCalculator.operate(5,6,sum));
        System.out.println(myCalculator.operate(5,6,mult));
        System.out.println(myCalculator.operate(5,6,sub));


    }

    private int operate(int a ,int b ,Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a,int b);
}
