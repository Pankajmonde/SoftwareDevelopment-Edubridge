package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Movie>movies=new ArrayList<Movie>();
		
		movies.add(new Movie(101,"DDLJ",4.5));
		movies.add(new Movie(30,"Dhurandhar",9.5));
		movies.add(new Movie(35,"Peddi",7.5));
		movies.add(new Movie(56,"RHTDM",6.5));
	System.out.println("Before sorting");
		
		for(Movie m:movies) {
			System.out.println(m);
		}
		Collections.sort(movies,new CompareMovieRating());
		
	
		System.out.println("After Sorting");
		
		for(Movie m:movies) {
			System.out.println(m);
		}
	}

}