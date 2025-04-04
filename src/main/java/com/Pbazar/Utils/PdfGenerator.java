package com.Pbazar.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.stereotype.Component;

import com.Pbazar.Entity.ReportEntity;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

@Component
public class PdfGenerator {

	public void generatePdf(HttpServletResponse response ,List<ReportEntity> res) throws Exception{
		Document doc = new Document(PageSize.A4);
		PdfWriter.getInstance(doc, response.getOutputStream());
		FileOutputStream fos = new FileOutputStream(new File("pdfreport.pdf"));
		PdfWriter.getInstance(doc, fos);
		doc.open();
		Font fontTitle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
	    fontTitle.setSize(20);
		Paragraph p = new Paragraph("Report of User Insurance",fontTitle);
		p.setAlignment(Paragraph.ALIGN_CENTER);
		doc.add(p);
		
		PdfPTable table = new PdfPTable(10);
		  // Setting width of the table, its columns and spacing
	    table.setWidthPercentage(100f);
	    table.setWidths(new int[] {1,3,3,3,3,4,3,4,4,4});
	    table.setSpacingBefore(5);
		//Header Section
		table.addCell("ID");
		table.addCell("User Name");
		table.addCell("Plan Name");
		table.addCell("Plan Status");
		table.addCell("Denail Reason");
		table.addCell("Termination Date");
		table.addCell("Termination Reason");
		table.addCell("Plan Start Date");
		table.addCell("plan end date");
		table.addCell("Benefical Amount");
		
		
		// cell insertation
		for(ReportEntity report:res) {
		table.addCell(report.getUserId()+"");
		table.addCell(report.getUserName());
		table.addCell(report.getPlanName());
		table.addCell(report.getPlanStatus());
		table.addCell(report.getDenial_Reason());
		table.addCell(report.getTerminated_Date()+"");
		table.addCell(report.getTermination_Reason());
		table.addCell(report.getPlan_Start_Date()+"");
		table.addCell(report.getPlan_End_Date()+"");
		table.addCell(report.getBenefit_Amount()+"");
		}
		doc.add(table);
		doc.close();
		fos.close();
	}
}
