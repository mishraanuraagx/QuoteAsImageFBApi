package QuoteAsImageFBApi;


import QuoteAsImageFBApi.model.PostOnFB;
import QuoteAsImageFBApi.model.QuoteToImage;
import QuoteAsImageFBApi.model.QuotesLoader;

public class Application {
  public static void main(String[] args) {
    String quote = QuotesLoader.randomisedQuote();
    QuoteToImage.run(quote);
    PostOnFB.run(quote);
  }
}
