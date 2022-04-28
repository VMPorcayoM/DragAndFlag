package dragandflag;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class Contenedor extends JLabel implements MouseMotionListener{
    private int noBandera;    
    private boolean ocupado;
    public Contenedor() {
        this.setBounds(50, 942, 193, 119); 
        ocupado=false;
    }       

    
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    
    public int getNoBandera() {
        return noBandera;
    }
    
    public void setNoBandera(int noBandera) {
        this.noBandera = noBandera;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
