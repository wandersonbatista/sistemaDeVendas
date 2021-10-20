package Formulários;

import Classes.Dados;
import Classes.BackGround;

public class frmMenu extends javax.swing.JFrame {
private Dados clsDados;
private int perfil;
private String senha;
private String usuario;


    public void setDados(Dados clsDados){
        this.clsDados=clsDados;
    }
    public void setupPerfil(int perfil){
        this.perfil=perfil;
    }
    public void setupSenha(String senha){
        this.senha=senha;
    }
    public void setupUsuario(String usuario){
        this.usuario=usuario;
    }

    public frmMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        deskPane = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnfile = new javax.swing.JMenu();
        mnfileclient = new javax.swing.JMenuItem();
        mnfileproduct = new javax.swing.JMenuItem();
        mnfileuser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnfilealtpass = new javax.swing.JMenuItem();
        mnfilealtuser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnfilesair = new javax.swing.JMenuItem();
        mnmov = new javax.swing.JMenu();
        mnmovsale = new javax.swing.JMenuItem();
        mnmovrel = new javax.swing.JMenuItem();
        mnhelp = new javax.swing.JMenu();
        mnhelpsobre = new javax.swing.JMenuItem();
        mnhelpajuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        deskPane.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout deskPaneLayout = new javax.swing.GroupLayout(deskPane);
        deskPane.setLayout(deskPaneLayout);
        deskPaneLayout.setHorizontalGroup(
            deskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        deskPaneLayout.setVerticalGroup(
            deskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        mnfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); // NOI18N
        mnfile.setText("Arquivos");

        mnfileclient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/client.png"))); // NOI18N
        mnfileclient.setText("Clientes");
        mnfileclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnfileclientActionPerformed(evt);
            }
        });
        mnfile.add(mnfileclient);

        mnfileproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        mnfileproduct.setText("Produtos");
        mnfileproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnfileproductActionPerformed(evt);
            }
        });
        mnfile.add(mnfileproduct);

        mnfileuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        mnfileuser.setText("Usuários");
        mnfileuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnfileuserActionPerformed(evt);
            }
        });
        mnfile.add(mnfileuser);
        mnfile.add(jSeparator1);

        mnfilealtpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N
        mnfilealtpass.setText("Alterar Senha");
        mnfilealtpass.setToolTipText("");
        mnfilealtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnfilealtpassActionPerformed(evt);
            }
        });
        mnfile.add(mnfilealtpass);

        mnfilealtuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        mnfilealtuser.setText("Alterar Usuário");
        mnfilealtuser.setToolTipText("");
        mnfilealtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnfilealtuserActionPerformed(evt);
            }
        });
        mnfile.add(mnfilealtuser);
        mnfile.add(jSeparator2);

        mnfilesair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        mnfilesair.setText("Sair");
        mnfilesair.setToolTipText("");
        mnfilesair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnfilesairActionPerformed(evt);
            }
        });
        mnfile.add(mnfilesair);

        jMenuBar1.add(mnfile);

        mnmov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cash.png"))); // NOI18N
        mnmov.setText("Movimentos");

        mnmovsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sales.png"))); // NOI18N
        mnmovsale.setText("Vendas");
        mnmovsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmovsaleActionPerformed(evt);
            }
        });
        mnmov.add(mnmovsale);

        mnmovrel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        mnmovrel.setText("Relatórios de Vendas");
        mnmov.add(mnmovrel);

        jMenuBar1.add(mnmov);

        mnhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        mnhelp.setText("Ajuda");

        mnhelpsobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        mnhelpsobre.setText("Sobre");
        mnhelpsobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnhelpsobreActionPerformed(evt);
            }
        });
        mnhelp.add(mnhelpsobre);

        mnhelpajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help1.png"))); // NOI18N
        mnhelpajuda.setText("Ajuda");
        mnhelp.add(mnhelpajuda);

        jMenuBar1.add(mnhelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnfileproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnfileproductActionPerformed
//CÓDIGO DO BOTÃO PRODUTOS -> MENU ARQUIVOS:
        frmProducts fproduct = new frmProducts();
        fproduct.setDados(clsDados);
        deskPane.add(fproduct);
        fproduct.show();
    }//GEN-LAST:event_mnfileproductActionPerformed

    private void mnfileuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnfileuserActionPerformed
