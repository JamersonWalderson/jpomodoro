/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import View.JGui;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Cronometro extends JGui {
    java.util.Timer timer1 = new java.util.Timer();
    public int tempoMinutos = 0;
    public int tempoSegundos = 0;
    public int delay = 1000;   // funcao Timer
    public int interval = 1000;  // funcao Timer
    public boolean timerAtivado = false;
    
    
    public void iniciarCronometro() {
        boolean timerAtivado = true; // programa em funcionamento
        
        timer1.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    /* System.out.println("Debugg btnIniciar"); */
                    /* Converte o valor inteiro em String para exibir no label */
                    String tempoConvSegundos = String.valueOf(tempoSegundos);
                    String tempoConvMinutos = String.valueOf(tempoMinutos);
                    tempoSegundos++;
                    lblCronometro.setText("00:"+tempoConvMinutos+":"+tempoConvSegundos);
                    if (tempoSegundos == 60) {
                        tempoMinutos++;
                        tempoSegundos = 0;
                    
                    }
                    if (tempoMinutos == 25) {
                        JOptionPane.showMessageDialog(null, "Ciclo esgotado\n! Descanse durante 5 minutos e volte as atividades.", "Você precisa fazer uma pausa", JOptionPane.ERROR_MESSAGE, null);
                        timer1.cancel();
                        timer1.purge();
                    }
                    
                }
            
        }, delay, interval);
    
    }
    
    public void pararCronometro() {
        timerAtivado = false; // desligado
        timer1.cancel();
        tempoSegundos = 0;
        tempoMinutos = 0;
        lblCronometro.setText("00:00:00");
        
    }
    
    
    
}

}
