import MyGraphic.ImageOfGame;
import MyInterface.Drawable;
import MyInterface.Tickable;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Spacecraft implements Drawable, Tickable {
    private int health;
    private int x, y;
    private int coin;
    private int temreature;
    private int meat;
    private int bomb;

    private String name;
//    private BufferedImage scImage;
    private Image scImage;

    public Spacecraft(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.scImage = ImageOfGame.getInstance().getSpacecraftImage();
        this.bomb = 3;
        this.health = 5;
        this.coin = 0;
        this.temreature = 0;
        this.meat = 0;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void draw(Graphics g) {
        g.drawImage(scImage,x,y,null);
    }
    @Override
    public void tick() {

    }

    public void shoot (){


    }


    public int getHealth() {
        return health;
    }
    public int getCoin() {
        return coin;
    }
    public int getTemreature() {
        return temreature;
    }
    public int getMeat() {
        return meat;
    }
    public String getName() { return name; }
    public int getBomb() { return bomb; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
