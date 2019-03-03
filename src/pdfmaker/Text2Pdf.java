package pdfmaker;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
//import sandbox.WrapToTest;
 
//@WrapToTest
public class Text2Pdf {
 
	private String DEST;
	private String TEXT;
	/*
    public static void main(String[] args)
    	throws DocumentException, IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
    	new Text2Pdf().createPdf(DEST);
    }
 */
    public Text2Pdf(String TEXT,String DEST) {
    	this.TEXT=TEXT;
    	this.DEST=DEST;
    }
    public void createPdf() {
	/*throws DocumentException, IOException*/
    try{
    	try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(DEST));
        document.open();
        BufferedReader br = new BufferedReader(new FileReader(TEXT));
        String line;
        Paragraph p;
        Font normal = new Font(FontFamily.TIMES_ROMAN, 12);
        Font bold = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        boolean title = true;
        while ((line = br.readLine()) != null) {
            p = new Paragraph(line, title ? bold : normal);
            p.setAlignment(Element.ALIGN_JUSTIFIED);
            title = line.isEmpty();
            document.add(p);
            
        }
        document.close();
    	}catch(DocumentException ex2) {
        	ex2.printStackTrace();
        }
    	
        }catch(IOException ex) {
        	ex.printStackTrace();
        }
       
    }
}

