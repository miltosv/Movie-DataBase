package tainiothiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class countryloader extends fileloader {

	public countryloader(String file) {
		super(file);
}
	
	
	public ArrayList<country> loadcountries(){
		System.out.println("loading countries");
		ArrayList<country> countries=new ArrayList<country>();
		String line;
		String[] lineprocess;
		boolean first=true;
		int counter=0;
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
	            	//System.out.println(counter);
	            	lineprocess=line.split("\t");
	            	ArrayList<String>toarraylist= new ArrayList<>(Arrays.asList(lineprocess));
	            	if (toarraylist.size()==1) {
	            		toarraylist.add("");
	            	}
	            	country ct=new country (toarraylist.get(1),toarraylist.get(0));
            		countries.add(ct);
	            	counter++;
	            	
	            	
	            	
	            	
	            	
	            	/*if (first==true) {
	            		first=false;
	            		String lineprocess2[];
	            		lineprocess2=line.split("\t");
	            		country ct=new country(lineprocess2[1]);
	            		ct.addmovie(lineprocess2[0]);
	            		countries.add(ct);
	            		continue;
	            	}
	            	lineprocess=line.split("\t");
	            	boolean newelement=true;
	            	for (country each:countries) {
	            		if(each.getname().equals(lineprocess[1])){
	            			each.addmovie(lineprocess[0]);
	            			newelement=false;
	            			            			
	            			
	            		}
	            			
	            	}
	            	if(newelement) {
	            	country ct=new country(lineprocess[1]);
        			ct.addmovie(lineprocess[0]);
        			countries.add(ct);	
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
		
		
		
		
		
		return countries;
	}
	
	
	
	
	
	
}
