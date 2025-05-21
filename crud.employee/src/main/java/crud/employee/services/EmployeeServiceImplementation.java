package crud.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entities.Employee;
import crud.employee.repositories.EmployeeRepository;


@Service
public class EmployeeServiceImplementation implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}
}
