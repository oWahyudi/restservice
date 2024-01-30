package com.example.restservice;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeesTest {
    private Employees employees;

    @BeforeEach
    void setUp(){
        //Insert 4 new employees
         this.employees =EmployeeManager.getEmployees();
    }

    @Test
    @Order(1)
    void testEmptyList(){
        employees=new Employees();
        assertEquals(0, employees.getEmployeelist().size());
    }

    @Test
    @Order(1)
    void testGetEmployeeList() {
        assertEquals(4, employees.getEmployeelist().size());
    }

    @Test
    @Order(2)
    void testAddEmployeeList() {
        Boolean ret=employees.addEmployee(new Employee(6,"Mariah","winston","mariah@test.com","staff"));
        assertEquals(5, employees.getEmployeelist().size());
        assertEquals(true, ret);

    }

    @Test
    @Order(3)
    void testGetEmployee() {
        Employee new_employee=employees.getEmployee(1);
        assertEquals("John",new_employee.getFirstname());
    }

    @Test
    @Order(4)
    void testDeleteEmployee() {
        employees.deleteEmployee(1);
        Employee employee=employees.getEmployee(1);
        assertNull(employee);
    }

    @Test
    @Order(5)
    void testUpdateEmployee() {
        assertTrue(employees.isExist(2));
        Boolean ret = employees.updateEmployee(2,new Employee(1,"Bill","Gates","bill@test.com","Manager"));
        Employee employee=employees.getEmployee(1);
        assertEquals(true,ret);
        assertEquals("Bill",employee.getFirstname());

    }

    @Test
    @Order(6)
    void testSetEmployeeList() {
        List<Employee> new_employees =new ArrayList<>();
        new_employees.add(new Employee(1,"New","New","New@test.com","Manager"));
        new_employees.add(new Employee(2,"New2","New2","New2@test.com","Manager"));

        employees.setEmployeelist(new_employees);
        assertEquals(new_employees.size(),employees.getEmployeelist().size());
    }





}
