package com.siwar.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siwar.demo.dto.EmployeeDTO;
import com.siwar.demo.entities.Employee;
import com.siwar.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class EmployeeRESTController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeDTO> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public EmployeeDTO getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployee(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeedto) {
		return employeeService.saveEmployee(employeedto);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeedto) {
		return employeeService.updateEmployee(employeedto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
	}

	@RequestMapping(value = "/employeeteam/{idTeam}", method = RequestMethod.GET)
	public List<Employee> getEmployeesByTeamId(@PathVariable("idTeam") Long idTeam) {
		return employeeService.findByTeamIdTeam(idTeam);
	}
	
	@RequestMapping(value="/employeebynom/{nomEmployee}",method = RequestMethod.GET)
	public List<Employee> findByNomContains(@PathVariable("nomEmployee") String nomEmployee) {
	return employeeService.findByNomContains(nomEmployee);
	}
}
