package Java_05_methods;

public class Java_01_03_toString {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("GeeksForGeeks");

        // Print and display the string
        // using standard toString() method
        System.out.println("String contains = "
                + str.toString());
    }
}
