package com.Pbazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Pbazar.Binding.ServiceRequest;
import com.Pbazar.Entity.ReportEntity;
import com.Pbazar.service.ReportServiceImp;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ReportController {
	@Autowired
	private ReportServiceImp service;
	
	public void init(Model model) {
		
			
			model.addAttribute("pname", service.getPlanNameDropDown());
			model.addAttribute("pstatus", service.getPlanStatusDropDown());
	}
	
	@GetMapping("/")
	public String  loadpage(Model model) {
		model.addAttribute("report", new ServiceRequest());
		init(model);
		
		return "CheckReport";
		
	}
	
	@PostMapping("/show")
public String showDetails(@ModelAttribute("report") ServiceRequest report,Model model) {
		List<ReportEntity> res = service.getData(report);
		model.addAttribute("res", res);
		init(model);
		System.out.println(res);
	
	return "CheckReport";
}
	@GetMapping("/excel")
	public void excelExport(HttpServletResponse response,Model model ) throws Exception {
		response.setContentType("application/octet-stream");
		response.addHeader("Content-Disposition", "attachment;filename=Reportexcel.xls"); 
		service.exportExcel(response);
		
	}
	@GetMapping("/pdf")
	public void pdfExport(HttpServletResponse response, Model model) throws Exception {
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment;filename=Reportpdf.pdf"); 
		service.exportPdf(response);
	}
}
