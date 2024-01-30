package com.example.restservice;

public class EmployeeManager {
    private static volatile Employees employees;

    private EmployeeManager(){
    }

    //Singleton Pattern with Thread-safe
    public static Employees getEmployees(){
        if(employees ==null){
            synchronized (EmployeeManager.class){
                if(employees==null){
                    employees=new Employees();

                    //Sample Data
                    employees.addEmployee(new Employee(1,"John","Doe","john@test.com","Manager"));
                    employees.addEmployee(new Employee(2,"March","Yu","March@test.com","Staff"));
                    employees.addEmployee(new Employee(3,"Rebeca","Song","Rebeca@test.com","Staff"));
                    employees.addEmployee(new Employee(4,"Ashley","Bil","Ashley@test.com","Staff"));

                }
            }
        }
        return EmployeeManager.employees;
    }

}
