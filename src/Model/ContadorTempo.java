package Model;

/**
 * 
 * @author jamerson walderson
 * Está classe tem como objetivo medir o tempo de duração das atividades
 */

public class ContadorTempo {
    public static long tempInicial;
    public static long tempFinal;
         
    public static void comecar(){
        tempInicial = System.currentTimeMillis();
        
    }
    /**
    * retorna o tempo de execução
    */
    public static String parar(){
        tempFinal = System.currentTimeMillis();  
        long dif = (tempFinal - tempInicial);
        // Para converter para segundos divide por mil
        long condicionalTempo = dif/1000;
        return condicionalTempo < 60 ? "Tempo decorrido: " +dif/1000+" seg" : "Tempo decorrido: "+dif/60000+ " min e "+ (dif/1000)%60+" seg.";        
     
    }
  
}
