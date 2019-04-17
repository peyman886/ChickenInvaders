import MyGraphic.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileReader;
import java.util.ArrayList;

public class MenuPanel extends MyPanel {
//    private int x = 20,
//            y = 20,
//            width = 1200,
//            height = 800,
//            margin = 10;

    private int userlableWidth = 100,
                userlableheight = 50;

    private int userlistWidth = 200,
                userlistHeight = 400;

//    private int myButtonWidth = 100,
//                myButtonHeight = 50;
//    private MyPanel menuPanel;
    private MyLable usersLabel;

    private JList userList;
    private ArrayList<String> usersName = new ArrayList<>();

    private MyButton loginButton;
    private SettingPanel settingPanel;
    private MyButton addUserButton;
    private MyButton removeUserButton;

    private final static BufferedImage BackGround = ImageOfGame.getBGImageOfMenu();

    public MenuPanel() {
        super(BackGround);
        init();
    }


    //    public Menu(Image image) {
//        super(BackGround);
//        setBounds(x,y,width,height);
//        setTitle("CHICKEN INVADERS");
//        setResizable(false);
//        setLayout(null);
//        init();
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        addWindowListener(new WindowAdapter()
//        {
//            @Override
//            public void windowClosing(WindowEvent e)
//            {
////                saveUsersToFile();
//                System.out.println("Closed");
//                e.getWindow().dispose();
//            }
//        });
//    }

    private void init() {
//        Image background = Toolkit.getDefaultToolkit().createImage
//                ("image/chicken-invaders-hd-wallpaper-0.jpg");
//        setBounds(0, 0, width, height);
//        setLayout(null);
//        MyLable backgroundImage = new MyLable(new ImageIcon(image));
//        menuPanel.add(backgroundImage);
//        setContentPane(menuPanel);
        usersLabel = new MyLable("کاربران");
        usersLabel.setBounds(width/2 - userlableWidth /8 , margin, userlableWidth,userlableheight);
//        usersLabel.setFont(new Font());
        this.add(usersLabel);
        userList = new MyList();
        loadToMyList();
        userList.setBounds(width/2- userlistWidth /2,usersLabel.getY() + usersLabel.getHeight() + margin,
                userlistWidth,
                userlistHeight);

        this.add(userList);
        loginButton = new MyButton("ورود");
        loginButton.setBounds(width/6 - MyButton.getMyButtonWidth() /2,height-margin-100);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                settingPanel = new SettingPanel();
                Game.getInstance().setGamePanel(settingPanel);
                System.out.println("ajab");
                //to do
                //login to game of this user

            }
        });
        this.add(loginButton);
        removeUserButton = new MyButton("حذف کاربر");
        removeUserButton.setBounds(width/2 - MyButton.getMyButtonWidth() /2,height-margin-100);
        removeUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    removeUser();
                    userList.setListData(usersName.toArray());
                }
                catch (Exception exception){

                }

            }
        });
        this.add(removeUserButton);
        addUserButton = new MyButton("افزودن کاربر");
        addUserButton.setBounds(5 * (width/6) - MyButton.getMyButtonWidth() /2,height-margin -100);
        this.add(addUserButton);
        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addUser();
            }
        });

    }

//    private static Image readBackGroundImageOfFile() {
//        File file = new File("image/chicken-invaders-hd-wallpaper-0.jpg");
//        BufferedImage image = null;
//        try
//        {
//            image = ImageIO.read(file);
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//
//        System.out.println("Read BG_image of file");
//        return image;
//    }


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
        System.out.println("Load of list");
    }

//    private void saveUsersToFile() {
//        JSONObject data = new JSONObject();
//        JSONArray jsonArray = new JSONArray();
//        String json;
//        try {
//            data.writeJSONString(new FileWriter("data/game.data"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    private void addUser(){
        usersName.add(getNewNamePlayer());
        userList.setListData(usersName.toArray());

        System.out.println("Add new user");

    }
    private String getNewNamePlayer(){
        String nameOfNewUser = JOptionPane.showInputDialog(null,
                "please enter your name");
        return nameOfNewUser;
    }
    private void removeUser(){
        int i = userList.getSelectedIndex();
        usersName.remove(i);
//        DefaultListModel model = (DefaultListModel) userList.getModel();
//        int selectedIndex = userList.getSelectedIndex();
//        if (selectedIndex != -1) {
//            model.remove(selectedIndex);
//        }
        System.out.println("Remove a user");

    }

}
