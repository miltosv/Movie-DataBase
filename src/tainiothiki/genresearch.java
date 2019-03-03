package tainiothiki;
import java.util.*;

public class genresearch extends searcher {

	public genresearch() {
		// TODO Auto-generated constructor stub
	}

	private ArrayList<String> ids = new ArrayList<String>();
	private ArrayList<String> director_ids = new ArrayList<String>();

	public String search(ArrayList<movie> movies, ArrayList<genre> genres,ArrayList<director> directors ,ArrayList<movietag> movietags,HashMap<Integer, String> tagdefs, String genre_name, int other) {
		// TODO Auto-generated method stub
		
		String result = "";
		String movie_title  = "";
		String movie_year = "";
		String director_name = "";
		System.out.println(genres.size());

		for(int i=0; i < genres.size(); i++){
			System.out.println("for");
			if(genre_name.equals(genres.get(i).getname())) {
				System.out.println("if");
	
				ids = genres.get(i).getmovies();
				
				result += "Found " + ids.size() + "movies. \n";
				
				for(int j=0; j < ids.size(); j++){
				
					for(int w=0; w < movies.size(); w++){
					
							if(ids.get(j).equals(movies.get(w).getID())) {
								
								movie_title = movies.get(w).getTitle();
								movie_year = movies.get(w).getYear();
								break;
							}	
					}
					
					//director_found: 
					for(int w=0; w < directors.size(); w++){
						//director_ids = directors.get(w).getDirectors();
						//for(int k=0; k < director_ids.size(); k++){
							if(directors.get(w).getMovieid().equals(ids.get(j))) {
								director_name = directors.get(w).getname();
								break ;
							}
						//}
					}
					
					result += "Movie Title : "+movie_title + " , Year : "+movie_year+" , Director: "+ director_name + "\n";
				}
				break;
			}
		}
		return result;
	}
}
