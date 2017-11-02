
import javax.swing.JComponent;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio
 */
public class Dibujar extends JComponent{
        private ArrayList<Double> PuntosU;
        private ArrayList<Double> PuntosV;
        private ArrayList<Double> PuntosW;
        private Graphics2D graph2;
        private Shape drawLine;
        private Shape drawLine1;
        private Shape drawLine2;
        private int value;
        int baseX = 315;
        int baseY = 180;
        @Override
        public void paint(Graphics g){
            
            //para inicializar los graficos
            graph2 = (Graphics2D)g;
            
            //graficos de la ventana para que tenga "graficas como los juegos"
            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           
            //dibuja una linea W                //x  , y , x 315, y 50
            drawLine  = new Line2D.Double(315,180,PuntosW.get(0),PuntosW.get(1));
                                                //       315-150=165
            //dibuja una linea U               //x  , y , x 185, y 250
            drawLine1 = new Line2D.Double(315,180,PuntosU.get(0),PuntosU.get(1));
            
                                               //       250+165 = 150         
            //dibuja una linea V               //x  , y , x 445, y 250
            drawLine2 = new Line2D.Double(315,180,PuntosV.get(0),PuntosV.get(1));
            
            //selecciona el color que quiere pintar
            graph2.setPaint(Color.gray );
         
            //dibuja todas las lineas de w,y,z
            
            graph2.draw(drawLine);
            
            graph2.draw(drawLine1);
            
            graph2.draw(drawLine2);
            
        }
        
        public void rota(int value){
            System.out.println(Integer.toString(value));
            this.value = value;
            //graph2.rotate(Math.toRadians(value));
            repaint();
        }
        
        public void setPuntos(ArrayList<Double> pPuntosU,
                ArrayList<Double> pPuntosV, ArrayList<Double> pPuntosW){
            PuntosU = pPuntosU;
            PuntosV = pPuntosV;
            PuntosW = pPuntosW;
        }
        
}

