package com.Pbazar.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name="Report_Details")
public class ReportEntity {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer userId;
	private String userName;
	private String gender;
	private String planName;
	private String planStatus;
    @Temporal(TemporalType.DATE)  // Stores only Date (YYYY-MM-DD)
	private LocalDate Plan_Start_Date;
    @Temporal(TemporalType.DATE)  // Stores only Date (YYYY-MM-DD)
	private LocalDate Plan_End_Date;
	private Double Benefit_Amount;
	private String denial_Reason;
	 @Temporal(TemporalType.DATE)
	private LocalDate terminated_Date;
	private String termination_Reason;
}
