package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5 {

	public static void main(String[] args) {
		//1.Create a list of the top 5 most populated countries in the world and print 2 country
		
		List<String> populatedCountry = new ArrayList<String>();
		populatedCountry.add("China");
		populatedCountry.add("India");
		populatedCountry.add("United States");
		populatedCountry.add("Indonesia");
		populatedCountry.add("Pakistan");
				
		//print 2 country
		System.out.printf("2nd most popluated country:%s %n",populatedCountry.get(1));
		
		//2.Create a set of the top 10 most visited tourist attractions in the world and print out its size

		Set<String> touristPlace = new LinkedHashSet<String>();
		touristPlace.add("Times Square, New York City");
		touristPlace.add("Central Park, New York City");
		touristPlace.add("The Las Vegas Strip, Las Vegas ");
		touristPlace.add("The Eiffel Tower, Paris");
		touristPlace.add("The Colosseum, Rome ");
		System.out.printf("Size of most visited country set is : "+touristPlace.size());
 
		//3.Create a map of the 5 largest cities in the United States and their populations.
		Map<String,String> largerCities = new Hashtable<String,String>();
		largerCities.put("New York City, New York ", "8,992,908");
		largerCities.put("Los Angeles, California", "3,930,586");
		largerCities.put("Chicago, Illinois",	"2,761,625");
		largerCities.put("Houston, Texas",	"2,366,119");
		largerCities.put("Phoenix, Arizona","1,656,892");
		//Print cities and popullation
		System.out.println(largerCities);
		System.out.println("%n");
		
		//4.Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		int[] integers = new int[10];
		integers[0] = 4;
		integers[1] = 5;
		integers[2] = 6;
		integers[3] = 2;
		integers[4] = 4;
		integers[5] = 5;
		integers[6] = 8;
		integers[7] = 34;
		integers[8] = 23;
		integers[9] = 1;

		//print out the sum of 3rd and 5th Value
		System.out.printf("sum of 3rd and 5th Value:%d %n",integers[2]+integers[4]);
		
		//5.Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> highestGrossingMovies = new ArrayList<String>();
		highestGrossingMovies.add("Avatar");
		highestGrossingMovies.add("Avengers: Endgame");
		highestGrossingMovies.add("Avatar: The Way of Water");
		highestGrossingMovies.add("Titanic");
		highestGrossingMovies.add("	Star Wars: The Force Awakens");
				
		//print 2 country
		System.out.printf("3rd movie on the list:%s %n",highestGrossingMovies.get(2));
		
		
	}

}
