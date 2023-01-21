package Exercise.Employee;

public class Employee {
private int ID;
private String first_name;
private String last_name;
private int salary;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return first_name;
    }



    public void setFirstname(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastname(String last_name) {
        this.last_name = last_name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName(){
        return this.first_name+" "+this.last_name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }

    public int raiseSalary(int percent){
        int percentage= percent*(this.salary)/100;
       this.salary= this.salary+ percentage;
       return this.salary;
    }


    Employee(int ID, String first_name, String last_name, int salary){
    this.ID = ID;
    this.first_name = first_name;
    this.last_name = last_name;
    this.salary = salary;
}

    @Override
    public String toString() {
        return "Employee[id="+this.ID+" name="+this.first_name+" "+this.last_name+" salary="+this.salary+"]";
    }
}
