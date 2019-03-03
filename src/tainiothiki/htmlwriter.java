package tainiothiki;
import java.io.*;

public class htmlwriter implements writer {

	
	private String path;
	private String input;
	private static String form1="<!DOCTYPE html>	<html>	<body>";
	private static String form2="</body></html>";
	
	public htmlwriter(String path, String in) {
		this.path=path;
		this.input=in;
		
	}

	public int writefile() {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {

			fw = new FileWriter(path);
			bw = new BufferedWriter(fw);
			bw.write(form1+"<p>"+input+"</p>"+form2);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}


		
		return 1;
	}
	
	
}