// CÓDIGO DO BOTÃO USUÁRIOS -> MENU ARQUIVOS:
        frmUsers fuser = new frmUsers();
        fuser.setDados(clsDados);
        deskPane.add(fuser);
        fuser.show();
    }//GEN-LAST:event_mnfileuserActionPerformed

    private void mnfilealtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnfilealtpassActionPerformed
// CÓDIGO DO BOTÃO ALT. SENHA -> MENU ARQUIVOS:
        frmChangePass malt = new frmChangePass(this, rootPaneCheckingEnabled);
        malt.setupSenha(senha);
        malt.setupUsuario(usuario);
        malt.setDados(clsDados);
        malt.setLocationRelativeTo(this);
        malt.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnfilealtpassActionPerformed

    private void mnfilesairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnfilesairActionPerformed
//CÓDIGO BOTAO SAIR -> MENU ARQUIVOS:
        clsDados.Cg();
        System.exit(0);
    }//GEN-LAST:event_mnfilesairActionPerformed

    private void mnfileclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnfileclientActionPerformed
// CÓDIGO DO BOTÃO CLIENTES -> MENU ARQUIVOS
        frmClients fclient = new frmClients();
        fclient.setDados(clsDados);
        deskPane.add(fclient);
        fclient.show();
    }//GEN-LAST:event_mnfileclientActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// PLANO DE FUNDO:
        ((BackGround)deskPane).setImagem("/images/bg.jpg");
        if(perfil==2){
            mnfileuser.setEnabled(false);
            mnfileproduct.setEnabled(false);
            mnfileclient.setEnabled(false);
            mnmovrel.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mnfilealtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnfilealtuserActionPerformed
// CÓDIGO DO BOTÃO ALT. USUARIOS -> MENU ARQUIVOS:
        this.setVisible(false);
        frmLog mlogs = new frmLog();
        mlogs.setDados(clsDados);
        mlogs.setLocationRelativeTo(null);
        mlogs.setVisible(true);
    }//GEN-LAST:event_mnfilealtuserActionPerformed

    private void mnhelpsobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnhelpsobreActionPerformed
// CÓDIGO DO BOTÃO SOBRE -> MENU AJUDA:
        frmAbout fabout=new frmAbout(this, rootPaneCheckingEnabled);
        fabout.setLocationRelativeTo(this);
        fabout.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnhelpsobreActionPerformed

    private void mnmovsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmovsaleActionPerformed
// CÓDIGO DO BOTÃO VENDAS -> MENU MOVIMENTOS:
        frmSaleControl frmsale = new frmSaleControl();
        frmsale.setDados(clsDados);
        deskPane.add(frmsale);
        frmsale.show();
    }//GEN-LAST:event_mnmovsaleActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnfile;
    private javax.swing.JMenuItem mnfilealtpass;
    private javax.swing.JMenuItem mnfilealtuser;
    private javax.swing.JMenuItem mnfileclient;
    private javax.swing.JMenuItem mnfileproduct;
    private javax.swing.JMenuItem mnfilesair;
    private javax.swing.JMenuItem mnfileuser;
    private javax.swing.JMenu mnhelp;
    private javax.swing.JMenuItem mnhelpajuda;
    private javax.swing.JMenuItem mnhelpsobre;
    private javax.swing.JMenu mnmov;
    private javax.swing.JMenuItem mnmovrel;
    private javax.swing.JMenuItem mnmovsale;
    // End of variables declaration//GEN-END:variables
}
