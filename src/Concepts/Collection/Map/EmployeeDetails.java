package Concepts.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class EmployeeDetails {

	public EmployeeDetails() {
		
	}

	public static void main(String[] args) {
		
		Map<String, List<String>> _objEmployeeDetailsMap=new HashMap<>();
		List<String> _objEmployeeDetailsList=new ArrayList<>();
		
		//Employee 1
		_objEmployeeDetailsList.add("Gaurav");
        _objEmployeeDetailsList.add("Manager");
        _objEmployeeDetailsList.add("2500000");
        _objEmployeeDetailsList.add("gauravthakurgt@gmail.com");
        
        _objEmployeeDetailsMap.put("Employee1", _objEmployeeDetailsList);
        
        System.out.println(_objEmployeeDetailsMap);
        //Employee 2
        _objEmployeeDetailsList.add("Shashank");
        _objEmployeeDetailsList.add("Junior Developer");
        _objEmployeeDetailsList.add("50000");
        _objEmployeeDetailsList.add("shashank12@gmail.com");
        _objEmployeeDetailsMap.put("Employee2", _objEmployeeDetailsList);
        
        System.out.println(_objEmployeeDetailsMap);
		
	}

}
