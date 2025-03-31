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
}
