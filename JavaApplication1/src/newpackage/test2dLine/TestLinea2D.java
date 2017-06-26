/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.test2dLine;

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

    private Panel p;

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
//        Panel p = new Panel(lineas);
        List<Actor> acts = new ArrayList<>();
        List<CasoDeUso> casos = new ArrayList<>();
        List<Union> uniones = new ArrayList<>();

        acts.add(new Actor(1, "Actor 1"));
        acts.add(new Actor(2, "Actor 2"));
        acts.add(new Actor(3, "Actor 3"));

        casos.add(new CasoDeUso(1, "caso de uso 1"));
        casos.add(new CasoDeUso(2, "caso de uso 2"));
        casos.add(new CasoDeUso(3, "caso de uso 3"));
        casos.add(new CasoDeUso(3, "caso de uso 4"));
        casos.add(new CasoDeUso(3, "caso de uso 5"));
        
        uniones.add(new Union(1, 1));
        uniones.add(new Union(1, 2));
        uniones.add(new Union(1, 3));
        uniones.add(new Union(2, 3));
        uniones.add(new Union(3, 4));
        uniones.add(new Union(3, 5));

        p = new Panel(acts, casos, uniones);
        p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
//        p.updateUI();

//        p.add(lblInicio, new AbsoluteConstraints(50, 30, -1, -1));
//        p.add(lblFin, new AbsoluteConstraints(300, 60, -1, -1));
        jScrollPane1.setViewportView(p);
        p.setDoubleBuffered(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        p.repaint();
    }//GEN-LAST:event_formComponentResized

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLinea2D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
