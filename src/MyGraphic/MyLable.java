package MyGraphic;

import javax.swing.*;

public class MyLable extends JLabel {
    public MyLable(String text, Icon icon, int horizontalAlignment) {
        super(text, icon, horizontalAlignment);
    }

    public MyLable(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
    }

    public MyLable(String text) {
        super(text);
    }

    public MyLable(Icon image, int horizontalAlignment) {
        super(image, horizontalAlignment);
    }

    public MyLable(Icon image) {
        super(image);
    }

    public MyLable() {
    }
}
