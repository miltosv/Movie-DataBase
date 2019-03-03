package tainiothiki;
import java.util.*;
public class country extends item {
	private String name;
	//private ArrayList<String> ids=new ArrayList<String>();
	private String id;
	
	public country(String n,String i) {
		name=n;
		id=i;
	}
	//public void addmovie(String id) {
	//	ids.add(id);
	//}
	public String getname() {
		return name;
	}
	public String getID() {
		return id;
	}
	//public ArrayList<String> getCountries(){
	//	return ids;
	//}
	
}
