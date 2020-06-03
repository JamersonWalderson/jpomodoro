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
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * Javadoc
 * @author github jamesw.97
 * Classe principal do JPomodoro
 */
public class JGui extends javax.swing.JFrame {
    private ControllerJGui controller;
    DefaultListModel model = new DefaultListModel();  // para o JList
    private Pomodoro pomodoro;
    private Cronometro cronometro;
    private Descanso descanso;
    private Periodoo periodo;
    private ContadorTempo cTempo;
    boolean cronometroStatus = false;
    boolean pomodoroStatus = false;
    boolean descansoStatus = false;
    private String criandoTarefa = ""; // variavel temporaria
    private int xMouse;
    private int yMouse;
    Thread p = null;
    Thread c = null;
    Thread d = null;
    // private JSlider sliderDescanso;
    
    public JGui() {
        initComponents();
        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        pnVerTempo = new javax.swing.JPanel();
        lbContadorTempo = new javax.swing.JLabel();
        btEncerrar = new javax.swing.JButton();
        pnTarefas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlAtividades = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btDescanso = new javax.swing.JButton();
        sliderDescanso = new javax.swing.JSlider();
        pnDicasSugestoes = new javax.swing.JPanel();
        lbTagDica = new javax.swing.JLabel();
        lbSugestao = new javax.swing.JLabel();
        pnOpcoes = new javax.swing.JPanel();
        btPausa = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        lbNomeProjeto = new javax.swing.JLabel();
        btPomodoro = new javax.swing.JButton();
        btCronometro = new javax.swing.JButton();
        brNovaAtividade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("JPomodoro"); // NOI18N
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

        btEncerrar.setBackground(new java.awt.Color(255, 153, 153));
        btEncerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x_106506.png"))); // NOI18N
        btEncerrar.setBorderPainted(false);
        btEncerrar.setOpaque(false);
        btEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnVerTempoLayout = new javax.swing.GroupLayout(pnVerTempo);
        pnVerTempo.setLayout(pnVerTempoLayout);
        pnVerTempoLayout.setHorizontalGroup(
            pnVerTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerTempoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbContadorTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnVerTempoLayout.setVerticalGroup(
            pnVerTempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVerTempoLayout.createSequentialGroup()
                .addComponent(btEncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(pnVerTempoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbContadorTempo)
                .addContainerGap())
        );

        pnTarefas.setBackground(new java.awt.Color(255, 255, 255));

        jlAtividades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1 - Pense nas atividades que serão realizadas.", "2 - Clique no botão verde.", "3 - Clique na parte branca.", "4 - Adicione suas tarefas.", "5 - Escolha Pomodoro ou Cronometro.", "6 - Evite distrações, e foque em concluir a tarefa.", "7 - Quando concluir clique duas vezes sobre a tarefa.", "8 - Após 25 minutos clique em descanso.", "9 - Aproveite o tempo para relaxar.", "10 - Depois dos 5 minutos clique novamente em Pomodoro.", "11 - Parabéns você concluiu um ciclo." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlAtividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAtividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlAtividades);

        jLabel1.setText("jamersonwalderson@gmail.com");

        btDescanso.setBackground(new java.awt.Color(204, 204, 255));
        btDescanso.setForeground(new java.awt.Color(255, 255, 255));
        btDescanso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/single-couch.png"))); // NOI18N
        btDescanso.setText("Pausa");
        btDescanso.setBorderPainted(false);
        btDescanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescansoActionPerformed(evt);
            }
        });

        sliderDescanso.setBackground(new java.awt.Color(255, 255, 255));
        sliderDescanso.setMajorTickSpacing(5);
        sliderDescanso.setMaximum(30);
        sliderDescanso.setMinimum(5);
        sliderDescanso.setPaintLabels(true);
        sliderDescanso.setPaintTicks(true);
        sliderDescanso.setToolTipText("");
        sliderDescanso.setValue(5);
        sliderDescanso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderDescansoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnTarefasLayout = new javax.swing.GroupLayout(pnTarefas);
        pnTarefas.setLayout(pnTarefasLayout);
        pnTarefasLayout.setHorizontalGroup(
            pnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTarefasLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnTarefasLayout.createSequentialGroup()
                        .addComponent(sliderDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        pnTarefasLayout.setVerticalGroup(
            pnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTarefasLayout.createSequentialGroup()
                .addGroup(pnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderDescanso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pnDicasSugestoes.setBackground(new java.awt.Color(204, 204, 204));
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
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnDicasSugestoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnVerTempo, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addComponent(pnVerTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDicasSugestoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(pnTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnOpcoes.setBackground(new java.awt.Color(102, 102, 255));

        btPausa.setBackground(new java.awt.Color(255, 204, 204));
        btPausa.setForeground(new java.awt.Color(204, 204, 255));
        btPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1486348534-music-pause-stop-control-play_80459.png"))); // NOI18N
        btPausa.setText("Parar");
        btPausa.setBorderPainted(false);
        btPausa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btPausa.setOpaque(false);
        btPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPausaActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(204, 255, 204));
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_broom_32px_1.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setBorderPainted(false);
        btLimpar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btMenu.setBackground(new java.awt.Color(232, 255, 232));
        btMenu.setBorderPainted(false);
        btMenu.setOpaque(false);
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 204, 204));
        btExcluir.setForeground(new java.awt.Color(204, 204, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-excluir-26.png"))); // NOI18N
        btExcluir.setText("Deletar");
        btExcluir.setBorderPainted(false);
        btExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btExcluir.setOpaque(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lbNomeProjeto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeProjeto.setForeground(new java.awt.Color(204, 204, 255));
        lbNomeProjeto.setText("JPomodoro");
        lbNomeProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btPomodoro.setBackground(new java.awt.Color(204, 255, 204));
        btPomodoro.setForeground(new java.awt.Color(204, 204, 255));
        btPomodoro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apple.png"))); // NOI18N
        btPomodoro.setText("Pomodoro");
        btPomodoro.setBorderPainted(false);
        btPomodoro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btPomodoro.setOpaque(false);
        btPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPomodoroActionPerformed(evt);
            }
        });

        btCronometro.setBackground(new java.awt.Color(204, 255, 204));
        btCronometro.setForeground(new java.awt.Color(204, 204, 255));
        btCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico-cronometro.png"))); // NOI18N
        btCronometro.setText("Cronômetro");
        btCronometro.setBorderPainted(false);
        btCronometro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCronometro.setMaximumSize(new java.awt.Dimension(81, 23));
        btCronometro.setMinimumSize(new java.awt.Dimension(81, 23));
        btCronometro.setOpaque(false);
        btCronometro.setPreferredSize(new java.awt.Dimension(81, 23));
        btCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCronometroActionPerformed(evt);
            }
        });

        brNovaAtividade.setBackground(new java.awt.Color(255, 204, 204));
        brNovaAtividade.setForeground(new java.awt.Color(204, 204, 255));
        brNovaAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mais.png"))); // NOI18N
        brNovaAtividade.setText("Nova atividade");
        brNovaAtividade.setBorderPainted(false);
        brNovaAtividade.setOpaque(false);
        brNovaAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brNovaAtividadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnOpcoesLayout = new javax.swing.GroupLayout(pnOpcoes);
        pnOpcoes.setLayout(pnOpcoesLayout);
        pnOpcoesLayout.setHorizontalGroup(
            pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btPausa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(brNovaAtividade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
            .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnOpcoesLayout.createSequentialGroup()
                .addGroup(pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPomodoro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnOpcoesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnOpcoesLayout.createSequentialGroup()
                                .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnOpcoesLayout.setVerticalGroup(
            pnOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnOpcoesLayout.createSequentialGroup()
                .addComponent(lbNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(brNovaAtividade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btPomodoro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPausa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addGap(69, 69, 69)
                .addComponent(btLimpar)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(531, 442));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
        
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
        
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged
    
    // Método usado para arrastar a tela 
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_formMousePressed

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

    private void btPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPausaActionPerformed

        if (pomodoroStatus) {
            pomodoroStatus = false;
            pomodoro = new Pomodoro();
            pomodoro.parar();
            p.interrupt();
            btCronometro.setEnabled ( true );
            btPomodoro.setEnabled ( true );
            btDescanso.setEnabled ( true );

        }

        if (cronometroStatus) {
            cronometroStatus = false;
            cronometro = new Cronometro();
            cronometro.parar();
            c.interrupt();
            btCronometro.setEnabled ( true );
            btPomodoro.setEnabled ( true );
            btDescanso.setEnabled ( true );

        }

        if (descansoStatus) {
            descansoStatus = false;
            descanso = new Descanso();
            descanso.parar();
            d.interrupt();
            btCronometro.setEnabled ( true );
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

    private void btEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btEncerrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        model.clear();
        jlAtividades.setModel(model);
        btLimpar.setOpaque(false);
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // Exclui o item selecionado
        model.remove(jlAtividades.getSelectedIndex());
        jlAtividades.setModel(model);
        
    }//GEN-LAST:event_btExcluirActionPerformed

   /**
     * Em seguida de dois cliques em algum item do JList marcar a atividade como
     * concluida.
     */
    private void jlAtividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAtividadesMouseClicked
        if (evt.getClickCount() == 2) {
            cTempo = new ContadorTempo();
            cTempo.parar();
            int index = jlAtividades.locationToIndex(evt.getPoint());
            model.addElement(cTempo.parar()+" | "+jlAtividades.getSelectedValue().toString());
            model.remove(jlAtividades.getSelectedIndex());
            jlAtividades.setModel(model);

        }      
    }//GEN-LAST:event_jlAtividadesMouseClicked

   /**
     * No futuro este botão servirá para exibir um menu com opções avançadas.
     */
    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        JOptionPane.showMessageDialog(null,"Em breve","Painel avançado",JOptionPane.ERROR_MESSAGE);
        
        
    }//GEN-LAST:event_btMenuActionPerformed

    private void sliderDescansoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderDescansoStateChanged
        lbContadorTempo.setText(sliderDescanso.getValue() + ":00");
    }//GEN-LAST:event_sliderDescansoStateChanged

    private void brNovaAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brNovaAtividadeActionPerformed
        adicionarTarefa();
        
    }//GEN-LAST:event_brNovaAtividadeActionPerformed

     
    /**
     * Se a variável criandoTarefa alimentada pelo JOptionPane não for vazia
     * adiciona um item a lista
     */
    public void adicionarTarefa() {
        criandoTarefa = JOptionPane.showInputDialog("Qual atividade de seja adicionar?");
        if (!criandoTarefa.isEmpty()) {
            periodo = new Periodoo();
            cTempo = new ContadorTempo();
            cTempo.comecar();
            model.addElement(periodo.tempoAgora()+" "+criandoTarefa);
            jlAtividades.setModel(model);
            pack();
            
            
        
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
    private javax.swing.JButton brNovaAtividade;
    private javax.swing.JButton btCronometro;
    private javax.swing.JButton btDescanso;
    private javax.swing.JButton btEncerrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btPausa;
    private javax.swing.JButton btPomodoro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlAtividades;
    private javax.swing.JLabel lbContadorTempo;
    private javax.swing.JLabel lbNomeProjeto;
    private javax.swing.JLabel lbSugestao;
    private javax.swing.JLabel lbTagDica;
    private javax.swing.JPanel pnDicasSugestoes;
    private javax.swing.JPanel pnOpcoes;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnTarefas;
    private javax.swing.JPanel pnVerTempo;
    private javax.swing.JSlider sliderDescanso;
    // End of variables declaration//GEN-END:variables
}
