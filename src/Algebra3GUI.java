
import java.awt.BorderLayout;
import java.util.ArrayList;

/**
 *
 * @author Mauricio
 */
public class Algebra3GUI extends javax.swing.JFrame {
    /**
     * Creates new form Algebra3GUI
     */
    
    private ArrayList<Double> PuntosU;
    private ArrayList<Double> PuntosV;
    private ArrayList<Double> PuntosW;
    private ArrayList<Double> baseU;
    private ArrayList<Double> baseV;
    private ArrayList<Double> baseW;
    
    private Dibujar dibujoBaseGris;
    
    public Algebra3GUI() {
        initComponents();
        this.setTitle("Transformaciones Lineales en 3D");
        dibujoBaseGris = new Dibujar();
        
        PuntosU = new ArrayList<>();
        PuntosV = new ArrayList<>();
        PuntosW = new ArrayList<>();
        baseU = new ArrayList<>();
        baseV = new ArrayList<>();
        baseW = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CambioPuntosZScroll = new javax.swing.JScrollBar();
        EtiquetaEje = new javax.swing.JLabel();
        PuntosPText = new javax.swing.JTextField();
        etiquetaP = new javax.swing.JLabel();
        etiquetaBase = new javax.swing.JLabel();
        BasePuntosText = new javax.swing.JTextField();
        PuntoPButton = new javax.swing.JButton();
        BaseButton = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        NombreLabel2 = new javax.swing.JLabel();
        VisualizacionArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CambioPuntosZScroll.setForeground(new java.awt.Color(51, 153, 0));
        CambioPuntosZScroll.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        CambioPuntosZScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CambioPuntosZScroll.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                CambioPuntosZScrollAdjustmentValueChanged(evt);
            }
        });

        EtiquetaEje.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        EtiquetaEje.setForeground(new java.awt.Color(51, 153, 0));
        EtiquetaEje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaEje.setText("Rotación Eje Z");

        PuntosPText.setText("(X,Y,Z)");
        PuntosPText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntosPTextActionPerformed(evt);
            }
        });

        etiquetaP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaP.setForeground(new java.awt.Color(0, 153, 0));
        etiquetaP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaP.setLabelFor(PuntosPText);
        etiquetaP.setText("P= ");

        etiquetaBase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaBase.setForeground(new java.awt.Color(0, 153, 0));
        etiquetaBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaBase.setText("Base B=");

        BasePuntosText.setText("(U;V;W)");
        BasePuntosText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasePuntosTextActionPerformed(evt);
            }
        });

        PuntoPButton.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        PuntoPButton.setForeground(new java.awt.Color(0, 153, 0));
        PuntoPButton.setText("Carga Punto");
        PuntoPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoPButtonActionPerformed(evt);
            }
        });

        BaseButton.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        BaseButton.setForeground(new java.awt.Color(0, 153, 0));
        BaseButton.setText("Carga Base");
        BaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaseButtonActionPerformed(evt);
            }
        });

        NombreLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 20)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(51, 0, 255));
        NombreLabel.setText("Trasformaciones ");

        NombreLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        NombreLabel2.setForeground(new java.awt.Color(51, 0, 255));
        NombreLabel2.setText("Lineales");

        VisualizacionArea.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout VisualizacionAreaLayout = new javax.swing.GroupLayout(VisualizacionArea);
        VisualizacionArea.setLayout(VisualizacionAreaLayout);
        VisualizacionAreaLayout.setHorizontalGroup(
            VisualizacionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        VisualizacionAreaLayout.setVerticalGroup(
            VisualizacionAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaBase)
                                    .addComponent(etiquetaP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PuntosPText)
                                    .addComponent(BasePuntosText, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PuntoPButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(NombreLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BaseButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(NombreLabel2)
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(EtiquetaEje, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CambioPuntosZScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VisualizacionArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PuntosPText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PuntoPButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaBase, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BasePuntosText, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(BaseButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(NombreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NombreLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VisualizacionArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CambioPuntosZScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaEje))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<Double> Iso(double pPuntoX,double pPuntoY, double pPuntoZ){
        ArrayList<Double> listaPuntos  = new ArrayList<>();
        double valorTemporal;
        valorTemporal = pPuntoY-pPuntoX;
        listaPuntos.add(valorTemporal);
        valorTemporal = (-0.5*(pPuntoX+pPuntoY-2*pPuntoZ));
        listaPuntos.add(valorTemporal);
        return listaPuntos;
    }
    
    private ArrayList<Double> Iso(int pPuntoX,double pPuntoY,double pPuntoZ, double angulo){
        ArrayList<Double> listaPuntos = new ArrayList<>();
        double xRota = (Math.cos(Math.toRadians(angulo))*pPuntoX)+
                (-1*Math.sin(Math.toRadians(angulo))*pPuntoY);
        double yRota = (Math.sin(Math.toRadians(angulo))*pPuntoX)+
                (Math.cos(Math.toRadians(angulo))*pPuntoY);
        listaPuntos.add(xRota);
        listaPuntos.add(yRota);
        listaPuntos.add(pPuntoZ);
        return listaPuntos;
    }
    
    private boolean isLI(ArrayList<Integer> pbaseU,ArrayList<Integer> pbaseV,ArrayList<Integer> pbaseW){
        return true;
    }
    
    private void PuntosPTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntosPTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntosPTextActionPerformed

    private void BasePuntosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasePuntosTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BasePuntosTextActionPerformed

    private void PuntoPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoPButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Double> PuntosU = new ArrayList<>();
        ArrayList<Double> PuntosV = new ArrayList<>();
        ArrayList<Double> PuntosW = new ArrayList<>();
        PuntosU.add(185.0);
        PuntosU.add(250.0);
        PuntosV.add(445.0);
        PuntosV.add(250.0);
        PuntosW.add(315.0);
        PuntosW.add(50.0);
        dibujo.setPuntos(PuntosU, PuntosV, PuntosW);
        VisualizacionArea.setLayout(new java.awt.BorderLayout());
        VisualizacionArea.add(dibujo, BorderLayout.CENTER);
        VisualizacionArea.validate();
        
        
    }//GEN-LAST:event_PuntoPButtonActionPerformed

    private void BaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseButtonActionPerformed
        // TODO add your handling code here:
        String textoBase[];
        String baseUString[];
        String baseVString[];
        String baseWString[];
        textoBase = BasePuntosText.getText().split(";");
        baseUString = textoBase[0].split(",");
        baseVString = textoBase[1].split(",");
        baseWString = textoBase[2].split(",");
        baseUString[0] = baseUString[0].replace("(", "");
        baseUString[2] = baseUString[2].replace(")", "");
        baseVString[0] = baseVString[0].replace("(", "");
        baseVString[2] = baseVString[2].replace(")", "");
        baseWString[0] = baseWString[0].replace("(", "");
        baseWString[2] = baseWString[2].replace(")", "");
        BasePuntosText.setText(baseUString[0]);
        
    }//GEN-LAST:event_BaseButtonActionPerformed

    private void CambioPuntosZScrollAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_CambioPuntosZScrollAdjustmentValueChanged
        // TODO add your handling code here:
        BasePuntosText.setText(Integer.toString(CambioPuntosZScroll.getValue()));
        dibujo.rota(CambioPuntosZScroll.getValue());
    }//GEN-LAST:event_CambioPuntosZScrollAdjustmentValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Algebra3GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Algebra3GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Algebra3GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Algebra3GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Algebra3GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaseButton;
    private javax.swing.JTextField BasePuntosText;
    private javax.swing.JScrollBar CambioPuntosZScroll;
    private javax.swing.JLabel EtiquetaEje;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel NombreLabel2;
    private javax.swing.JButton PuntoPButton;
    private javax.swing.JTextField PuntosPText;
    private javax.swing.JPanel VisualizacionArea;
    private javax.swing.JLabel etiquetaBase;
    private javax.swing.JLabel etiquetaP;
    // End of variables declaration//GEN-END:variables
}
