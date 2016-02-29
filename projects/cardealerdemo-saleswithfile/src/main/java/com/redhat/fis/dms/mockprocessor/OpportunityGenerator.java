package com.redhat.fis.dms.mockprocessor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.redhat.fis.dms.model.Opportunity;

public class OpportunityGenerator {
	List<Opportunity> opportunityList = new ArrayList<Opportunity>();
	
	
	public OpportunityGenerator(){
		//generateRandomOpportunities();
	}
	
	public void addOpportunity(Opportunity opportunity){
		opportunityList.add(opportunity);
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
			//opportunityinList.add(opportunity.getOpenDate());
			
			data.add(opportunityinList);
		}
		
		resultMap.put("data", data);
		
		return resultMap;
	}
	
	
}
