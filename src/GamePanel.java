import MyGraphic.ImageOfGame;
import MyGraphic.MyLable;
import MyGraphic.MyPanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends MyPanel {
    private final static BufferedImage BackGround = ImageOfGame.getInstance().getBGImageOfMenu();
    Spacecraft spacecraft;
    private MyLable health;
    private MyLable coin;
    private MyLable temreature;
    private MyLable meat;

    public GamePanel() {
        super(BackGround);
        init();
    }

    private void init() {

        health = new MyLable();


    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.drawImage(BackGround,0,0,width,height,null);
    }
}
