package org.Tasks.Streams.EmployeeTask;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class EmployeeTest {
    private EmployeeUtils employeeUtils = new EmployeeUtils();

    @Test
    public void employeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");

        String actual = employeeUtils.getFullName(employee);

        assertEquals(actual,"Jerome Donaldson");
    }

    @Test
    public void employeeManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Westbay");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagersLastName(employee1);

        assertEquals(actual,"Westbay");
    }

    @Test
    public void employeeInEmploymentLongerThanFiveYears() {
        Employee employee = new Employee();
        employee.setYearsOfService(20);

        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

        assertTrue(actual);
    }

    @Test
    public void employeeHasMoreThanThreeDirectReports() {
        Employee employee = new Employee();
        employee.setNumberOfDirectReports(5);

        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);

        assertTrue(actual);
    }

    @Test
    public void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(5);
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        assertTrue(actual);
    }

}



