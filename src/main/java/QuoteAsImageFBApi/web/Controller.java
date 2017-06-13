package QuoteAsImageFBApi.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import QuoteAsImageFBApi.model.PostOnFB;
import QuoteAsImageFBApi.model.QuoteToImage;
import QuoteAsImageFBApi.model.QuotesLoader;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping("/")
  public String home(Model model) {

    return "index";
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  @ResponseBody
  public String posted(@RequestParam("quote") String quote,@RequestParam("accessToken") String accessToken, Model model) {
    if(quote.equals("random")){
      quote = QuotesLoader.randomisedQuote();
    }
    if(quote.length()<10){
      return "That Quote was very small, enter 'random' in text field to get randomised quote";
    }
    boolean converted = QuoteToImage.run(quote);
    if(!converted){
      return "problem Converting quote to Image, Must be very small string";
    }
    boolean valid = PostOnFB.run(quote,accessToken);

    if(!valid){
      return "Enter a valid Access Token";
    }
    return "QUOTE: "+ "\""+quote+"\""+"\n -- Posted on your Timeline";
  }
}
