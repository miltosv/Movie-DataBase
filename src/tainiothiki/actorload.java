package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class actorload extends fileloader {

	public actorload(String file) {
		super(file);
	}

	public ArrayList<actor> loadactors(){
		System.out.println("loading actors");
		ArrayList<actor> actors=new ArrayList<actor>();
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
	            	
	            	lineprocess=line.split("\t");
	            	actor act=new actor(lineprocess[2],lineprocess[1],lineprocess[0],lineprocess[3]);
            		actors.add(act);
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	/*if (first==true) {
	            		first=false;
	            		String lineprocess2[];
	            		lineprocess2=line.split("\t");
	            		actor ac=new actor(lineprocess2[2],lineprocess2[1]);
	            		ac.addmovie(lineprocess2[0]);
	            		actors.add(ac);
	            		continue;
	       
	            	}

	            	lineprocess=line.split("\t");
	            	boolean newelement=true;
	            	for(actor each:actors) {
	            		if(each.getid().equals(lineprocess[1])){
	            			each.addmovie(lineprocess[0]);
	            			each.setrank(lineprocess[2]);
	            			newelement=false;
	            			            			
	            			
	            		}
	            		
	            		
	            	}
	            	if(newelement) {
	            		actor ac=new actor(lineprocess[2],lineprocess[1]);
            			ac.addmovie(lineprocess[0]);
            			ac.setrank(lineprocess[3]);
            			actors.add(ac);
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
		
		
		
		
		
		return actors;
	}
	
	
}
