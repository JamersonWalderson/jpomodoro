package Model;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author jamer
 */
public class Pomodoro {
    private Timer timer = new Timer();
    private int segundos = 1500; // MINUTOS *60
    private int minutos = 25; // DEIXA 2
    private static boolean ligado = true;
    private boolean descanso = false;
    
    
    
    public Pomodoro() {
        
    }
    public void iniciar() {
        ligado = true;
        timer.scheduleAtFixedRate(new TimerTask() {
          public void run() {
                if (ligado) {
                    segundos--;
                    int resto = segundos %60;
                    if (resto == 0 && minutos != 0) {
                        minutos--;
                        
                    }
                    if (minutos == 0 && segundos == 0) {
                            timer.cancel();
                            timer.purge();
                            //System.out.println("SAPORRA");
                            //descanso = true; // teste
                            if (descanso == false) {
                                descanso = true;
                                
                            }
                            
                    }
                  
                } else {
                    timer.cancel();
                    timer.purge();
                    
                }
                       
          }
        }, 1000, 1000);
               
    }
    public void parar() {        
        ligado = false;
        
    }
    public String getTempo() {
        //return String.format("%02d:%02d", segundos /60 , segundos %60);
        return String.format("%02d:%02d", minutos, segundos%60);
    }
    public boolean getDescanso() {
        // Dispara quando o cronometro zerar.
        return descanso;
    }
    public void setDescanso(boolean descanso) {
        // Muda o valor da variavel descanso
        this.descanso = descanso;
        
    }

}