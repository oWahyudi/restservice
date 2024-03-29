package com.example.restservice;


/*
Step 3:
Create a resource class for the Employee that includes
private variables for employee_id, first_name, last_name, email, and title.
Also include getter functions for each variable.
*/

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "employee_id",
        "first_name",
        "last_name",
        "email",
        "title"
})
public class Employee {

    private  final long employee_id;
    private  final String first_name;
    private  final String last_name;
    private  final String email;
    private  final String title;

    public Employee(long employee_id, String first_name, String last_name, String email, String title){
        this.employee_id=employee_id;
        this.first_name=first_name;
        this.last_name=last_name;
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

