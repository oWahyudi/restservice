package com.example.restservice;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeTest {

    private Employees employees;

    @BeforeEach
    void setUp(){
        employees =EmployeeManager.getEmployees();
    }

    @Test
    @Order(1)
    void testGetter(){
        employees.addEmployee(new Employee(0,"getter","getter","getter@test.com","getter"));
        Employee employee=employees.getEmployee(0);
        assertEquals("getter", employee.getFirstname());
        assertEquals("getter", employee.getLastname());
        assertEquals("getter@test.com", employee.getEmail());
        assertEquals("getter", employee.getTitle());

    }



}



