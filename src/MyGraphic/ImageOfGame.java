package MyGraphic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageOfGame {
    private final static BufferedImage [] images = new BufferedImage[2];

    private ImageOfGame() {
        readAndPutImagesInArray(0,"image/menuBG.jpg");
        readAndPutImagesInArray(1,"image/SettingBG.jpg");
    }
    private static void readAndPutImagesInArray (int i,String adress){
        File file = new File(adress);
        BufferedImage image = null;
        try
        {
            image = ImageIO.read(file);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        images[i] = image;
    }

    public static BufferedImage getBGImageOfMenu(){
        return images[0];
    }
    public static BufferedImage getStImage(){
        return images[1];
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
