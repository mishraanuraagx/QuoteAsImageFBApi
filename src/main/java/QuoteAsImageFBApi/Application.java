package QuoteAsImageFBApi;


import QuoteAsImageFBApi.model.PostOnFB;
import QuoteAsImageFBApi.model.QuoteToImage;
import QuoteAsImageFBApi.model.QuotesLoader;

public class Application {
  public static void main(String[] args) {
    //TODO mishra: create Readme.md
    //TODO mishra: output font style size family
    //TODO mishra: add cool background theme pics to quotes
    //TODO mishra: create Heroku Hosted API for developers to directly use your API with their own quotes

    String quote = QuotesLoader.randomisedQuote();
    QuoteToImage.run(quote);
//    PostOnFB.run(quote);
  }
}
