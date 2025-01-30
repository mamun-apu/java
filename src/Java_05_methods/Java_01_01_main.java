package Java_05_methods;

//  main method is the starting point of java
//  Where JVM start the execution of the program
/*
    Static
    It is a keyword that is when associated with a
    method, making it a class-related method.
    The main() method is static so that JVM can
    invoke it without instantiating the class.
    This also saves the unnecessary wastage of
    memory which would have been used by the
    object declared only for calling the main()
    method by the JVM.
    If you try to run Java code where main is not static, you will get an error.


 */
public class Java_01_01_main {
    public static void main(String[] args){//args stands for command-line arguments
        System.out.println("Hello world!");
    }
}
