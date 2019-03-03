package tainiothiki;
import java.util.*;
public class genre extends item {
	private String name;
	private ArrayList<String> ids=new ArrayList<String>();
	
	
	public genre(String n) {
		name=n;
	}
	
	public void addmovie(String id) {
		ids.add(id);
	}
	public ArrayList<String> getmovies(){
		return ids;
	}
	public String getname() {
		return name;
	}
	

}
