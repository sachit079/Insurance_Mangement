package com.Pbazar.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.Pbazar.Entity.ReportEntity;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class ExcelGenerator {

	public void generateExcel(HttpServletResponse response ,List<ReportEntity> res) throws Exception {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet=workbook.createSheet("Report-data");
		Row headerRow =sheet.createRow(0);
		//Header Creation
		headerRow.createCell(0).setCellValue("ID");
		headerRow.createCell(1).setCellValue("User Name");
		headerRow.createCell(2).setCellValue("Plan Name");
		headerRow.createCell(3).setCellValue("Plan Status");
		headerRow.createCell(4).setCellValue("Denail Reason");
		headerRow.createCell(5).setCellValue("Termination Date");
		headerRow.createCell(6).setCellValue("Termination Reason");
		headerRow.createCell(7).setCellValue("Plan Start Date");
		headerRow.createCell(8).setCellValue("plan end date");
		headerRow.createCell(9).setCellValue("Benefical Amount");
		
		int rowIndex=1;
		
		//row insertion
		for(ReportEntity report: res) {
			Row datarow=sheet.createRow(rowIndex);
			datarow.createCell(0).setCellValue(report.getUserId());
			datarow.createCell(1).setCellValue(report.getUserName());
			datarow.createCell(2).setCellValue(report.getPlanName());
			datarow.createCell(3).setCellValue(report.getPlanStatus());
			if(report.getDenial_Reason()!=null) {
			datarow.createCell(4).setCellValue(report.getDenial_Reason());
			}
			else {
				datarow.createCell(4).setCellValue("N/A");
			}
			if(report.getTerminated_Date()!=null) {
				datarow.createCell(5).setCellValue(report.getTerminated_Date()+"");
				}
				else {
					datarow.createCell(5).setCellValue("N/A");
				}
			if(report.getTermination_Reason()!=null) {
				datarow.createCell(6).setCellValue(report.getTermination_Reason());
				}
				else {
					datarow.createCell(6).setCellValue("N/A");
				}
			datarow.createCell(7).setCellValue(report.getPlan_Start_Date()+"");
			datarow.createCell(8).setCellValue(report.getPlan_End_Date()+"");
			datarow.createCell(9).setCellValue(report.getBenefit_Amount());
			rowIndex++;
		}// for:each end
		
		FileOutputStream fos = new FileOutputStream(new File("excelreport.xls"));
		workbook.write(fos);
		fos.close();
		ServletOutputStream outStream = response.getOutputStream();
		workbook.write(outStream);
		workbook.close();
	}
}
