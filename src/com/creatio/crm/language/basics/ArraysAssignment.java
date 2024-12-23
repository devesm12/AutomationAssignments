package com.creatio.crm.language.basics;

public class ArraysAssignment {

		    public static void main(String[] args) 
		    {
		    	//3D array declaration (category,sub category,products)
		    	String[][][] store = new String[2][4][5];

		    	// category 0- Groceries
		    	//[0][0]-Beverages
	        
		    	store[0][0] = new String[]
		    			{
		    				"1", "Beverages", "Cola",
		    				"2", "Beverages", "Orange Juice",
		    				"3", "Beverages", "Lemonade",
		    				"4", "Beverages", "Green Tea",
		    				"5", "Beverages", "Black Coffee"
		    			};
	        
		    	//[0][1]-Snacks
		    	store[0][1] = new String[]
		    			{
		    				"1", "Snacks", "Popcorn",
		    				"2", "Snacks", "Trail Mix",
		    				"3", "Snacks", "Beef Jerky",
		    				"4", "Snacks", "Salted Nuts",
		    				"5", "Snacks", "Rice Cakes"
		    			};

		    	//[0][2]-Dairy products
		    	store[0][2] = new String[]
		    			{
		    				"1", "Dairy Products", "Cottage Cheese",
		    				"2", "Dairy Products", "Heavy Cream",
		    				"3", "Dairy Products", "Ice Cream",
		    				"4", "Dairy Products", "Parmesan Cheese",
		    				"5", "Dairy Products", "Eggnog"
		    			};
		    	//[0][3]-Produce
		    	store[0][3] = new String[]
		    			{
		    				"1", "Produce", "Apples",
		    				"2", "Produce", "Bananas",
		    				"3", "Produce", "Carrots",
		    				"4", "Produce", "Potatoes",
		    				"5", "Produce", "Onions"
		    			};

	        // category [1]-Electronics
		    //[1][0]-Beverages
	        
	        store[1][0] = new String[]
	        {
	            "1", "Beverages", "Cola",
	            "2", "Beverages", "Orange Juice",
	           	"3", "Beverages", "Lemonade",
	            "4", "Beverages", "Green Tea",
	            "5", "Beverages", "Black Coffee"
	        };
	      //[1][1]-Snacks
	        store[1][1] = new String[]
	        		{
	        			"1", "Snacks", "Popcorn",
	        			"2", "Snacks", "Trail Mix",
	        			"3", "Snacks", "Beef Jerky",
	        			"4", "Snacks", "Salted Nuts",
	        			"5", "Snacks", "Rice Cakes"
	        		};
	         //[1][2]-Dairy products
	        store[1][2] = new String[]
	        		{
	        			"1", "Dairy Products", "Cottage Cheese",
	        			"2", "Dairy Products", "Heavy Cream",
		    			"3", "Dairy Products", "Ice Cream",
						"4", "Dairy Products", "Parmesan Cheese",
						"5", "Dairy Products", "Eggnog"
	        		};
	        		
	        		//[1][3]-Produce
	    	store[1][3] = new String[]
	    			{
	    	            "1", "Produce", "Apples",
	    	            "2", "Produce", "Bananas",
	    	            "3", "Produce", "Carrots",
	    	            "4", "Produce", "Potatoes",
	    	            "5", "Produce", "Onions"
	    	        };

	
	
}
}
