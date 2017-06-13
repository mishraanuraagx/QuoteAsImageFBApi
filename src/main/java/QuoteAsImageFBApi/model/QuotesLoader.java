package QuoteAsImageFBApi.model;


public class QuotesLoader {
  public static String[] quotes = {
      "It is better to be feared than loved, if you cannot be both.",
      "Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do.",
      "Keep your face always toward the sunshine—and shadows will fall behind you.",
      "All you need is the plan, the road map, and the courage to press on to your destination.",
      "Once we believe in ourselves, we can risk curiosity, wonder, spontaneous delight, or any experience that reveals the human spirit.",
      "Where there is a will, there is a way. If there is a chance in a million that you can do something, anything, to keep what you want from ending, do it. Pry the door open or, if need be, wedge your foot in that door and keep it open.",
      "Do not wait; the time will never be ‘just right.’ Start where you stand, and work with whatever tools you may have at your command, and better tools will be found as you go along.",
      ""
  };

  public static String randomisedQuote(){

    return quotes[(int)(Math.random()*quotes.length)];
  }
}
