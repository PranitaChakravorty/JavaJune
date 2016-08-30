package com.pranita.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl implements IEmployee {
	List<Employee> employeeList;
	

	public EmployeeImpl(List<Employee> employeeList) {
		employeeList = new ArrayList();
	  }
	

	@Override
	public List<Employee> getEmployees() {
		return employeeList;
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeList.add(emp);

	}

	@Override
	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);

	}

	@Override
	public EmpIterator createIterator(String iteratorType) {
		
		if ("Waged".equals(iteratorType)) {
		      return new WagedIterator(employeeList);
		    } else 
		    {
		      return new SalariedIterator(employeeList);
		
		    }
	}

}
