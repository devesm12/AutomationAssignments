package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class BankTransactions {

	public static void main(String[] args) {
		
		int numberOfCredits = 0, numberOfDebits = 0;
        int totalCredit = 0, totalDebit = 0, suspiciousTransactions = 0,balance=0;
		
        List<Integer> transactions = new ArrayList<Integer>();
        transactions.add(50000); 
        transactions.add(-2000); 
        transactions.add(3000); 
        transactions.add(-15000); 
        transactions.add(-200); 
        transactions.add(-300); 
        transactions.add(4000);
        transactions.add(-3000); 
        
        for(int n:transactions)
        {
        	
        	if(n>0)
        	{
        		numberOfCredits++;
        		totalCredit+=n;
        		if (n > 10000)
        		{
                    System.out.println("Suspicious credit transaction: " + n);
                    suspiciousTransactions++;
                }
        	}
        	else if(n<0)
        	{
        		numberOfDebits++;
        		totalDebit-=n;
        		if (n < -10000) 
        		{
                    System.out.println("Suspicious debit transaction: " + n);
                    suspiciousTransactions++;
                }
        	}
        	
        }
        balance = totalCredit-totalDebit;
        
        System.out.println("Total number of credit transactions: " + numberOfCredits+"\n Total number of debit transactions: " + numberOfDebits);
        System.out.println("Total amount credited: " + totalCredit+"\nTotal amount debited: " + totalDebit);
        System.out.println("Total remaining balance: " + balance);
        
        System.out.println("Suspicious transactions count: " + suspiciousTransactions);
		
		
	}	
		
	}


