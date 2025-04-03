package com.Pbazar.service;

import java.util.List;

import com.Pbazar.Binding.ServiceRequest;
import com.Pbazar.Entity.ReportEntity;

import jakarta.servlet.http.HttpServletResponse;

public interface ReportService {
public List<String> getPlanNameDropDown();
public List<String> getPlanStatusDropDown();
public List<ReportEntity> getData(ServiceRequest service);
public Boolean exportExcel(HttpServletResponse response) throws Exception;
public Boolean exportPdf(HttpServletResponse response) throws Exception;
}
