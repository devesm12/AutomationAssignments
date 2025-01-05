package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysAndCollections {

	public static void main(String[] args) {
		
		List<String> popCountries=new ArrayList<String>();
		popCountries.add("India");
		popCountries.add("China");
		popCountries.add("US");
		popCountries.add("Indonesia");
		popCountries.add("Pakistan");
		System.out.println("List of Top 5 most populated countries :"+ popCountries);
		System.out.println("2nd most populated country:"+ popCountries.get(1));
		System.out.println("************************************************");
		
		Set<String> touristPlaces=new HashSet<String>();
		touristPlaces.add("Taj Mahal");
		touristPlaces.add("Eiffel Tower");
		touristPlaces.add("Colosseum");
		touristPlaces.add("Forbidden City");
		touristPlaces.add("St. Peter's Basilica");
		touristPlaces.add("Palace of Versailles");
		touristPlaces.add("Lincoln Memorial");
		touristPlaces.add("Parthenon");
		touristPlaces.add("Peterhof Palace");
		touristPlaces.add("The Great Wall of China");
		System.out.println("Set of top 10 most visited tourist attractions in the world are:"+ touristPlaces);
		System.out.println("Total size:"+touristPlaces.size());
		System.out.println("************************************************");
		
		Map<String,String> largestCities=new HashMap<String,String>();
		largestCities.put("New York City", "8,804,190");
		largestCities.put("Los Angeles", "3,898,747");
		largestCities.put("Chicago", "2,746,388");
		largestCities.put("Houston", "2,304,580");
		largestCities.put("Phoenix", "1,608,139");
		
		System.out.println("List of 5 largest cities in the United States and their populations. :"+ largestCities);
		System.out.println("************************************************");
		

		int[] numbers = {10,20,30,40,50,60,70,80,90,100};

        // Calculate the sum of the 3rd and 5th values 
        int sum = numbers[2] + numbers[4];

        
       System.out.print("Values in the Array are: ");
   
        for(int i=0;i<numbers.length;i++)
        {
        	System.out.println(numbers[i]);
        	
        }
        System.out.println("Sum of 3rd and 5th values: " + sum);
        
        System.out.println("************************************************");
		
        List<String> movies=new ArrayList<String>();
		movies.add("Avatar");
		movies.add("Avengers");
		movies.add("Avatar: The Way of Water");
		movies.add("Titanic");
		movies.add("Avengers: Infinity War");
		System.out.println("List of top 5 highest-grossing movies of all time:"+ movies);
		System.out.println("the third movie on the list:"+ movies.get(2));
		System.out.println("************************************************");
		
	}

}
