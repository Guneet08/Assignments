package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment7 {

	public static void main(String[] args) {
		List<Integer> transactions =new LinkedList<Integer>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);

		int debitamount=0;
		int creditamount=0;
		int debitTransaction=0;
		int creditTransaction=0;
		int suspiciousTransactions =0;
		for(int i=0; i< transactions.size(); i++) {
			if(transactions.get(i) >=0) {
			
				creditTransaction=creditTransaction+1;
				 creditamount= creditamount + transactions.get(i);
				
			}
			else {
				debitTransaction = debitTransaction+1;
			debitamount=debitamount  + transactions.get(i);
			}
			
			if ((transactions.get(i) <= -10000) || (transactions.get(i) >= 10000)) {
				suspiciousTransactions = suspiciousTransactions+1;
				
				System.out.printf("Suspicious credit/ debit Transaction with Amount %d %n", transactions.get(i));
			}
					
  	}
		//1.Print total number of credit and debit transactions completed
		 System.out.printf("Total no. of Debit Transaction %d %n",debitTransaction );
		 System.out.printf("Total no. of Credit Transaction %d %n",creditTransaction );
		 
		 //2.Print the total amount credited and debited in account
		 System.out.printf("total amount credited %d %n", creditamount);
		 System.out.printf("total amount debited %d %n", debitamount); 
		 
		 //3.Print total amount remaining at the end in Bank Account
		 System.out.printf("total amount remaining at the end in Bank Account %d %n", creditamount-debitamount);
		 
		 //4. Print total number of suspicious transactions
		 System.out.printf("Total no. of suspicious Transaction %d %n",suspiciousTransactions );
    }
			
		
		

	}


