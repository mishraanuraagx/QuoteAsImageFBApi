package QuoteAsImageFBApi;


import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;
import QuoteAsImageFBApi.stringUtils.StringUtils;

public class Application {
  public static void main(String[] args) {
    String accessToken = "AddYourAccessTokenHere";
    FacebookClient fbClient = new DefaultFacebookClient(accessToken);
//    try {
//      FileInputStream fis = new FileInputStream(new File("assets/images/FocusWallpaper.png"));
//      FacebookType response = fbClient.publish("me/photos", FacebookType.class,
//          BinaryAttachment.with("FocusWallpaper.png",fis), Parameter.with("message","Focus2"));
//      System.out.println("Done");
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }

    final BufferedImage image;
    try {
      String text = "Hello World hhhhhhhhhhhhh!Hello World! <p color=\"#00FF00\">NOTICE</p>";
      Font font = new Font("Comic Sans MS", Font.BOLD & Font.ITALIC, 100);
      image = ImageIO.read(
          new File("assets/images/FocusWallpaper.png"));
      Graphics g = image.getGraphics();
//      g.setFont(g.getFont().deriveFont(300f));
      g.setFont(new Font("Comic Sans MS", Font.BOLD & Font.ITALIC, 100));
      g.setColor(Color.DARK_GRAY);
      g.drawString("Hello World! <p color=\"#00FF00\">NOTICE</p>", 0, 100);

      FontMetrics fm= g.getFontMetrics(font);
      Rectangle2D rect=fm.getStringBounds("Some Text",g);

      List<String> textList= StringUtils.wrap(text, fm, (int) image.getWidth());
      System.out.println(rect.getWidth() +" "+ rect.getHeight() +" "+ image.getWidth()+" "+image.getHeight());
      System.out.println(textList);
      g.dispose();
      ImageIO.write(image, "png", new File("assets/images/test.png"));
      System.out.println("Done2");
    } catch (IOException e) {
      e.printStackTrace();
    }
//    User me = fbClient.fetchObject("me", User.class);
//    System.out.println(me.getName());
//    System.out.println(me.getBirthday());
  }
}
