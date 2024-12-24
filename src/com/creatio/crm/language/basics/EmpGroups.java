package com.creatio.crm.language.basics;

public class EmpGroups {

    //Employees class that stores employee names and IDs in separate variables.
    static class Employees 
    {
        String eName1 = "Bharath";
        String eName2 = "ABC";
        String eName3 = "XYZ";
        
        int eId1 = 1234;
        int eId2 = 1235;
        int eId3 = 1236;
    }

    public static void main(String[] args)
    {
        String[] eNames;
        int[] eIds;
        
        // object for Employees class
        Employees emp = new Employees();
        
        // Initializing arrays from Employees class using emp obj
        eNames = new String[] {emp.eName1, emp.eName2, emp.eName3};
        eIds = new int[] {emp.eId1, emp.eId2, emp.eId3};
        
        // To print employee details passing arguments
         display(eNames,eIds);
    }
    
    // To display employee details
    public static void display(String[] eNames, int[] eIds)
    {
        for (int i = 0; i < eNames.length; i++)
        {
            System.out.println("Employee Name: " + eNames[i] + ", Employee ID: " + eIds[i]);
        }
    }
}
