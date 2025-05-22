package com.example.Employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "emp_table")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	private String role;
	private int age;
	private String gender;

	public void setid(int i) {
		id = i;
	}

	public void setname(String n) {
		name = n;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	public void setrole(String r) {
		role = r;
	}

	public void setage(int a) {
		age = a;
	}

	public void setgender(String g) {
		gender = g;
	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public int getsalary() {
		return salary;
	}

	public String getrole() {
		return role;
	}

	public int getage() {
		return age;
	}

	public String getgender() {
		return gender;
	}
}
