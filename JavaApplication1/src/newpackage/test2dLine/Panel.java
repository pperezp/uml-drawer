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
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.BLACK);
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
            pintarActores(g2);
            pintarCasosDeUso(g2);
            pintarLineas(g2);
            System.out.println("COMPONENTS DESPUES: " + this.getComponents().length);
        }
        i++;
//        pintar = false;

    }

    private void pintarActores(Graphics2D g) {

        int cantidadComponentes = actores.size();
        int subir_y, subir_x; // variables para mover el actor
        int posAlto = this.getHeight() / (cantidadComponentes + 1);
        int posAlto_antiguo = posAlto;
        for (Actor a : actores) {
            /*MODIFICAR LOS VALORES DE RESTA Y SUMA PARA MOVER EL ACTOR*/
            subir_y = a.getY()-10;
            subir_x = a.getX()+5;
            /*MODIFICAR LOS VALORES DE RESTA Y SUMA PARA MOVER EL ACTOR*/
            
            this.add(a, new AbsoluteConstraints(50, posAlto, -1, -1));

            /*Dibujando al actor*/
            /*Pies*/
            g.drawLine(subir_x+10, subir_y, subir_x+15, subir_y-10);
            g.drawLine(subir_x+20, subir_y, subir_x+15, subir_y-10);
            /*Pies*/
            
            /*Tronco*/
            g.drawLine(subir_x+15, subir_y-10, subir_x+15, subir_y-25);
            /*Tronco*/
            
            /*Cabeza*/
            g.drawOval(subir_x+7, subir_y-40, 15, 15);
            /*Cabeza*/
            
            /*Brazos*/
            g.drawLine(subir_x+10, subir_y-20, subir_x+15, subir_y-20);
            g.drawLine(subir_x+20, subir_y-20, subir_x+15, subir_y-20);
            /*Brazos*/
            
            /*Dibujando al actor*/
            
            posAlto = posAlto + posAlto_antiguo;
        }
    }

    private void pintarCasosDeUso(Graphics2D g) {
        int cantidadComponentes = casosDeUso.size();

        int posAlto = this.getHeight() / (cantidadComponentes + 1);
        int posAlto_antiguo = posAlto;
        for (CasoDeUso c : casosDeUso) {
            this.add(c, new AbsoluteConstraints(200, posAlto, -1, -1));

            g.setColor(Color.black);
            g.drawOval(c.getX() - 15, c.getY() - 15, c.getWidth() + 30, c.getHeight() + 30);

            /*para pintar el caso de uso, aun no implementados*/
            g.setColor(Color.white);
            g.fillOval(c.getX()-14, c.getY()-14, c.getWidth()+28, c.getHeight()+28);
            /*para pintar el caso de uso, aun no implementados*/
            posAlto = posAlto + posAlto_antiguo;
        }
    }

    private void pintarLineas(Graphics2D g) {

        Actor actor;
        CasoDeUso caso;
        g.setColor(Color.black);

        for (Union u : uniones) {
            actor = actores.get(u.getIdActor() - 1);
            caso = casosDeUso.get(u.getIdCasoDeUso() - 1);

            System.out.println(actor.getText() + " - " + caso.getText());
            
            g.drawLine(
                actor.getX() + (actor.getWidth()),
                actor.getY() -15,
                caso.getX() -15,
                caso.getY() + (caso.getHeight() / 2)
            );

        }
    }
}
