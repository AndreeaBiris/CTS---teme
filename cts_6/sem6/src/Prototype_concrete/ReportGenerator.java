package Prototype_concrete;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    private Map<String, Report> reports = new HashMap<>();

    public ReportGenerator() {
        reports.put("sales", new SalesReport());
    }

    public Report generateReport(String departament, String data, String format){
        try{
            Report report = new SalesReport();
            report = reports.get(departament).clone();
            report.setData(data);
            report.setFormat(format);
            report.generateReport();
            return report;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
