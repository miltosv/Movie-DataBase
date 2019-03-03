package tainiothiki;

import java.util.*;

public class countrysearch extends searcher {

	public countrysearch() {
		// TODO Auto-generated constructor stub
	}
	
	//private ArrayList<String> ids = new ArrayList<String>();
	//private ArrayList<String> director_ids = new ArrayList<String>();

	public String search(ArrayList<movie> movies, ArrayList<country> countries, ArrayList<director> directors ,ArrayList<movietag> movietags,HashMap<Integer, String> tagdefs, String country, int other) {
		// TODO Auto-generated method stub
		
		String result1 = "";
		String result = "";
		String movie_title  = "";
		String movie_year = "";
		String director_name = "";
		int sum_movies = 0;
		
		
		for(int i=0; i < countries.size(); i++){
			
			if(country.equals(countries.get(i).getname())){
				
				sum_movies ++;
				//ids = countries.get(i).getCountries();
				
				//result += "Found " + ids.size() + "movies. \n";
				
					for(int w=0; w < movies.size(); w++){
					
							if(countries.get(i).getID().equals(movies.get(w).getID())) {
								
								movie_title = movies.get(w).getTitle();
								movie_year = movies.get(w).getYear();
								
								break;
							}	
					}	
					
					//director_found: 
					for(int w=0; w < directors.size(); w++){
						//director_ids = directors.get(w).getDirectors();
						//for(int k=0; k < director_ids.size(); k++){
							if(directors.get(w).getMovieid().equals(countries.get(i).getID())) {
								director_name = directors.get(w).getname();
								break ;
							}
						}
					//}
					result1 += "Movie Title : "+movie_title + " , Year : "+movie_year+" , Director: "+ director_name + "\n";
			}
		}	
		result = "Found "+sum_movies+" movies\n"+result1;
		return result;
	}
}
