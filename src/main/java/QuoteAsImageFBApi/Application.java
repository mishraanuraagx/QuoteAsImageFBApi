package QuoteAsImageFBApi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import QuoteAsImageFBApi.model.PostOnFB;
import QuoteAsImageFBApi.model.QuoteToImage;
import QuoteAsImageFBApi.model.QuotesLoader;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Application {
  public static String accessToken = "Add Your Access Token Here";
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    //TODO mishra: add cool background theme pics to quotes



  }

  public static void run(String accessToken) {
    String quote = QuotesLoader.randomisedQuote();
    QuoteToImage.run(quote);
    PostOnFB.run(quote, accessToken);
  }
}
