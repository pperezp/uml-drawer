/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import legacy.Diagrama;
import legacy.Union;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import legacy.Actor;
import legacy.CasoDeUso;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author prez
 */
public class TestLinea2D extends javax.swing.JFrame {

    private Diagrama panelDiagrama;

    public TestLinea2D() {
        initComponents();

//        JLabel lblInicio = new JLabel("INICIO");
//        JLabel lblFin = new JLabel("FIN");
//        Linea l1, l2;
//        
//        l1 = new Linea(new Point(10, 10), new Point(50, 50));
//        l2 = new Linea(new Point(60, 60), new Point(200, 200));
//        
//        List<Linea> lineas = new ArrayList<>();
//        lineas.add(l1);
//        lineas.add(l2);
//        Diagrama p = new Diagrama(lineas);


//        List<Actor> acts = new ArrayList<>();
//        List<CasoDeUso> casos = new ArrayList<>();
//        List<Union> uniones = new ArrayList<>();

        panelDiagrama = new Diagrama();
        
        panelDiagrama.addActor(new Actor(1, "Actor 1"));
        panelDiagrama.addActor(new Actor(2, "Actor 2"));
        panelDiagrama.addActor(new Actor(3, "Actor 3"));

        panelDiagrama.addCasoDeUso(new CasoDeUso(1, "caso de uso 1"));
        panelDiagrama.addCasoDeUso(new CasoDeUso(2, "caso de uso 2"));
        panelDiagrama.addCasoDeUso(new CasoDeUso(3, "caso de uso 3"));
        panelDiagrama.addCasoDeUso(new CasoDeUso(3, "caso de uso 4"));
        panelDiagrama.addCasoDeUso(new CasoDeUso(3, "caso de uso 5"));
        
        panelDiagrama.addUnion(new Union(1, 1));
        panelDiagrama.addUnion(new Union(1, 2));
        panelDiagrama.addUnion(new Union(1, 3));
        panelDiagrama.addUnion(new Union(2, 3));
        panelDiagrama.addUnion(new Union(3, 4));
        panelDiagrama.addUnion(new Union(3, 5));

        
        panelDiagrama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//        p.updateUI();

//        p.add(lblInicio, new AbsoluteConstraints(50, 30, -1, -1));
//        p.add(lblFin, new AbsoluteConstraints(300, 60, -1, -1));
        jScrollPane2.setViewportView(panelDiagrama);
//        jScrollPane2.setBackground(Color.red);
        panelDiagrama.setDoubleBuffered(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        panelDiagrama.repaint();
    }//GEN-LAST:event_formComponentResized

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLinea2D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
