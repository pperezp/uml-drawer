package legacy;

import javax.swing.JLabel;

public class Actor extends JLabel{
    private int id;

    public Actor(int id, String text) {
        super(text);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
