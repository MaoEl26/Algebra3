
package Controller;
import java.math.*;
import calculations.*;

/**
 *
 * @author Silvia Calderón Navarro
 */
public class Matriz {
    private int cantidadFilas;
    private int cantidadColumnas;
    private Rational matriz [][];
    
    public Matriz(int cantidadFilas, int cantidadColumnas){
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        matriz = new Rational[cantidadFilas][cantidadColumnas];
        for(int i=0; i < cantidadFilas; i++){
            for(int j=0; j < cantidadColumnas; j++){
               matriz[i][j] = new Rational(0); 
            }
        }        
    }
    
    public Matriz(Matriz m){
        cantidadFilas = m.getCantidadFilas();
        cantidadColumnas = m.getCantidadColumnas();
        matriz = new Rational[cantidadFilas][cantidadColumnas];
        for(int i=0; i<cantidadFilas; i++){
            for(int j=0; j<cantidadColumnas; j++){
               matriz[i][j] = m.conseguirElementoFraccion(i, j); 
            }
        }             
    }

    public String mostrarMatriz(){
        String text="Matriz:\n";
        for(int i=0; i<getCantidadFilas(); i++){
            for(int j=0; j<getCantidadColumnas(); j++){
                if(matriz[i][j].getDenom()!=1){
                    text = text + matriz[i][j].getNum()+"/"+matriz[i][j].getDenom()+"\t";
                }
                else
                {
                    text = text + matriz[i][j].getNum()+"\t";
                }
            }
            text = text + "\n";
        }
        return text;
    }
    
    public void insertarElemento(int fila,int columna,Rational elemento){
        matriz[fila][columna] = elemento;
        matriz[fila][columna].simplify();
    }
    
    public int numeroDecimales(String numero){
        int numeroDecimal=0;
        
        for(int i=numero.indexOf(".")+1;i<numero.length();i++){
            numeroDecimal++;
        }
        return numeroDecimal;
    }
    
    public void intercambiarFilas(int fila1,int fila2){    
        Rational vector[] = matriz[fila1];
        
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = vector;     
    }
    
    public void multiplicarFilaPorEscalar(int fila, Rational escalar){
        Rational temp;
        for(int i=0;i<cantidadColumnas;i++){
             temp = new Rational(escalar.getNum(),escalar.getDenom());
             matriz[fila][i] = RationalCalc.mulRat(matriz[fila][i],temp);
             matriz[fila][i].simplify();
        }
    }
    
    public void sumarFilas(int fila1, int fila2){        
        if(fila1!=fila2){        
        Rational contenedor = new Rational(0);
            for(int i=0; i<cantidadColumnas; i++){
                contenedor =RationalCalc.addRat(matriz[fila2][i], matriz[fila1][i]);
                contenedor.simplify();
                matriz[fila2][i] = contenedor;   
            }        
        }
    }
    
    public void multiplicarSumarFilas(int fila1, int fila2, Rational escalar1, Rational escalar2){    
        Matriz temp = new Matriz (cantidadFilas, cantidadColumnas);
        temp = copiaMatriz(temp);
        temp.multiplicarFilaPorEscalar(fila1, escalar1);
        multiplicarFilaPorEscalar(fila2, escalar2);
        if(fila1!=fila2){        
        Rational contenedor = new Rational(0);
            for(int i=0; i<cantidadColumnas; i++){
                contenedor = RationalCalc.addRat(matriz[fila2][i], temp.matriz[fila1][i]);
                contenedor.simplify();
                matriz[fila2][i] = contenedor;   
            }        
        }
    }
    
    public int conseguirElemento(int fila,int columna, int parteDeFraccion){
        if(parteDeFraccion==1){
            return matriz[fila][columna].getNum();
        
        }else{
            return matriz[fila][columna].getDenom();
        }
    }
    
    //Copia los elementos a una nueva matriz
    public Matriz copiaMatriz (Matriz temp){
        for(int i=0; i<getCantidadFilas(); i++){
            for(int j=0; j<getCantidadColumnas(); j++){
                temp.insertarElemento(i, j, matriz[i][j]);
            }
        }
        return temp;
    }
    
    
    //Devuelve el elemento racional que se encuentra en esa posición
    public Rational conseguirElementoFraccion(int fila,int columna){
        return matriz[fila][columna];
    }
    
    //Devuelve la cantidad de filas
    public int getCantidadFilas() {
        return cantidadFilas;
    }

    //Establece la cantidad de filas
    public void setCantidadFilas(int cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }

    //Devuelve la cantidad de columnas
    public int getCantidadColumnas() {
        return cantidadColumnas;
    }

    //Establece la cantidad de columnas
    public void setCantidadColumnas(int cantidadColumnas) {
        this.cantidadColumnas = cantidadColumnas;
    }
    
}

