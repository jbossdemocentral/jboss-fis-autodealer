package com.redhat.fis.dms.mockprocessor;

public class GeoLocationCheck {
	
	
	public Integer isCloseToStore(String location){
		if(location!=null && !location.trim().isEmpty()){
			
			if(location.startsWith("3") || location.startsWith("7"))
				return 1;
			else if (location.endsWith("0") || location.endsWith("8") || location.endsWith("5"))
				return 2;
			else
				return 0;
			
		}else{
			return 0;
			
		}
		
		
	}

}
