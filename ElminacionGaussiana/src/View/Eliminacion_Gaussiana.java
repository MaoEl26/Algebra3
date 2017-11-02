package View;
import java.util.*;
import javax.swing.*;
import Controller.Matriz;
import calculations.*;
import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Silvia Calderón Navarro
 */
public class Eliminacion_Gaussiana extends javax.swing.JFrame {
    private javax.swing.JLabel jLabel5;
    List<JTextField> TFmatrix = new ArrayList<JTextField>();
    List<Integer> matrizPos = new ArrayList<Integer>();
    Matriz matriz;
    List<Matriz> matrices = new ArrayList<Matriz>();
    List<String> operaciones = new ArrayList<String>();
    String operacion;
    
    final String instrucciones = "Eliminación Gaussiana:\n\n"
            + "Las entradas de la Matriz\nsólo pueden ser enteros\no fracciones. Por ejemplo:"
            + "\n1/3,-4/5,3.\n\n"
            + "Ejemplos de Operaciones:\n\n"
            + "Se modifica la 1ra fila digitada:\n"
            + "> f2, f3 o f1,3 (permuta filas)\n"
            + "> 2f1 o 2F1 o 2*F1 [enter]\n"
            + "> 2/3 f2 - 3f3 [enter]";
    int filas = 2;
    int columnas = 2;
    
