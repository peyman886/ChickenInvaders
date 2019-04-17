import MyGraphic.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame{
    private int x = 20,
            y = 20,
            width = 1200,
            height = 800;

    public GameFrame(MyPanel contentPanePanel) throws HeadlessException {
        setBounds(x,y,width,height);
        setTitle("CHICKEN INVADERS");
        setResizable(false);
        setLayout(null);
        setContentPane(contentPanePanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
//                saveUsersToFile();
                System.out.println("Closed");
                e.getWindow().dispose();
            }
        });

    }
//    private JPanel contentPanePanel;
//    private int width, height;
//
//
//    GameFrame(int width, int height){
//        this.width = width;
//        this.height = height;
//        init();
//    }
//
//    private void init() {
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
//        //
//        contentPanePanel = new JPanel();
////        int cpPanelWidth, cpPanelHeight;
////        Dimension cpPanelDimension = new Dimension()
//        contentPanePanel.setBackground(Color.BLACK);
//        contentPanePanel.setLayout(new BoxLayout(contentPanePanel, BoxLayout.PAGE_AXIS));
//        setContentPane(contentPanePanel);
//
//
//    }

}

