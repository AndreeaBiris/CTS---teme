package Prototype_concrete;

public class PrototypeMain {
    public static void main(String[] args){
        ReportGenerator reportGenerator = new ReportGenerator();
        Report report = reportGenerator.generateReport("sales", "Sales Data", "pdf");
    }
}
