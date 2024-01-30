package com.example.restservice;


/*
Step 3:
Create a resource class for the Employee that includes
private variables for employee_id, first_name, last_name, email, and title.
Also include getter functions for each variable.
*/

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    private long employee_id;

    private String first_name;

    private String last_name;

    private String email;

    private String title;

    public Employee(long employeeId, String firstname, String lastname, String email, String title){
        this.employee_id=employeeId;
        this.first_name=firstname;
        this.last_name=lastname;
        this.email=email;
        this.title=title;
    }

    @JsonProperty("employee_id")
    public long getEmployeeId() {
        return employee_id;
    }

    @JsonProperty("first_name")
    public String getFirstname() {
        return first_name;
    }

    @JsonProperty("last_name")
    public String getLastname() {
        return last_name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

}

