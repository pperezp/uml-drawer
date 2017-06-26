package newpackage.test2dLine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import legacy.Actor;
import legacy.CasoDeUso;
import legacy.Union;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class Panel extends JPanel {

    private List<Actor> actores;
    private List<CasoDeUso> casosDeUso;
    private List<Union> uniones;

    private boolean pintar;
    private int i;

    public Panel(List<Actor> actores, List<CasoDeUso> casosDeUso, List<Union> uniones) {
        this.actores = actores;
        this.casosDeUso = casosDeUso;
        this.uniones = uniones;

        pintar = true;
        i = 0;
    }

//    private List<Linea> lineas;
//
//    public Panel(List<Linea> lineas) {
//        this.lineas = lineas;
//    }
    @Override
    public void paintComponent(Graphics g) {
        System.out.println("Paint wea [" + i + "]");

        if (pintar) {
            System.out.println("PINTANDO...");

//        Point inicio, fin;
//        
//        for(Linea l : lineas){
//            inicio = l.getInicio();
//            fin = l.getFin();
//            g2.drawLine(inicio.x, inicio.y, fin.x, fin.y);
//        }
//            this.removeAll();
            System.out.println("COMPONENTS: " + this.getComponents().length);
            pintarActores();
            pintarCasosDeUso();
            pintarLineas(g);
            System.out.println("COMPONENTS DESPUES: " + this.getComponents().length);
        }
        i++;
//        pintar = false;

    }

    private void pintarActores() {

        int cantidadComponentes = actores.size();

        int posAlto = this.getHeight() / (cantidadComponentes + 1);
        int posAlto_antiguo = posAlto;
        for (Actor a : actores) {
            this.add(a, new AbsoluteConstraints(50, posAlto, -1, -1));

            posAlto = posAlto + posAlto_antiguo;
        }
    }

    private void pintarCasosDeUso() {
        int cantidadComponentes = casosDeUso.size();

        int posAlto = this.getHeight() / (cantidadComponentes + 1);
        int posAlto_antiguo = posAlto;
        for (CasoDeUso c : casosDeUso) {
            this.add(c, new AbsoluteConstraints(200, posAlto, -1, -1));

            posAlto = posAlto + posAlto_antiguo;
        }
    }

    private void pintarLineas(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);

        Actor a;
        CasoDeUso c;

        for (Union u : uniones) {
            a = actores.get(u.getIdActor() - 1);
            c = casosDeUso.get(u.getIdCasoDeUso() - 1);

            System.out.println(a.getText() + " - " + c.getText());
            g2.drawLine(
                    a.getX() + (a.getWidth()),
                    a.getY() + (a.getHeight() / 2),
                    c.getX(),
                    c.getY() + (c.getHeight() / 2)
            );

        }
    }
}
