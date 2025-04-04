package com.Pbazar.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Pbazar.Entity.ReportEntity;

public interface ReportRepo extends JpaRepository<ReportEntity,Integer>{

	@Query(value="Select Distinct(planName) from ReportEntity")
	public List<String> giveDistictPlanName();
	
	@Query(value="Select Distinct(planStatus) from ReportEntity")
	public List<String> giveDistictPlanStatus();
	
}
