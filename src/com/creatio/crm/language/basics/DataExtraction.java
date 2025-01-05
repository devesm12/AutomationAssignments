package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataExtraction {
    public static void main(String[] args) {
        // List to store all the data for each category
        List<Map<String, String>> studentDetails = new ArrayList<>();
        List<Map<String, String>> employeeDetails = new ArrayList<>();
        List<Map<String, String>> productDetails = new ArrayList<>();
        
        // Example data for Student Details
        studentDetails.add(createStudent("John Doe", "20", "Male", "S12345", "A", "Computer Science", "3.8", "john@example.com", "9999997777", "123 Elm St"));
        studentDetails.add(createStudent("Jane Smith", "21", "Female", "S12346", "B", "Mathematics", "3.5", "jane@example.com", "9876665666", "456 Oak St"));
        studentDetails.add(createStudent("Mike Brown", "22", "Male", "S12347", "A", "Physics", "3.9", "mike@example.com", "8787876546", "789 Pine St"));

        // Example data for Employee Details
        employeeDetails.add(createEmployee("E001", "Alice Green", "30", "Female", "Engineering", "Software Engineer", "75000", "alice@example.com", "9876543213"));
        employeeDetails.add(createEmployee("E002", "Bob Johnson", "35", "Male", "Marketing", "Marketing Manager", "85000", "bob@example.com", "9876543214"));
        employeeDetails.add(createEmployee("E003", "Carol White", "28", "Female", "Sales", "Sales Executive", "65000", "carol@example.com", "9876543215"));

        // Example data for Product Details
        productDetails.add(createProduct("P001", "Laptop", "Electronics", "$1200", "50", "Tech Supplies", "2 years", "4.5", "15-01-2023", "15-01-2025"));
        productDetails.add(createProduct("P002", "Desk Chair", "Furniture", "$150", "200", "Office Depot", "1 year", "4", "10-02-2023", "N/A"));
        productDetails.add(createProduct("P003", "Coffee Maker", "Kitchen", "$75", "100", "KitchenWorld", "6 months", "4.2", "20-03-2023", "20-03-2025"));

        // Retrieve and print the Supplier Name for "Office Depot"
        for (Map<String, String> product : productDetails) {
            if ("Office Depot".equals(product.get("Supplier"))) {
                System.out.println("Product Name: " + product.get("Name") + ", Supplier: " + product.get("Supplier"));
            }
        }
    }

    private static Map<String, String> createStudent(String name, String age, String gender, String rollNumber, String grade, String major, String gpa, String email, String contactNumber, String address) {
        Map<String, String> student = new HashMap<>();
        student.put("Name", name);
        student.put("Age", age);
        student.put("Gender", gender);
        student.put("RollNumber", rollNumber);
        student.put("Grade", grade);
        student.put("Major", major);
        student.put("GPA", gpa);
        student.put("Email", email);
        student.put("ContactNumber", contactNumber);
        student.put("Address", address);
        return student;
    }

    private static Map<String, String> createEmployee(String employeeId, String name, String age, String gender, String department, String position, String salary, String email, String contactNumber) {
        Map<String, String> employee = new HashMap<>();
        employee.put("EmployeeID", employeeId);
        employee.put("Name", name);
        employee.put("Age", age);
        employee.put("Gender", gender);
        employee.put("Department", department);
        employee.put("Position", position);
        employee.put("Salary", salary);
        employee.put("Email", email);
        employee.put("ContactNumber", contactNumber);
        return employee;
    }

    private static Map<String, String> createProduct(String productId, String name, String category, String price, String stockQuantity, String supplier, String warranty, String rating, String manufacturingDate, String expiryDate) {
        Map<String, String> product = new HashMap<>();
        product.put("ProductID", productId);
        product.put("Name", name);
        product.put("Category", category);
        product.put("Price", price);
        product.put("StockQuantity", stockQuantity);
        product.put("Supplier", supplier);
        product.put("Warranty", warranty);
        product.put("Rating", rating);
        product.put("ManufacturingDate", manufacturingDate);
        product.put("ExpiryDate", expiryDate);
        return product;
    }
}
