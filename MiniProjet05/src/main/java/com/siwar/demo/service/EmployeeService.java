package com.siwar.demo.service;

import java.util.List;
import com.siwar.demo.entities.Employee;
import com.siwar.demo.entities.Team;
import com.siwar.demo.dto.*;

public interface EmployeeService {
	
	EmployeeDTO saveEmployee(EmployeeDTO e);
	EmployeeDTO getEmployee(Long id);
	List<EmployeeDTO> getAllEmployee();
	
	EmployeeDTO updateEmployee(EmployeeDTO e);
	void deleteEmployee(Employee e);
	void deleteEmployeeById(Long id);
	

	List<Employee> findByNom(String nom);

	List<Employee> findByNomContains(String nom);

	List<Employee> findByNomSalaire(String nom, Double salaire);

	List<Employee> findByTeam(Team team);

	List<Employee> findByTeamIdTeam(Long id);

	List<Employee> trierEmployeesNomsSalaire();
	
	List<Employee> findByOrderByNomAsc();


	EmployeeDTO convertEntityToDto (Employee employee);
	Employee convertDtoToEntity(EmployeeDTO employeetDto);
}
