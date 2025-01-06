package com.creatio.crm.language.basics;

public class HelloWorld {

	public static void main(String[] args) {
	
		System.out.println("Hello World");

	}

}
/*

class Employee {
    String name;
    double baseSalary;
    int experienceYears;
    double yearEndRating;
    double hikePercentage;

    public void calculateHike() {
        double variablePayPercentage = 0;
        double bonus = 0;
        double reward = 0;

        // Determine variable pay percentage and bonus based on year-end rating
        if (yearEndRating >= 4) {
            variablePayPercentage = 0.15;
            bonus = 1500;
        } else if (yearEndRating >= 3) {
            variablePayPercentage = 0.10;
            bonus = 1200;
        } else {
            variablePayPercentage = 0.03;
            bonus = 300;
        }

        // Determine reward based on experience
        if (experienceYears >= 5) {
            reward = 5000;
        }

        // Calculate hike
        double hike = (baseSalary * variablePayPercentage) + bonus + reward;
        hikePercentage = hike / baseSalary;
    }
}


import java.util.HashMap;
import java.util.Map;

public class EmployeeHikeCalculator {
    public static void main(String[] args) {
        // Create and initialize employee records without using a constructor
        Employee employee1 = new Employee();
        employee1.name = "Alice Johnson";
        employee1.baseSalary = 75000;
        employee1.experienceYears = 5;
        employee1.yearEndRating = 4.2;

        Employee employee2 = new Employee();
        employee2.name = "Bob Smith";
        employee2.baseSalary = 68000;
        employee2.experienceYears = 3;
        employee2.yearEndRating = 3.8;

        Employee employee3 = new Employee();
        employee3.name = "Carol Davis";
        employee3.baseSalary = 82000;
        employee3.experienceYears = 7;
        employee3.yearEndRating = 4.5;

        Employee employee4 = new Employee();
        employee4.name = "David Brown";
        employee4.baseSalary = 90000;
        employee4.experienceYears = 10;
        employee4.yearEndRating = 2.0;

        Employee employee5 = new Employee();
        employee5.name = "Eva Green";
        employee5.baseSalary = 60000;
        employee5.experienceYears = 2;
        employee5.yearEndRating = 3.5;

        // Array of employees
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        // Calculate and store hike percentages in a map
        Map<String, Double> employeeHikeMap = new HashMap<>();
        for (Employee employee : employees) {
            employee.calculateHike();
            employeeHikeMap.put(employee.name, employee.hikePercentage);
        }

        // Print the hike percentages
        for (Map.Entry<String, Double> entry : employeeHikeMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Hike Percentage: " + (entry.getValue() * 100) + "%");
        }
    }
}



*/