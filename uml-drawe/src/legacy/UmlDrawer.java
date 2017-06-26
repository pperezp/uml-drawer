package legacy;

public class UmlDrawer extends javax.swing.JFrame {
    private Diagrama panelDiagrama;
    private int idActorGenerado, idCasoGenerado;
        
    public UmlDrawer() {
        initComponents();
        
        panelDiagrama = new Diagrama();
        panelDiagrama.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(panelDiagrama);
        panelDiagrama.setDoubleBuffered(true);
        
        idActorGenerado = 1;
        idCasoGenerado = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigo_diagrama = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigo_diagrama.setColumns(20);
        codigo_diagrama.setFont(new java.awt.Font("C059", 0, 24)); // NOI18N
        codigo_diagrama.setRows(5);
        jScrollPane1.setViewportView(codigo_diagrama);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jScrollPane2.setBackground(new java.awt.Color(254, 254, 254));
        jSplitPane1.setRightComponent(jScrollPane2);

        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        panelDiagrama.addActor(new Actor(1,"Actor 1"));

        final int NO_EXISTE = -1;
        
        
        
        String[] lineas = codigo_diagrama.getText().split("\n");
        
        String item1, item2;
        String nomActor, nomCaso;
        
        for(String lin: lineas){
            item1 = lin.split("-")[0];
            item2 = lin.split("-")[1];
            
            if((item1.startsWith("[") && item1.endsWith("]")) &&
               (item2.startsWith("(") && item2.endsWith(")"))){
                // actor y caso de uso
                nomActor = item1.replace("[", "").replace("]", "");
                nomCaso = item2.replace("(", "").replace(")", "");
                
//                System.out.println("Actor: "+ nomActor);
//                System.out.println("Caso: "+ nomCaso);
                
                int idA = panelDiagrama.getIdActor(nomActor);
                int idC = panelDiagrama.getIdCasoDeUso(nomCaso);
                
                if(idA == NO_EXISTE){
                    panelDiagrama.addActor(new Actor(idActorGenerado,nomActor));
                    idA = idActorGenerado;
                    idActorGenerado++;
                }
                
                if(idC == NO_EXISTE){
                    panelDiagrama.addCasoDeUso(new CasoDeUso(idCasoGenerado, nomCaso));
                    idC = idCasoGenerado;
                    idCasoGenerado++;
                }
                
                panelDiagrama.addUnion(new Union(idA, idC));
            }
        }
        
        /*TURBIO: esto lo hago para que se actualice el panel. Aún no logro
        dar con el método. He probado updateui, repaint y nada*/
        this.setBounds(0, 0, this.getWidth()+1, this.getHeight()+1);
        this.setBounds(0, 0, this.getWidth()-1, this.getHeight()-1);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UmlDrawer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea codigo_diagrama;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
