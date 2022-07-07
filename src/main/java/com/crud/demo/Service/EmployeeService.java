package com.crud.demo.Service;

import com.crud.demo.Exception.UserNotFoundException;
import com.crud.demo.Repository.EmployeeRepository;
import com.crud.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
// de service zorgt voor contact met de database
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

// een random nummer toevoegen aan de employees en een random ID meegeven voor elke user
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    // alle Employees opzoeken en terug geven

    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    //employee updaten
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    //employee deleten
    public void deleteEmployee(Long id){
        employeeRepository.deleteEmployeeById(id);
    }
    //zoek de Employee op id als die er niet is gebruik de Exception
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by " +id +" was not found!"));
    }
}
