
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
        private ArrayList<Double> Punto;
        private ArrayList<Double> PuntoX;
        private ArrayList<Double> PuntoY;
        private ArrayList<Double> PuntoZ;
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
         
            //graph2.drawPolygon(new int[] {245, 250, 255}, new int[] {100, 90, 100}, 3);
            
            //graph2.drawPolygon(new int[] {195, 200, 205}, new int[] {255, 245, 250}, 3);
            
            //graph2.fillPolygon(new int[] {escalar*PuntosV.get(0)+baseX, 340, 345}, new int[] {222, 215, 224}, 3);
            //dibuja todas las lineas de w,y,z
            graph2.draw(drawLine);
            
            graph2.draw(drawLine1);
            
            graph2.draw(drawLine2);
            
            
            if (dibujaRectangulo){
                
            drawLine  = new Line2D.Double((escalar*0.5)*PuntoX.get(0)+baseX,-(escalar*0.5)*PuntoX.get(1)+baseY,
                    (escalar*0.5)*PuntoZ.get(0)+baseX,-(escalar*0.5)*PuntoZ.get(1)+baseY);
                                                //       315-150=165
            //dibuja una linea U               //x  , y , x 185, y 250
            drawLine1 = new Line2D.Double((escalar*0.5)*PuntoY.get(0)+baseX,-(escalar*0.5)*PuntoY.get(1)+baseY,
                    (escalar*0.5)*PuntoZ.get(0)+baseX,-(escalar*0.5)*PuntoZ.get(1)+baseY);
            
            drawLine2 = new Line2D.Double((escalar*0.5)*PuntoZ.get(0)+baseX,-(escalar*0.5)*PuntoZ.get(1)+baseY
                    ,(escalar*0.5)*Punto.get(0)+baseX,-(escalar*0.5)*Punto.get(1)+baseY);
            
           
            graph2.setPaint(color.ORANGE);
            
            graph2.draw(drawLine);
            
            graph2.draw(drawLine1);
            
            graph2.draw(drawLine2);
            
            graph2.setPaint(color.red);
            
            
            Ellipse2D.Double drawPoint = new Ellipse2D.Double((escalar*0.5)*Punto.get(0)+baseX,
            -(escalar*0.5)*Punto.get(1)+baseY, 5, 5);
            graph2.fill(drawPoint);
            graph2.draw(drawPoint);
            }
        }
        
        public void setPuntos(ArrayList<Double> pPuntosU,
                ArrayList<Double> pPuntosV, ArrayList<Double> pPuntosW){
            PuntosU = pPuntosU;
            PuntosV = pPuntosV;
            PuntosW = pPuntosW;
        }
        
        public void setPuntosRectangulo(ArrayList<Double> PuntoX,
                ArrayList<Double> PuntoY, ArrayList<Double> PuntoZ,
                ArrayList<Double> Punto){
            this.Punto = Punto;
            this.PuntoX = PuntoX;
            this.PuntoY = PuntoY;
            this.PuntoZ = PuntoZ;
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

