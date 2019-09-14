package Model;

public class ContadorTempo {
    public static long tempInicial;
    public static long tempFinal;
         
    public static void comecar(){
        tempInicial = System.currentTimeMillis();
        
    }   
    public static String parar(){
        tempFinal = System.currentTimeMillis();  
        long dif = (tempFinal - tempInicial);
        long condicionalTempo = dif/1000;
        return condicionalTempo < 60 ? "Tempo gasto: " +dif/1000+" segundos" : "Tempo gasto: "+dif/60000+ " min e "+ (dif/1000)%60+" seg.";        
    
        
    }

    
}

