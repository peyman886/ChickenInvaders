package MyGraphic;

import javax.swing.*;

public class MyButton extends JButton {
    private static final int myButtonWidth = 100,
            myButtonHeight = 50;
    private int x;
    private int y;

    public void setBounds(int x, int y) {
        this.x = x;
        this.y = y;
        super.setBounds(x, y, myButtonWidth, myButtonHeight);
    }

    public MyButton(String text) {
        super(text);
    }

    public static int getMyButtonWidth() {
        return myButtonWidth;
    }

    public static int getMyButtonHeight() {
        return myButtonHeight;
    }
}
