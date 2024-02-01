package com.example.utesocialnetworkwebsitebackend.repositories;

import com.example.utesocialnetworkwebsitebackend.eitities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}