package com.Pbazar.Runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.Pbazar.Entity.ReportEntity;
import com.Pbazar.Repo.ReportRepo;

@Component
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	private ReportRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		ReportEntity re1 = new ReportEntity();
		re1.setUserName("keven");
		re1.setGender("Male");
		re1.setPlanName("Cash-in-Transit Insurance--Cash");
		re1.setPlanStatus("Approved");
		re1.setPlan_Start_Date(LocalDate.now().minusMonths(9));
		re1.setPlan_End_Date(LocalDate.now().plusMonths(3));
		re1.setBenefit_Amount(5000000.0);

		ReportEntity re2 = new ReportEntity();
		re2.setUserName("olivia");
		re2.setGender("Female");
		re2.setPlanName("Cash-in-Counter Insurance--Cash");
		re2.setPlanStatus("Denied");
		re2.setDenial_Reason("Lack of valid business permits, tax documents, or licenses.");
		re2.setPlan_Start_Date(LocalDate.now().minusDays(10));
		re2.setPlan_End_Date(LocalDate.now().plusYears(5));
		re2.setBenefit_Amount(640000.0);

		ReportEntity re3 = new ReportEntity();
		re3.setUserName("duke");
		re3.setGender("Male");
		re3.setPlanName("Money Insurance Policy--Cash");
		re3.setPlanStatus("Terminated");
		re3.setPlan_Start_Date(LocalDate.now().minusMonths(11));
		re3.setPlan_End_Date(LocalDate.now().plusMonths(1));
		re3.setTerminated_Date(LocalDate.now());
		re3.setTermination_Reason("Office permanently shut down or sold to a new owner.");
		re3.setBenefit_Amount(2000000.0);

		ReportEntity re4 = new ReportEntity();
		re4.setUserName("sujen");
		re4.setGender("Female");
		re4.setPlanName("Money Insurance Policy--Cash");
		re4.setPlanStatus("Approved");
		re4.setPlan_Start_Date(LocalDate.now().minusDays(6));
		re4.setPlan_End_Date(LocalDate.now().plusMonths(24));
		re4.setBenefit_Amount(1235000.0);

		ReportEntity re5 = new ReportEntity();
		re5.setUserName("peter");
		re5.setGender("Male");
		re5.setPlanName("Cash-in-Counter Insurance--Cash");
		re5.setPlanStatus("Terminated");
		re5.setPlan_Start_Date(LocalDate.now().minusMonths(9));
		re5.setPlan_End_Date(LocalDate.now().plusMonths(3));
		re5.setTerminated_Date(LocalDate.now());
		re5.setTermination_Reason("Exceeding the cash limit specified in the policy.");
		re5.setBenefit_Amount(980000.0);

		ReportEntity re6 = new ReportEntity();
		re6.setUserName("steve");
		re6.setGender("Male");
		re6.setPlanName("Cash-in-Transit Insurance--Cash");
		re6.setPlanStatus("Approved");
		re6.setPlan_Start_Date(LocalDate.now());
		re6.setPlan_End_Date(LocalDate.now().plusMonths(84));
		re6.setBenefit_Amount(4500000.0);

		ReportEntity re7 = new ReportEntity();
		re7.setUserName("lisa");
		re7.setGender("Female");
		re7.setPlanName("Fast Food Outlet Insurance--Food");
		re7.setPlanStatus("Approved");
		re7.setPlan_Start_Date(LocalDate.now().minusMonths(5));
		re7.setPlan_End_Date(LocalDate.now().plusMonths(20));
		re7.setBenefit_Amount(1750000.0);

		ReportEntity re8 = new ReportEntity();
		re8.setUserName("james");
		re8.setGender("Male");
		re8.setPlanName("Food Warehouse Protection Plan--Food");
		re8.setPlanStatus("Denied");
		re8.setDenial_Reason("Non-compliance with food safety regulations.");
		re8.setPlan_Start_Date(LocalDate.now().minusMonths(1));
		re8.setPlan_End_Date(LocalDate.now().plusMonths(18));
		re8.setBenefit_Amount(950000.0);

		ReportEntity re9 = new ReportEntity();
		re9.setUserName("harry");
		re9.setGender("Male");
		re9.setPlanName("Organic Farm Insurance--Food");
		re9.setPlanStatus("Terminated");
		re5.setTerminated_Date(LocalDate.now().minusDays(10));
		re9.setPlan_Start_Date(LocalDate.now().minusMonths(8));
		re9.setPlan_End_Date(LocalDate.now().plusMonths(10));
		re9.setTermination_Reason("Farm ceased organic certification.");
		re9.setBenefit_Amount(1150000.0);

		ReportEntity re10 = new ReportEntity();
		re10.setUserName("sophia");
		re10.setGender("Female");
		re10.setPlanName("Critical Illness Insurance--Healthcare");
		re10.setPlanStatus("Approved");
		re10.setPlan_Start_Date(LocalDate.now().minusMonths(7));
		re10.setPlan_End_Date(LocalDate.now().plusYears(2));
		re10.setBenefit_Amount(3250000.0);


		ReportEntity re11 = new ReportEntity();
		re11.setUserName("john");
		re11.setGender("Male");
		re11.setPlanName("Surgical Expense Cover--Healthcare");
		re11.setPlanStatus("Denied");
		re11.setDenial_Reason("Pre-existing condition not covered.");
		re11.setPlan_Start_Date(LocalDate.now().minusDays(15));
		re11.setPlan_End_Date(LocalDate.now().plusMonths(24));
		re11.setBenefit_Amount(780000.0);

		ReportEntity re12 = new ReportEntity();
		re12.setUserName("emma");
		re12.setGender("Female");
		re12.setPlanName("Freelancer Income Protection--Employment");
		re12.setPlanStatus("Approved");
		re12.setPlan_Start_Date(LocalDate.now().minusMonths(6));
		re12.setPlan_End_Date(LocalDate.now().plusMonths(12));
		re12.setBenefit_Amount(2500000.0);

		ReportEntity re13 = new ReportEntity();
		re13.setUserName("Mr. Anderson");
		re13.setGender("Male");
		re13.setPlanName("Cash-in-Transit Insurance--Cash");
		re13.setPlanStatus("Approved");
		re13.setPlan_Start_Date(LocalDate.now().minusMonths(10));
		re13.setPlan_End_Date(LocalDate.now().plusMonths(5));
		re13.setBenefit_Amount(4800000.0);

		ReportEntity re14 = new ReportEntity();
		re14.setUserName("Mr. Brown");
		re14.setGender("Male");
		re14.setPlanName("Cash-in-Counter Insurance--Cash");
		re14.setPlanStatus("Terminated");
		re5.setTerminated_Date(LocalDate.now().minusMonths(3));
		re14.setPlan_Start_Date(LocalDate.now().minusMonths(7));
		re14.setPlan_End_Date(LocalDate.now().plusMonths(8));
		re14.setTermination_Reason("Breach of cash handling protocol.");
		re14.setBenefit_Amount(920000.0);

		ReportEntity re15 = new ReportEntity();
		re15.setUserName("Mr. Carter");
		re15.setGender("Male");
		re15.setPlanName("Money Insurance Policy--Cash");
		re15.setPlanStatus("Denied");
		re15.setDenial_Reason("Incomplete business registration.");
		re15.setPlan_Start_Date(LocalDate.now().minusMonths(2));
		re15.setPlan_End_Date(LocalDate.now().plusYears(3));
		re15.setBenefit_Amount(1600000.0);

		ReportEntity re16 = new ReportEntity();
		re16.setUserName("Mr. Davis");
		re16.setGender("Male");
		re16.setPlanName("Fast Food Outlet Insurance--Food");
		re16.setPlanStatus("Approved");
		re16.setPlan_Start_Date(LocalDate.now().minusMonths(12));
		re16.setPlan_End_Date(LocalDate.now().plusMonths(18));
		re16.setBenefit_Amount(1450000.0);

		ReportEntity re17 = new ReportEntity();
		re17.setUserName("Mr. Evans");
		re17.setGender("Male");
		re17.setPlanName("Food Warehouse Protection Plan--Food");
		re17.setPlanStatus("Terminated");
		re5.setTerminated_Date(LocalDate.now().minusMonths(1));
		re17.setPlan_Start_Date(LocalDate.now().minusMonths(5));
		re17.setPlan_End_Date(LocalDate.now().plusMonths(9));
		re17.setTermination_Reason("Policyholder failed to renew warehouse inspection.");
		re17.setBenefit_Amount(1100000.0);

		ReportEntity re18 = new ReportEntity();
		re18.setUserName(" Foster");
		re18.setGender("Male");
		re18.setPlanName("Organic Farm Insurance--Food");
		re18.setPlanStatus("Denied");
		re18.setDenial_Reason("Insufficient organic certification.");
		re18.setPlan_Start_Date(LocalDate.now().minusDays(20));
		re18.setPlan_End_Date(LocalDate.now().plusMonths(15));
		re18.setBenefit_Amount(880000.0);

		ReportEntity re19 = new ReportEntity();
		re19.setUserName(" Green");
		re19.setGender("Male");
		re19.setPlanName("Critical Illness Insurance--Healthcare");
		re19.setPlanStatus("Approved");
		re19.setPlan_Start_Date(LocalDate.now().minusMonths(9));
		re19.setPlan_End_Date(LocalDate.now().plusYears(1));
		re19.setBenefit_Amount(3200000.0);

		ReportEntity re20 = new ReportEntity();
		re20.setUserName(" Harris");
		re20.setGender("Male");
		re20.setPlanName("Surgical Expense Cover--Healthcare");
		re20.setPlanStatus("Approved");
		re20.setPlan_Start_Date(LocalDate.now().minusMonths(3));
		re20.setPlan_End_Date(LocalDate.now().plusMonths(24));
		re20.setBenefit_Amount(900000.0);

		ReportEntity re21 = new ReportEntity();
		re21.setUserName(" Irving");
		re21.setGender("Male");
		re21.setPlanName("Freelancer Income Protection--Employment");
		re21.setPlanStatus("Denied");
		re21.setDenial_Reason("Irregular income source, does not meet policy standards.");
		re21.setPlan_Start_Date(LocalDate.now().minusMonths(1));
		re21.setPlan_End_Date(LocalDate.now().plusYears(2));
		re21.setBenefit_Amount(1100000.0);

		ReportEntity re22 = new ReportEntity();
		re22.setUserName(" Jackson");
		re22.setGender("Male");
		re22.setPlanName("Corporate Layoff Protection--Employment");
		re22.setPlanStatus("Approved");
		re22.setPlan_Start_Date(LocalDate.now().minusMonths(15));
		re22.setPlan_End_Date(LocalDate.now().plusMonths(6));
		re22.setBenefit_Amount(2700000.0);

		ReportEntity re23 = new ReportEntity();
		re23.setUserName(" King");
		re23.setGender("Male");
		re23.setPlanName("Fast Food Outlet Insurance--Food");
		re23.setPlanStatus("Terminated");
		re5.setTerminated_Date(LocalDate.now().minusDays(20));
		re23.setPlan_Start_Date(LocalDate.now().minusMonths(10));
		re23.setPlan_End_Date(LocalDate.now().plusMonths(3));
		re23.setTermination_Reason("Repeated violations of health and safety protocols.");
		re23.setBenefit_Amount(1750000.0);

		ReportEntity re24 = new ReportEntity();
		re24.setUserName(" Lewis");
		re24.setGender("Male");
		re24.setPlanName("Cash-in-Transit Insurance--Cash");
		re24.setPlanStatus("Approved");
		re24.setPlan_Start_Date(LocalDate.now().minusMonths(6));
		re24.setPlan_End_Date(LocalDate.now().plusMonths(12));
		re24.setBenefit_Amount(4200000.0);

		ReportEntity re25 = new ReportEntity();
		re25.setUserName(" Miller");
		re25.setGender("Male");
		re25.setPlanName("Money Insurance Policy--Cash");
		re25.setPlanStatus("Denied");
		re25.setDenial_Reason("Failure to submit mandatory business income reports.");
		re25.setPlan_Start_Date(LocalDate.now().minusMonths(2));
		re25.setPlan_End_Date(LocalDate.now().plusYears(4));
		re25.setBenefit_Amount(1350000.0);
		
		ReportEntity re26 = new ReportEntity();
		re26.setUserName("Ms. Anderson");
		re26.setGender("Female");
		re26.setPlanName("Cash-in-Transit Insurance--Cash");
		re26.setPlanStatus("Approved");
		re26.setPlan_Start_Date(LocalDate.now().minusMonths(8));
		re26.setPlan_End_Date(LocalDate.now().plusMonths(7));
		re26.setBenefit_Amount(4500000.0);

		ReportEntity re27 = new ReportEntity();
		re27.setUserName("Ms. Brown");
		re27.setGender("Female");
		re27.setPlanName("Cash-in-Counter Insurance--Cash");
		re27.setPlanStatus("Terminated");
		re27.setPlan_Start_Date(LocalDate.now().minusMonths(12));
		re27.setPlan_End_Date(LocalDate.now().plusMonths(4));
		re27.setTermination_Reason("Exceeded maximum cash deposit limit.");
		re27.setBenefit_Amount(780000.0);

		ReportEntity re28 = new ReportEntity();
		re28.setUserName("Ms. Carter");
		re28.setGender("Female");
		re28.setPlanName("Money Insurance Policy--Cash");
		re28.setPlanStatus("Denied");
		re28.setDenial_Reason("Lack of proper financial documentation.");
		re28.setPlan_Start_Date(LocalDate.now().minusMonths(3));
		re28.setPlan_End_Date(LocalDate.now().plusYears(2));
		re28.setBenefit_Amount(950000.0);

		ReportEntity re29 = new ReportEntity();
		re29.setUserName("Ms. Davis");
		re29.setGender("Female");
		re29.setPlanName("Fast Food Outlet Insurance--Food");
		re29.setPlanStatus("Approved");
		re29.setPlan_Start_Date(LocalDate.now().minusMonths(14));
		re29.setPlan_End_Date(LocalDate.now().plusMonths(10));
		re29.setBenefit_Amount(2100000.0);

		ReportEntity re30 = new ReportEntity();
		re30.setUserName("Ms. Evans");
		re30.setGender("Female");
		re30.setPlanName("Food Warehouse Protection Plan--Food");
		re30.setPlanStatus("Terminated");
		re5.setTerminated_Date(LocalDate.now());
		re30.setPlan_Start_Date(LocalDate.now().minusMonths(5));
		re30.setPlan_End_Date(LocalDate.now().plusMonths(8));
		re30.setTermination_Reason("Failure to adhere to safety regulations.");
		re30.setBenefit_Amount(1120000.0);
		
		List<ReportEntity> list=Arrays.asList(re1,re2,re3,re4,re5,re6,re7,re8,re9,re10,re11,re12,re13,re15,re25,re14,re16,re17,re18,re18,re19,re20,re21,re22,re23,re24,re26,re27,re28,re28,re29,re30);
		repo.saveAll(list);
		System.err.println("record inserted...");
	}

}
