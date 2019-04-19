import MyGraphic.ImageOfGame;
import MyInterface.Drawable;
import MyInterface.Tickable;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Bullet implements Drawable , Tickable {

//    private BufferedImage bulletImage ;
    private Image bulletImage ;

    int x,y;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
        this.bulletImage = ImageOfGame.getInstance().getShotImage();
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(bulletImage,x,y,null);
    }

    @Override
    public void tick() { this.y++; }
}
