
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Mauricio
 */
public class Algebra3GUI extends javax.swing.JFrame {
    /**
     * Creates new form Algebra3GUI
     */
    
    
    
    //Arreglos para el uso de los vectores
    private ArrayList<Double> PuntosU;
    private ArrayList<Double> PuntosV;
    private ArrayList<Double> PuntosW;
    private ArrayList<Double> baseU;
    private ArrayList<Double> baseV;
    private ArrayList<Double> baseW;
    
    //Arreglos para la base gris y puntos en R2 
    private ArrayList<Double> baseX;
    private ArrayList<Double> baseY;
    private ArrayList<Double> baseZ;
    private ArrayList<Double> PuntosX;
    private ArrayList<Double> PuntosY;
    private ArrayList<Double> PuntosZ;
    
    //Valor para el uso del angulo
    int valorAngulo=0;
    
    //Objetos para el dibujo de las lineas de los vectores
    private Dibujar dibujoBaseGris;
    private Dibujar dibujoBaseVectores;
    private Dibujar dibujoBaseP;
    
    public Algebra3GUI() {
        initComponents();
        this.setTitle("Transformaciones Lineales en 3D");
        inicializa();        
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
        setResizable(false);

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

    private void cargaInicio(){
        //Genera el dibujo base color gris de la gráfica
        VisualizacionArea.setLayout(new java.awt.BorderLayout());
        //VisualizacionArea.removeAll();
        //VisualizacionArea.add(dibujoBaseGris, BorderLayout.CENTER);
        //VisualizacionArea.validate();
}
             
    private void inicializa(){
        //Inicializa los objetos con los que se va a dibujar
        dibujoBaseGris = new Dibujar();
        dibujoBaseVectores = new Dibujar();
        dibujoBaseP = new Dibujar();
        
        //Modifica los colores a los objetos correspondientes
        dibujoBaseVectores.Color(Color.GREEN);
        dibujoBaseP.Color(Color.BLUE);
        
        //Modifica el largo que debe tener para la correcta visualizacion
        dibujoBaseVectores.setEscalar(30);
        
        //Inicializa las listas a utilizar para calculos posteriores
        PuntosU = new ArrayList<>();
        PuntosV = new ArrayList<>();
        PuntosW = new ArrayList<>();
        baseU = new ArrayList<>();
        baseV = new ArrayList<>();
        baseW = new ArrayList<>();
        baseX = new ArrayList<>();
        baseY = new ArrayList<>();
        baseZ = new ArrayList<>();
        
        //Valores iniciales del dibujo base (R3)
        baseX.add(5.0);
        baseX.add(0.0);
        baseX.add(0.0);
        baseY.add(0.0);
        baseY.add(5.0);
        baseY.add(0.0);
        baseZ.add(0.0);
        baseZ.add(0.0);
        baseZ.add(5.0);
        //Creacion de los puntos en (R2)
        PuntosX = Iso(baseX.get(0), baseX.get(1), baseX.get(2));
        PuntosY = Iso(baseY.get(0), baseY.get(1), baseY.get(2));
        PuntosZ = Iso(baseZ.get(0), baseZ.get(1), baseZ.get(2));
        //Establecer el valor de las coordenadas correspondientes a utilizar
        dibujoBaseGris.setPuntos(PuntosX, PuntosY, PuntosZ);
    }
    
    private ArrayList<Double> Iso(double pPuntoX,double pPuntoY, double pPuntoZ){
        ArrayList<Double> listaPuntos  = new ArrayList<>();
        double valorTemporal;
        valorTemporal = pPuntoY-pPuntoX;
        listaPuntos.add(valorTemporal);
        valorTemporal = (-0.5*(pPuntoX+pPuntoY-2*pPuntoZ));
        listaPuntos.add(valorTemporal);
        return listaPuntos;
    }
    
    private ArrayList<Double> Iso(double pPuntoX,double pPuntoY,double pPuntoZ, double angulo){
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
    
    private void separaVectores(String textoBase[]){
        String baseUString[] = textoBase[0].split(",");
        String baseVString[] = textoBase[1].split(",");
        String baseWString[] = textoBase[2].split(",");
        baseUString[0] = baseUString[0].replace("(", "");
        baseUString[2] = baseUString[2].replace(")", "");
        baseVString[0] = baseVString[0].replace("(", "");
        baseVString[2] = baseVString[2].replace(")", "");
        baseWString[0] = baseWString[0].replace("(", "");
        baseWString[2] = baseWString[2].replace(")", "");
        
        for(int i=0;i<baseUString.length;i++){
        baseW.add(Double.parseDouble(baseWString[i]));
        baseU.add(Double.parseDouble(baseUString[i]));
        baseV.add(Double.parseDouble(baseVString[i]));
        }
    }
    
    private void separaP(String textoP[]){
        
    }
    
    //Vectores de la Base
    private void setValoresISOVectores(){
        PuntosU = Iso(baseU.get(0), baseU.get(1), baseU.get(2));
        PuntosV = Iso(baseV.get(0), baseV.get(1), baseV.get(2));
        PuntosW = Iso(baseW.get(0), baseW.get(1), baseW.get(2));
    }
    
    //Vectores de la base cambio angulo
    private void setValoresISOVectoresCambioAngulo(double angulo){
        baseU = Iso(baseU.get(0), baseU.get(1), baseU.get(2),angulo);
        baseV = Iso(baseV.get(0), baseV.get(1), baseV.get(2),angulo);
        baseW = Iso(baseW.get(0), baseW.get(1), baseW.get(2),angulo);
    }
    
    //Vectores base gris
    private void setVectoresBase(){
        PuntosX = Iso(baseX.get(0), baseX.get(1), baseX.get(2));
        PuntosY = Iso(baseY.get(0), baseY.get(1), baseY.get(2));
        PuntosZ = Iso(baseZ.get(0), baseZ.get(1), baseZ.get(2));
    }
    
    //Vectores base gris cambio angulo
    private void setVectoresBaseCambioAngulo(double angulo){
        baseX=Iso(baseX.get(0), baseX.get(1), baseX.get(2),angulo);
        baseY=Iso(baseY.get(0), baseY.get(1), baseY.get(2),angulo);
        baseZ=Iso(baseZ.get(0), baseZ.get(1), baseZ.get(2),angulo);
    }
    
    
    private void PuntosPTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntosPTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntosPTextActionPerformed

    private void BasePuntosTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasePuntosTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BasePuntosTextActionPerformed

    private void PuntoPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoPButtonActionPerformed
        // TODO add your handling code here:
       cargaInicio();   
    }//GEN-LAST:event_PuntoPButtonActionPerformed

    private void BaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaseButtonActionPerformed
        // TODO add your handling code here:
        String textoBase[];
        textoBase = BasePuntosText.getText().split(";");
        separaVectores(textoBase);
        //Condicion L.I
        setValoresISOVectores();
        dibujoBaseVectores.setPuntos(PuntosU, PuntosV, PuntosW);
        VisualizacionArea.add(dibujoBaseVectores, BorderLayout.CENTER);
        VisualizacionArea.validate();
    }//GEN-LAST:event_BaseButtonActionPerformed

