package MyGraphic;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    public MenuPanel(LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
    }

    public MenuPanel(LayoutManager layout) {
        super(layout);
    }

    public MenuPanel(boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }

    public MenuPanel() {
    }
}
