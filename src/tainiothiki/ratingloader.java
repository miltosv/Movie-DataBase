package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ratingloader extends fileloader {

	public ratingloader(String file) {
		super(file);
		
	}

	public ArrayList<userratings> loadrating(){
		ArrayList<userratings> uratings=new ArrayList<userratings>();
		
		
		String line;
		String[] lineprocess;
		 try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileloc);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                //System.out.println(line);
	            	//System.out.println("mpike sto load rating");
	            	if (line == null) {
	            		break;
	            	}
	            	lineprocess=line.split("\t");
	            	/*for (usertags each:utags) {
	            		if(each.getUid().equals(lineprocess[0])&&each.getmovieid().equals(lineprocess[1])){
	            			each.addtag(lineprocess[2],lineprocess[3]);
	            			            			
	            			
	            		}else if((each.getUid().equals(lineprocess[0])&&!(each.getmovieid().equals(lineprocess[1])))){
	            			usertags ust=new usertags(lineprocess[1]);
	            			ust.addtag(lineprocess[2],lineprocess[3]);
	            			utags.add(ust);           			
	            			
	            		}else if(!each.getUid().equals(lineprocess[0])){
	            			usertags ust=new usertags(lineprocess [1]);
	            			ust.setUid(lineprocess[0]);
	            			ust.addtag(lineprocess[2], lineprocess[3]);
	            			utags.add(ust);
	            			
	            			
	            			
	            			
	            		}
	            		
	            		
	            		
	            	}*/
	            	userratings ur=new userratings(lineprocess[0],lineprocess[1],lineprocess[2],lineprocess[3]);
	            	
	            	uratings.add(ur);
	            	
	            	
	            	
	            	
	            	
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

		
		return uratings;
	}
	
	
	
	
	
}
