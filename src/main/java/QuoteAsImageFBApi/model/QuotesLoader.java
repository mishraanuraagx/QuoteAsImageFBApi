package QuoteAsImageFBApi.model;


public class QuotesLoader {
  public static String[] quotes = {
      "It is better to be feared than loved, if you cannot be both."
  };

  public static String randomisedQuote(){

    return quotes[(int)(Math.random()*quotes.length)];
  }
}
