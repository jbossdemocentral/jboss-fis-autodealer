package com.redhat.fis.dms.mockprocessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.redhat.fis.dms.model.Opportunity;

public class OpportunityGenerator {
	List<Opportunity> opportunityList = new ArrayList<Opportunity>();
	
	
	public OpportunityGenerator(){
		generateRandomOpportunities();
	}
	
	public HashMap<String, ArrayList<ArrayList<String>>> getAllList(){
		
		HashMap<String, ArrayList<ArrayList<String>>> resultMap = new HashMap<String, ArrayList<ArrayList<String>>>();
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		
		for(Opportunity opportunity: opportunityList){
			
			ArrayList<String> opportunityinList = new ArrayList<String>();
			opportunityinList.add(opportunity.getCustName());
			opportunityinList.add(opportunity.getPhone());
			opportunityinList.add(opportunity.getType());
			opportunityinList.add(opportunity.getStage());
			opportunityinList.add(opportunity.getVehicleId());
			opportunityinList.add(opportunity.getDiscount().toString());
			opportunityinList.add(opportunity.getOpenDate());
			
			data.add(opportunityinList);
		}
		
		resultMap.put("data", data);
		
		return resultMap;
	}
	
	private void generateRandomOpportunities(){
		
		Opportunity op1= new Opportunity();
		op1.setCustName("Pasqualino Daryush");
		op1.setDiscount(15);
		op1.setPhone("202-555-0132");
		op1.setType("Lost");
		op1.setStage("Closed");
		op1.setVehicleId("vno01");
		op1.setOpenDate("2016-01-01");
		
		Opportunity op2= new Opportunity();
		op2.setCustName("Tone Manuel");
		op2.setDiscount(15);
		op2.setPhone("202-555-0132");
		op2.setType("Won");
		op2.setStage("Closed");
		op2.setVehicleId("vno02");
		op2.setOpenDate("2016-01-01");
		
		Opportunity op3= new Opportunity();
		op3.setCustName("Amis Giancarlo");
		op3.setDiscount(15);
		op3.setPhone("832-697-3381");
		op3.setType("Won");
		op3.setStage("Closed");
		op3.setVehicleId("vno06");
		op3.setOpenDate("2016-01-02");
		
		Opportunity op4= new Opportunity();
		op4.setCustName("Mary Lea");
		op4.setDiscount(15);
		op4.setPhone("952-461-7909");
		op4.setType("Lost");
		op4.setStage("Closed");
		op4.setVehicleId("vno06");
		op4.setOpenDate("2016-01-18");
		
		Opportunity op5= new Opportunity();
		op5.setCustName("Charles K. Elliott");
		op5.setDiscount(15);
		op5.setPhone("830-296-8320");
		op5.setType("Won");
		op5.setStage("Closed");
		op5.setVehicleId("vno07");
		op5.setOpenDate("2016-01-05");
		
		Opportunity op6= new Opportunity();
		op6.setCustName("Joanne Gruver");
		op6.setDiscount(15);
		op6.setPhone("952-461-7909");
		op6.setType("Open");
		op6.setStage("Negotiating");
		op6.setVehicleId("vno05");
		op6.setOpenDate("2016-01-16");
		
		Opportunity op7= new Opportunity();
		op7.setCustName("Scott M. Nystrom");
		op7.setDiscount(15);
		op7.setPhone("504-248-3491");
		op7.setType("Open");
		op7.setStage("Quate");
		op7.setVehicleId("vno07");
		op7.setOpenDate("2016-01-11");
		
		Opportunity op8= new Opportunity();
		op8.setCustName("Stephanie Marshall");
		op8.setDiscount(15);
		op8.setPhone("718-583-3616");
		op8.setType("Lost");
		op8.setStage("Negotiating");
		op8.setVehicleId("vno05");
		op8.setOpenDate("2016-01-01");
	
		
		Opportunity op9= new Opportunity();
		op9.setCustName("John A. Spencer");
		op9.setDiscount(15);
		op9.setPhone("917-601-5750");
		op9.setType("Open");
		op9.setStage("Quate");
		op9.setVehicleId("vno04");
		op9.setOpenDate("2016-01-18");
		
		Opportunity op10= new Opportunity();
		op10.setCustName("Charles Wall");
		op10.setDiscount(15);
		op10.setPhone("970-264-8238");
		op10.setType("Open");
		op10.setStage("Negotiating");
		op10.setVehicleId("vno03");
		op10.setOpenDate("2016-01-17");
		
		Opportunity op11= new Opportunity();
		op11.setCustName("Keely Delvalle");
		op11.setDiscount(15);
		op11.setPhone("612-318-4013");
		op11.setType("Open");
		op11.setStage("Quate");
		op11.setVehicleId("vno05");
		op11.setOpenDate("2016-01-19");
		
		Opportunity op12= new Opportunity();
		op12.setCustName("Christopher Murphy");
		op12.setDiscount(15);
		op12.setPhone("207-643-028");
		op12.setType("Open");
		op12.setStage("Negotiating");
		op12.setVehicleId("vno01");
		op12.setOpenDate("2016-01-21");
		
		Opportunity op13= new Opportunity();
		op13.setCustName("Yolanda D. Willems");
		op13.setDiscount(15);
		op13.setPhone("765-265-8972");
		op13.setType("Won");
		op13.setStage("Quate");
		op13.setVehicleId("vno04");
		op13.setOpenDate("2016-01-01");
		
		Opportunity op14= new Opportunity();
		op14.setCustName("Richard Webster");
		op14.setDiscount(15);
		op14.setPhone("720-839-7540");
		op14.setType("Open");
		op14.setStage("Quate");
		op14.setVehicleId("vno03");
		op14.setOpenDate("2016-01-27");
		
		Opportunity op15= new Opportunity();
		op15.setCustName("Stephanie D. Ling");
		op15.setDiscount(15);
		op15.setPhone("803-594-6576");
		op15.setType("Open");
		op15.setStage("Quate");
		op15.setVehicleId("vno02");
		op15.setOpenDate("2016-01-29");
		
		opportunityList.add(op1);
		opportunityList.add(op2);
		opportunityList.add(op3);
		opportunityList.add(op4);
		opportunityList.add(op5);
		opportunityList.add(op6);
		opportunityList.add(op7);
		opportunityList.add(op8);
		opportunityList.add(op9);
		opportunityList.add(op10);
		opportunityList.add(op11);
		opportunityList.add(op12);
		opportunityList.add(op13);
		opportunityList.add(op14);
		opportunityList.add(op15);
		
	}
}
