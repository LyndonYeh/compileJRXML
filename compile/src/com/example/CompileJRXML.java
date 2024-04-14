package com.example;

import net.sf.jasperreports.engine.JasperCompileManager;

public class CompileJRXML {
    public static void main(String[] args) {
    	// 輸入 JRXML 路徑
    	String jrxmlFilePath = "C:\\Users\\gga99\\JaspersoftWorkspace\\MyReports\\test.jrxml";

    	// 输出 Jasper 文件路徑
    	String jasperFilePath = "C:\\Users\\gga99\\JaspersoftWorkspace\\MyReports\\test.jasper";

    	try {
    	    // 编譯成 Jasper 文件
    	    JasperCompileManager.compileReportToFile(jrxmlFilePath, jasperFilePath);
    	    System.out.println("Compilation Successful!");
    	} catch (Exception e) {
    	    System.out.println("Compilation Failed: " + e.getMessage());
    	    e.printStackTrace();
    	}
    }
}