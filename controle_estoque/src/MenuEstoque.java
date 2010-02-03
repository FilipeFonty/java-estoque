/*
 * MenuEstoque.java
 *
 * Created on 7 de Abril de 2009, 09:59
 */

/**
 *
 * @author  martins
 */

import cadastro.*;
import utilitarios.data;
public class MenuEstoque extends javax.swing.JFrame {
data mostra_data = new data();
    /** Creates new form MenuEstoque */
    public MenuEstoque()
    {
        initComponents();   
        
        mostra_data.le_data();
        label_data.setText("Data: "+mostra_data.dia_semana+" , "+mostra_data.dia+" de "+mostra_data.mes+" de "+mostra_data.ano);
        timer1.start();
       }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        clente = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        cidade = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        bairro = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        sairIcone = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label_data = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        funcionario = new javax.swing.JMenuItem();
        Cargo = new javax.swing.JMenuItem();
        Cidade = new javax.swing.JMenuItem();
        Bairro = new javax.swing.JMenuItem();
        Fornecedores = new javax.swing.JMenuItem();
        endereco = new javax.swing.JMenuItem();
        Estoque = new javax.swing.JMenu();
        impatacao = new javax.swing.JMenuItem();
        Entrada = new javax.swing.JMenuItem();
        saida = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        sair = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        Consulta = new javax.swing.JMenu();
        Relat�rio = new javax.swing.JMenu();
        Utilit�rio = new javax.swing.JMenu();
        Sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA PARA GEST�O DE ESTOQUE");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jToolBar1.setBackground(java.awt.SystemColor.inactiveCaption);
        jToolBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.setRollover(true);

        clente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/clientes2.jpg"))); // NOI18N
        clente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clenteActionPerformed(evt);
            }
        });
        jToolBar1.add(clente);
        jToolBar1.add(jSeparator3);

        cidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/bairros.jpg"))); // NOI18N
        cidade.setToolTipText("cadastro de cidades");
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        jToolBar1.add(cidade);
        jToolBar1.add(jSeparator4);

        bairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/bairro5.jpg"))); // NOI18N
        bairro.setToolTipText("cadastro de bairros");
        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });
        jToolBar1.add(bairro);
        jToolBar1.add(jSeparator5);

        sairIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botoes/sair.jpg"))); // NOI18N
        sairIcone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairIconeActionPerformed(evt);
            }
        });
        jToolBar1.add(sairIcone);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(10, 10, 750, 50);

        label_data.setFont(new java.awt.Font("Tahoma", 1, 14));
        label_data.setText("Data.:");

        label_hora.setText("Hora:");

        jLabel4.setText("jLabel4");
        jLabel4.setBounds(0, 0, -1, -1);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 255), null, null));

        Cadastro.setText("Cadastro");

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        Cadastro.add(Cliente);

        funcionario.setText("Funcionario");
        Cadastro.add(funcionario);

        Cargo.setText("Cargo");
        Cadastro.add(Cargo);

        Cidade.setText("Cidade");
        Cadastro.add(Cidade);

        Bairro.setText("Bairro");
        Cadastro.add(Bairro);

        Fornecedores.setText("Fornecedores");
        Cadastro.add(Fornecedores);

        endereco.setText("Endereco");
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        Cadastro.add(endereco);

        Estoque.setText("Estoque");

        impatacao.setText("Implantacao");
        Estoque.add(impatacao);

        Entrada.setText("Entrada");
        Estoque.add(Entrada);

        saida.setText("Sa�da");
        Estoque.add(saida);

        Cadastro.add(Estoque);
        Cadastro.add(jSeparator1);

        sair.setText("Sair");
        Cadastro.add(sair);
        Cadastro.add(jSeparator2);

        jMenuBar1.add(Cadastro);

        Consulta.setText("Consulta");
        jMenuBar1.add(Consulta);

        Relat�rio.setLabel("Relatorio");
        jMenuBar1.add(Relat�rio);

        Utilit�rio.setLabel("Utilitarios");
        jMenuBar1.add(Utilit�rio);

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenuBar1.add(Sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(848, 848, 848)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)))
                .addGap(478, 478, 478)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1151, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(139, 139, 139))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3337, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_data, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2634, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(180, 180, 180)
                .addComponent(label_data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_hora)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-786)/2, (screenSize.height-557)/2, 786, 557);
    }// </editor-fold>//GEN-END:initComponents

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
    new logradouro().show();
    }//GEN-LAST:event_enderecoActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
     new bairro().show();
    }//GEN-LAST:event_bairroActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
// TODO add your handling code here:
        mostra_data.le_hora();
        label_hora.setText("Hora: "+mostra_data.hora);
    }//GEN-LAST:event_timer1OnTime

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
      System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_SairMouseClicked

    private void sairIconeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairIconeActionPerformed
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_sairIconeActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
         new cad_cidade().show();       // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void clenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clenteActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEstoque().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bairro;
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cargo;
    private javax.swing.JMenuItem Cidade;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenu Consulta;
    private javax.swing.JMenuItem Entrada;
    private javax.swing.JMenu Estoque;
    private javax.swing.JMenuItem Fornecedores;
    private javax.swing.JMenu Relat�rio;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu Utilit�rio;
    private javax.swing.JButton bairro;
    private javax.swing.JButton cidade;
    private javax.swing.JButton clente;
    private javax.swing.JMenuItem endereco;
    private javax.swing.JMenuItem funcionario;
    private javax.swing.JMenuItem impatacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_hora;
    private javax.swing.JMenuItem saida;
    private javax.swing.JMenuItem sair;
    private javax.swing.JButton sairIcone;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
    
}
