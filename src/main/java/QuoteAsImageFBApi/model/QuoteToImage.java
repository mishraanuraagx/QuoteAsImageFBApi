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
    if(quote.length()<5);
    final BufferedImage image;

      String text = "<html><body style='width: 700px; padding: 5px;'>"
          +"<h1 style=\"font-size:40px;text-align:center;text-shadow: 2px 2px;word-spacing: normal;"
          +"font-family: Comic Sans MS;\">"
          +"Success is no accident. It is hard work, perseverance, learning,"
          +" studying, sacrifice and most of all, love of what you are doing or learning to do."
          +""
          +"</h1><body></html>";
      JLabel textField = new JLabel(text);
      textField.setSize(textField.getPreferredSize());

      Dimension d = textField.getPreferredSize();
      BufferedImage bi = new BufferedImage(
          d.width,
          d.height,
          BufferedImage.TYPE_INT_ARGB);
      Graphics2D g = bi.createGraphics();
//      g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
//      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//      g.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
//      g.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
//      g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
//      g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//      g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//      g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

      g.setColor(new Color(255, 255, 255, 255));
      g.fillRoundRect(
          0,
          0,
//          bi.getWidth(d),
//          bi.getHeight(d),
          1200,800,
          15,
          10);
      g.setColor(Color.black);
      textField.paint(g);
      try {
        ImageIO.write(bi, "png", new File("assets/images/test.png"));
        System.out.println("done bi");
      } catch (IOException e) {
        e.printStackTrace();
      }
//    try {
//      Font font = new Font("Comic Sans MS", Font.BOLD & Font.ITALIC, 100);
//      image = ImageIO.read(new File("assets/images/FocusWallpaper.png"));
//      Graphics g = image.getGraphics();
//      g.setFont(new Font("Comic Sans MS", Font.BOLD & Font.ITALIC, 100));
//      g.setColor(Color.DARK_GRAY);
//      textField.paint(g);
//      g.dispose();
//      ImageIO.write(image, "png", new File("assets/images/test.png"));
//      System.out.println("Done");
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

  }
}
