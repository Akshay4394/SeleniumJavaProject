package SafariBrowserTest;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ExcelTest1 {


	public static void main(String[] args) {
		
		Xls_Reader r = new Xls_Reader("/Users/akshaypatel/Desktop/Testing/Book1.Xlsx");
		
		r.getCellData("project2", "Browser", 2);
		
		System.out.println(r.getCellData("Project2", "Browser", 2));
		
		System.out.println(r.getCellData("Project2", 1, 2));
		
      	r.setCellData("Project2", "Name", 7, "Priyanka");
      	
      	System.out.println(r.getCellData("Project2", "Name", 7));
      	
      	r.getColumnCount("Project2");
      	
      	System.out.println(	r.getColumnCount("Project2"));
      	
      	r.getRowCount("Project2");
      	
      	System.out.println(	r.getRowCount("Project2"));
      	
		
		
		
        
	}

}
