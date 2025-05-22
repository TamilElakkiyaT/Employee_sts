package com.example.Employee.Service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.dao.EmployeeDao;
import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	@Autowired
	EmployeeRepository Er;

	public String post(Employee e) {
		return ed.post(e);
	}

	public String postEmp1(List<Employee> e) {
		return ed.postEmp1(e);
	}

	public Employee FindById(int n) {
		return ed.FindById(n);
	}

	public List<Employee> getmult() {
		return ed.getmult();
	}

	public String delete(int t) {
		return ed.delete(t);
	}

	public String update(int n, Employee ee) {
		return ed.update(n, ee);
	}

	public String nameupdate(int n, Employee ee) {
		return ed.nameupdate(n, ee);
	}

	public Employee nameupda(int n, Employee ee) {
		return ed.nameupda(n, ee);
	}

	public List<Employee> nameup(int n, Employee ee) {
		return ed.nameup(n, ee);
	}

	public Employee getagemax() {
		List<Employee> y = Er.findAll();
		Employee z = y.stream().sorted(Comparator.comparing(Employee::getage).reversed()).skip(1).findFirst().get();
		return z;

	}

	public List<Employee> getbyname(String a) {
		// TODO Auto-generated method stub
		return ed.getbyname(a);
	}

	public List<Employee> startswith(String a) {
		// TODO Auto-generated method stub
		return ed.startswith(a);
	}

	public List<String> endswith(String a) {
		// TODO Auto-generated method stub
		return ed.endswith(a);
	}

	public List<Employee> bet(int a, int b) {
		// TODO Auto-generated method stub
		return ed.bet(a, b);
	}

	public List<Employee> betw() {
		// TODO Auto-generated method stub
		return ed.betw();
	}

	public List<Employee> max() {
		// TODO Auto-generated method stub
		return ed.max();
	}

	public int maxs() {
		// TODO Auto-generated method stub
		return ed.maxs();
	}

	public List<Employee> smaxs() {
		// TODO Auto-generated method stub
		return ed.smaxs();
	}

}
