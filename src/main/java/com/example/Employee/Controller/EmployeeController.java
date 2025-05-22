package com.example.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.Service.EmployeeService;
import com.example.Employee.entity.Employee;

@RestController
@RequestMapping(value = "/emp/api")
public class EmployeeController {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postsingleEmp")
	public String post(@RequestBody Employee e) {
		return es.post(e);
	}

	@PostMapping(value = "/postmulitEmp")
	public String postEmp1(@RequestBody List<Employee> e) {
		return es.postEmp1(e);
	}

	@GetMapping(value = "/FindById/{n}")
	public Employee FindById(@PathVariable int n) {
		return es.FindById(n);
	}

	@GetMapping(value = "/getmult")
	public List<Employee> getmult() {
		return es.getmult();
	}

	@DeleteMapping(value = "/delete/{t}")
	public String delete(@PathVariable int t) {
		return es.delete(t);
	}

	@PutMapping(value = "/update/{n}")
	public String update(@PathVariable int n, @RequestBody Employee ee) {
		return es.update(n, ee);
	}

	@PatchMapping(value = "/nameupdate/{n}")
	public String nameupdate(@PathVariable int n, @RequestBody Employee ee) {
		return es.nameupdate(n, ee);
	}

	@PatchMapping(value = "/nameupda/{n}")
	public Employee nameupda(@PathVariable int n, @RequestBody Employee ee) {
		return es.nameupda(n, ee);
	}

	@PatchMapping(value = "/nameup/{n}")
	public List<Employee> nameup(@PathVariable int n, @RequestBody Employee ee) {
		return es.nameup(n, ee);
	}

	@GetMapping(value = "/getagemax")
	public Employee getagemax() {
		return es.getagemax();
	}

	@GetMapping(value = "/getbyname/{a}")
	public List<Employee> getbyname(@PathVariable String a) {
		return es.getbyname(a);
	}

	@GetMapping(value = "/startswith/{a}")
	public List<Employee> startswith(@PathVariable String a) {
		return es.startswith(a);
	}

	@GetMapping(value = "/endswith/{a}")
	public List<String> endswith(@PathVariable String a) {
		return es.endswith(a);
	}

	@GetMapping(value = "/bet/{a}/{b}")
	public List<Employee> bet(@PathVariable int a, @PathVariable int b) {
		return es.bet(a, b);
	}

	@GetMapping(value = "/betw")
	public List<Employee> betw() {
		return es.betw();
	}

	@GetMapping(value = "/max")
	public List<Employee> max() {
		return es.max();
	}

	@GetMapping(value = "/maxs")
	public int maxs() {
		return es.maxs();
	}

	@GetMapping(value = "/smaxs")
	public List<Employee> smaxs() {
		return es.smaxs();
	}
}
