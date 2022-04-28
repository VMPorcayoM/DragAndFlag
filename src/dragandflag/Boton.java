package dragandflag;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

public class Boton extends JButton implements MouseMotionListener{
    private int noBandera;
    private Contenedor cont;     
    public Boton() {       
        cont=null;
    }

    public Contenedor getCont() {
        return cont;
    }

    public void setCont(Contenedor cont) {
        this.cont = cont;
    }

    
    
    public int getNoBandera() {
        return noBandera;
    }

    public void setNoBandera(int noBandera) {
        this.noBandera = noBandera;
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        this.setLocation(e.getX()+this.getX()-this.getWidth()/2, e.getY()+this.getY()-this.getHeight()/2);                                
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
}
