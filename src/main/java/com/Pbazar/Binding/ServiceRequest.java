package com.Pbazar.Binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ServiceRequest {

	private String pname;
	private String pStatus;
	private String Gender;
	private LocalDate sDate;
	private LocalDate edate;
}
