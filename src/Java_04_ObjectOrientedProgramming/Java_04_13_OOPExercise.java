package Java_04_ObjectOrientedProgramming;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class Java_04_13_OOPExercise {
    public static void main(String[] args) {
//        Inventory inventory = new Inventory();
//
//        // Create new Product objects with name and quantity
//        Product product1 = new Product("LED TV", 200);
//        Product product2 = new Product("Mobile", 80);
//        Product product3 = new Product("Tablet", 50);
//
//
//
//        // Add the products to the inventory
//        inventory.addProduct(product1);
//        inventory.addProduct(product2);
//        inventory.addProduct(product3);
//
//        // Print a message indicating low inventory check
//        System.out.println("\nCheck low inventory:");
//
//        // Check and print products with low inventory
//        inventory.checkLowInventory();
//



        BaseLogger logger = new FileLogger();
        logger.log("Starting application...");
    }
}

// airplane **************************************************
class Airplane{
    private int flightNumber;
    private String destination;
    private Time departureTime;

    Airplane(int flightNumber, String destination, Time departureTime){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void flightStatus(){
        System.out.println(flightNumber + " " + departureTime);
    }
    public void delay(){
        System.out.println();
    }

}
// inventory **************************************************

class Product{
    private String name;
    private int quantity;

    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory{
    private ArrayList<Product> products;

    Inventory(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    public void checkLowInventory(){
        for(Product product: products){
            if(product.getQuantity() < 100){
                System.out.println(product.getName() + " is running low on inventory." +
                        "Current quantity: " + product.getQuantity());
            }
        }
    }
}

// School **************************************************

class student{
    private String name;
    private int classNo;
    private int role;

    public student(String name, int classNo, int role) {
        this.name = name;
        this.classNo = classNo;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}

class Teacher{
    private String name;
    private String department;

    public Teacher(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class School{
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;

    School(){
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
// composition over inheritance ********************************
class BaseLogger {
    public void log(String message) {
        System.out.println("[LOG] " + message);
        sendToCloud(message); // ❗New behavior added
    }

    private void sendToCloud(String message) {
        System.out.println("[Cloud] Syncing log...");
    }
}

class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("[File] Writing log: " + message);
    }
}

