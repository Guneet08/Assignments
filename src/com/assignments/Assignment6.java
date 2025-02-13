package com.assignments;

public class Assignment6 {

	public static void main(String[] args) {
	int creditScore=670;
	int income = 55000;
	String empStatus= "employed";
	double DTIRatio = 35; 
	
	if (creditScore>750) {
		System.out.printf("Loan is automatically approved");
	
	}
	else if ((creditScore>650)&&(creditScore<750)) {
		
		System.out.printf("Additional checks are performed.%n");
		//checking income
		if((income >= 50000) &&(empStatus=="employed") && (DTIRatio<=40) ) {
			
				System.out.printf("Loan is approved");
						
			}
			
			else
				System.out.printf("Loan is denied");
			
		}
	
    
	else {
		System.out.printf("Loan is denied.");
	}
	}

}
