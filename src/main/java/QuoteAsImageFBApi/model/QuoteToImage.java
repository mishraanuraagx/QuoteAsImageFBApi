package QuoteAsImageFBApi.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


public class QuoteToImage {
  public static void run(String quote) {
    //TODO mishra: Very small if received via HTTP request String replace with with some default or randomised again
    if (quote.length() < 5);
    final BufferedImage image;

    String text = "<html><body style='width: 1080px; padding: 5px;'>"
        + "<h1 style=\"font-size:40px;text-align:center;text-shadow: 2px 2px;word-spacing: normal;margin: 50px;"
        + "font-family: Comic Sans MS;background-image: url(assets/images/FocusWallpaper.png)\">"
        + quote
        + "</h1><body></html>";
    JLabel textField = new JLabel(text);
    textField.setSize(textField.getPreferredSize());

    Dimension d = textField.getPreferredSize();
    int x = d.width;
    int y = d.height;
    BufferedImage bi = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = bi.createGraphics();

    g.setColor(new Color(138, 146, 255, 125));
    g.fillRoundRect(0, 0, x, y, 15, 10);
    textField.paint(g);
    try {
      ImageIO.write(bi, "png", new File("assets/images/test.png"));
      System.out.println("Quoted converted to text");
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
