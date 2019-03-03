package tainiothiki;
import java.io.*;
public class markdownwriter implements writer {

	private String path;
	private String input;
	
	public markdownwriter(String path, String in) {
		this.path=path;
		input=in;
	}
		public int writefile() {
			
			BufferedWriter bw = null;
			FileWriter fw = null;
			try {

				fw = new FileWriter(path);
				bw = new BufferedWriter(fw);
				bw.write("##"+input);

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
