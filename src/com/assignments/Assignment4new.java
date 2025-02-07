package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4new {

	public static void main(String[] args) {

		//Adding first row E001 of employee table in Map
       	Map<String,String> row1 = new HashMap<String,String>();
		row1.put("Employee ID", "E001");
		row1.put("Name", "Alice Green");
		row1.put("Age", "30");
		row1.put("Gender", "Female");
		row1.put("Department", "Engineering");
		row1.put("Position", "Software Engineer");
		row1.put("Salary", "75000");
		row1.put("Email", "alice@example.com");
		row1.put("Contact Number", "9876543213");
		
		//Adding second row E002 of employee table in Map
		Map<String,String> row2 = new HashMap<String,String>();
		row2.put("Employee ID", "E002");
		row2.put("Name", "Bob Johnson");
		row2.put("Age", "35");
		row2.put("Gender", "Male");
		row2.put("Department", "Marketing");
		row2.put("Position", "Marketing Manager");
		row2.put("Salary", "85000");
		row2.put("Email", "bob@example.com");
		row2.put("Contact Number", "9876543214");
		
		//Adding second row E003 of employee table in Map
		Map<String,String> row3 = new HashMap<String,String>();
		row3.put("Employee ID", "E003");
		row3.put("Name", "Carol White");
		row3.put("Age", "28");
		row3.put("Gender", "Female");
		row3.put("Department", "Sales");
		row3.put("Position", "Sales Executive");
		row3.put("Salary", "65000");
		row3.put("Email", "carol@example.com");
		row3.put("Contact Number", "9876543215");
		
		//ADD Map to List to print "bob@example.com" from the table
		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		data.add(row1);
		data.add(row2);
		data.add(row2);
		
		data.get(2).get("Email");
		System.out.println(data.get(2).get("Email"));

    }

   

}
