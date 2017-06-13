package QuoteAsImageFBApi.model;


import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;
import com.restfb.types.User;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PostOnFB {
  public static void run(String quote) {
//    String accessToken = "AddYourAccessTokenHere";
    String accessToken = "EAACEdEose0cBAK3Whyz4ou8bXwv8AQDVZAQJPclyCXs4w2gm3pNQXPpfRAaJdVAtQZBUuCjySEYvAQPgn08HO9dPdFOwdA1yvJlO7BQ9e6T8sljkilnvM4hSLts9nDZCnriZAfbu6Gun5pCZCcErySylQmNEWXft6MAYPoviNx0TZBshr2hOdh6XZADtJkUT68ZD";
    FacebookClient fbClient = new DefaultFacebookClient(accessToken);

    try {
      FileInputStream fis = new FileInputStream(new File("assets/images/test.png"));
      FacebookType response = fbClient.publish("me/photos", FacebookType.class,
          BinaryAttachment.with("test.png",fis), Parameter.with("message",quote));
      System.out.println("Posted Image");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    User me = fbClient.fetchObject("me", User.class);
    System.out.println(me.getName());
    System.out.println(me.getBirthday());
  }
}