    private void CambioPuntosZScrollAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_CambioPuntosZScrollAdjustmentValueChanged

        //Obtiene el valor actual del scroll
        int temporal = CambioPuntosZScroll.getValue();
        
        //Valida si el valor actual es menor que el valor anterior 
        if (temporal > valorAngulo) {
            //Giro en sentido del reloj
            //Se actualiza el valor del angulo 
            valorAngulo = CambioPuntosZScroll.getValue();
            
            //Genera los valores de la Rotacion
            //setVectoresBaseCambioAngulo(valorAngulo);
            setValoresISOVectoresCambioAngulo(valorAngulo);
            
        }else{
            //Giro en contra del sentido del reloj
            //Se actualiza el valor de la Rotacion
            valorAngulo = CambioPuntosZScroll.getValue();
            
            //Genera los valores de la Rotacion
            //setVectoresBaseCambioAngulo(-valorAngulo);
            setValoresISOVectoresCambioAngulo(-valorAngulo);
        }
        
        //Genera los valores de las coordenas X,Y correspondientes
        //setVectoresBase();
        setValoresISOVectores();
        
        //Actualiza los puntos a dibujar
        dibujoBaseVectores.setPuntos(PuntosU, PuntosV, PuntosW);
        //dibujoBaseGris.setPuntos(PuntosX, PuntosY, PuntosZ);
        //dibujoBaseGris.repaint();
        dibujoBaseVectores.repaint();
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
