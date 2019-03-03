package tainiothiki;
import java.util.*;
public class actor extends item {
	
	private String name;
	//private ArrayList<String> ids=new ArrayList<String>();
	private String id;
	//private ArrayList<String> rankings=new ArrayList<String>();
	private String movieid;
	private String ranking;
	
	public actor(String n,String id,String mid,String ra) {
		name=n;
		this.id=id;
		movieid=mid;
		ranking=ra;
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
	/*public ArrayList<String> getActors(){
		return ids;
	}
	public void setrank(String rank) {
		rankings.add(rank);
	}*/
	public String getMovieid() {
		return movieid;
	}
	public String getRanking() {
		return ranking;
	}
	

}
