package MyGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel {
    protected int x = 20,
            y = 20,
            width = 1200,
            height = 800,
            margin = 10;

    protected BufferedImage image ;
    public MyPanel(BufferedImage image) {
        this.image = image;
        setBounds(0, 0, width, height);
        setLayout(null);

    }
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        drawBackGround(g);
    }
    private void drawBackGround(Graphics g) {
        g.drawImage(image,0,0,this);

    }
    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
    }
    //    public MenuPanel() {
//        try {
//            setIcon(new ImageIcon(ImageIO.read(getClass().getResource("../image/chicken-invaders-hd-wallpaper-0.jpg"))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//        g.drawImage(image,0,0,null);
//    }
}
