package com.example.demo.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.example.demo.data.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		
		List<Employee> empLst = new ArrayList<Employee>();
		empLst.add(new Employee(101,"Arham","IT","Full Stack Developer"));
		empLst.add(new Employee(102,"Mir","IT","Full Stack Developer"));
		empLst.add(new Employee(103,"Mohammed","IT","Full Stack Developer"));
		empLst.add(new Employee(104,"Guru","IT","Full Stack Developer"));
		empLst.add(new Employee(105,"Charan","IT","Full Stack Developer"));
		
		return empLst;
	}
	
	@PostMapping("/insertEmployee")
	public String insertEmployee(@RequestBody Employee empObj) {
		System.out.println("Received data is : "+empObj);
		
		String strReturn = "Data inserted in the db Successfully.";
		return strReturn;
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee empObj) {
		System.out.println("Received data to update is : "+empObj);
		
		String strReturn = "Data updated in the db Successfully.";
		return strReturn;
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		System.out.println("Received Employee ID to delete is : "+id);
		
		String strReturn = "Given Employee id "+id+" is deleted from the db Successfully.";
		return strReturn;
	}


}
