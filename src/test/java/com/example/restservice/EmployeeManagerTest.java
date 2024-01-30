package com.example.restservice;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeManagerTest {

    @BeforeEach
    void setUp(){
        Employees employees1 =EmployeeManager.getEmployees();
    }

    @Test
    @Order(1)
    void testSingleton(){
        Employees employees1 =EmployeeManager.getEmployees();
        assertEquals(4,employees1.getEmployeelist().size());
        Employees employees2 =EmployeeManager.getEmployees();
        assertEquals(4,employees1.getEmployeelist().size());
        Employees employees3 =EmployeeManager.getEmployees();
        assertEquals(4,employees1.getEmployeelist().size());
    }

}
