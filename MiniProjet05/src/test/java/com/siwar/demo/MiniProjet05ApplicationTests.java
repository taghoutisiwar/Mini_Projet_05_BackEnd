package com.siwar.demo;

import java.util.Date;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.siwar.demo.entities.Employee;
import com.siwar.demo.entities.Team;
import com.siwar.demo.repos.EmployeeRepository;
import com.siwar.demo.service.EmployeeService;

@SpringBootTest
class MiniProjet05ApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee("siwar", "taghouti", (double) 2000, new Date());
		employeeRepository.save(employee);
	}

	@Test
	public void testFindEmployee() {
		Employee e = employeeRepository.findById(1L).get();
		System.out.println(e);
	}

	@Test
	public void testUpdateEmployee() {
		Employee e = employeeRepository.findById(1L).get();
		e.setSalaire(1000.0);
		employeeRepository.save(e);
	}

	@Test
	public void testDeleteEmployee() {
		employeeRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	@Test
	public void testFindBynomEmployeeContains(){
			List<Employee> e = employeeRepository.findByNomContains("r");
			for (Employee empl : e)
			{
			System.out.println(e);
			} 
	}

	@Test
	public void testfindByNom() {
		List<Employee> employee = employeeRepository.findByNom("siwar");
		for (Employee e : employee) {
			System.out.println(e);
		}
	}

	@Test
	public void testFindByNomContains() {
		List<Employee> employee = employeeRepository.findByNomContains("s");
		for (Employee e : employee) {
			System.out.println(e);
		}
	}

	@Test
	public void testfindByNomSalaire() {
		List<Employee> employee = employeeRepository.findByNomSalaire("siwar", (double) 2000);
		for (Employee e : employee) {
			System.out.println(e);
		}
	}

	@Test
	public void testfindByTeam() {
		Team teams = new Team();
		List<Employee> employee = employeeRepository.findByTeam(teams);
		for (Employee e : employee) {
			System.out.println(e);
		}
	}

	@Test
	public void findByTeamIdTeam() {
		List<Employee> employee = employeeRepository.findByTeamIdTeam(1L);
		for (Employee e : employee) {
			System.out.println(e);
		}
	}

	@Test
	public void testtrierEmployeesNomsSalaire() {
		List<Employee> employee = employeeRepository.trierEmployeesNomsSalaire();
		for (Employee e : employee) {
			System.out.println(e);
		}
	}
	
	@Test
	public void testfindByOrderByNomAsc()
	{
	List<Employee> empl = employeeRepository.findByOrderByNomAsc();
	for (Employee e : empl)
	{
	System.out.println(e);
	}
	}

}
