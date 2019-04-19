import MyGraphic.ImageOfGame;
import MyGraphic.MyPanel;
import MyInterface.Drawable;
import MyInterface.Tickable;

import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GamePanel extends MyPanel implements Tickable {
//    private final static BufferedImage BackGround = ImageOfGame.getInstance().getBackGroundImageOfMenu();
    private final static Image BackGround = ImageOfGame.getInstance().getBackGroundImageOfMenu();

    Spacecraft spacecraft;
    StatusOfSc statusOfSc;
    ArrayList<Bullet> bullets;

    public GamePanel() {
        super(BackGround);
//        Input input = new Input();
//        addMouseMotionListener(input);
//        addMouseListener(input);
        initStatusOfSc();
        initSpacecraft();
        this.addMouseListener(new Input(this));

    }

    private void initSpacecraft() {
        this.spacecraft = new Spacecraft(width/2 - 45,height-150,"sosKoNamoosan");
    }
    private void initStatusOfSc() {
        this.statusOfSc = new StatusOfSc(0, width - 50);
    }
    public void initBullet(){
        bullets.add(new Bullet(spacecraft.getX(),spacecraft.getY()));
    }

//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//        g.drawImage(BackGround, 0, 0, width, height, null);
//    }

    @Override
    public void tick() {
        spacecraft.tick();
        for (Bullet bullet : bullets) {
            bullet.tick();
        }
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        statusOfSc.draw(g);
        spacecraft.draw(g);
        for (Bullet bullet : bullets) {
            bullet.draw(g);
            repaint();
        }
        repaint();
    }

    public class StatusOfSc implements Drawable {
        private int x, y,
                tool = 150,
                arz = 50;
        private int widthOgImageIcon = 25,
                    heightOfImageIcon = 25;

//        private BufferedImage health;
//        //    private final static BufferedImage coin = ImageOfGame.getInstance().;
//        private BufferedImage temreature;
//        //    private final static BufferedImage meat = ImageOfGame.getInstance().;
//        private BufferedImage bomb ;
        private Image health;
        //    private final static BufferedImage coin = ImageOfGame.getInstance().;
        private Image temreature;
        //    private final static BufferedImage meat = ImageOfGame.getInstance().;
        private Image bomb ;

        public StatusOfSc(int x, int y) {
            this.x = x;
            this.y = y;
            this.health = ImageOfGame.getInstance().getHeatImage();
            this.temreature = ImageOfGame.getInstance().getTempImage();
            this.bomb = ImageOfGame.getInstance().getBombImage();
        }
        @Override
        public void draw(Graphics g) {
            g.setColor(Color.pink);
            g.fillRect(x, y, tool, arz);

            g.drawImage(health, x, y, widthOgImageIcon, heightOfImageIcon, null);
            String stHealth = String.valueOf(spacecraft.getHealth());
            g.drawString(stHealth,x+widthOgImageIcon,y);

            g.drawImage(bomb,x+2*widthOgImageIcon,y,widthOgImageIcon,heightOfImageIcon,null);
            String stBomb = String.valueOf(spacecraft.getBomb());
            g.drawString(stBomb,x+3*widthOgImageIcon,y);

            g.drawImage(temreature,x+4*widthOgImageIcon,y,widthOgImageIcon,heightOfImageIcon,null);
            String stTemp = String.valueOf(spacecraft.getTemreature());
            g.drawString(stTemp,x+5*widthOgImageIcon,y);

        }

    }
}

