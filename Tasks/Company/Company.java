package org.Tasks.Company;

public class Company {
    public static void main(String[] args) {
        Department dep1 = new Department("dep1");
        Department dep2 = new Department("dep2");
        Employee emp1 = new Employee("aa", "bb", "cc", "dd");
        Employee emp2 = new Employee("aab", "bbb", "ccb", "ddb");
        Employee emp3 = new Employee("c", "cc", "css", "csb");
        dep1.addEmployee(emp1);
        dep1.addEmployee(emp2);
        dep2.addEmployee(emp3);
        dep1.showEmployees();
        dep1.removeEmployee(emp1);
        dep1.showEmployees();
        System.out.println(emp1.getPhoneNo());
        emp1.setEmail("aaa");
        System.out.println(emp1.getEmail());
    }
}
