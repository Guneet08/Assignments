package com.assignments;

public class Assignment2 {

	public static void main(String[] args) {
		String[][][] sem= {
				
				{
					//sem1
					{"Mathematics I","Physics", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
                     {"78","85","91","74","88","79"}
                     
				},
				{
					//sem2
					{"Mathematics II","Mechanics", "Environmental Sci", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
                    {"82", "77", "93", "69", "84", "90"},
				},
				 { 
					//sem3
                    {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
                    {"88", "81", "76", "92", "85", "78"}
            },
            { 
            	    //sem4
                    {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
                    {"91", "73", "89", "80", "76", "87"}
            },
            { 
            	    //sem5
                    {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
                    {"86", "88", "84", "95", "73", "90"}
            }
				};
		
		//Print Semester 3 - Subject 4 and Subject 5 Names
		System.out.println("Semester 3 - Subject 4 Name:"+ sem[2][0][3]);
		System.out.println("Semester 3 - Subject 5 Name: "+ sem[2][0][4]);
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println("Semester 5 - Subject 3 Marks "+ sem[4][1][2]);
		System.out.println("Semester 5 - Subject 6 Marks "+ sem[4][1][5]);
		}

	}


