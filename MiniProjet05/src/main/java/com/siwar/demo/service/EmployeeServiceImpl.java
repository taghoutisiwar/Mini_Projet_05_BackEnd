package com.siwar.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siwar.demo.dto.EmployeeDTO;
import com.siwar.demo.entities.Employee;
import com.siwar.demo.entities.Team;
import com.siwar.demo.repos.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public EmployeeDTO saveEmployee(EmployeeDTO e) {
		return convertEntityToDto (employeeRepository.save(convertDtoToEntity(e)));
	}
	
	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO e) {
		return convertEntityToDto(employeeRepository.save(convertDtoToEntity(e)));
	}
	
	@Override
	public void deleteEmployee(Employee e) {
		employeeRepository.delete(e);
	}
	
	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}
	
	@Override
	public EmployeeDTO getEmployee(Long id) {
		return convertEntityToDto (employeeRepository.findById(id).get());
	}
	
	@Override
	public List<EmployeeDTO> getAllEmployee() {
		return employeeRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}
	
	
	@Override
	public List<Employee> findByNom(String nom) {
		
		return employeeRepository.findByNom(nom);
	}
	
	@Override
	public List<Employee> findByNomContains(String nom) {
		
		return employeeRepository.findByNomContains(nom);
	}
	
	@Override
	public List<Employee> findByNomSalaire(String nom, Double salaire) {
		
		return employeeRepository.findByNomSalaire(nom, salaire);
	}
	
	@Override
	public List<Employee> findByTeam(Team team) {
		
		return employeeRepository.findByTeam(team);
	}
	
	@Override
	public List<Employee> findByTeamIdTeam(Long id) {
	
		return employeeRepository.findByTeamIdTeam(id);
	}
	
	@Override
	public List<Employee> trierEmployeesNomsSalaire() {
		
		return employeeRepository.trierEmployeesNomsSalaire();
	}
	

	@Override
	public List<Employee> findByOrderByNomAsc() {
		return employeeRepository.findByOrderByNomAsc();
	}
	
	@Override
	public EmployeeDTO convertEntityToDto(Employee employee) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		EmployeeDTO employeeDTO = modelMapper.map(employee, EmployeeDTO.class);
		return employeeDTO;
	}
	
	@Override
	public Employee convertDtoToEntity(EmployeeDTO employeetDto) {
		Employee employee = new Employee();
		employee = modelMapper.map(employeetDto, Employee.class);
		
		return employee;
	}
}
