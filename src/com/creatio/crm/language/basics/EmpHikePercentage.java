package com.creatio.crm.language.basics;
import java.util.*;

public class EmpHikePercentage {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.baseSalary = 75000;
        e1.experience = 5;
        e1.rating = (float) 4.2;

        Employee e2 = new Employee();
        e2.name = "Bob";
        e2.baseSalary = 68000;
        e2.experience = 3;
        e2.rating = (float) 3.8;

        Employee e3 = new Employee();
        e3.name = "Carol";
        e3.baseSalary = 82000;
        e3.experience = 7;
        e3.rating = (float) 4.5;

        Employee e4 = new Employee();
        e4.name = "David";
        e4.baseSalary = 90000;
        e4.experience = 10;
        e4.rating = (float) 2.0;

        Employee e5 = new Employee();
        e5.name = "Eva";
        e5.baseSalary = 60000;
        e5.experience = 2;
        e5.rating = (float) 3.5;

        Employee[] emp = {e1, e2, e3, e4, e5};

        Map<String, Double> empHike = new LinkedHashMap<String, Double>();

        for (Employee e : emp) {
            e.calcHike();
            empHike.put(e.name, e.hikePercentage);
        }

        
        System.out.println("Employee Name\tHike Percentage");

        for (Map.Entry<String, Double> value : empHike.entrySet()) {
            String employeeName = value.getKey();
            Double hikePercentage = value.getValue();
            System.out.println(employeeName + "\t\t" + hikePercentage + "%");
        }
    }
}
