package View;

import Controller.ControllerJGui;
import Model.Pomodoro;
import Model.Cronometro;
import Model.Descanso;
import Model.NovaTarefa;
import Model.Periodoo;
import Model.ContadorTempo;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author github jamesw.97
 */
public class JGui extends javax.swing.JFrame {
    private ControllerJGui controller;
    private Pomodoro pomodoro;
    private Cronometro cronometro;
    private Descanso descanso;
    private Periodoo periodo;
    private ContadorTempo cTempo;
    boolean cronometroStatus = false;
    boolean pomodoroStatus = false;
    boolean descansoStatus = false;
    private String criandoTarefa; // variavel temporaria
    Thread p = null;
    Thread c = null;
    Thread d = null;
    int xMouse;
    int yMouse;
    //JLabel lbTarefa;
    
    //  Construtor
    public JGui() {
        initComponents();
        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnVerTempo = new javax.swing.JPanel();
        lbContadorTempo = new javax.swing.JLabel();
        pnTarefas = new javax.swing.JPanel();
        lbTarefa = new javax.swing.JLabel();
        pnDicasSugestoes = new javax.swing.JPanel();
        lbTagDica = new javax.swing.JLabel();
        lbSugestao = new javax.swing.JLabel();
        pnOpcoes = new javax.swing.JPanel();
        btPausa = new javax.swing.JButton();
        btNovaTarefa = new javax.swing.JButton();
        btDescanso = new javax.swing.JButton();
        btPomodoro = new javax.swing.JButton();
        lbNomeProjeto = new javax.swing.JLabel();
        lbVersao = new javax.swing.JLabel();
        btCronometro = new javax.swing.JButton();
        Notas = new javax.swing.JButton();
        btEncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(287, 274));

        pnVerTempo.setBackground(new java.awt.Color(255, 255, 255));
        pnVerTempo.setPreferredSize(new java.awt.Dimension(177, 221));
        pnVerTempo.setRequestFocusEnabled(false);

        lbContadorTempo.setBackground(new java.awt.Color(255, 255, 255));
        lbContadorTempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbContadorTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbContadorTempo.setText("00:00:00");

        javax.swing.GroupLayout pnVerTempoLayout = new javax.swing.GroupLayout(pnVerTempo);
        pnVerTempo.setLayout(pnVerTempoLayout);
        pnVerTempoLayout.setHorizontalGroup(
            pnVerTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerTempoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lbContadorTempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        pnVerTempoLayout.setVerticalGroup(
            pnVerTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerTempoLayout.createSequentialGroup()
                .addComponent(lbContadorTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnTarefas.setBackground(new java.awt.Color(255, 255, 255));
        pnTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnTarefasMouseClicked(evt);
            }
        });
        pnTarefas.setLayout(new javax.swing.BoxLayout(pnTarefas, javax.swing.BoxLayout.PAGE_AXIS));

