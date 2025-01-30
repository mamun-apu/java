package Java_04_Object;

public class Java_04_11_super {
    public static void main(String[] args)
    {
        Student s = new Student();

        // calling display() of Student
        s.display();
    }
}
class Person {
    void message()
    {
        System.out.println("This is person class\n");
    }
}
// Subclass Student
class Student extends Person {
    void message()
    {
        System.out.println("This is student class");
    }
    // Note that display() is
    // only in Student class
    void display()
    {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}
