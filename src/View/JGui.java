/*
 * http://www.gqferreira.com.br/artigos/ver/mvc-com-java-desktop-parte3
 */
package View;
import Model.Cronometro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author jamesw.97
 */
public class JGui extends javax.swing.JFrame {
    
    public boolean painelOp;
    /**
     * Creates new form JGui
     */
    public JGui() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCores = new javax.swing.ButtonGroup();
        painelOpcoes = new javax.swing.JPanel();
        lblEstiloLivre = new javax.swing.JLabel();
        lblInciar = new javax.swing.JLabel();
        lblReiniciar = new javax.swing.JLabel();
        pnlOpcoes = new javax.swing.JPanel();
        lblRoxo = new javax.swing.JLabel();
        lblAmarelo = new javax.swing.JLabel();
        lblAzulClaro = new javax.swing.JLabel();
        lblCinza = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTarefa = new javax.swing.JLabel();
        lblOpcoes = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblCronometro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JPomodoro");
        setBackground(new java.awt.Color(255, 204, 153));
        setMinimumSize(new java.awt.Dimension(473, 332));
        setResizable(false);

        painelOpcoes.setBackground(new java.awt.Color(204, 204, 255));

        lblEstiloLivre.setFont(new java.awt.Font("Rachana", 0, 14)); // NOI18N
        lblEstiloLivre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstiloLivre.setIcon(new javax.swing.ImageIcon("C:\\Users\\jamer\\Desktop\\JPomodoro\\img\\pencil-writing-on-a-paper-sheet_icon-icons.com_70422.png")); // NOI18N

        lblInciar.setBackground(new java.awt.Color(204, 204, 255));
        lblInciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInciar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jamer\\Desktop\\JPomodoro\\img\\icons8-reproduzir-50.png")); // NOI18N
        lblInciar.setText("Pomodoro");
        lblInciar.setOpaque(true);
        lblInciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInciarMouseClicked(evt);
            }
        });

        lblReiniciar.setBackground(new java.awt.Color(204, 204, 255));
        lblReiniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReiniciar.setIcon(new javax.swing.ImageIcon("C:\\Users\\jamer\\Desktop\\JPomodoro\\img\\1492790919-81power_84209.png")); // NOI18N
        lblReiniciar.setText("Descanço");
        lblReiniciar.setOpaque(true);
        lblReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReiniciarMouseClicked(evt);
            }
        });

        pnlOpcoes.setBackground(new java.awt.Color(204, 204, 255));

        lblRoxo.setBackground(new java.awt.Color(153, 102, 255));
        lblRoxo.setOpaque(true);

        lblAmarelo.setBackground(new java.awt.Color(255, 255, 153));
        lblAmarelo.setOpaque(true);
        lblAmarelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmareloMouseClicked(evt);
            }
        });

        lblAzulClaro.setBackground(new java.awt.Color(204, 255, 204));
        lblAzulClaro.setOpaque(true);

        lblCinza.setBackground(new java.awt.Color(204, 204, 204));
        lblCinza.setOpaque(true);

        jLabel2.setText("Atividades em execução:");

        jLabel3.setText("0");

        jLabel4.setText("Concluidas: ");

        jLabel5.setText("0");

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(lblRoxo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAzulClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCinza, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCinza, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAzulClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoxo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblTarefa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTarefa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTarefa.setIcon(new javax.swing.ImageIcon("C:\\Users\\jamer\\Desktop\\JPomodoro\\img\\calendar-with-a-clock-time-tools_icon-icons.com_56831.png")); // NOI18N

        lblOpcoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpcoes.setText(" ...");
        lblOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpcoesMouseClicked(evt);
            }
        });

        lblFechar.setBackground(new java.awt.Color(255, 0, 0));
        lblFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechar.setText("X");
        lblFechar.setOpaque(true);
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelOpcoesLayout = new javax.swing.GroupLayout(painelOpcoes);
        painelOpcoes.setLayout(painelOpcoesLayout);
        painelOpcoesLayout.setHorizontalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInciar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstiloLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblTarefa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addComponent(lblReiniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEstiloLivre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(lblOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );

        pnlOpcoes.setVisible(true);

        lblCronometro.setBackground(new java.awt.Color(204, 204, 255));
        lblCronometro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro.setText("00:00:00");
        lblCronometro.setOpaque(true);

        campoTexto.setColumns(20);
        campoTexto.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        campoTexto.setRows(5);
        campoTexto.setLineWrap(true);
        campoTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTextoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(campoTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblCronometro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelOpcoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblOpcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpcoesMouseClicked

        if (painelOp) {
            System.out.println("bug1");
            pnlOpcoes.setVisible(false);
            
        } else {
            System.out.println("bug2");
            pnlOpcoes.setVisible(true);
            
        }
        /*if (painelOp == false) {
            pnlOpcoes.setVisible(true);
        }
        if (painelOp == true) {
            pnlOpcoes.setVisible(false);
        }
        */
        
    }//GEN-LAST:event_lblOpcoesMouseClicked

    private void lblAmareloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmareloMouseClicked
        campoTexto.setBackground(new java.awt.Color(255, 255, 204));

    }//GEN-LAST:event_lblAmareloMouseClicked

    private void lblInciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInciarMouseClicked
        /* Trabalhando neste bloco */
        
        Cronometro modelCronometro = new Cronometro();
        modelCronometro.iniciarCronometro();
        
                  
        
        
    }//GEN-LAST:event_lblInciarMouseClicked

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblFecharMouseClicked

    private void lblReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReiniciarMouseClicked
        /* Trabalhando nisso */
        
    }//GEN-LAST:event_lblReiniciarMouseClicked

    private void campoTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTextoKeyPressed
        // tecla F1
        if (evt.getKeyCode() == 112) {
            // formato da data
            Date d = new Date();            
            String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);      
            SimpleDateFormat horaAtual = new SimpleDateFormat("HH:mm:ss");
            
            // thread para rodar multitarefas
            Thread test = new Thread((Runnable) horaAtual);
            
            campoTexto.setText(dStr+(" ")+horaAtual.format(d));
              
        }
        if (evt.getKeyCode() == 113) {
            campoTexto.setText("\n [ ] ");
            
        }
        
    }//GEN-LAST:event_campoTextoKeyPressed

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
                if ("Windows".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campoTexto;
    private javax.swing.ButtonGroup grupoCores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmarelo;
    private javax.swing.JLabel lblAzulClaro;
    private javax.swing.JLabel lblCinza;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel lblEstiloLivre;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblInciar;
    private javax.swing.JLabel lblOpcoes;
    private javax.swing.JLabel lblReiniciar;
    private javax.swing.JLabel lblRoxo;
    private javax.swing.JLabel lblTarefa;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel pnlOpcoes;
    // End of variables declaration//GEN-END:variables
}