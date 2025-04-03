package com.Pbazar.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.Pbazar.Binding.ServiceRequest;
import com.Pbazar.Entity.ReportEntity;
import com.Pbazar.Repo.ReportRepo;
import com.Pbazar.Utils.EmailUtils;
import com.Pbazar.Utils.ExcelGenerator;
import com.Pbazar.Utils.PdfGenerator;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportServiceImp implements ReportService {

	@Autowired
	private ReportRepo repo;
	
	@Autowired
	private ExcelGenerator excel;
	
	@Autowired
	private PdfGenerator pdf;
	
	@Autowired
	private EmailUtils email;
	@Override
	public List<String> getPlanNameDropDown() {
		
		return repo.giveDistictPlanName();
	}

	@Override
	public List<String> getPlanStatusDropDown() {
		
		return repo.giveDistictPlanStatus();
	}


	@Override
	public List<ReportEntity> getData(ServiceRequest service) {
		System.out.println(service.getPname()+" "+service.getPStatus()+" "+service.getGender());
		ReportEntity entity= new ReportEntity();
		if(service.getPname() != null && !"".equals(service.getPname())) {
			entity.setPlanName(service.getPname());
		}
		if(service.getPStatus() != null && !"".equals(service.getPStatus())) {
			entity.setPlanStatus(service.getPStatus());
		}
		if(service.getGender() != null && !"".equals(service.getGender())) {
			entity.setGender(service.getGender());
		}
		if(service.getSDate() != null ) {
			entity.setPlan_Start_Date(service.getSDate());
		}
		if(service.getEdate() != null ) {
			entity.setPlan_End_Date(service.getEdate());
		}
		return repo.findAll(Example.of(entity));
	}

	@Override
	public Boolean exportExcel(HttpServletResponse response) throws Exception {
		File f =new File("excelreport.xls");
		List<ReportEntity> list=repo.findAll();
		excel.generateExcel(response, list);
		
		email.sendEmail("testing the mail", "<h2>testing the email smtp...</h2>", "deepaknayak2107@gmail.com", f);
		f.delete();
		return true;
	}
  
	@Override
	public Boolean exportPdf(HttpServletResponse response) throws Exception {
		List<ReportEntity> list=repo.findAll();
		File f =new File("pdfreport.pdf");

		pdf.generatePdf(response, list);
		email.sendEmail("testing the mail", "<h2>testing the email smtp...</h2>", "deepaknayak2107@gmail.com", f);
		f.delete();
		return true;
	}

}
