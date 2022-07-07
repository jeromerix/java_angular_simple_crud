package com.crud.demo.Repository;

import com.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {

    //methoden instellen voor de queries
    void deleteEmployeeById(Long id);

    //mocht er geen Employee met dit id zijn
    Optional<Employee> findEmployeeById(Long id);
}
