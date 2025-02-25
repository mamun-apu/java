package Java_06_OOPDesignPattern;
import java.util.HashMap;
import java.util.Map;

public class Java_06_04_prototypePattern {
    public static void main(String[] args) {
        // Clone a report document
        Document clonedReport = DocumentRegistry.getDocument("report");
        clonedReport.showDocument();

        // Clone an invoice document
        Document clonedInvoice = DocumentRegistry.getDocument("invoice");
        clonedInvoice.showDocument();
    }
}

// Prototype Interface
interface Document extends Cloneable {
    Document clone();  // Clone method
    void showDocument();
}

// Concrete Prototype: Report Document
class Report implements Document {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new Report(this.content);
    }

    @Override
    public void showDocument() {
        System.out.println("Report Document: " + content);
    }
}

// Concrete Prototype: Invoice Document
class Invoice implements Document {
    private String content;

    public Invoice(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new Invoice(this.content);
    }

    @Override
    public void showDocument() {
        System.out.println("Invoice Document: " + content);
    }
}

// Document Registry (Prototype Manager)
class DocumentRegistry {
    private static final Map<String, Document> prototypes = new HashMap<>();

    // Initialize registry with default document types
    static {
        prototypes.put("report", new Report("Annual Financial Report"));
        prototypes.put("invoice", new Invoice("Customer Invoice"));
    }

    public static Document getDocument(String type) {
        return prototypes.get(type).clone();
    }
}

