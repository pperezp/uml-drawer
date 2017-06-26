package legacy;

import javax.swing.JLabel;

public class CasoDeUso extends JLabel{
    private int id;

    public CasoDeUso(int id, String text) {
        super(text);
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
}
