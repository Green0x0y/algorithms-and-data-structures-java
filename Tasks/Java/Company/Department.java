package org.Tasks.Java.Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {
    private String department_name;
    private List<Employee> employees = new ArrayList<Employee>();

    Department(String department_name){
        this.department_name = department_name;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    public void showEmployees(){
        System.out.println(Arrays.toString(employees.toArray()));
    }

    public String getDepartment_name() {
        return department_name;
    }
}
