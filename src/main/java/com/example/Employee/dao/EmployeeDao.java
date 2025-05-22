package com.example.Employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String post(Employee e) {
		er.save(e);
		return "saved successfully";
	}

	public String postEmp1(List<Employee> e) {
		er.saveAll(e);
		return "Saved Succesfully";
	}

	public Employee FindById(int v) {
		return er.findById(v).get();
	}

	public List<Employee> getmult() {
		List<Employee> t = er.findAll();
		return t;
	}

	public String delete(int t) {
		er.deleteById(t);

		return "succefull";
	}

	public String update(int n, Employee ee) {
		Employee x = er.findById(n).get();
		x.setage(ee.getage());
		x.setgender(ee.getgender());
		x.setname(ee.getname());
		x.setrole(ee.getrole());
		x.setsalary(ee.getsalary());
		er.save(x);
		return "successfull";

	}

	public String nameupdate(int n, Employee t) {
		Employee f = er.findById(n).get();
		f.setname(t.getname());
		er.save(f);
		return "Successfull";
	}

	public Employee nameupda(int n, Employee t) {
		Employee f = er.findById(n).get();
		f.setname(t.getname());
		er.save(f);
		return f;
	}

	public List<Employee> nameup(int g, Employee t) {
		Employee f = er.findById(g).get();
		f.setname(t.getname());
		er.save(f);
		return er.findAll();
	}

	public List<Employee> getbyname(String a) {
		// TODO Auto-generated method stub
		return er.getbyname(a);
	}

	public List<Employee> startswith(String a) {
		// TODO Auto-generated method stub
		return er.startswith(a);
	}

	public List<String> endswith(String a) {
		// TODO Auto-generated method stub
		return er.endswith(a);
	}

	public List<Employee> bet(int a, int b) {
		// TODO Auto-generated method stub
		return er.bet(a, b);
	}

	public List<Employee> betw() {
		// TODO Auto-generated method stub
		return er.betw();
	}

	public List<Employee> max() {
		// TODO Auto-generated method stub
		return er.max();
	}

	public int maxs() {
		// TODO Auto-generated method stub
		return er.maxs();
	}

	public List<Employee> smaxs() {
		// TODO Auto-generated method stub
		return er.smaxs();
	}
}