    public Eliminacion_Gaussiana() {        
        initComponents();        
        matrizCreate();
        matrizVisible(false);
        jButton4.setVisible(false);
        jTextField1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jTextArea1.setText(instrucciones);
        jScrollPane2.setVisible(false);
        jTextArea2.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminacion Gaussiana");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminación Gaussiana");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 40, 290, 29);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Elija el tamaño de la matriz:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 200, 15);

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(90, 140, 40, 19);

        jComboBox2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(200, 140, 40, 19);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("X");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 140, 10, 14);

        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 140, 110, 21);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 190, 110, 30);

        jButton2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton2.setText("Aplicar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 230, 110, 21);

        jButton3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton3.setText("Deshacer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(310, 260, 110, 21);

        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextArea1.setEnabled(false);
        jTextArea1.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 110, 210, 300);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(90, 190, 30, 19);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(120, 190, 30, 19);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(150, 190, 30, 19);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 190, 30, 19);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 190, 30, 19);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(90, 210, 30, 19);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(120, 210, 30, 19);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(150, 210, 30, 19);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(180, 210, 30, 19);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField11);
        jTextField11.setBounds(210, 210, 30, 19);

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField12);
        jTextField12.setBounds(90, 230, 30, 19);

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField13);
        jTextField13.setBounds(120, 230, 30, 19);

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField14);
        jTextField14.setBounds(150, 230, 30, 19);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField15);
        jTextField15.setBounds(180, 230, 30, 19);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField16);
        jTextField16.setBounds(210, 270, 30, 19);

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField17);
        jTextField17.setBounds(90, 250, 30, 19);
        jTextField17.setVisible(false);

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField18);
        jTextField18.setBounds(120, 250, 30, 19);

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField19);
        jTextField19.setBounds(150, 250, 30, 19);
        jTextField19.setVisible(false);

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField20);
        jTextField20.setBounds(180, 250, 30, 19);

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField21);
        jTextField21.setBounds(210, 250, 30, 19);

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField22);
        jTextField22.setBounds(90, 270, 30, 19);
        jTextField22.setVisible(false);

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField23);
        jTextField23.setBounds(120, 270, 30, 19);

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField24);
        jTextField24.setBounds(150, 270, 30, 19);

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField25);
        jTextField25.setBounds(180, 270, 30, 19);
        jTextField25.setVisible(false);

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField26.setMinimumSize(new java.awt.Dimension(5, 19));
        jTextField26.setPreferredSize(new java.awt.Dimension(5, 19));
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField26);
        jTextField26.setBounds(210, 230, 30, 19);

        jButton4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton4.setText("Reiniciar");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(310, 140, 110, 23);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(80, 190, 166, 96);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/folder/Fondo.png"))); // NOI18N
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 500);

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Reiniciar el programa 
    private void reiniciar(){
        matrizVisible(false);  
        jButton1.setVisible(true);
        jButton4.setVisible(false); 
        jTextField1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        matrizPos.clear();
        jTextArea1.setText(instrucciones);
        jScrollPane2.setVisible(false);
        matrices.clear();
        operaciones.clear();
        jTextField1.setText("");
       for (int i=0; i<25; i++)
            TFmatrix.get(i).setText("");
    }
    
    //Crea la lista de textfields
    private void matrizCreate(){        
        TFmatrix.add(jTextField2);
        TFmatrix.add(jTextField3);
        TFmatrix.add(jTextField4); 
        TFmatrix.add(jTextField5);
        TFmatrix.add(jTextField6);
        TFmatrix.add(jTextField7);
        TFmatrix.add(jTextField8);
        TFmatrix.add(jTextField9); 
        TFmatrix.add(jTextField10);
        TFmatrix.add(jTextField11);
        TFmatrix.add(jTextField12);
        TFmatrix.add(jTextField13);
        TFmatrix.add(jTextField14); 
        TFmatrix.add(jTextField15);
        TFmatrix.add(jTextField16);
        TFmatrix.add(jTextField17);
        TFmatrix.add(jTextField18);
        TFmatrix.add(jTextField19); 
        TFmatrix.add(jTextField20);
        TFmatrix.add(jTextField21);
        TFmatrix.add(jTextField22);
        TFmatrix.add(jTextField23);
        TFmatrix.add(jTextField24); 
        TFmatrix.add(jTextField25);
        TFmatrix.add(jTextField26);
    }
    
    //Cambia el estado de visibilidad de todas las label
    private void matrizVisible(boolean estado){
        for (int i=0; i<25; i++)
            TFmatrix.get(i).setVisible(estado);
    }
    
    //Cambia el estado de habilitación de todas las label
    private void matrizEnabled(boolean estado){
        for (int i=0; i<25; i++)
            TFmatrix.get(i).setEnabled(estado); 
    }
    
    //Cambia el estado de habilitación de las label según el tamaño elegido
    private void matrizEnabledMN(int m, int n){
        matrizPos.clear();
        int fila = 0;
        for (int i=0; i<m; i++){
            fila = i*5;            
            for (int j=0; j<n; j++){
                TFmatrix.get(fila+j).setEnabled(true); 
                TFmatrix.get(fila+j).setVisible(true); 
                matrizPos.add(fila+j);
            }
        }            
    }
    
    //Muestra las operaciones realizadas en la matriz
    private void mostrarMatrices(){
        jTextArea1.setText("");
        jTextArea1.setText("Matriz original:\n"+matrices.get(0).mostrarMatriz());
        for (int i=1; i < matrices.size(); i++){
            jTextArea1.setText(jTextArea1.getText()+ "\nOp: " +operaciones.get(i-1)+"\n"+matrices.get(i).mostrarMatriz());
        }
        jTextArea2.setText(matrices.get(matrices.size()-1).mostrarMatriz());
    }
    
    //Verifica que la matriz no esté vacía
    private boolean matrizVerify(){
        for (int i=0; i < matrizPos.size(); i++){
            if(TFmatrix.get(matrizPos.get(i)).getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Rellene todos los campos de la matriz");
                return false;    
            }            
        }
        return true;
    }
    
    //Verifica el tipo de operacion
    private boolean operacionTipo(){
        String fila;
        String tipo;
        List<String> operacionLista = new ArrayList<String>();
        List<String> escalaresLista = new ArrayList<String>();
        
        operacion = jTextField1.getText();
        
        if(operacion.indexOf("F", 0) == -1)
            fila = "f";   
        else
            fila = "F";
        if(operacion.indexOf(",", 0) != -1 || operacion.indexOf(";", 0) != -1){
            if(operacion.indexOf(",", 0) != -1)
                tipo = ","; 
            else
                tipo = ";";
            int i = 0;
            int contador = 0;
            int start, end;
            start = end = 0;
            while (true) {
                int found = operacion.indexOf(fila, i);
                if (found == -1){
                    if(contador == 1){
                        operacionLista.add(operacion.substring(end+1, operacion.length()));
                    }
                    break;
                }
                start = found+1;
                if(contador==0){
                    end = operacion.indexOf(tipo, start);
                }
                else
                {
                    operacionLista.add(operacion.substring(found+1, operacion.length()));
                    break;
                }
                if (end ==-1) break;
                operacionLista.add(operacion.substring(start, end));
                i = end; 
                contador++;
            }
            for (int j=0; j<operacionLista.size(); j++)
                System.out.println(operacionLista.get(j));
        }
        else{
            if(operacion.indexOf("+", 0) != -1){
                tipo = "+";
                int i = 0;
                int contador = 0;
                int start, end, found;
                start = end = found = 0;
                while (true) {
                    found = operacion.indexOf(fila, i);                                                        
                    if (found == -1){
                        if(contador == 1){
                            operacionLista.add(operacion.substring(end+1, operacion.length()));
                        }
                        break;
                    }
                    if(contador == 0){
                        if(found==0)
                            escalaresLista.add("1");
                        else
                            escalaresLista.add(operacion.substring(0, found));
                    }else{
                        if(start == end)
                            escalaresLista.add("1");
                        else
                            escalaresLista.add(operacion.substring(end+1, found));
                    } 
                    
                    start = found+1;
                    
                    if(contador==0){
                        end = operacion.indexOf(tipo, start);
                    }
                    else
                    {
                        operacionLista.add(operacion.substring(found+1, operacion.length()));
                        break;
                    }
                     
                    if (end ==-1) break;
                    operacionLista.add(operacion.substring(start, end));
                    i = end; 
                    contador++;
                }
                System.out.println("Filas: ");
                for (int j=0; j<operacionLista.size(); j++)
                    System.out.println(operacionLista.get(j));
                System.out.println("Escalares size: "+escalaresLista.size());
                for (int j=0; j<escalaresLista.size(); j++)
                    System.out.println(escalaresLista.get(j));
            }                           
            else{
                tipo = "nulo";
                int i = 0;
                int contador = 0;
                int start, end, found;
                start = end = found = 0;
                found = operacion.indexOf(fila, 0);                                                                    
                if(found==0)
                    escalaresLista.add("1");
                else
                    escalaresLista.add(operacion.substring(0, found));                   
                operacionLista.add(operacion.substring(found+1, operacion.length()));
                
                System.out.println("Filas: ");
                for (int j=0; j<operacionLista.size(); j++)
                    System.out.println(operacionLista.get(j));
                System.out.println("Escalares size: "+escalaresLista.size());
                for (int j=0; j<escalaresLista.size(); j++)
                    System.out.println(escalaresLista.get(j));
            }            
        }  
        for (int j=0; j<escalaresLista.size(); j++)
            escalaresLista.set(j, escalaresLista.get(j).replaceAll("\\*",""));
        System.out.println("Filas: ");
        for (int j=0; j<operacionLista.size(); j++)
            System.out.println(operacionLista.get(j));
        System.out.println("Escalares size: "+escalaresLista.size());
        for (int j=0; j<escalaresLista.size(); j++)
            System.out.println(escalaresLista.get(j));
                
        if(tipo == "," ||tipo == ";"){
            System.out.println("Cambio de filas");
            int fila1, fila2;
            try{
                fila1 = Integer.parseInt(operacionLista.get(0));
                fila2 = Integer.parseInt(operacionLista.get(1));
                if(fila1>filas || fila2>filas || fila1<1 || fila2<1){
                    JOptionPane.showMessageDialog(null, "Entrada no válida");
                    return false;
                }                    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida");
                return false;
            }
            matrices.get(matrices.size()-1).intercambiarFilas(fila1-1, fila2-1);
            return true;
        }
        
        if(tipo == "+"){
            System.out.println("Suma de filas");
            int fila1, fila2;
            int[] escalar1, escalar2;
            try{
                fila1 = Integer.parseInt(operacionLista.get(0));
                fila2 = Integer.parseInt(operacionLista.get(1));
                escalar1 = converter(escalaresLista.get(0));
                escalar2 = converter(escalaresLista.get(1));
                if(fila1>filas || fila2>filas || fila1<1 || fila2<1){
                    JOptionPane.showMessageDialog(null, "Entrada no válida");
                    return false;
                }                    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida");
                return false;
            }
            matrices.get(matrices.size()-1).multiplicarSumarFilas(fila1-1, fila2-1, new Rational(escalar1[0], escalar1[1]), new Rational(escalar2[0], escalar2[1]));
            return true;
        }
        
        if(tipo == "nulo"){
            System.out.println("Multiplicación fila");
            int fila1;
            int[] escalar1;
            try{
                fila1 = Integer.parseInt(operacionLista.get(0));
                escalar1 = converter(escalaresLista.get(0));
                if(fila1>filas || fila1<1){
                    JOptionPane.showMessageDialog(null, "Entrada no válida");
                    return false;
                }                    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida");
                return false;
            }
            matrices.get(matrices.size()-1).multiplicarFilaPorEscalar(fila1-1, new Rational(escalar1[0], escalar1[1]));
            return true;
        }
        return true;
    }
    
    //Verifica que la operación no esté vacía
    private boolean operacionVerify(){        
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduzca una operación correcta");
            return false; 
        }        
        return true;
    }
    
    //Convertidor a racional
    private int[] converter(String num){        
        int[] lista = new int[2];
        String[] listaS = new String[2];
        listaS = num.split("\\/");
        try{
            for (int i = 0; i<listaS.length; i++)
                lista[i] = Integer.parseInt(listaS[i]);
            if(listaS.length==1)
                lista[1]=1;
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada no válida");
        }
        return lista;
    }
    
    //Crea la matriz real apartir de los valores capturados en pantalla
    private void matrizFilling(){    
        if (operacionVerify()){
            if(matrices.size() == 0)
            {
                matrices.add(new Matriz(filas, columnas));    
                int contador = 0;
                for (int i=0; i < filas; i++){
                    for (int j=0; j < columnas; j++){ 
                        int[] lista = new int[2];
                        lista = converter(TFmatrix.get(matrizPos.get(contador)).getText());                         
                        if(lista[1] == 0)
                            lista[1] = 1;
                        matrices.get(matrices.size()-1).insertarElemento(i, j, new Rational(lista[0], lista[1]));                        
                        contador ++;
                    }
                }
                matrizVisible(false); 
                jScrollPane2.setVisible(true);
            }
            operaciones.add(jTextField1.getText());
            Matriz temp = matrices.get(matrices.size()-1).copiaMatriz(new Matriz(filas, columnas));
            matrices.add(temp);            
            if(!operacionTipo())
                deshacerOperacion();
            mostrarMatrices();
            jTextField1.setText("");
        }
    }
    
    //Deshacer la última operación
    private void deshacerOperacion(){
        if(matrices.size() > 1){
            operaciones.remove(operaciones.size()-1);
            matrices.remove(matrices.size()-1);
            mostrarMatrices();
        }
        else
            JOptionPane.showMessageDialog(null, "No hay operaciones para deshacer");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        filas = Integer.parseInt(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));        
        columnas = Integer.parseInt(jComboBox2.getItemAt(jComboBox2.getSelectedIndex()));
        System.out.print(filas +", "+ columnas);
        matrizVisible(false);
        matrizEnabledMN(filas, columnas);
        
        jTextArea1.setText("");
        jButton1.setVisible(false);
        jButton4.setVisible(true);
        jTextField1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(matrizVerify()){
            matrizFilling();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if(!((c=='-') || (Character.isDigit(c) ) || (c == KeyEvent.VK_BACKSPACE)  || (c == KeyEvent.VK_DELETE)  || (c == KeyEvent.VK_SLASH))){
            evt.consume();
        } 
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if(!((c=='-') || (c=='+') || (c=='f') || (c=='F') || (c=='*') || (c==',') || (c==';') ||(Character.isDigit(c)) ||  (c == KeyEvent.VK_BACKSPACE)  || (c == KeyEvent.VK_DELETE)  || (c == KeyEvent.VK_SLASH))){
            evt.consume();
        } 
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if(!((c=='-') || (Character.isDigit(c) ) || (c == KeyEvent.VK_BACKSPACE)  || (c == KeyEvent.VK_DELETE)  || (c == KeyEvent.VK_SLASH))){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        deshacerOperacion();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminacion_Gaussiana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminacion_Gaussiana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminacion_Gaussiana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminacion_Gaussiana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminacion_Gaussiana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
