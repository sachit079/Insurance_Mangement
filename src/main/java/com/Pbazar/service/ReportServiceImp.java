package com.Pbazar.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.Pbazar.Binding.ServiceRequest;
import com.Pbazar.Entity.ReportEntity;
import com.Pbazar.Repo.ReportRepo;

@Service
public class ReportServiceImp implements ReportService {

	@Autowired
	private ReportRepo repo;
	 
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

}
