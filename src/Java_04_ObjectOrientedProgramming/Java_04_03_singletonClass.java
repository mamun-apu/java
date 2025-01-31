package Java_04_ObjectOrientedProgramming;

public class Java_04_03_singletonClass {
    public static void main(String[] args){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();

/*
How to Design/Create a Singleton Class in Java?
To create a singleton class, we must follow the steps, given below:

1. Ensure that only one instance of the class exists.

2. Provide global access to that instance by

Declaring all constructors of the class to be private.

Providing a static method that returns a reference to the instance. The lazy
initialization concept is used to write the static methods.

The instance is stored as a private static variable.

Example of singleton classes is Runtime class, Action Servlet,
and Service Locator. Private constructors and factory methods are
also an example of the singleton class.

Remember the key points while defining a class as a singleton class that is while designing a singleton class:

Make a constructor private.
Write a static method that has the return
type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.

#Purpose of Singleton Class
The primary purpose of a java Singleton class is
to restrict the limit of the number of object
creations to only one. This often ensures that
there is access control to resources, for example,
 socket or database connection.

Memory space wastage does not occur with the use
of the singleton class because it restricts instance
creation. As the object creation will take place
only once instead of creating it each time a
new request is made.

We can use this single object repeatedly as per
 the requirements. This is the reason why
 multithreaded and database applications
 mostly make use of the Singleton pattern in
 Java for caching, logging, thread pooling,
 configuration settings, and much more.

For example, there is a license with us, and we have only one
database connection or suppose our JDBC driver does not allow
us to do multithreading, then the Singleton class comes into
the picture and makes sure that at a time, only a single
connection or a single thread can access the connection.
 */
    }
}

class Singleton{
    private static Singleton singleton;
    int num;
    private Singleton(){
        this.num = 10;
        System.out.println("singleton object created with num: " + this.num);
    }
    public static synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
class SingleTon{
    private SingleTon(){
        System.out.println("SingleTon created!");
    }
    private static class SingleTonHelper{
        private static final SingleTon INSTANCE =  new SingleTon();
    }
    public static SingleTon getInstance(){
        return SingleTonHelper.INSTANCE;
    }
}

