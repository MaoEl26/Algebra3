
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
        private int escalar = 30;
        private final int baseX = 315;
        private final int baseY = 180;
        private Color color = Color.gray;
        private boolean dibujaRectangulo = false;
        @Override
        public void paint(Graphics g){
            
            //para inicializar los graficos
            graph2 = (Graphics2D)g;
            
            //graficos de la ventana para que tenga "graficas como los juegos"
            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
           
            //dibuja una linea W                //x  , y , x 315, y 50
            drawLine  = new Line2D.Double(315,180,-escalar*PuntosW.get(0)+baseX,-escalar*PuntosW.get(1)+baseY);
                                                //       315-150=165
            //dibuja una linea U               //x  , y , x 185, y 250
            drawLine1 = new Line2D.Double(315,180,escalar*PuntosU.get(0)+baseX,-escalar*PuntosU.get(1)+baseY);
                                               //       250+165 = 150         
            //dibuja una linea V               //x  , y , x 445, y 250
            drawLine2 = new Line2D.Double(315,180,escalar*PuntosV.get(0)+baseX,-escalar*PuntosV.get(1)+baseY);
                
            //selecciona el color que quiere pintar
            graph2.setPaint(color);
         
            //dibuja todas las lineas de w,y,z
            graph2.draw(drawLine);
            
            graph2.draw(drawLine1);
            
            graph2.draw(drawLine2);
            
            
            if (dibujaRectangulo){
                
            drawLine  = new Line2D.Double(310,184,340,200);
                                                //       315-150=165
            //dibuja una linea U               //x  , y , x 185, y 250
            drawLine1 = new Line2D.Double(350,197,341,200);
            
            drawLine2 = new Line2D.Double(340,100,340,200);
            
           
            graph2.setPaint(color.ORANGE);
            
            graph2.draw(drawLine);
            
            graph2.draw(drawLine1);
            
            graph2.draw(drawLine2);
            
            graph2.setPaint(color.red);
            
            graph2.fillOval(338, 90, 5, 5);
            }
        }
        
        public void setPuntos(ArrayList<Double> pPuntosU,
                ArrayList<Double> pPuntosV, ArrayList<Double> pPuntosW){
            PuntosU = pPuntosU;
            PuntosV = pPuntosV;
            PuntosW = pPuntosW;
        }
        public void Color(Color color){
            this.color = color;
        }
        
        public void setEscalar(int escalar){
            this.escalar = escalar;
        }
        
        public void setDibujaRectagulo(boolean dibujaRectangulo){
            this.dibujaRectangulo = dibujaRectangulo;
        }
}

