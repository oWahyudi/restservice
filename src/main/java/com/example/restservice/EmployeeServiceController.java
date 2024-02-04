package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeServiceController {

    @GetMapping("/employees")
    public Employees employees(@RequestParam(value="id",defaultValue = "") String id){
        return EmployeeManager.getEmployees();
    }

    @PostMapping("/employee")
    public Boolean addemployee(@RequestBody Employee employee){
        Employees employees=EmployeeManager.getEmployees();
        return employees.addEmployee(employee);
    }


}
