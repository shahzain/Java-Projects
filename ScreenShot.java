package screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import static java.lang.Thread.sleep;
import java.util.Date;
import javax.imageio.ImageIO;




public class ScreenShot {

    
public static void main(String[] args)  throws AWTException, IOException, InterruptedException  {
      
    while(true){
    Date date = new Date();
    
   // sleep(5000);
        
     BufferedImage screencapture = new Robot().createScreenCapture(
     new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );

     // Save as JPEG
     File file = new File(date.toString().replace(":"," ")+" .jpg");
     ImageIO.write(screencapture, "jpg", file);
     
    }


    
    }
    
}
