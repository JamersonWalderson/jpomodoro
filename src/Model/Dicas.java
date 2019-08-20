package Model;
import java.util.ArrayList;

/**
 *
 * @author jamer
 */
public class Dicas {
    private int qtdDicas = 0;
    ArrayList<String> dicas = new ArrayList();
    
    public Dicas() {
        
    
    }    
    public String mostrarDicas(int i) {
        dicas.add("Respeite seu tempo.");
        dicas.add("Você pode fazer aprender qual quer coisa, no tempo certo");
        dicas.add("Não Desista. Não desista em dias ruins.");
        dicas.add("Não Desista");
        dicas.add("Não tenha medo de fracassar!");
        dicas.add("Seja Persistente e Siga em Frente!");
        dicas.add("Foco no Objetivo.");
        dicas.add("Foco em Seguir em Frente estudante!");
        dicas.add("Seu tempo e energia.");
        dicas.add("O tempo não para.");
        dicas.add("Tempo é dinheiro.");
        dicas.add("Você é maior que tudo isso, força!");
        qtdDicas = dicas.size();
        
        return dicas.get(i);
            
    }    
    
    /*
    public static void main(String args[]) {
        Dicas dicas = new Dicas();
        System.out.println(dicas.mostrarDicas(4));
    }
    */
    


}
