package Controller;

import View.JGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jamer
 * Classe que controla os dados entre a camada View e a camada Modelo
 * 
 */
public class ControllerJGui implements ActionListener{
    private JGui framePrincipal;
    
    
    // Método construtor
    public void ControllerJGui(framePrincipal) {
        this.framePrincipal = framePrincipal;
        
    }
    
    // Eventos de ação
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
    }
    
    
}
