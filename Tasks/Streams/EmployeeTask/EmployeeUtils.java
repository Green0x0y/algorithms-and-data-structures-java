package org.Tasks.Streams.EmployeeTask;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {
    public String getFullName(Employee employee){
        Function<Employee, String> fullName = (Employee e) -> e.getFirstName() + " " + e.getLastName();
        return fullName.apply(employee);
    }

    public String getManagersLastName(Employee employee){
        Function<Employee, String> managersLastName = (Employee e) -> e.getManager().getLastName();
        return managersLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee){
        Predicate<Employee> moreThan = (Employee e) -> e.getYearsOfService() > 5;
        return moreThan.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee){
        Predicate<Employee> moreThan = (Employee e) -> e.getNumberOfDirectReports() > 3;
        return moreThan.test(employee);
    }

    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports =
                (Employee e) -> (e.getNumberOfDirectReports() < 2 &&  e.getYearsOfService() > 3);
        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }

}
