package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class tagdefloader extends fileloader {

	public tagdefloader(String file) {
		super(file);
		
	}

	public HashMap<Integer,String> loaddefs(){
		HashMap<Integer,String> tagdefs=new HashMap<Integer,String>();

			
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
		            		continue;
		            	}
		            	lineprocess=line.split("\t");
		            	Integer key;
		            	key=Integer.parseInt(lineprocess[0]);
		            	tagdefs.put(key, lineprocess[1]);
		            	
		            	
		            	
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
		return tagdefs;
	}	
}
