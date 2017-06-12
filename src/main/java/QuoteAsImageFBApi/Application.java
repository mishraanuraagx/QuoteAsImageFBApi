package QuoteAsImageFBApi;


import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

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
      image = ImageIO.read(
          new File("assets/images/FocusWallpaper.png"));
      Graphics g = image.getGraphics();
//      g.setFont(g.getFont().deriveFont(300f));
      g.setFont(new Font("Comic Sans MS", Font.BOLD & Font.ITALIC, 100));
      g.setColor(Color.DARK_GRAY);
      g.drawString("Hello World! <p color=\"#00FF00\">NOTICE</p>", 100, 100);
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
