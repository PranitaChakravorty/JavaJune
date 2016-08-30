package com.pranita.demo;

import java.util.List;

public interface IEmployee {
	public List<Employee> getEmployees();
	 
	  public void addEmployee(Employee emp);
	 
	  public void removeEmployee(Employee emp);
	 
	  public EmpIterator createIterator(String iteratorType);


}
