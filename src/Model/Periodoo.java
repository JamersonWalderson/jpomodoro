/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;



/**
 *
 * @author jamer
 */
public class Periodoo {
    LocalTime inicio;
    LocalTime fim;
    long t1;
    long t2;

    public String tempoAgora() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime inicio = LocalTime.now();
        String tempoString = f.format(inicio);
        return tempoString;
        
    }
    public void inicio() {
        this.t1= System.currentTimeMillis();
        Instant inicio = Instant.now();
        
    }
    public long fim() {
        // Instant fim = Instant.now
        this.t2 = System.currentTimeMillis();
        return t2 - t1;
    
    }
    public long tempoDuracao() {
        Duration duracao = Duration.between(inicio, fim);
        long duracaoEmMilissegundos = duracao.getSeconds();
        
        return duracaoEmMilissegundos;
    
    }    
    
    public static void main(String[] args) {
        Periodoo periodo = new Periodoo();
        periodo.inicio();
        System.out.println("VAI KRL: "+periodo.tempoAgora());
        for(int i=0; i<100000 ; i++) {
            System.out.println(i+" ");
        }
        periodo.fim();    
        System.out.println("ACABOU: "+periodo.tempoDuracao());
    }
 
}
