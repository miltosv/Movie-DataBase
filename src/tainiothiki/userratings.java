package tainiothiki;

public class userratings extends item{

	private String userid;
	private String movieid;
	private String rating;
	private String timestamp;
	
	public userratings(String uid, String id,String rat,String time) {
		userid = uid;
		movieid=id;
		rating=rat;
		timestamp=time;
		
		
	}

	public String getMovieid() {
		return movieid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUserid() {
		return userid;
	}
	
	
	
}
