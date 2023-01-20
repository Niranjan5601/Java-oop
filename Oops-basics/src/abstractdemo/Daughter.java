package abstractdemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to become a doctor");
    }

    @Override
    void school() {
        System.out.println("I want to do schooling at nps");
    }
}
