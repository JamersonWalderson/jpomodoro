package Model;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author jamer
 */
public class Cronometro {
    private Timer timer = new Timer();
    private int segundos = 0; // segundos
    private int minutos = 0;
    private int horas = 0;
    private static boolean ligado = true;
    
    
    public Cronometro() {
        
    }
    public void iniciar() {
        timer.scheduleAtFixedRate(new TimerTask() {
          public void run() {
            if (ligado) {
                segundos++;
                if (segundos == 60) {
                    minutos ++;
                    segundos = 0;
                    
                }
                if (minutos == 60) {
                    horas ++;
                    minutos = 0;
                    
                }
                
            } else {
                timer.cancel();
                timer.purge();
                
            }
            
           
          }
        }, 1000, 1000);
               
    }
    public void parar() {
        timer.cancel();
        timer.purge();
        
    }
    public String getTempo() {
        return String.format("%02d:%02d:%02d", horas, minutos , segundos); // horas, minutos e segundos
        
    }
    
}
