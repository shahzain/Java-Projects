
package parser;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {

   
    public static void main(String[] args) throws IOException {
        
      
      Document doc = Jsoup.connect("http://en.wikipedia.org/").timeout(1000).get();
    
      Elements newsHeadlines = doc.select("#mp-itn b a");
            System.out.println("Answerer: " + newsHeadlines.text());
    }
    
}

