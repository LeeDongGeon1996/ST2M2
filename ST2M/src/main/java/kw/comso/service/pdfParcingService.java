package kw.comso.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
 
/**
 * This class parses the pdf file.
 * i.e this class returns the text from the pdf file.
 * @author Mubin Shrestha
 */
public class pdfParcingService {
 
    public String PdfFileParcer(String pdffilePath) throws FileNotFoundException, IOException
    {
        String content;
        FileInputStream fi = new FileInputStream(new File(pdffilePath));
        PDFParser parser = new PDFParser(fi);
        parser.parse();
        COSDocument cd = parser.getDocument();
        PDFTextStripper stripper = new PDFTextStripper();
        content = stripper.getText(new PDDocument(cd));
        cd.close();
        return content;
    }
     
    public static void parcer() throws FileNotFoundException, IOException
    {
        String filepath = "fullPath";
        System.out.println(new pdfParcingService().PdfFileParcer("C:/Users/junma/DOCUME~1/카카오~1/자이스~1.PDF"));    
    }
}