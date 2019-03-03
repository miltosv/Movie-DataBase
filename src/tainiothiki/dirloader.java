package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class dirloader extends fileloader {

	public dirloader(String file) {
		super(file);
	}

	public ArrayList<director> loaddirectors(){
		System.out.println("loading directors");
		ArrayList<director> directors=new ArrayList<director>();
		String line;
		String[] lineprocess;
		//int counter=0;
		
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
	            	
	            	lineprocess=line.split("\t");
	            	System.out.println(lineprocess[0]);
	            	director dir=new director(lineprocess[2],lineprocess[1],lineprocess[0]);
            		directors.add(dir);
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	/*
	            	if (first==true) {
	            		first=false;
	            		String lineprocess2[];
	            		lineprocess2=line.split("\t");
	            		director dir=new director(lineprocess2[2],lineprocess2[1]);
	            		dir.addmovie(lineprocess2[0]);
	            		directors.add(dir);
	            		continue;
	       
	            	}
	            	
	            	
	            	lineprocess=line.split("\t");
	            	boolean newelement=true;
	            	for (director each:directors) {
	            		if(each.getid().equals(lineprocess[1])){
	            			each.addmovie(lineprocess[0]);
	            			newelement=false;
	            		
	            		}
	            		
	            	}
	            	if(newelement) {
	            		director dir=new director(lineprocess[2],lineprocess[1]);
	            		dir.addmovie(lineprocess[0]);
	            		directors.add(dir);
	            	}*/
	            	
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
		
		
		
		
		
		return directors;
	}
	
	
}
