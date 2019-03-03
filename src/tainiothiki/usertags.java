package tainiothiki;
import java.util.*;
public class usertags extends item{
	private String uid;
	private String movieid;
	private String tags;
	private String time;
	
	public usertags(String uid,String movied,String tg,String t) {
		movieid=movied;
		this.uid=uid;
		this.movieid=movied;
		tags=tg;
		time=t;
		
	}
	/*public void addtag(String tag, String times) {
		tags.add(tag);
		time.add(times);
	}
	public String getmovieid() {
		return movieid;
	}
	
	
	public ArrayList<String> returnTags(){
		return tags;
		
		
	}
	public ArrayList<String> returnTimes(){
		
		
		return time;
	}*/
	public String getUid() {
		return uid;
	}
	public String getMovieid() {
		return movieid;
	}
	public int getTags() {
		
		return Integer.parseInt(tags);
	}
	public String getTime() {
		return time;
	}
	
	
	
}
