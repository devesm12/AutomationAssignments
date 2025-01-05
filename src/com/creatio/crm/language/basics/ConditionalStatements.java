package com.creatio.crm.language.basics;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		String customerName="John Doe";
		int creditScore=720;
		float income=55000.0f;
		boolean isEmployed=true;
		float debtToIncomeRatio=35.0f;
		
		if (creditScore>750)
			System.out.println("Loan is approved");
		else if(creditScore >=650 && creditScore <=750)
		{
			if(income>=50000)
			{
				if(isEmployed)
				{
					if(debtToIncomeRatio<40)
						System.out.println("Loan is Approved");
					else if(debtToIncomeRatio>=40)
						System.out.println("Loan is denied(debt is high)");
				}
				else
					System.out.println("Loan is denied(Unemployed)");
			}
			else
				System.out.println("Loan is denied(Less income)");
			
		}
		else
		{
			System.out.println("Loan is denied (Credit score is less)");
		}
		
		
		
		
				
			
    }

}


