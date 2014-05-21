package guitemp;

//import java.awt.image.MemoryImageSource;
import java.awt.Image;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.Point;
import java.awt.Component;

public class TranspCursor {
   public void createCurs() throws Exception {
      int[] pixels = new int[16 * 16];
     // Image image = Toolkit.getDefaultToolkit().createImage(
      //new MemoryImageSource(16, 16, pixels, 0, 16));
      Image image = Toolkit.getDefaultToolkit().getImage("cur230.png");
      Cursor transparentCursor = Toolkit.getDefaultToolkit().
      createCustomCursor(image, new Point(0, 0), "invisibleCursor");
      //Component curs;
      //curs = Component();
      setCursor(transparentCursor);
      System.out.println("Transparent Cursor created.");
   }
}

//http://www.tutorialspoint.com/javaexamples/gui_transparent.htm
//http://docs.oracle.com/javase/7/docs/api/java/awt/Image.html
//http://docs.oracle.com/javase/7/docs/api/java/awt/Cursor.html
//http://docs.oracle.com/javase/7/docs/api/java/awt/Point.html
//http://docs.oracle.com/javase/7/docs/api/java/awt/Toolkit.html