package Formulários;

import Classes.Dados;
import javax.swing.JOptionPane;

public class frmChangePass extends javax.swing.JDialog {
    private String senha;
    private String usuario;
    private Dados clsDados;
    
    public void setupUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setupSenha(String senha){
        this.senha=senha;
    }
    public void setDados(Dados clsDados){
    this.clsDados=clsDados;
}
    public frmChangePass(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtatualpass = new javax.swing.JPasswordField();
        txtnewpass = new javax.swing.JPasswordField();
        txtconfpass = new javax.swing.JPasswordField();
        cmdconf = new javax.swing.JButton();
        cmdcanc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Senha Atual:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nova Senha: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Confirmar Senha:");

        txtatualpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cmdconf.setText("Confirmar");
        cmdconf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdconfActionPerformed(evt);
            }
        });

        cmdcanc.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdconf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(cmdcanc))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtatualpass)
                            .addComponent(txtnewpass)
                            .addComponent(txtconfpass, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtatualpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtconfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdconf)
                    .addComponent(cmdcanc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdconfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdconfActionPerformed
// BOTAO CONFIRMAR:
        String atualp=new String(txtatualpass.getPassword());
        String newp=new String(txtnewpass.getPassword());
        String confp=new String(txtconfpass.getPassword());
// VERIFICANDO OS CAMPOS:
        if(atualp.equals("")){
            JOptionPane.showMessageDialog(rootPane,"DIGITE A SUA SENHA ATUAL");
            txtatualpass.requestFocusInWindow();
            return;
        }
        if(newp.equals("")){
            JOptionPane.showMessageDialog(rootPane,"DIGITE A NOVA  SENHA QUE VOCÊ DESEJA");
            txtnewpass.requestFocusInWindow();
            return;
        }
        if(confp.equals("")){
            JOptionPane.showMessageDialog(rootPane,"DIGITE A NOVA  SENHA QUE VOCÊ DESEJA");
            txtconfpass.requestFocusInWindow();
            return;
        }
// VERIFICANDO SE A NOVA SENHA E A CONFIRMAÇÃO COINCIDEM:
        if(!atualp.equals(senha)){
            JOptionPane.showMessageDialog(rootPane,"DIGITE A NOVA SENHA QUE VOCÊ DESEJ:");
            txtatualpass.setText("");
            txtatualpass.requestFocusInWindow();
            return;
        }
        if(!newp.equals(confp)){
            JOptionPane.showMessageDialog(rootPane,"DIGITE A NOVA SENHA QUE VOCÊ DESEJA");
            txtconfpass.setText("");
            txtconfpass.requestFocusInWindow();
            return;
        }
        clsDados.changePass(usuario, newp);
        JOptionPane.showMessageDialog(rootPane,"SENHA ALTERADA!");
        this.dispose();
        
    }//GEN-LAST:event_cmdconfActionPerformed

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
            java.util.logging.Logger.getLogger(frmChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmChangePass dialog = new frmChangePass(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdcanc;
    private javax.swing.JButton cmdconf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtatualpass;
    private javax.swing.JPasswordField txtconfpass;
    private javax.swing.JPasswordField txtnewpass;
    // End of variables declaration//GEN-END:variables
}
