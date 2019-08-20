package Model;

import java.util.ArrayList;

/**
 *
 * @author jamer
 */
public class NovaTarefa {
    private String novaTarefa;
    private int i = 0;
    ArrayList<String> atividade = new ArrayList();
   
    public String criarTarefa(String atividades) {
        atividade.add(atividades);
        int posicao = atividade.indexOf(atividades);
        return atividade.get(posicao);
        
    }
    
}
