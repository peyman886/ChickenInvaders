package MyGraphic;

import javax.swing.*;
import java.util.Vector;

public class MyList extends JList {
    public MyList(ListModel dataModel) {
        super(dataModel);
    }

    public MyList(Object[] listData) {
        super(listData);
    }

    public MyList(Vector listData) {
        super(listData);
    }

    public MyList() {
    }
}
