package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class genreloader extends fileloader {

	public genreloader(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<genre> loadgenres(){
		System.out.println("loading genres");
		ArrayList<genre> genres=new ArrayList<genre>();
		String line;
		String[] lineprocess;
		
		boolean first=true;
		 try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileloc);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                //System.out.println(line);
	            	if (line == null) {
	            		break;
	            	}
	            	if (first==true) {
	            		first=false;
	            		String lineprocess2[];
	            		lineprocess2=line.split("\t");
	            		genre gn=new genre(lineprocess2[1]);
	            		gn.addmovie(lineprocess2[0]);
	            		genres.add(gn);
	            		continue;
	       
	            	}
	            	
	            	lineprocess=line.split("\t");
	            	boolean newelement=true;
	            	for (genre each:genres) {
	            		if(each.getname().equals(lineprocess[1])){
	            			newelement=false;
	            			each.addmovie(lineprocess[0]);
	            			            			
	            			
	            		}
	            			     			

	            		
	            	}
	            	if (newelement) {
	            		genre gn=new genre(lineprocess[1]);
            			gn.addmovie(lineprocess[0]);
            			genres.add(gn);	 
	            		
	            		
	            	}
	            	
	            	
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                		fileloc + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileloc + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
		
		
		
		
		
		return genres;
	}
	
	

	
}
