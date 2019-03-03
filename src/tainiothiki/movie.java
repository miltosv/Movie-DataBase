package tainiothiki;
import java.util.*;
public class movie extends item{
	/*
	
	private String id;
	private String title;
	private String spanishTitle;
	private String year;
	private String rtID;
	private ArrayList<Float> ratings;
	
	private String imdbPictureURL;
	private String rats;
	private String rtimageurl;
	*/
	
	//21 items
	private ArrayList<String> actors;
	private ArrayList<String> genres;
	private ArrayList<String> country;
	private ArrayList<usertags> utag;
	private ArrayList<userratings> usrate;
	private String locations="";
	//private ArrayList<Integer> tags=new ArrayList<Integer>();
	
	


	private ArrayList<String> details=new ArrayList<String>();
	
	public movie(ArrayList<String>items) {
		details=items;
		
		
	}
	
	
	public String getLocations() {
		return locations;
	}


	public void setLocations(String locations) {
		this.locations =" "+this.locations+" "+locations;
	}
	
	public String getYear() {
		
		return details.get(5);
	}
	
	
	public String getID() {
		
		
		return details.get(0);
	}
	
	public String getTitle() {
		
		
		return details.get(1);
	}
	public String getAllDetails(){
		String returned="";
		for(String each:details) {
			returned=returned+"\t"+each;
			
			
		}
		return returned;
		
	}


	public ArrayList<String> getActors() {
		return actors;
	}


	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	}


	public ArrayList<String> getGenres() {
		return genres;
	}


	public void setGenres(ArrayList<String> genres) {
		this.genres = genres;
	}


	public ArrayList<String> getCountry() {
		return country;
	}


	public void setCountry(ArrayList<String> country) {
		this.country = country;
	}


	public ArrayList<usertags> getUtag() {
		return utag;
	}


	public void setUtag(ArrayList<usertags> utag) {
		this.utag = utag;
	}


	public ArrayList<userratings> getUsrate() {
		return usrate;
	}


	public void setUsrate(ArrayList<userratings> usrate) {
		this.usrate = usrate;
	}


	public ArrayList<String> getDetails() {
		return details;
	}


	public void setDetails(ArrayList<String> details) {
		this.details = details;
	}
	
	//public void addTag(int tg) {
	//	tags.add(tg);
		
		
	//}
	//public ArrayList<Integer> getTag(){
	//	return tags;
	//}
	
	
	
}
