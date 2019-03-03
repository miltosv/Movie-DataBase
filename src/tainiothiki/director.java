package tainiothiki;
import java.util.*;
public class director extends item {
	private String name;
	//private ArrayList<String> ids=new ArrayList<String>();
	private String id;
	private String movieid;
	//private ArrayList<Integer> rankings;
	
	
	public director(String n,String id,String mid) {
		name=n;
		this.id=id;
		movieid=mid;
		
	}
	//public void addmovie(String id) {
	//	ids.add(id);
	//}
	public String getname() {
		return name;
	}
	public String getid() {
		return id;
	}
	//public ArrayList<String> getDirectors(){
	//	return ids;
	//}
	//public void setrank(int rank) {
	//	rankings.add(rank);
	//}
	
	
	public String getMovieid() {
		return movieid;
	}
	

}
