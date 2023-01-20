package abstractdemo;

public class Son extends  Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become a coder ");

    }

    @Override
    void school( ) {
        System.out.println("I want to do schooling at svm ");

    }
}
