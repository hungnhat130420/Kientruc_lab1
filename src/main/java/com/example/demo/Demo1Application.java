package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    public void insertEmployee(EmployeeRepository employeeRepository){
        Employee employee = Employee.builder()
                .firstName("Nhat")
                .lastName("Hung")
                .email("hungnguyen.130420@gmail.com")
                .build();
        employeeRepository.save(employee);
    }
}
