/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algortimobareiss;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Bareiss extends javax.swing.JFrame {

    private static int[][] arreglo;
    private static int auxiliar[][];
    private static int determinante;

    /**
     * Creates new form Bareiss
     */

    private void limpiarCamposTexto() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        textArea1.setText("");
    }

    private static void borrarTextos() {
        jLabel3.setText("   ");
        jLabel4.setText("   ");
        jLabel5.setText("   ");
        jLabel6.setText("   ");
        jLabel7.setText("   ");
        jLabel8.setText("   ");
        jLabel9.setText("   ");
        jLabel10.setText("   ");
        jLabel11.setText("   ");
        jLabel12.setText("   ");
        jLabel13.setText("   ");
        jLabel14.setText("   ");
        jLabel15.setText("   ");
        jLabel16.setText("   ");
        jLabel17.setText("   ");
        jLabel18.setText("   ");
        jLabel19.setText("   ");
        jLabel20.setText("   ");
        jLabel21.setText("   ");
        jLabel22.setText("   ");
        jLabel23.setText("   ");
        jLabel24.setText("   ");
        jLabel25.setText("   ");
        jLabel26.setText("   ");
        jLabel27.setText("   ");
    }

    private static void ocultarObjetos() {
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
        jTextField13.setVisible(false);
        jTextField14.setVisible(false);
        jTextField15.setVisible(false);
        jTextField16.setVisible(false);
        jTextField17.setVisible(false);
        jTextField18.setVisible(false);
        jTextField19.setVisible(false);
        jTextField20.setVisible(false);
        jTextField21.setVisible(false);
        jTextField22.setVisible(false);
        jTextField23.setVisible(false);
        jTextField24.setVisible(false);
        jTextField25.setVisible(false);
        jTextField26.setVisible(false);
        jTextField27.setVisible(false);
        jTextField28.setVisible(false);
        jTextField29.setVisible(false);
        jTextField30.setVisible(false);
    }

    private void mostrarConTamaño1() {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel3.setText("x1 =");
    }

    private void mostrarConTamaño2() {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jLabel3.setText("x1 +");
        jLabel8.setText("x1 +");
        jLabel4.setText("x2 =");
        jLabel9.setText("x2 =");
    }

    private void mostrarConTamaño3() {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
        jTextField13.setVisible(true);
        jTextField14.setVisible(true);;
        jTextField15.setVisible(true);
        jTextField16.setVisible(true);
        jLabel3.setText("x1 +");
        jLabel8.setText("x1 +");
        jLabel13.setText("x1 +");
        jLabel4.setText("x2 +");
        jLabel9.setText("x2 +");
        jLabel10.setText("x2 +");
        jLabel6.setText("x3 =");
        jLabel16.setText("x3 =");
        jLabel17.setText("x3 =");
    }

    private void mostrarConTamaño4() {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
        jTextField11.setVisible(true);
        jTextField13.setVisible(true);
        jTextField14.setVisible(true);
        jTextField15.setVisible(true);
        jTextField16.setVisible(true);
        jTextField17.setVisible(true);
        jTextField19.setVisible(true);
        jTextField20.setVisible(true);
        jTextField21.setVisible(true);
        jTextField22.setVisible(true);
        jTextField23.setVisible(true);
        jLabel3.setText("x1 +");
        jLabel8.setText("x1 +");
        jLabel13.setText("x1 +");
        jLabel14.setText("x1 +");
        jLabel4.setText("x2 +");
        jLabel9.setText("x2 +");
        jLabel10.setText("x2 +");
        jLabel11.setText("x2 +");
        jLabel6.setText("x3 +");
        jLabel16.setText("x3 +");
        jLabel17.setText("x3 +");
        jLabel18.setText("x3 +");
        jLabel5.setText("x4 =");
        jLabel21.setText("x4 =");
        jLabel20.setText("x4 =");
        jLabel23.setText("x4 =");
    }

    private void mostrarConTamaño5() {
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
        jTextField11.setVisible(true);
        jTextField12.setVisible(true);
        jTextField13.setVisible(true);
        jTextField14.setVisible(true);
        jTextField15.setVisible(true);
        jTextField16.setVisible(true);
        jTextField17.setVisible(true);
        jTextField18.setVisible(true);
        jTextField19.setVisible(true);
        jTextField20.setVisible(true);
        jTextField21.setVisible(true);
        jTextField22.setVisible(true);
        jTextField23.setVisible(true);
        jTextField24.setVisible(true);
        jTextField25.setVisible(true);
        jTextField26.setVisible(true);
        jTextField27.setVisible(true);
        jTextField28.setVisible(true);
        jTextField29.setVisible(true);
        jTextField30.setVisible(true);
        jLabel3.setText("x1 +");
        jLabel8.setText("x1 +");
        jLabel13.setText("x1 +");
        jLabel14.setText("x1 +");
        jLabel15.setText("x1 +");
        jLabel4.setText("x2 +");
        jLabel9.setText("x2 +");
        jLabel10.setText("x2 +");
        jLabel12.setText("x2 +");
        jLabel11.setText("x2 +");
        jLabel6.setText("x3 +");
        jLabel16.setText("x3 +");
        jLabel17.setText("x3 +");
        jLabel18.setText("x3 +");
        jLabel19.setText("x3 +");
        jLabel5.setText("x4 +");
        jLabel21.setText("x4 +");
        jLabel20.setText("x4 +");
        jLabel23.setText("x4 +");
        jLabel22.setText("x4 +");
        jLabel7.setText("x5 =");
        jLabel24.setText("x5 =");
        jLabel25.setText("x5 =");
        jLabel26.setText("x5 =");
        jLabel27.setText("x5 =");
    }

    public static void iniciarAlgoritmo(int[][] arr) {
        arreglo = arr;
        int pivAnt = 1;
        textArea1.setText("");
        for (int i = 0; i < arreglo.length; i++) {
            imprimirMatriz(i);
            calcularDiagonalDeterminante(i);
            calcularPrimerCuadrante(i, pivAnt);
            calcularCuartoCuadrante(i, pivAnt);
            columnaACeros(i);
            pivAnt = arreglo[i][i];
        }

			// despliega la matriz
        //for (int i = 0; i < arreglo.length; i++)
        //	System.out.println(Arrays.toString(arreglo[i]));
        mostrarSolucion();
    }

    private static void imprimirMatriz(int j) {
        // despliega la matriz
        for (int i = 0; i < auxiliar.length; i++) {
            if (i==0){
                textArea1.setText(textArea1.getText()+ Arrays.toString(auxiliar[i])+ "     A"+(j+1)+ "\n");
            }else{
                textArea1.setText(textArea1.getText()+ Arrays.toString(auxiliar[i])+ "\n");
            }            
        }
        textArea1.setText(textArea1.getText()+ "\n"+ "\n");
    }

    private static void calcularDiagonalDeterminante(int indice) {
        for (int i = 0; i < indice; i++) {
            arreglo[i][i] = arreglo[indice][indice];
        }
    }

    private static void columnaACeros(int indice) {
        determinante = arreglo[indice][indice];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i][indice] = 0;
        }

        arreglo[indice][indice] = determinante;
    }

    private static void mostrarSolucion() {
        boolean infinito = false;
        boolean sinSolucion = false;
        int as[] = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i][i] == 0) {
                if (arreglo[i][arreglo[0].length - 1] == 0) {
                    infinito = true;
                } else {
                    sinSolucion = true;
                }
            } else {
                as[i] = arreglo[i][arreglo[0].length - 1] / arreglo[i][i];
            }
        }

        if (sinSolucion == true) {
            textArea1.setText(textArea1.getText()+"\n\n"+"* El sistema no tiene solución");
        } else if (infinito == true) {
            textArea1.setText(textArea1.getText()+"\n\n"+"* El sistema tiene un número infinito de soluciones");
        } else {
            textArea1.setText(textArea1.getText()+"\n\n"+"LA SOLUCIÓN DEL SISTEMA ES: \n");
            for (int i = 0; i < as.length; i++) {
                textArea1.setText(textArea1.getText()+"\n"+"x" + (i + 1) + " = " + as[i]);
            }
        }
        textArea1.setText(textArea1.getText()+"\n\n"+"EL DETERMINANTE ES: \n" + determinante);
    }

    public static void imprimirArreglo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //jTextField32.setText(jTextField32.getText()+ arr[i][j] + " ");
                System.out.print(arr[i][j]+" ");
            }
            //jTextField32.setText(jTextField32.getText()+ "\n");
            System.out.println();
        }
    }

    private static int validarDiagonal(int[][] arr) {
        // TODO verificar que no haya 0 en la diagonal principal
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static void intercambiarFilas(int[][] arr) {
        // TODO intercambia renglones hasta que no hay 0os en la diagonal
        int[] aux = new int[arr.length];
        int problema = -1;//numero del renglon donde hay un 0
        int contador = 0;
        while (((problema = validarDiagonal(arr)) != -1) && contador < 1000) {
            for (int i = 0; i < arr.length; i++) {
                aux = arr[problema];
                arr[problema] = arr[i];
                arr[i] = aux;
            }
            contador++;
        }
    }
    
        private static void calcularPrimerCuadrante(int indice, int pivAnt) {
        if (pivAnt==0){
            pivAnt =1;
        }
        for (int i = 0; i < indice; i++) {
            for (int j = indice + 1; j < arreglo[0].length; j++) {
                arreglo[i][j] = (((arreglo[i][indice] * arreglo[indice][j])- (arreglo[indice][indice] * arreglo[i][j])) * -1) / pivAnt;
            }
        }
    }

    private static void calcularCuartoCuadrante(int indice, int pivoteAnterior) {
        for (int i = indice + 1; i < arreglo.length; i++) {
            for (int j = indice + 1; j < arreglo[0].length; j++) {
                arreglo[i][j] = ((arreglo[indice][indice] * arreglo[i][j])
                        - (arreglo[i][indice] * arreglo[indice][j])) / pivoteAnterior;
            }
        }
    }

    public void resolverSistema(int pTamaño) {
        int numCol = pTamaño;
        int numRen = pTamaño;
        int[][] matriz;

        matriz = new int[numRen][numCol+1];

        switch (pTamaño) {
            case 1:
                matriz[0][0] = Integer.parseInt(jTextField1.getText());
                matriz[0][1] = Integer.parseInt(jTextField2.getText());
                break;
            case 2:
                matriz[0][0] = Integer.parseInt(jTextField1.getText());
                matriz[0][1] = Integer.parseInt(jTextField2.getText());
                matriz[0][2] = Integer.parseInt(jTextField3.getText());
                matriz[1][0] = Integer.parseInt(jTextField7.getText());
                matriz[1][1] = Integer.parseInt(jTextField8.getText());
                matriz[1][2] = Integer.parseInt(jTextField9.getText());
                break;
            case 3:
                matriz[0][0] = Integer.parseInt(jTextField1.getText());
                matriz[0][1] = Integer.parseInt(jTextField2.getText());
                matriz[0][2] = Integer.parseInt(jTextField3.getText());
                matriz[0][3] = Integer.parseInt(jTextField4.getText());
                matriz[1][0] = Integer.parseInt(jTextField7.getText());
                matriz[1][1] = Integer.parseInt(jTextField8.getText());
                matriz[1][2] = Integer.parseInt(jTextField9.getText());
                matriz[1][3] = Integer.parseInt(jTextField10.getText());
                matriz[2][0] = Integer.parseInt(jTextField13.getText());
                matriz[2][1] = Integer.parseInt(jTextField14.getText());
                matriz[2][2] = Integer.parseInt(jTextField15.getText());
                matriz[2][3] = Integer.parseInt(jTextField16.getText());
                break;
            case 4:
                matriz[0][0] = Integer.parseInt(jTextField1.getText());
                matriz[0][1] = Integer.parseInt(jTextField2.getText());
                matriz[0][2] = Integer.parseInt(jTextField3.getText());
                matriz[0][3] = Integer.parseInt(jTextField4.getText());
                matriz[0][4] = Integer.parseInt(jTextField5.getText());
                matriz[1][0] = Integer.parseInt(jTextField7.getText());
                matriz[1][1] = Integer.parseInt(jTextField8.getText());
                matriz[1][2] = Integer.parseInt(jTextField9.getText());
                matriz[1][3] = Integer.parseInt(jTextField10.getText());
                matriz[1][4] = Integer.parseInt(jTextField11.getText());
                matriz[2][0] = Integer.parseInt(jTextField13.getText());
                matriz[2][1] = Integer.parseInt(jTextField14.getText());
                matriz[2][2] = Integer.parseInt(jTextField15.getText());
                matriz[2][3] = Integer.parseInt(jTextField16.getText());
                matriz[2][4] = Integer.parseInt(jTextField17.getText());
                matriz[3][0] = Integer.parseInt(jTextField19.getText());
                matriz[3][1] = Integer.parseInt(jTextField20.getText());
                matriz[3][2] = Integer.parseInt(jTextField21.getText());
                matriz[3][3] = Integer.parseInt(jTextField22.getText());
                matriz[3][4] = Integer.parseInt(jTextField23.getText());
                break;
            case 5:
                matriz[0][0] = Integer.parseInt(jTextField1.getText());
                matriz[0][1] = Integer.parseInt(jTextField2.getText());
                matriz[0][2] = Integer.parseInt(jTextField3.getText());
                matriz[0][3] = Integer.parseInt(jTextField4.getText());
                matriz[0][4] = Integer.parseInt(jTextField5.getText());
                matriz[0][5] = Integer.parseInt(jTextField6.getText());
                matriz[1][0] = Integer.parseInt(jTextField7.getText());
                matriz[1][1] = Integer.parseInt(jTextField8.getText());
                matriz[1][2] = Integer.parseInt(jTextField9.getText());
                matriz[1][3] = Integer.parseInt(jTextField10.getText());
                matriz[1][4] = Integer.parseInt(jTextField11.getText());
                matriz[1][5] = Integer.parseInt(jTextField12.getText());
                matriz[2][0] = Integer.parseInt(jTextField13.getText());
                matriz[2][1] = Integer.parseInt(jTextField14.getText());
                matriz[2][2] = Integer.parseInt(jTextField15.getText());
                matriz[2][3] = Integer.parseInt(jTextField16.getText());
                matriz[2][4] = Integer.parseInt(jTextField17.getText());
                matriz[2][5] = Integer.parseInt(jTextField18.getText());
                matriz[3][0] = Integer.parseInt(jTextField19.getText());
                matriz[3][1] = Integer.parseInt(jTextField20.getText());
                matriz[3][2] = Integer.parseInt(jTextField21.getText());
                matriz[3][3] = Integer.parseInt(jTextField22.getText());
                matriz[3][4] = Integer.parseInt(jTextField23.getText());
                matriz[3][5] = Integer.parseInt(jTextField24.getText());
                matriz[4][0] = Integer.parseInt(jTextField25.getText());
                matriz[4][1] = Integer.parseInt(jTextField26.getText());
                matriz[4][2] = Integer.parseInt(jTextField27.getText());
                matriz[4][3] = Integer.parseInt(jTextField28.getText());
                matriz[4][4] = Integer.parseInt(jTextField29.getText());
                matriz[4][5] = Integer.parseInt(jTextField30.getText());
                break;
        }
        auxiliar = matriz;
        //printArr(auxiliar);
        iniciarAlgoritmo(matriz);
        if (validarDiagonal(matriz) != -1) {
            intercambiarFilas(matriz);
        }                
        
    }
    
    private boolean validarCampos() {
        switch(Integer.parseInt(jTextField31.getText())){
            case 1:
                if (!jTextField1.getText().equals("")&&(!jTextField2.getText().equals(""))){                    
                    return true;
                }else{
                    return false;
                }
            case 2:
                if (!jTextField1.getText().equals("")&&(!jTextField2.getText().equals(""))&&(!jTextField3.getText().equals(""))
                    &&(!jTextField7.getText().equals(""))&&(!jTextField8.getText().equals(""))&&(!jTextField9.getText().equals(""))){
                    return true;
                }else{
                    return false;
                }
            case 3:
                if (!jTextField1.getText().equals("")&&(!jTextField2.getText().equals(""))&&(!jTextField3.getText().equals(""))&&(!jTextField4.getText().equals(""))
                  &&(!jTextField7.getText().equals(""))&&(!jTextField8.getText().equals(""))&&(!jTextField9.getText().equals(""))&&(!jTextField10.getText().equals(""))
                   &&(!jTextField13.getText().equals(""))&&(!jTextField14.getText().equals(""))&&(!jTextField15.getText().equals(""))&&(!jTextField16.getText().equals(""))){                 
                    return true;
                }else{
                    return false;
                }
            case 4:
                if (!jTextField1.getText().equals("")&&(!jTextField2.getText().equals(""))&&(!jTextField3.getText().equals(""))&&(!jTextField4.getText().equals(""))&&(!jTextField5.getText().equals(""))
                  &&(!jTextField7.getText().equals(""))&&(!jTextField8.getText().equals(""))&&(!jTextField9.getText().equals(""))&&(!jTextField10.getText().equals(""))&&(!jTextField11.getText().equals(""))
                   &&(!jTextField13.getText().equals(""))&&(!jTextField14.getText().equals(""))&&(!jTextField15.getText().equals(""))&&(!jTextField16.getText().equals(""))&&(!jTextField17.getText().equals(""))
                    &&(!jTextField19.getText().equals(""))&&(!jTextField20.getText().equals(""))&&(!jTextField21.getText().equals(""))&&(!jTextField22.getText().equals(""))&&(!jTextField23.getText().equals(""))){                 
                    return true;
                }else{
                    return false;
                }
            case 5:
                if (!jTextField1.getText().equals("")&&(!jTextField2.getText().equals(""))&&(!jTextField3.getText().equals(""))&&(!jTextField4.getText().equals(""))&&(!jTextField5.getText().equals(""))&&(!jTextField6.getText().equals(""))
                  &&(!jTextField7.getText().equals(""))&&(!jTextField8.getText().equals(""))&&(!jTextField9.getText().equals(""))&&(!jTextField10.getText().equals(""))&&(!jTextField11.getText().equals(""))&&(!jTextField12.getText().equals(""))
                   &&(!jTextField13.getText().equals(""))&&(!jTextField14.getText().equals(""))&&(!jTextField15.getText().equals(""))&&(!jTextField16.getText().equals(""))&&(!jTextField17.getText().equals(""))&&(!jTextField18.getText().equals(""))
                    &&(!jTextField19.getText().equals(""))&&(!jTextField20.getText().equals(""))&&(!jTextField21.getText().equals(""))&&(!jTextField22.getText().equals(""))&&(!jTextField23.getText().equals(""))&&(!jTextField24.getText().equals(""))
                     &&(!jTextField26.getText().equals(""))&&(!jTextField26.getText().equals(""))&&(!jTextField27.getText().equals(""))&&(!jTextField28.getText().equals(""))&&(!jTextField29.getText().equals(""))&&(!jTextField30.getText().equals(""))){                 
                    return true;
                }else{
                    return false;
                }
            default:
                return false;
        }      
    }
    
    private void bloquearCampos(){
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
        jTextField12.setEditable(false);
        jTextField13.setEditable(false);
        jTextField14.setEditable(false);
        jTextField15.setEditable(false);
        jTextField16.setEditable(false);
        jTextField17.setEditable(false);
        jTextField18.setEditable(false);
        jTextField19.setEditable(false);
        jTextField20.setEditable(false);
        jTextField21.setEditable(false);
        jTextField22.setEditable(false);
        jTextField23.setEditable(false);
        jTextField24.setEditable(false);
        jTextField25.setEditable(false);
        jTextField26.setEditable(false);
        jTextField27.setEditable(false);
        jTextField28.setEditable(false);
        jTextField29.setEditable(false);
        jTextField30.setEditable(false);        
    }
    
    private void desbloquearCampos(){
        jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextField8.setEditable(true);
        jTextField9.setEditable(true);
        jTextField10.setEditable(true);
        jTextField11.setEditable(true);
        jTextField12.setEditable(true);
        jTextField13.setEditable(true);
        jTextField14.setEditable(true);
        jTextField15.setEditable(true);
        jTextField16.setEditable(true);
        jTextField17.setEditable(true);
        jTextField18.setEditable(true);
        jTextField19.setEditable(true);
        jTextField20.setEditable(true);
        jTextField21.setEditable(true);
        jTextField22.setEditable(true);
        jTextField23.setEditable(true);
        jTextField24.setEditable(true);
        jTextField25.setEditable(true);
        jTextField26.setEditable(true);
        jTextField27.setEditable(true);
        jTextField28.setEditable(true);
        jTextField29.setEditable(true);
        jTextField30.setEditable(true);
    }
    
    public Bareiss() {
        initComponents();
        this.setLocationRelativeTo(null); //Centra la pantalla
        jButton3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
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
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField31 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Algoritmo de Bareiss");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("n =");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("x1 +");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("x2 +");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("x4 +");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("x3 +");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("x5 =");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("x1 +");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("x2 +");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("x2 +");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("x2 +");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("x2 +");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("x1 +");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("x1 +");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("x1 +");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("x3 +");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("x3 +");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("x3 +");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("x3 +");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("x4 +");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("x4 +");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("x4 +");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("x4 +");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("x5 =");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("x5 =");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("x5 =");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("x5 =");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Limpiar valores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Generar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Resolver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23))
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel25))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27))
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Resultado");

        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(235, 235, 235))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel28)
                .addGap(27, 27, 27)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCamposTexto();
        ocultarObjetos();
        borrarTextos();
        jTextField31.setEditable(true);
        jTextField31.requestFocus();
        jTextField31.setText("");
        jButton2.setEnabled(true);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        desbloquearCampos();
        if (!jTextField31.getText().equals("")) {
            if ((jTextField31.getText().equals("1"))
                    || (jTextField31.getText().equals("2"))
                    || (jTextField31.getText().equals("3"))
                    || (jTextField31.getText().equals("4"))
                    || (jTextField31.getText().equals("5"))) {
                int tamaño = Integer.parseInt(jTextField31.getText());
                switch (tamaño) {
                    case 1:
                        mostrarConTamaño1();
                        break;
                    case 2:
                        mostrarConTamaño2();
                        break;
                    case 3:
                        mostrarConTamaño3();
                        break;
                    case 4:
                        mostrarConTamaño4();
                        break;
                    case 5:
                        mostrarConTamaño5();
                        break;
                }
                jTextField31.setEditable(false);
                jTextField1.requestFocus();
                jButton3.setEnabled(true);
                jButton2.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "El tamaño debe estar entre 1 y 5.",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
                jTextField31.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe colocar el tamaño de la matriz.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            jTextField31.requestFocus();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(validarCampos()){
            resolverSistema(Integer.parseInt(jTextField31.getText()));
            jButton3.setEnabled(false);
            bloquearCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los espacios.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(Bareiss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bareiss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bareiss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bareiss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bareiss().setVisible(true);
                ocultarObjetos();
                borrarTextos();
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    static javax.swing.JLabel jLabel10;
    static javax.swing.JLabel jLabel11;
    static javax.swing.JLabel jLabel12;
    static javax.swing.JLabel jLabel13;
    static javax.swing.JLabel jLabel14;
    static javax.swing.JLabel jLabel15;
    static javax.swing.JLabel jLabel16;
    static javax.swing.JLabel jLabel17;
    static javax.swing.JLabel jLabel18;
    static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    static javax.swing.JLabel jLabel20;
    static javax.swing.JLabel jLabel21;
    static javax.swing.JLabel jLabel22;
    static javax.swing.JLabel jLabel23;
    static javax.swing.JLabel jLabel24;
    static javax.swing.JLabel jLabel25;
    static javax.swing.JLabel jLabel26;
    static javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    static javax.swing.JLabel jLabel3;
    static javax.swing.JLabel jLabel4;
    static javax.swing.JLabel jLabel5;
    static javax.swing.JLabel jLabel6;
    static javax.swing.JLabel jLabel7;
    static javax.swing.JLabel jLabel8;
    static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    static javax.swing.JTextField jTextField1;
    static javax.swing.JTextField jTextField10;
    static javax.swing.JTextField jTextField11;
    static javax.swing.JTextField jTextField12;
    static javax.swing.JTextField jTextField13;
    static javax.swing.JTextField jTextField14;
    static javax.swing.JTextField jTextField15;
    static javax.swing.JTextField jTextField16;
    static javax.swing.JTextField jTextField17;
    static javax.swing.JTextField jTextField18;
    static javax.swing.JTextField jTextField19;
    static javax.swing.JTextField jTextField2;
    static javax.swing.JTextField jTextField20;
    static javax.swing.JTextField jTextField21;
    static javax.swing.JTextField jTextField22;
    static javax.swing.JTextField jTextField23;
    static javax.swing.JTextField jTextField24;
    static javax.swing.JTextField jTextField25;
    static javax.swing.JTextField jTextField26;
    static javax.swing.JTextField jTextField27;
    static javax.swing.JTextField jTextField28;
    static javax.swing.JTextField jTextField29;
    static javax.swing.JTextField jTextField3;
    static javax.swing.JTextField jTextField30;
    private static javax.swing.JTextField jTextField31;
    static javax.swing.JTextField jTextField4;
    static javax.swing.JTextField jTextField5;
    static javax.swing.JTextField jTextField6;
    static javax.swing.JTextField jTextField7;
    static javax.swing.JTextField jTextField8;
    static javax.swing.JTextField jTextField9;
    private static java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
    
}
