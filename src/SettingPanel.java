import MyGraphic.MyButton;
import MyGraphic.MyPanel;
import MyGraphic.ImageOfGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class SettingPanel extends MyPanel {
    private MyButton resumeGame;
    private MyButton startNewGame;
    private MyButton ranking;

    private MyButton setting;
    private MyButton exit;
    private MyButton aboutUs;


    private final static BufferedImage BackGround = ImageOfGame.getStImage();

    public SettingPanel() {
        super(BackGround);
        init();

    }
    private void init(){
        resumeGame = new MyButton("ادامه بازی");
        resumeGame.setBounds(width/2 - MyButton.getMyButtonWidth()/2,
                height/2 - MyButton.getMyButtonHeight()/2);
        resumeGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //to do
                //login to game of this user
            }
        });
        this.add(resumeGame);
        startNewGame = new MyButton("شروع بازی جدید");
        startNewGame.setBounds(width/2 - MyButton.getMyButtonWidth()/2 +MyButton.getMyButtonWidth()+margin,
                height/2 - MyButton.getMyButtonHeight()/2 + MyButton.getMyButtonHeight() + margin);
        startNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //to do
                //login to game of this user
            }
        });
        this.add(startNewGame);

        ranking = new MyButton("رتبه بندی");
        ranking.setBounds(width/2 - MyButton.getMyButtonWidth()/2 + 2 * MyButton.getMyButtonWidth()+ 2* margin,
                height/2 - MyButton.getMyButtonHeight()/2 + 2 * MyButton.getMyButtonHeight() + 2* margin);
        ranking.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //to do
                //login to game of this user
            }
        });
        this.add(ranking);

        setting = new MyButton("تنظیمات");
        setting.setBounds(width/2 - MyButton.getMyButtonWidth()/2,
                height - MyButton.getMyButtonHeight()/2 -margin);
        setting.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //to do
                //login to game of this user
            }
        });
        this.add(setting);
        exit = new MyButton("خروج");
        exit.setBounds(margin,
                height - MyButton.getMyButtonHeight()/2 -margin);
        exit.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
        this.add(exit);
        aboutUs = new MyButton("درباره ما");
        aboutUs.setBounds(width-margin,
                height - MyButton.getMyButtonHeight()/2 -margin);
        aboutUs.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //to do
                //login to game of this user
            }
        });
        this.add(aboutUs);


    }



//    private static Image readSettingImageOfFile() {
//        File file = new File("image/chicken-invaders-hd-wallpaper-1280_720.png");
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
//        System.out.println("Read ST_image of file");
//        return image;
//    }
}
