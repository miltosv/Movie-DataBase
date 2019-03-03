package tainiothiki;
import java.util.*;

public class directorsearch extends searcher {

	public directorsearch() {
		// TODO Auto-generated constructor stub
	}

	//private ArrayList<String> ids = new ArrayList<String>();
	
	public String search(ArrayList<movie> movies, ArrayList<director> directors, ArrayList<director> item,ArrayList<movietag> movietags,HashMap<Integer, String> tagdefs, String director_name, int other) {
		// TODO Auto-generated method stub
		
		String result = "";
		String result1 = "";
		String movie_title  = "";
		String movie_year = "";
		int sum_movies = 0;
		
		
		for(int i=0; i < directors.size(); i++){
			
			if(director_name.equals(directors.get(i).getname())) {
				
				sum_movies ++;
				//ids = directors.get(i).getDirectors();
				//result += "Found " + ids.size() + "movies. \n";
				for(int w=0; w < movies.size(); w++){
				
						if(directors.get(i).getMovieid().equals(movies.get(w).getID())) {
							
							movie_title = movies.get(w).getTitle();
							movie_year = movies.get(w).getYear();
							
							break;
						}	
				}	
									
				result1 += "Movie Title : "+movie_title + " , Year : "+movie_year+"\n";
				
			}
		}
		result = "Found "+sum_movies+" movies!! \n"+result1;
		return result;
	}

	
}