        lbTarefa.setBackground(new java.awt.Color(204, 255, 204));
        lbTarefa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTarefa.setText("00:58 | Estudar: Método lambda");
        //lbTarefa.setVisible(false);
        lbTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTarefaMouseClicked(evt);
            }
        });
        lbTarefa.setVisible(false);
        pnTarefas.add(lbTarefa);

        pnDicasSugestoes.setOpaque(false);

        lbTagDica.setText("Dica:");

        Random random = new Random();
        ControllerJGui controller = new ControllerJGui();
        int numFrase = random.nextInt(10);
        lbSugestao.setText(controller.dica(numFrase));

        javax.swing.GroupLayout pnDicasSugestoesLayout = new javax.swing.GroupLayout(pnDicasSugestoes);
        pnDicasSugestoes.setLayout(pnDicasSugestoesLayout);
        pnDicasSugestoesLayout.setHorizontalGroup(
            pnDicasSugestoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDicasSugestoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbTagDica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbSugestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnDicasSugestoesLayout.setVerticalGroup(
            pnDicasSugestoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDicasSugestoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbSugestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTagDica, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnDicasSugestoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
            .addComponent(pnVerTempo, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnVerTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnDicasSugestoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pnOpcoes.setBackground(new java.awt.Color(165, 165, 255));

        btPausa.setBackground(new java.awt.Color(255, 204, 204));
        btPausa.setText("Encerrar");
        btPausa.setBorderPainted(false);
        btPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausaActionPerformed(evt);
            }
        });

        btNovaTarefa.setBackground(new java.awt.Color(204, 204, 255));
        btNovaTarefa.setText("Nova Tarefa");
        btNovaTarefa.setBorderPainted(false);
        btNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaTarefaActionPerformed(evt);
            }
        });

        btDescanso.setBackground(new java.awt.Color(232, 255, 232));
        btDescanso.setText("Modo Descanso");
        btDescanso.setBorderPainted(false);
        btDescanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescansoActionPerformed(evt);
            }
        });

        btPomodoro.setBackground(new java.awt.Color(204, 255, 204));
        btPomodoro.setText("Pomodoro");
        btPomodoro.setBorderPainted(false);
        btPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPomodoroActionPerformed(evt);
            }
        });

        lbNomeProjeto.setText("JPomodoro");

        lbVersao.setBackground(new java.awt.Color(255, 255, 255));
        lbVersao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbVersao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVersao.setText("1.0.0 Beta");

        btCronometro.setBackground(new java.awt.Color(204, 255, 204));
        btCronometro.setText("Cronômetro");
        btCronometro.setBorderPainted(false);
        btCronometro.setMaximumSize(new java.awt.Dimension(81, 23));
        btCronometro.setMinimumSize(new java.awt.Dimension(81, 23));
        btCronometro.setPreferredSize(new java.awt.Dimension(81, 23));
        btCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCronometroActionPerformed(evt);
            }
        });

        Notas.setBackground(new java.awt.Color(204, 204, 255));
        Notas.setText("Notas");
        Notas.setBorderPainted(false);
        Notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotasActionPerformed(evt);
            }
        });

        btEncerrar.setBackground(new java.awt.Color(255, 153, 153));
        btEncerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEncerrar.setBorderPainted(false);
        btEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOpcoesLayout = new javax.swing.GroupLayout(pnOpcoes);
        pnOpcoes.setLayout(pnOpcoesLayout);
        pnOpcoesLayout.setHorizontalGroup(
            pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOpcoesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNomeProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbVersao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDescanso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPomodoro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNovaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Notas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnOpcoesLayout.setVerticalGroup(
            pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOpcoesLayout.createSequentialGroup()
                .addGroup(pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNomeProjeto)
                    .addComponent(btEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Notas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addComponent(pnOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(470, 343));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btNovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaTarefaActionPerformed
        adicionarTarefa();
        
    }//GEN-LAST:event_btNovaTarefaActionPerformed
    
    private void NotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotasActionPerformed
       Notas anotacoes = new Notas();
       anotacoes.setVisible(true);
       
         
    }//GEN-LAST:event_NotasActionPerformed

    private void btPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPomodoroActionPerformed
        pomodoroStatus = true;
        cronometroStatus = false;
        
        pomodoro = new Pomodoro();
        pomodoro.iniciar();
        /* 
        * Da linha 346 a 353 não editar, favor
        * Só deus sabe como isso está funcionando
        */
        p = new Thread(() ->{
            while(pomodoroStatus){ //status true quando aperta o botão iniciar
                lbContadorTempo.setText("00:"+pomodoro.getTempo()); // altera o JLabel
                if (pomodoro.getDescanso() == true) {
                    pomodoro.setDescanso(false);
                    JOptionPane.showMessageDialog(null, "Faça uma pausa de 5 minutos");
                }
            }
        });
        p.start();
        btCronometro.setEnabled( false );
        btDescanso.setEnabled ( false );
        
    }//GEN-LAST:event_btPomodoroActionPerformed

    private void btPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausaActionPerformed
        
        if (pomodoroStatus) {    
            pomodoroStatus = false;
            pomodoro = new Pomodoro();
            pomodoro.parar();
            p.interrupt();
            btCronometro.setEnabled( true );
            btPomodoro.setEnabled ( true );
        }
        
        if (cronometroStatus) {
            cronometroStatus = false;
            cronometro = new Cronometro();
            cronometro.parar();
            c.interrupt();
            btCronometro.setEnabled( true );
            btPomodoro.setEnabled ( true );
            
        }
        
        if (descansoStatus) {
            descansoStatus = false;
            descanso = new Descanso();
            descanso.parar();
            d.interrupt();
            btCronometro.setEnabled( true );
            btPomodoro.setEnabled ( true );
            btDescanso.setEnabled ( true);
            
        }
        
        lbContadorTempo.setText("00:00:00");
        
    }//GEN-LAST:event_btPausaActionPerformed

    private void btCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCronometroActionPerformed
        cronometroStatus = true;
        pomodoroStatus = false;
        cronometro = new Cronometro();
        cronometro.iniciar();
        c = new Thread(() ->{
            while(cronometroStatus){ //status true quando aperta o botão iniciar
                lbContadorTempo.setText(cronometro.getTempo()); // altera o JLabel
            }
        });
        c.start();
        btPomodoro.setEnabled( false );
        
        
    }//GEN-LAST:event_btCronometroActionPerformed

    private void btDescansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescansoActionPerformed
        cronometroStatus = false;
        pomodoroStatus = false;
        descansoStatus = true;
        descanso = new Descanso();
        descanso.iniciar();
        d = new Thread( () -> {
           while (descansoStatus) {
               lbContadorTempo.setText(descanso.getTempo());
           }
            
        });
        d.start();
        btPomodoro.setEnabled( false );
        btCronometro.setEnabled( false );
    }//GEN-LAST:event_btDescansoActionPerformed

    private void btEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarActionPerformed
       System.exit(0);
        
    }//GEN-LAST:event_btEncerrarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_formMousePressed

     
    private void pnTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTarefasMouseClicked
        if (evt.getClickCount() == 2 ) {
            adicionarTarefa();
            System.out.println("Clicou no painel");

        }
        
    }//GEN-LAST:event_pnTarefasMouseClicked

    private void lbTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTarefaMouseClicked
        if (evt.getClickCount() == 1 ) {
            JLabel label = (JLabel) evt.getSource();
            label.setBackground(new java.awt.Color(204, 255, 204));
            ContadorTempo cTempo = new ContadorTempo();
            cTempo.parar();
            label.setText(cTempo.parar()+" | "+criandoTarefa);
            System.out.println("Clicou na lbTarefa");

        }
    }//GEN-LAST:event_lbTarefaMouseClicked

    // Adiciona a tarefa ao painel
    public void adicionarTarefa() {
        criandoTarefa = JOptionPane.showInputDialog("Qual atividade de seja adicionar?");
        if (criandoTarefa != null) {
            Periodoo periodo = new Periodoo();
            JLabel lbTarefa = new JLabel();
            NovaTarefa nTarefa = new NovaTarefa();
            lbTarefa.setText(periodo.tempoAgora()+" | "+nTarefa.criarTarefa(criandoTarefa));
            lbTarefa.setFont(new java.awt.Font("Tahoma", 0, 14));
            lbTarefa.setOpaque(true);
            lbTarefa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                lbTarefaMouseClicked(evt);
            }
            });
            pnTarefas.add(lbTarefa);
            pack();
            ContadorTempo cTempo = new ContadorTempo();
            cTempo.comecar();
        
        }
        
    }      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JGui().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Notas;
    private javax.swing.JButton btCronometro;
    private javax.swing.JButton btDescanso;
    private javax.swing.JButton btEncerrar;
    private javax.swing.JButton btNovaTarefa;
    private javax.swing.JButton btPausa;
    private javax.swing.JButton btPomodoro;
    private javax.swing.JLabel lbContadorTempo;
    private javax.swing.JLabel lbNomeProjeto;
    private javax.swing.JLabel lbSugestao;
    private javax.swing.JLabel lbTagDica;
    private javax.swing.JLabel lbTarefa;
    private javax.swing.JLabel lbVersao;
    private javax.swing.JPanel pnDicasSugestoes;
    private javax.swing.JPanel pnOpcoes;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnTarefas;
    private javax.swing.JPanel pnVerTempo;
    // End of variables declaration//GEN-END:variables
}
