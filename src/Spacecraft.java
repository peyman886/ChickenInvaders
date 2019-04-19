import MyGraphic.MyLable;
import MyInterface.Drawable;

import java.awt.*;

public class Spacecraft implements Drawable {
    private int health;
    private int x, y;
    private int coin;
    private int temreature;
    private int meat;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private MyLable myLable;


    @Override
    public void draw(Graphics g) {

    }
    public void moveSpacecraft (){}

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
}
