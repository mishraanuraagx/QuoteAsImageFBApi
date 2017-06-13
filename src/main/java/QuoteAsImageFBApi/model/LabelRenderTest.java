package QuoteAsImageFBApi.model;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LabelRenderTest {

  public static void run() {
    SwingUtilities.invokeLater( new Runnable() {
      public void run() {

        String title = "<html><body style='width: 700px; padding: 5px;'>"
            + "<h1 style=\"font-size:50px\">Do U C Me?</h1>"
            + "<p style=\"font-size:40px\">Here is a long string that will wrap.  "
            + "Here is a long string that will wrap.  "
            + "Here is a long string that will wrap.  "
            + "The effect we want is a multi-line label.</p>";

        JFrame f = new JFrame("Label Render Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage image = new BufferedImage(
            1200,
            800,
            BufferedImage.TYPE_INT_RGB);
        Graphics2D imageGraphics = image.createGraphics();
        GradientPaint gp = new GradientPaint(
            20f,
            20f,
            Color.red,
            2000f,
            780f,
            Color.orange);
        imageGraphics.setPaint(gp);
        imageGraphics.fillRect(0, 0, 1200, 800);

        JLabel textLabel = new JLabel(title);
        textLabel.setSize(textLabel.getPreferredSize());

        Dimension d = textLabel.getPreferredSize();
        BufferedImage bi = new BufferedImage(
            d.width,
            d.height,
            BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        g.setColor(new Color(255, 255, 255, 255));
        g.fillRoundRect(
            0,
            0,
            bi.getWidth(f),
            bi.getHeight(f),
            15,
            10);
        g.setColor(Color.black);
        textLabel.paint(g);
        try {
          ImageIO.write(bi, "png", new File("assets/images/test2.png"));
          System.out.println("done bi");
        } catch (IOException e) {
          e.printStackTrace();
        }
        Graphics g2 = image.getGraphics();
        g2.drawImage(bi, 20, 20, f);

        ImageIcon ii = new ImageIcon(image);
        JLabel imageLabel = new JLabel(ii);

        f.getContentPane().add(imageLabel);
        f.pack();
        f.setLocationByPlatform(true);

        f.setVisible(true);
      }
    });
  }
}