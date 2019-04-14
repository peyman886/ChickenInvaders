import MyGraphic.MyButton;
import MyGraphic.MyLable;
import MyGraphic.MenuPanel;
import MyGraphic.MyList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu extends JFrame {
    private int x = 20,
            y = 20,
            width = 1200,
            height = 800,
            margin = 10;

    private int userlableWith = 100,
                userlableheight = 50;

    private int userlistWith = 200,
                userlistHeight = 400;

    private int myButtonWith = 100,
                myButtonHeight = 50;

    MenuPanel menuPanel;
    MyLable usersLabel;

    JList userList;
    ArrayList<String> usersName = new ArrayList<>();

    MyButton loginButton;
    MyButton addUserButton;
    MyButton removeUserButton;





    public Menu() {
        setBounds(x,y,width,height);
        setTitle("CHICKEN INVADERS");
        setResizable(false);
        setLayout(null);
        init();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void init() {
//        Image background = Toolkit.getDefaultToolkit().createImage
//                ("image/chicken-invaders-hd-wallpaper-0.jpg");
        menuPanel = new MenuPanel();
        menuPanel.setBounds(0, 0, width, height);
        menuPanel.setLayout(null);

        BufferedImage image = null;
        try {
            image = ImageIO.read
                    (new File("image/chicken-invaders-hd-wallpaper-0.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyLable backgroundImage = new MyLable(new ImageIcon(image));
        menuPanel.add(backgroundImage);
        setContentPane(menuPanel);

        usersLabel = new MyLable("کاربران");
        usersLabel.setBounds(width/2 -userlableWith/8 , margin, userlableWith,userlableheight);
//        usersLabel.setFont(new Font());
        menuPanel.add(usersLabel);
        userList = new MyList();
        loadToMyList();
        userList.setBounds(width/2-userlistWith/2,usersLabel.getY() + usersLabel.getHeight() + margin,
                userlistWith,
                userlistHeight);

        menuPanel.add(userList);
        loginButton = new MyButton("ورود");
        loginButton.setBounds(width/6 - myButtonWith/2,height-margin-100,myButtonWith,myButtonHeight);

        menuPanel.add(loginButton);
        removeUserButton = new MyButton("حذف کاربر");
        removeUserButton.setBounds(width/2 - myButtonWith/2,height-margin-100,myButtonWith,myButtonHeight);

        menuPanel.add(removeUserButton);
        addUserButton = new MyButton("افزودن کاربر");
        addUserButton.setBounds(5 * (width/6) - myButtonWith/2,height-margin -100,myButtonWith,myButtonHeight);
        menuPanel.add(addUserButton);
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usersName.add(getNewNamePlayer());
                userList.setListData(usersName.toArray());
            }
        });

    }
    private void loadToMyList(){
        JSONObject data = null;
        try {
            data = (JSONObject) new JSONParser().parse(new FileReader("data/game.data"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        JSONArray namesOfPlayers = (JSONArray) data.get("Names");
//        ArrayList<String> usersName = new ArrayList<>();
        for (int i = 0; i < namesOfPlayers.size(); i++) {
            usersName.add(namesOfPlayers.get(i).toString());
        }
        userList.setListData(usersName.toArray());
    }
    private String getNewNamePlayer(){
        String nameOfNewUser = JOptionPane.showInputDialog(null,
                "please enter your name");
        return nameOfNewUser;
    }

}
