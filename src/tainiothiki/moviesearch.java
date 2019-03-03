package tainiothiki;
import java.util.*;
public class moviesearch extends searcher {

	public moviesearch() {
		// TODO Auto-generated constructor stub
	}
	
	//private ArrayList<String> tags = new ArrayList<String>();
	private ArrayList<Integer> movie_tags = new ArrayList<Integer>();
	
	public String search(ArrayList<userratings> userratingss, ArrayList<movie> movies,ArrayList<usertags> usertagss ,ArrayList<movietag> movietags,HashMap<Integer, String> tagdefs, String movie_name, int tag_rating) {
		
		
		
		String result = "";
		
		
		String[] details;
		//System.out.println(movies.size());	
		for(int i=0; i < movies.size(); i++){
			//System.out.println(i);
			if( isInteger(movie_name)){
				//String movieID=movies.get(i).getID();
				//System.out.println("movieid"+movieID);
				if(movie_name.equals(movies.get(i).getID())) {
					
					result += movies.get(i).getAllDetails();
					
					details = result.split("\t");
					
					result = "the ID of movie is :"+ movies.get(i).getID() +"\n"+"the title is : "+ movies.get(i).getTitle() +"\n"+"the imdb ID is: "+ details[0] + "\n" + "the spanish Title is : "+ details[1] +"\n" + "the imdb Picture is: "+ details[2] + "\n" + "the year is :" + details[3] + "\n" + "the rt ID is :" + details[4] + "\n" + "the rt All Critics Rating is :" + details[5] + "\n" + "the rt All Critics Num Reviews is :" + details[6] +"\n" + "the rt All Critics Num Fresh is :" + details[7] +"\n" + "the rt All Critics Num Rotten is :" + details[8] +"\n" + "the rt All Critics Score is :" + details[9] +"\n" + "the rt Top Critics Rating is :" + details[10] +"\n" + "the rt Top Critics Num Reviews is :" + details[11] +"\n" + "the rt Top Critics Num Fresh is :" + details[12] +"\n" + "the rt Top Critics Num Rotten is :" + details[13] +	"\n" + "the rt Top Critics Score is :" + details[14] +"\n" + "the rt Audience Rating is :" + details[15] +"\n" + "the rt Audience Num Ratings is :" + details[16] +"\n" + "the rt Audience Score is :" + details[17] +"\n" + "the rt Picture is :" + details[18] +"\n\n";																																	
					
					if(tag_rating == 1) {
						
						
						result += "movie tags :\n";
						//movie_tags = movies.get(i).getTag();
						for(movietag each: movietags) {
							result += tagdefs.get(each.getTagvalue()) + ", ";
						}
						
						
						result += "\nTags for this movie from users: \n";
						for(int y=0; y < usertagss.size(); y++) {
							if(usertagss.get(y).getMovieid().equals(movie_name)) {
								result += "user with id :"+usertagss.get(y).getUid() +"\n";
								//tags = usertagss.get(y).returnTags();
								//tags_time = usertagss.get(y).returnTimes();
								//for(int w=0; w < tags.size(); w++) {
									result += "\t tag : "+tagdefs.get(usertagss.get(y).getTags())+"\t in "+usertagss.get(y).getTime() +"\n";
								//}
								
							}
						}
						
					}else if(tag_rating == 2) {
						result += "Ratings for this movie: \n";
						for(int y=0; y < userratingss.size(); y++) {
							if(userratingss.get(y).getMovieid().equals(movie_name)) {
								result += "user with id :"+userratingss.get(y).getUserid() +"\n";
								result += "\t rating : "+userratingss.get(y).getRating()+"\t in "+userratingss.get(y).getTimestamp() +"\n";
							}
						}
					}
					
					break;
				}
			}else {
					if(movie_name.equals(movies.get(i).getTitle())) {
					
						result += movies.get(i).getAllDetails();
						
						details = result.split("\t");

						result = "the ID of movie is :"+ movies.get(i).getID() +"\n"+"the title is : "+ movies.get(i).getTitle() +"\n"+"the imdb ID is: "+ details[0] + "\n" + "the spanish Title is : "+ details[1] +"\n" + "the imdb Picture is: "+ details[2] + "\n" + "the year is :" + details[3] + "\n" + "the rt ID is :" + details[4] + "\n" + "the rt All Critics Rating is :" + details[5] + "\n" + "the rt All Critics Num Reviews is :" + details[6] +"\n" + "the rt All Critics Num Fresh is :" + details[7] +"\n" + "the rt All Critics Num Rotten is :" + details[8] +"\n" + "the rt All Critics Score is :" + details[9] +"\n" + "the rt Top Critics Rating is :" + details[10] +"\n" + "the rt Top Critics Num Reviews is :" + details[11] +"\n" + "the rt Top Critics Num Fresh is :" + details[12] +"\n" + "the rt Top Critics Num Rotten is :" + details[13] +	"\n" + "the rt Top Critics Score is :" + details[14] +"\n" + "the rt Audience Rating is :" + details[15] +"\n" + "the rt Audience Num Ratings is :" + details[16] +"\n" + "the rt Audience Score is :" + details[17] +"\n" + "the rt Picture is :" + details[18];																																	

						String movie_id = movies.get(i).getID();
					
					if(tag_rating == 1) {
						
						
						result += "movie tags :\n";
						//movie_tags = movies.get(i).getTag();
						for(movietag each: movietags) {
							result += tagdefs.get(each) + ", ";
						}
						
						
						result += "\nTags for this movie from users: \n";
						for(int y=0; y < usertagss.size(); y++) {
							if(usertagss.get(y).getMovieid().equals(movie_id)) {
								result += "user with id :"+usertagss.get(y).getUid() +"\n";
								//tags = usertagss.get(y).returnTags();
								//tags_time = usertagss.get(y).returnTimes();
								//for(int w=0; w < tags.size(); w++) {
									result += "\t tag : "+tagdefs.get(usertagss.get(y).getTags())+"\t in "+usertagss.get(y).getTime() +"\n";
								//}
								
							}
						}
					}else if(tag_rating == 2) {
						result += "Ratings for this movie: \n";
						for(int y=0; y < userratingss.size(); y++) {
							if(userratingss.get(y).getMovieid().equals(movie_id)) {
								result += "user with id :"+userratingss.get(y).getUserid() +"\n";
								result += "\t rating : "+userratingss.get(y).getRating()+"\t in "+userratingss.get(y).getTimestamp() +"\n";
							}
						}
					}
					
					break;
				}
			}
		}
		
		return result;
	}

	
	private static boolean isInteger(String s) {
	      boolean isValidInteger = false;
	      try
	      {
	         Integer.parseInt(s);
	 
	         // s is a valid integer
	 
	         isValidInteger = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValidInteger;
	   }
}
