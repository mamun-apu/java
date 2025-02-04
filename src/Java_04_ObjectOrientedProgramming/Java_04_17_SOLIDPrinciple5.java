package Java_04_ObjectOrientedProgramming;

public class Java_04_17_SOLIDPrinciple5 {
    Database mySQL = new MySQLDatabase();
    ReportGenerator report = new ReportGenerator(mySQL); // Works with MySQL

    Database mongoDB = new MongoDBDatabase();
    ReportGenerator report2 = new ReportGenerator(mongoDB); // Now works with MongoDB!
}
interface Database {
    void connect();
    void query(String command);
}
class MySQLDatabase implements Database {
    @Override
    public void connect() { /* MySQL connection */ }

    @Override
    public void query(String sql) { /* Run MySQL query */ }
}

class MongoDBDatabase implements Database {
    @Override
    public void connect() { /* MongoDB connection */ }

    @Override
    public void query(String command) { /* Run MongoDB query */ }
}
class ReportGenerator {
    private Database database;  // Depends on abstraction, not concrete class

    // Dependency is injected (e.g., via constructor)
    public ReportGenerator(Database database) {
        this.database = database;
        this.database.connect();
    }

    public void generateReport() {
        database.query("SELECT * FROM data");
        // ... logic to generate report
    }
}