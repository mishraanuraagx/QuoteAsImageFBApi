package QuoteAsImageFBApi.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


public class QuoteToImage {
  public static boolean run(String quote) {
    // Converts Quotes to image using BufferedImage, Graphics, and ImageIO
    //JLabel is used to format the HTML tagged text to get nice wrapping and styled text
    boolean valid = true;
    //TODO mishra: Handle if String is too small

    final BufferedImage image;

    String text = "<html><body style='width: 1080px; padding: 5px;'>"
        + "<h1 style=\"font-size:40px;text-align:center;text-shadow: 2px 2px;word-spacing: normal;margin: 50px;"
        + "font-family: Comic Sans MS;\">"
        + "\"" + quote + "\""
        + "</h1><body></html>";
    JLabel textField = new JLabel(text);
    textField.setSize(textField.getPreferredSize());

    Dimension d = textField.getPreferredSize();
    int x = d.width;
    int y = d.height;
    BufferedImage bi = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = bi.createGraphics();

    //Gives a gradient background
    GradientPaint redToWhite = new GradientPaint(x, y, Color.red, 200, y, Color.blue);
    g.setPaint(redToWhite);
    g.fillRoundRect(0, 0, x, y, 15, 10);

    //Adds Another layer of White color with translucent effect
    g.setColor(new Color(254, 249, 255, 200));
    g.fillRoundRect(0, 0, x, y, 15, 10);
    textField.paint(g);

    try {
      ImageIO.write(bi, "png", new File("assets/images/test.png"));
      System.out.println("Quote converted to text");
    } catch (IOException e) {
      e.printStackTrace();
      valid = false;
    }

    return valid;
  }
}
