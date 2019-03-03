package tainiothiki;
import java.util.*;

public class actorsearch extends searcher {

	public actorsearch() {
		// TODO Auto-generated constructor stub
	}

	//private ArrayList<String> ids = new ArrayList<String>();
	private ArrayList<String> director_ids = new ArrayList<String>();
	
	
	public String search(ArrayList<movie> movies, ArrayList<actor> actors, ArrayList<director> directors ,ArrayList<movietag> movietags,HashMap<Integer, String> tagdefs, String Actor, int other) {
		// TODO Auto-generated method stub	

		String result1 = ""; 
		String result = ""; 
		String movie_title  = "";
		String movie_year = "";
		String director_name = "";
		int sum_movies = 0;
		

		for(int i=0; i < actors.size(); i++){
			
			if(Actor.equals(actors.get(i).getname())) {
				
				sum_movies ++;
				//ids = actors.get(i).getActors();
				//result += "Found " + ids.size() + "movies. \n";
				
				for(int w=0; w < movies.size(); w++){
				
						if(actors.get(i).getMovieid().equals(movies.get(w).getID())) {
							
							movie_title = movies.get(w).getTitle();
							movie_year = movies.get(w).getYear();
							
							break;
						}	
				}	
					
				//director_found: 
				for(int w=0; w < directors.size(); w++){
					//director_ids = directors.get(w).getDirectors();
					//for(int k=0; k < director_ids.size(); k++){
						if(directors.get(w).getMovieid().equals(actors.get(i).getMovieid())) {
							director_name = directors.get(w).getname();
							break ;
						}
					//}
				}
					result1 += "Movie Title : "+movie_title + " , Year : "+movie_year+" , Director: "+ director_name + "\n";
				
			
			}
		}
		result = "Found "+sum_movies+" movies"+result1;
		return result;
	}

	
	
}
