package com.Pbazar.service;

import java.time.LocalDate;
import java.util.List;

import com.Pbazar.Binding.ServiceRequest;
import com.Pbazar.Entity.ReportEntity;

public interface ReportService {
public List<String> getPlanNameDropDown();
public List<String> getPlanStatusDropDown();
public List<ReportEntity> getData(ServiceRequest service);
}
