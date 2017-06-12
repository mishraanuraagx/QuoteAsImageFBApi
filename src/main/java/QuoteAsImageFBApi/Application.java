package QuoteAsImageFBApi;


import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Application {
  public static void main(String[] args) {
    String accessToken = "AddYourAccessTokenHere";
    FacebookClient fbClient = new DefaultFacebookClient(accessToken);
    try {
//      FileInputStream fis = new FileInputStream(new File("C:\\Users\\MAX\\Desktop\\QuotesAsImage\\FocusWallpaper.png"));
      FileInputStream fis = new FileInputStream(new File("assets/images/FocusWallpaper.png"));
      FacebookType response = fbClient.publish("me/photos", FacebookType.class,
          BinaryAttachment.with("FocusWallpaper.png",fis), Parameter.with("message","Focus2"));
      System.out.println("Done");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    User me = fbClient.fetchObject("me", User.class);
    System.out.println(me.getName());
    System.out.println(me.getBirthday());
  }
}
