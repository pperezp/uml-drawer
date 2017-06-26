package newpackage.test2dLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.List;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private List<Linea> lineas;

    public Panel(List<Linea> lineas) {
        this.lineas = lineas;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);

        Point inicio, fin;
        
        for(Linea l : lineas){
            inicio = l.getInicio();
            fin = l.getFin();
            g2.drawLine(inicio.x, inicio.y, fin.x, fin.y);
        }
        
    }
}
