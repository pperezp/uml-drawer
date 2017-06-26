package test;

import java.awt.Point;

public class Linea {
    private Point inicio;
    private Point fin;

    public Linea(Point inicio, Point fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Point getInicio() {
        return inicio;
    }

    public void setInicio(Point inicio) {
        this.inicio = inicio;
    }

    public Point getFin() {
        return fin;
    }

    public void setFin(Point fin) {
        this.fin = fin;
    }
    
    
}
