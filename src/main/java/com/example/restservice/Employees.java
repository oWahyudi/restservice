package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    @JsonProperty("Employees")
    private List<Employee> employeelist;

    public Employees(){
        this.employeelist=new ArrayList<Employee>();
    }

    public List<Employee> getEmployeelist(){
        return employeelist;
    }

    public  void setEmployeelist(List<Employee> employeelist){
        this.employeelist=employeelist;
    }

    public boolean addEmployee(Employee employee){
        if (isExist(employee.getEmployeeId())){
            return false;
        }
        this.employeelist.add(employee);
        return true;
    }

    public Employee getEmployee(long id){
        for (Employee employee : employeelist) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        return null;
    }


    public void deleteEmployee(long id){
        Iterator<Employee> iterator =employeelist.iterator();

        while(iterator.hasNext()){
            Employee employee =iterator.next();

            if(employee.getEmployeeId()==id){
                iterator.remove();
                break;
            }
        }
    }

    public boolean isExist(long id){
        for (Employee employee : employeelist) {
            if (employee.getEmployeeId() == id) {
                return true;
            }
        }
        return false;

    }

    public Boolean updateEmployee(long id,Employee employee){
        if (!isExist(id)){
            return false;
        }
        deleteEmployee(id);
        employeelist.add(employee);
        return  true;
    }


}
