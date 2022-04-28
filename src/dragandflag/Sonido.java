package dragandflag;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Clip;

public class Sonido extends Thread{
    private String audio;

    public Sonido() {
    }

    
    public Sonido(int pais) {
        audio=""+pais;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
    
    @Override
    public void run(){
        Clip sound = Sounds.getSound(audio+".wav");
	Sounds.playSound(sound);
    }

}
