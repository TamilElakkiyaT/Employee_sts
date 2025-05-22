package com.example.Employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "select e from Employee e where e.name like :a ")
	public List<Employee> getbyname(String a);

	@Query(value = "select e from Employee e where e.name like :a% ")
	public List<Employee> startswith(String a);

	@Query(value = "select e.name from Employee e where e.name like concat('%', :a) ")
	public List<String> endswith(@Param("a") String a);

	@Query(value = "select e from Employee e where e.salary between :a and :b ")
	public List<Employee> bet( int a, int b);

	@Query(value = "select e from Employee e order by name ")
	public List<Employee> betw();

	@Query(value = "select e from Employee e where e.salary= (select max(e2.salary) from Employee e2) ")
	public List<Employee> max();

	@Query(value = "select max(salary) from Employee ")
	public int maxs();

	@Query(value = "select e from Employee e where salary= (select max(e1.salary) from Employee e1 where salary<(select max(e2.salary) from Employee e2)) ")
	public List<Employee> smaxs();

}
