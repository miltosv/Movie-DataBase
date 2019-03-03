package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class movieloader extends fileloader {

	private String location_path;
	private ArrayList<movie> movies=new ArrayList<movie>();
	
	/*public movieloader(String file,/*String fileloc2) {
		super(file);
		// TODO Auto-generated constructor stub
		//location_path=fileloc2;
		
	
	}*/
	public movieloader(String file,String fileloc2) {
		super(file,fileloc2);
		// TODO Auto-generated constructor stub
		//location_path=fileloc2;
		
	
	}
	public ArrayList<movie> loadmovies(){
		String line;
		String[] lineprocess;
		boolean first=true;
		//ArrayList<movie> movies=new ArrayList<movie>();
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
	            		continue;
	            	}
	            	lineprocess=line.split("\t");


	            	ArrayList<String>toarraylist= new ArrayList<>(Arrays.asList(lineprocess));
	            	movie m=new movie(toarraylist);
	            	//System.out.println(lineprocess[0]);

	            	
	            	movies.add(m);
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
	    boolean first2=true;
/*		try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader2 = 
	                new FileReader(fileloc2);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader2 = 
	                new BufferedReader(fileReader2);

	            while((line = bufferedReader2.readLine()) != null) {
	                //System.out.println(line);
	            	if (first==true) {
	            		first=false;
	            		continue;
	            	}
	            	
	            	if (line == null) {
	            		break;
	            	}
	            	
	            		
	            	
	            			
	            	lineprocess=line.split("\t");
	            	//System.out.println(lineprocess[0]);
	            	
	            	//int index=Integer.parseInt(lineprocess[0]);
	            	//System.out.println("loading");
	            	ArrayList<String>toarraylist= new ArrayList<>(Arrays.asList(lineprocess));
	            	for(movie each: movies) {
	            		for(int k=1; k<toarraylist.size(); k++) {
	            			if(each.getID().equals(lineprocess[0])) {
	            				each.setLocations(toarraylist.get(k));
	            			}
	            			
	            			
	            			
	            		}
	            		
	            		
	            		  //movies.get(index).setLocations(toarraylist.get(k));
	            		}
	            	
	            	
	            	

	            	
	            	
	            }   

	            // Always close files.
	            bufferedReader2.close();         
	        }
	        catch(FileNotFoundException ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                		fileloc2 + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileloc2 + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }*/

		
		return movies;
	}
	
	
	
}
