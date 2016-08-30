package com.pranita.demo;

import java.util.List;

public class WagedIterator implements EmpIterator {

	List<Employee> employeeList;
	  private int position;
	
	
	
	public WagedIterator(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	@Override
	public Employee nextEmployee() {
		Employee emp=null;
		 for (; position < employeeList.size(); position++) {
		      if ("Waged".equals((employeeList.get(position)).getEmployeeType())) {
		        emp = employeeList.get(position);
		        position++;
		        break;
		      }
		    }
		    return emp;
	}

	@Override
	public boolean isLastEmployee() {
		 for (int i = position; i < employeeList.size(); i++) {
		      if ("Waged".equals((employeeList.get(i)).getEmployeeType())) {
		        return false;
		      }
		    }
		    return true;
	}

	@Override
	public Employee currentEmployee() {
		 if (position < employeeList.size()) {
		      return employeeList.get(position);
		    }
		    return null;
	}

}
