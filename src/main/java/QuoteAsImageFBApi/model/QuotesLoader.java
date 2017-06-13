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
      "Clothes do not make the man, but you need the proper costume if you want to play the part.",
      "Small thaws make great floods, so be twice wary of a slowly changing season.",
      "Just because I tread heavily on propriety’s toes doesn’t mean I can’t play the game when it’s of use to me.",
      "My rooms were so pleasant it took me almost a full day to realize how much I hated them."
          + "Again you have to think in terms of shoes. You don’t want the biggest pair. You want a pair that fits. If your shoes are too big, your feet chafe and blister.",
      "There are two types of power - granted and inherited.",
      "Nothing in the world is harder than convincing someone of an unfamiliar truth.",
      "Lies are simpler, and most of the time they make better sense.",
      "Cynicism comes from love. Being jaded comes from apath.",
      "As long as you think the current situation is okay ... however bad it may be... noone can help you.",
      "To ask is a moment's shame. Not to, lifelong.",
      "Copy an image over and over on a stack of paper and eventually the lower sheets will bear the same image, pressed down. Deep within.",
      "True art was more than beauty; it was more than technique. It was not just imitation.It was boldness, it was contrast, it was subtlety.",
      "I've found that you look lot smarter asking questions than dumbly dont answering them.",
      "My father is a man of passion and virtue. Just never at the same time.",
      "The hallmark of insecurity is bravado.",
      "Sometimes it isn't strength that keeps us going on. It's the lack of options.",
      "It's hard enough to find an error in your code when you're looking for it; it's even harder when you've assumed your code is error-free.",
      "First, solve the problem. Then, write the code.",
      " Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live.",
      "Linux is only free if your time has no value.",
      "May the Force be with you.",
      "Freedom is something that you need to actively acquire. It's not something that's given with no strings attached. To be free means to take responsibility, and to prepare yourself for what's to come.",
      "Fear is not evil. It tells you what weakness is. And once you know your weakness, you can become stronger as well as kinder.",
      "The country? The skies? You can have them. I’m busy just protecting what’s right in front of me. I don’t know what’ll happen to me in the future, but if something has fallen at my feet, then the least I can do is pick it up.",
      "When do you think people die? When they are shot through the heart by the bullet of a pistol? No. When they are ravaged by an incurable disease? No. When they drink a soup made from a poisonous mushroom!? No! It’s when they are forgotten.",


  };

  public static String randomisedQuote() {

    return quotes[(int) (Math.random() * quotes.length)];

  }
}
