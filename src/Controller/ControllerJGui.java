package Controller;

import View.JGui;
import Model.NovaTarefa;
import Model.Dicas;
import Model.Pomodoro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;

/**
 *
 * @author jamer
 * Classe que controla os dados entre a camada View e a camada Modelo
 * 
 */
public class ControllerJGui {
    private JGui view;
    private NovaTarefa modelTarefa;
    private Dicas dica;
    private Pomodoro pomodoro;
    
    public ControllerJGui(NovaTarefa novaTarefa) {
        this.modelTarefa = modelTarefa;
        this.view = new JGui();
        
    }
    public ControllerJGui() {
        
        
    }
    
 /*   
    public String btNovaTarefa(String tarefa) {
        modelTarefa.setTarefa(tarefa);      
        return modelTarefa.getTarefa();
        
    }
*/
    public String dica(int numRandom) {
        dica = new Dicas();        
        return dica.mostrarDicas(numRandom);
        
    }
        
        
 }

    
