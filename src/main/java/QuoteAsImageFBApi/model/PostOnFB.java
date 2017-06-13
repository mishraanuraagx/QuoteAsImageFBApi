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
  public static boolean run(String quote, String token) {

    String accessToken = token;
    Boolean valid = true;
    if(token.length() == 0){
      return false;
   }
    FacebookClient fbClient = new DefaultFacebookClient(accessToken);

    try {
      FileInputStream fis = new FileInputStream(new File("assets/images/test.png"));
      FacebookType response = fbClient.publish("me/photos", FacebookType.class,
          BinaryAttachment.with("test.png",fis), Parameter.with("message",quote));
      System.out.println("Posted Image");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      valid = false;
    }

    User me = fbClient.fetchObject("me", User.class);
    System.out.println(me.getName());
    System.out.println(me.getBirthday());
    return valid;
  }
}
