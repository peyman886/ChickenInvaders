package MyGraphic;

import javax.swing.*;

public class MyButton extends JButton {
    public MyButton() {
    }

    public MyButton(Icon icon) {
        super(icon);
    }

    public MyButton(String text) {
        super(text);
    }

    public MyButton(Action a) {
        super(a);
    }

    public MyButton(String text, Icon icon) {
        super(text, icon);
    }
}
