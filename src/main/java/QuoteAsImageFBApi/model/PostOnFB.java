package QuoteAsImageFBApi.model;


import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PostOnFB {
  public static boolean run(String quote, String token) {
    // Post image named 'test.png' from local directory, this image is produced by QuoteToImage class
    // Also adds a Message with the pic, which quote itself

    String accessToken = token;
    //Checks if token is null or not
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
      valid = false;
      return valid;
    } catch (Exception e){
      //Use to handle exception when token is invalid
      System.out.println("wrong Token");
      return false;
    }

    return valid;
  }
}
