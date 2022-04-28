package dragandflag;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class Tablero extends JFrame implements MouseListener{
    private class Tiempo{
        private Timer timer=new Timer();
        private int segundos=0;
        class Contador extends TimerTask{
            @Override
            public void run() {
                segundos++;
                System.out.println("Segundo: "+segundos);
                if(segundos>10)
                    Detener();
            }
            
        }
        public void Contar(){
            this.segundos=0;
            timer=new Timer();
            timer.schedule(new Contador(), 0,1000);
        }
        public void Detener(){
            timer.cancel();
        }
        public int getSegundos(){
            return segundos;
        }
    }
    
    private Boton regresar;
    private Inicio origen;   
    private JLabel valida;
    Sonido s;
    private Tiempo tiempo=new Tiempo();
    private ArrayList<Boton> listaBotones=new ArrayList<Boton>();
    private ArrayList<Contenedor> listaContenedores=new ArrayList<Contenedor>();
    String[] paises={"México", "Estados Unidos", "Japón", "Canada", "Brasil", "Alemania",
        "Francia", "Reino Unido", "Argentina", "China", "Italia", "Rusia", "Camerún",
        "Dinamarca", "Nepal", "Panamá"};   
    
    public Tablero(String nivel) {                               
        regresar=new Boton();
        regresar.setBounds(50, 15, 100, 35);
        regresar.setText("Regresar");
        regresar.addMouseListener(this);
        this.add(regresar);
        
        JLabel etiMensaje= new JLabel();
        etiMensaje.setBounds(361, 15, 500, 35);
        etiMensaje.setText("Click en cualquier bandera y escucha parte de su himno.");
        etiMensaje.setHorizontalTextPosition(JLabel.CENTER);
        add(etiMensaje);      
        
        valida= new JLabel();
        valida.setBounds(311, 300, 400, 25);
        valida.setText("Arrastra cada bandera al contenedor correspondiente");
        valida.setVerticalAlignment(JLabel.CENTER);       
        valida.setHorizontalAlignment(JLabel.CENTER);
        valida.setBorder(new LineBorder(Color.WHITE));       
        add(valida);  
        
        int ini = 0, fin=0, cont=0;
        Boton b;
        Contenedor c;                
        switch(nivel){
            case "novato":
                ini=0;
                fin=3;
                break;
            case "conocedor":
                ini=4;
                fin=7;
                break;
            case "sabiondo":
                ini=8;
                fin=11;
                break;
            case "erudito":
                ini=12;
                fin=15;
                break;
        }
        
        for (int i=ini; i <= fin; i++) {
            c=new Contenedor();
            c.setNoBandera(i);                                    
            c.setIcon(new ImageIcon("src\\iconos\\mundo.png"));
            c.setText(paises[c.getNoBandera()]);            
            listaContenedores.add(c);            
        }
        
        for (int i=ini; i <= fin; i++) {
            b=new Boton();
            b.setNoBandera(i);
            b.addMouseListener(this);
            b.addMouseMotionListener(b);
            b.setIcon(new ImageIcon("src\\banderas\\"+i+".jpg"));                        
            listaBotones.add(b);            
        }
        
        Collections.shuffle(listaBotones, new Random());
        for (int j = 0; j < listaBotones.size(); j++) {
            Boton add=(Boton)listaBotones.get(j);
            if(add.getNoBandera()==14)
                add.setBounds(50+(cont*243), 80, 143, 175);
            else
                add.setBounds(50+(cont*243), 80, 193, 121);                        
            this.add(add);              
            cont++;
        }
        
        Collections.shuffle(listaContenedores, new Random());
        for (int j = 0; j < listaContenedores.size(); j++) {
            Contenedor contenedor=(Contenedor)listaContenedores.get(j);            
            contenedor.setBounds(50+(j*243), 350, 193, 149);             
            contenedor.setHorizontalAlignment(JLabel.CENTER);            
            contenedor.setVerticalAlignment(JLabel.TOP);
            contenedor.setHorizontalTextPosition(JLabel.CENTER);
            contenedor.setVerticalTextPosition(JLabel.BOTTOM);
            this.add(contenedor);
        }
                
        this.setBounds(0,0,1022,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setTitle("Drag & Flag");        
        this.setResizable(false);
    }
    
    public Inicio getOrigen() {
        return origen;
    }
    public void setOrigen(Inicio origen) {
        this.origen = origen;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==regresar){
            origen.setVisible(true);
            this.dispose();
        }
        reproduce((Boton) e.getSource());
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {
        dentroContenedor(e);
        validacionFinal();
    }
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    public void reproduce(Boton e){
        for (int i = 0; i < listaBotones.size(); i++) {
            if(e==listaBotones.get(i)){
                if(tiempo.getSegundos()>0 && tiempo.getSegundos()<10){
                    JOptionPane.showMessageDialog(null, "Espere "+(10-tiempo.getSegundos())+" segundos antes de reproducir otro.", "Espere", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                tiempo.Detener();
                Boton b=(Boton) listaBotones.get(i);                
                s=new Sonido(b.getNoBandera());   
                s.start();
                
                tiempo.Contar();
                break;
            }
        }
    }
    public void dentroContenedor(MouseEvent e){
        Boton b=(Boton) e.getComponent();       
        int cont=0;
        for (int i = 0; i < 4; i++) {
            if(listaContenedores.get(i).getLocation()!=b.getLocation()){
                cont++;                
            }                       
        }            
        if(cont==4)
            b.setCont(null);
        for (int i = 0; i < 4; i++) {
            if(e.getXOnScreen()+(b.getHeight()/4)>=listaContenedores.get(i).getX() && e.getXOnScreen()-(b.getHeight()/2)<=(listaContenedores.get(i).getX()+ 243)){
                if(e.getYOnScreen()+(b.getWidth()/2)>=listaContenedores.get(i).getY() && e.getYOnScreen()-(b.getWidth()/4)<=(listaContenedores.get(i).getY()+199)) {                                        
                    b.setLocation(listaContenedores.get(i).getLocation());
                    listaContenedores.get(i).setOcupado(true);
                    b.setCont(listaContenedores.get(i));                    
                    return;                   
                }
            }
            
        }        
    }
    public boolean contenedoresLlenos(){
        int cont=0;
        for (int i = 0; i < 4; i++) {
            if (listaBotones.get(i).getCont()!=null) {
                cont++;
            }
        }
        return cont==4;
    }
    public boolean valida(){
        int cont=0;
        for (int i = 0; i < 4; i++) {
            if (listaBotones.get(i).getNoBandera()==listaBotones.get(i).getCont().getNoBandera()) {
                cont++;
            }
        }
        return cont==4;
    }    
    public void validacionFinal(){        
        if(contenedoresLlenos())
            if (valida()) {                
                valida.setText("¡Correcto!, prueba en otro nivel");
                valida.setBackground(Color.GREEN); 
                valida.setOpaque(true);
                valida.setBorder(new LineBorder(Color.GREEN));
            }else{                              
                valida.setText("¡Incorrecto!, sigue intentando");
                valida.setBackground(Color.RED);
                valida.setOpaque(true);
                valida.setBorder(new LineBorder(Color.RED));
            }
        else{            
            valida.setText("Arrastra cada bandera al contenedor correspondiente");
            valida.setOpaque(false);            
            valida.setBorder(new LineBorder(Color.WHITE));
        }
    }
}