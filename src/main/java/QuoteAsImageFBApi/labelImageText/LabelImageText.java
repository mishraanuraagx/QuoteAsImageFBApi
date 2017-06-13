package QuoteAsImageFBApi.labelImageText;

import java.awt.*;
import javax.swing.*;

public class LabelImageText extends JPanel
{
  public LabelImageText()
  {
    JLabel label1 = new JLabel( new ColorIcon(Color.ORANGE, 100, 100) );
    label1.setText( "Easy Way" );
    label1.setHorizontalTextPosition(JLabel.CENTER);
    label1.setVerticalTextPosition(JLabel.CENTER);
    add( label1 );

    JLabel label2 = new JLabel( new ColorIcon(Color.YELLOW, 200, 150) );
    label2.setLayout( new BoxLayout(label2, BoxLayout.Y_AXIS) );
    add( label2 );

    JLabel text = new JLabel( "More Control" );
    text.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    label2.add( Box.createVerticalGlue() );
    label2.add( text );
    label2.add( Box.createVerticalStrut(10) );
  }


  public static class ColorIcon implements Icon
  {
    private Color color;
    private int width;
    private int height;

    public ColorIcon(Color color, int width, int height)
    {
      this.color = color;
      this.width = width;
      this.height = height;
    }

    public int getIconWidth()
    {
      return width;
    }

    public int getIconHeight()
    {
      return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
      g.setColor(color);
      g.fillRect(x, y, width, height);
    }
  }

  private static void createAndShowUI()
  {
    JFrame frame = new JFrame("LabelImageText");
    frame.setUndecorated(true);
    frame.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add( new LabelImageText() );
    frame.pack();
    frame.setLocationRelativeTo( null );
    frame.setVisible( true );
  }

  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable(){public void run(){createAndShowUI();}});
  }
}