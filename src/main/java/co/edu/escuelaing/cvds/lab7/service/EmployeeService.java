package co.edu.escuelaing.cvds.lab7.service;

import co.edu.escuelaing.cvds.lab7.model.Configuration;
import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.repository.ConfigurationRepository;
import co.edu.escuelaing.cvds.lab7.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(String id){
        return employeeRepository.findById(id);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void deleteEmployee(String id){
        employeeRepository.deleteById(id);
    }

    public String getName(){
        return employeeRepository.findByIdEmployees("1").get(0).getFirstName();
    }
    
}
