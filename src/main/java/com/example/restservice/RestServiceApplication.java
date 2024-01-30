package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        Employees employess =EmployeeManager.getEmployees();
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
