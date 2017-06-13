package QuoteAsImageFBApi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import QuoteAsImageFBApi.model.PostOnFB;
import QuoteAsImageFBApi.model.QuoteToImage;
import QuoteAsImageFBApi.model.QuotesLoader;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    //TODO mishra: output font style size family
    //TODO mishra: add cool background theme pics to quotes

    String accessToken = "Add Your Access Token Here";


  }

  public static void run(String accessToken) {
    String quote = QuotesLoader.randomisedQuote();
    QuoteToImage.run(quote);
    PostOnFB.run(quote, accessToken);
  }
}
