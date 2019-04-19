import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

public class Input implements MouseInputListener {
    GamePanel gamePanel;

    public Input(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        gamePanel.initBullet();
        gamePanel.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        while (true) {
            gamePanel.initBullet();
            gamePanel.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        gamePanel.spacecraft.setX(e.getX());
        gamePanel.spacecraft.setY(e.getY());
        gamePanel.repaint();

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}