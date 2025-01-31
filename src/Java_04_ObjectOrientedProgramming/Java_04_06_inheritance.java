package Java_04_ObjectOrientedProgramming;

public class Java_04_06_inheritance {
    public static void main(String[] args)
    {

    }
}

class Employee{
    private String name;
    private int id;
    private double salary;
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println(name + " : " + id + " : " + salary);
    }
}

class Manager extends Employee{
    private String department;
    Manager(String name, int id, double salary, String department){
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("department: " + department);
    }
}

class Developer extends Employee{
    private String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("programming language: " + programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

}