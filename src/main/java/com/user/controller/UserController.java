package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.emp.entity.Employee;
import com.user.model.User;
import com.user.service.IUserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {


	@Autowired
	IUserService iUserService;
	
	@Autowired
	private RestTemplate restTemplate;
		
	@PostMapping("/saveUser")
	Integer createEmployee(@RequestBody User user)
	{
		Integer id =iUserService.saveUser(user);
		return id;
	}
	
	@GetMapping("/getAllUser")
	List<User> getAuthor()
	{
		return iUserService.getAllUser();
	}
	
	
	@GetMapping("/getUserbyType")
	List<User> getUserByType(@PathVariable String Type )
	{
		List<User> record=iUserService.getUserByType(Type);
		return record;
		
	}
	
	
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId) {
		Employee employee=this.iEmployeeService.getEmployee(eId);
		
		//http://localhost:9090/record/emp/13111
		//List records=this.restTemplate.getForObject("http://localhost:9090/record/emp/" +eId, List.class);
		List records=this.restTemplate.getForObject("http:record-Microservice/record/emp/" +eId, List.class);
		employee.setRecords(records);
		return employee;
	}

	@GetMapping("getBooksBy/{Phone}")
	public User getBooks(@PathVariable("Phone") String Phone) {
		User bookRecords=this.iUserService.getUserByPhone(Phone);
		
		//http://localhost:9090/record/emp/13111
		//List records=this.restTemplate.getForObject("http://localhost:9090/record/emp/" +eId, List.class);
		List records=this.restTemplate.getForObject("http:Book-Microservice/bookByPhone/" +Phone, List.class);
		bookRecords.setRecords(records);
		return bookRecords;
	}

}
