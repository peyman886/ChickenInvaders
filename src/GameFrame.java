import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    private JPanel contentPanePanel;
    private int width, height;

    GameFrame(int width, int height){
        this.width = width;
        this.height = height;
        init();
    }

    private void init() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        //
        contentPanePanel = new JPanel();
//        int cpPanelWidth, cpPanelHeight;
//        Dimension cpPanelDimension = new Dimension()
        contentPanePanel.setBackground(Color.BLACK);
        contentPanePanel.setLayout(new BoxLayout(contentPanePanel, BoxLayout.PAGE_AXIS));
        setContentPane(contentPanePanel);


    }

}

