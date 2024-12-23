package com.creatio.crm.language.basics;

public class DataTypesAssignment {
	
	/**
	 * This main method illustrates how different values are stored in respective data types.
	 * 
	 * @param Different types of values holding int,float,string,char data types
	 * @return values stored in respective data types are printed as output
	 * @author devi devi@gmail.com
	 * @version 1.0
	 * @throws NullPointerException
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		// Temperature of a city in degrees Celsius
		
		float temperature = 25.5f;
		System.out.println("Temperature: " + temperature);

		// Whether a customer has placed an order
        boolean order = true;
        System.out.println("Customer placed order: " + order);

        // Person's phone number
        String phoneNumber = "123-456-7890";
        System.out.println("Phone Number: " + phoneNumber);

        // Amount of money in a customer's bank account
        float bankBalance = 1000.50f;
        System.out.println("Bank Balance: " + bankBalance);

        // Person's email address
        String emailAddress = "john.doe@example.com";
        System.out.println("Email Address: " + emailAddress);

        // Coordinates of a location (latitude, longitude)
        float latitude = 37.7749f;
        float longitude = -122.4194f;
        System.out.println("Latitude" +latitude+", longitude"+longitude);


        // Person's marital status
        boolean marital = true;
        System.out.println("Marital Status: " + marital);

        // Person's occupation
        String occupation = "Software Engineer";
        System.out.println("Occupation: " + occupation);

        // Person's favourite colour
        String favColour = "Blue";
        System.out.println("Favourite Colour: " + favColour);

        // Current year
        int currentYear = 2023;
        System.out.println("Current Year: " + currentYear);

        // Number of followers on a social media platform
        int followersCount = 1_000_000;
        System.out.println("Number of Followers: " + followersCount);

        // Rating of a movie
        float movieRating = 7.5f;
        System.out.println("Movie Rating: " + movieRating);

        // Person's blood type
        char bloodType = 'A';
        System.out.println("Blood Type: " + bloodType);

        // Title of a book
        String bookTitle = "To Kill a Mockingbird";
        System.out.println("Book Title: " + bookTitle);

        // Number of employees in a company
        int numberOfEmployees = 500;
        System.out.println("Number of Employees: " + numberOfEmployees);

        // Time of an event
        String eventTime = "2:30 PM";
        System.out.println("Event Time: " + eventTime);

        // Name of a country
        String countryName = "United States";
        System.out.println("Country Name: " + countryName);

        // Person's eye color
        String eyeColor = "Brown";
        System.out.println("Eye Color: " + eyeColor);

        // Person's birthplace
        String birthPlace = "New York City";
        System.out.println("Birth Place: " + birthPlace);

        // Distance between two cities
        float distanceBetweenCities = 200.5f;
        System.out.println("Distance between two cities: " + distanceBetweenCities);
    }
}

