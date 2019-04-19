package MyGraphic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageOfGame {

    private static ImageOfGame iamgeOfImage = new ImageOfGame();
    public static ImageOfGame getInstance(){
        return iamgeOfImage;
    }


    private final static BufferedImage [] images = new BufferedImage[7];
    private static Image [] images2;


    private ImageOfGame() {
        images2 = new Image[7];
//        readAndPutImagesInArray(0,"image/menuBG.jpg");
//        readAndPutImagesInArray(1,"image/SettingBG.jpg");
//        readAndPutImagesInArray(2,"image/heart_3.png");
//        readAndPutImagesInArray(3,"image/bomb64.png");
//        readAndPutImagesInArray(4,"image/");
//        readAndPutImagesInArray(5,"image/shot.png");
//        readAndPutImagesInArray(6,"image/spaceship-resized.png");
        readAndPutImagesInArray(0,1200,800,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\menuBG.jpg");
        readAndPutImagesInArray(1,1200,800,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\SettingBG.jpg");
        readAndPutImagesInArray(2,25,25,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\heart_3.png");
        readAndPutImagesInArray(3,25,25,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\bomb64.png");
        readAndPutImagesInArray(4,25,25,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\bomb64.png");
        readAndPutImagesInArray(5,10,10,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\shot.png");
        readAndPutImagesInArray(6,90,145,"C:\\Users\\surface\\Desktop\\coding\\code java\\AP\\ChickenInvaders\\image\\spaceship-resized.png");

//        image = Toolkit.getDefaultToolkit().
//                createImage("C:\\Users\\surface\\Desktop\\coding\\code java\\javaCup\\JavaCupProject\\src\\faraDars\\img\\m.jpg").
//                getScaledInstance(100,100,Image.SCALE_DEFAULT);
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        Graphics2D g2 = (Graphics2D) g ;
//
//        g2.drawImage(image,0,0,new Color(0,0,0,0),null);
//        repaint();
//    }


    }
//    private void readAndPutImagesInArray (int i,String adress){
//        File file = new File(adress);
//        BufferedImage image = null;
//        try
//        {
//            image = ImageIO.read(file);
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        images[i] = image;
//    }

//    public BufferedImage getBackGroundImageOfMenu(){
//        return images[0];
//    }
//    public BufferedImage getSettingImage(){
//        return images[1];
//    }
//    public BufferedImage getHeatImage(){return images[2];}
//    public BufferedImage getBombImage(){return images[3];}
//    public BufferedImage getTempImage(){return images[4];}
//    public BufferedImage getShotImage(){return images[5];}
//    public BufferedImage getSpacecraftImage(){return images[6];}
    public Image getBackGroundImageOfMenu(){
    return images2[0];
}
    public Image getSettingImage(){
        return images2[1];
    }
    public Image getHeatImage(){return images2[2];}
    public Image getBombImage(){return images2[3];}
    public Image getTempImage(){return images2[4];}
    public Image getShotImage(){return images2[5];}
    public Image getSpacecraftImage(){return images2[6];}

    //        image = Toolkit.getDefaultToolkit().
//                createImage("C:\\Users\\surface\\Desktop\\coding\\code java\\javaCup\\JavaCupProject\\src\\faraDars\\img\\m.jpg").
//                getScaledInstance(100,100,Image.SCALE_DEFAULT);
//    }
    private void readAndPutImagesInArray(int i , int toolAks,int arzAks,String adress){
        try {
            Image image = Toolkit.getDefaultToolkit().
                    createImage(adress).getScaledInstance(toolAks,arzAks,Image.SCALE_DEFAULT);
            images2[i] = image;
        }
        catch (Exception e){
            e.printStackTrace();
        }
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
