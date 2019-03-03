package tainiothiki;
import java.util.*;
import pdfmaker.*;



public class moviemanager {
	

	private ArrayList<movie> movies;
	private ArrayList<actor> actors;
	private ArrayList<country> countries; 
	private ArrayList<director> directors; 
	private ArrayList<genre> genres;
	//private ArrayList <location> locations;
	private HashMap<Integer, String> tagdefs;
	private ArrayList<usertags> usertagss;
	private ArrayList<userratings> userratingss;
	private ArrayList<movietag> movietags;
	
	
	
	public moviemanager() {		
	}
	
	public boolean load(String movie_path, String actor_path, String country_path, String genre_path, String location_path, String dir_path, String tagdef_path) {
		
		movieloader ml=new movieloader(movie_path,location_path);
		movies = ml.loadmovies();
		
		actorload al=new actorload(actor_path);
		actors = al.loadactors();
		
		countryloader cl=new countryloader(country_path);
		countries = cl.loadcountries();
		
		genreloader gl=new genreloader(genre_path);
		genres = gl.loadgenres();
		
		//locationloader ll=new locationloader(location_path);
		//locations = ll.loadlocation();
		
		dirloader dl=new dirloader(dir_path);
		directors = dl.loaddirectors();
		
		tagdefloader tdl = new tagdefloader(tagdef_path);
		tagdefs = tdl.loaddefs();
		
		return true;
	}
	
	public boolean loaduser(String rating_path, String tag_path) {
		
		ratingloader rl=new ratingloader(rating_path);
		userratingss = rl.loadrating();
		
		tagloader tl=new tagloader(tag_path);
		usertagss = tl.loadtag();
	
		return true;
	}
	
	public boolean loadmovietags(String movietag_path) {
		movietagloader mtl = new movietagloader(movietag_path);
		movietags = mtl.loadtags();
		
		return true;
	}
	
	
	public int searchmovieName(String movie_name,String path_file,String file_name,int form, int tag_rating) {
		
		moviesearch s=new moviesearch();
		String out = s.search(userratingss,movies,usertagss,movietags,tagdefs, movie_name, tag_rating );
		
		
		if(form == 1){
			writer w=new htmlwriter(path_file, out);
			w.writefile();
		
		}else if(form == 2){
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
		}else if(form == 3) {
			writer w=new markdownwriter(path_file, out);
			w.writefile();
		}
		if(form == 4) {
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
			Text2Pdf converter=new Text2Pdf(path_file,path_file+".pdf");
			converter.createPdf();
		}
		
		return 1;
	}
	
	public int searchgenre(String genre_name ,String path_file,String file_name,int form) {
		
		genresearch s=new genresearch();
		String out = s.search(movies, genres,directors,movietags,tagdefs, genre_name, 0);
		
		if(form == 1){
			writer w=new htmlwriter(path_file, out);
			w.writefile();
		
		}else if(form == 2){
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
		}else if(form == 3) {
			writer w=new markdownwriter(path_file, out);
			w.writefile();
		}
		if(form == 4) {
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
			Text2Pdf converter=new Text2Pdf(path_file,path_file+".pdf");
			converter.createPdf();
		}
		
		return 1;
	}
	
	public int searchdirector(String director_name ,String path_file,String file_name,int form) {
		directorsearch s=new directorsearch();
		String out = s.search(movies, directors,directors,movietags,tagdefs, director_name, 0);
		
		if(form == 1){
			writer w=new htmlwriter(path_file, out);
			w.writefile();
		
		}else if(form == 2){
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
		}else if(form == 3) {
			writer w=new markdownwriter(path_file, out);
			w.writefile();
		}
		if(form == 4) {
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
			Text2Pdf converter=new Text2Pdf(path_file,path_file+".pdf");
			converter.createPdf();
		}
		
		return 1;
	}
	
	public int searchactor(String actor_name ,String path_file,String file_name,int form) {
		actorsearch s=new actorsearch();
		String out = s.search(movies, actors,directors,movietags,tagdefs, actor_name, 0);
		
		if(form == 1){
			writer w=new htmlwriter(path_file, out);
			w.writefile();
		
		}else if(form == 2){
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
		}else if(form == 3) {
			writer w=new markdownwriter(path_file, out);
			w.writefile();
		}
		if(form == 4) {
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
			Text2Pdf converter=new Text2Pdf(path_file,path_file+".pdf");
			converter.createPdf();
		}
		
		return 1;
	}
	
	public int searchcountry(String country_name ,String path_file,String file_name,int form) {
		countrysearch s=new countrysearch();
		String out = s.search(movies, countries,directors,movietags,tagdefs, country_name, 0);
		
		if(form == 1){
			writer w=new htmlwriter(path_file, out);
			w.writefile();
		
		}else if(form == 2){
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
		}else if(form == 3) {
			writer w=new markdownwriter(path_file, out);
			w.writefile();
		}
		if(form == 4) {
			writer w=new txtwriter(path_file, out);
			w.writefile();
			
			Text2Pdf converter=new Text2Pdf(path_file,path_file+".pdf");
			converter.createPdf();
		}
		
		return 1;
	}	
}

