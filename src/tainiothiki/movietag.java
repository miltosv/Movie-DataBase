package tainiothiki;

public class movietag extends item{

	private String movieid;
	private String tagvalue;
	public movietag(String m, String tv) {
		movieid=m;
		tagvalue=tv;
	}
	public String getMovieid() {
		return movieid;
	}
	public Integer getTagvalue() {
		
		return Integer.parseInt(tagvalue);
	}
	

}
