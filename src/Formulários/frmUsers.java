package Formulários;

import Classes.Dados;
import Classes.Users;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmUsers extends javax.swing.JInternalFrame {
private Dados clsDados;
private int atualuser =0;
private boolean cmdnovo=false;
private DefaultTableModel UserTable;


public void setDados(Dados clsDados){
    this.clsDados=clsDados;
}

    public frmUsers() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcoduser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtname1 = new javax.swing.JTextField();
        cmbprofile = new javax.swing.JComboBox<>();
        cmdn = new javax.swing.JButton();
        cmdp = new javax.swing.JButton();
        cmdf = new javax.swing.JButton();
        cmdl = new javax.swing.JButton();
        cmdadd = new javax.swing.JButton();
        cmdedit = new javax.swing.JButton();
        cmdsave = new javax.swing.JButton();
        cmdsearch = new javax.swing.JButton();
        cmdcancel = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        txtsenha1 = new javax.swing.JPasswordField();
        cmddel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cadastro de Usuários");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("Cód. Usuário: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Sobrenome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Conf Senha:");

        txtcoduser.setEnabled(false);
        txtcoduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoduserActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Perfil:");

        txtname.setEnabled(false);

        txtname1.setEnabled(false);
        txtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname1ActionPerformed(evt);
            }
        });

        cmbprofile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Perfil", "Administrador", "Funcionario" }));
        cmbprofile.setEnabled(false);
        cmbprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbprofileActionPerformed(evt);
            }
        });

        cmdn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        cmdn.setToolTipText("Próximo");
        cmdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnActionPerformed(evt);
            }
        });

        cmdp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow1.png"))); // NOI18N
        cmdp.setToolTipText("Anterior");
        cmdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpActionPerformed(evt);
            }
        });

        cmdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow3.png"))); // NOI18N
        cmdf.setToolTipText("Primeiro Registro");
        cmdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdfActionPerformed(evt);
            }
        });

        cmdl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow2.png"))); // NOI18N
        cmdl.setToolTipText("Último Registro");
        cmdl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdlActionPerformed(evt);
            }
        });

        cmdadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        cmdadd.setToolTipText("Adicionar Cadastro");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        cmdedit.setToolTipText("Editar Cadastro");
        cmdedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditActionPerformed(evt);
            }
        });

        cmdsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        cmdsave.setToolTipText("Salvar Cadastro");
        cmdsave.setEnabled(false);
        cmdsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsaveActionPerformed(evt);
            }
        });

        cmdsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        cmdsearch.setToolTipText("Buscar Cadastro");
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });

        cmdcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove.png"))); // NOI18N
        cmdcancel.setToolTipText("Cancelar Cadastro");
        cmdcancel.setEnabled(false);
        cmdcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelActionPerformed(evt);
            }
        });

        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });

        cmddel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove1.png"))); // NOI18N
        cmddel.setToolTipText("Deletar Cadastro");
        cmddel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddelActionPerformed(evt);
            }
        });

        mtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mtable.setToolTipText("");
        jScrollPane1.setViewportView(mtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                            .addComponent(txtcoduser, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtname1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtsenha))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(txtsenha1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(cmdadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(cmddel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdsave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(cmdcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(cmdf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(cmdl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcoduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(cmdcancel)
                    .addComponent(cmdadd)
                    .addComponent(cmdsearch))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmddel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtsenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(cmdn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbprofileActionPerformed

    private void txtcoduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoduserActionPerformed

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed
        // BOTAO DE ADICIONAR
        cmdf.setEnabled(false);
        cmdl.setEnabled(false);
        cmdp.setEnabled(false);
        cmdn.setEnabled(false);
        cmdedit.setEnabled(false);
        cmdadd.setEnabled(false);
        cmdcancel.setEnabled(true);
        cmdsave.setEnabled(true);
        cmdsearch.setEnabled(false);
        
        txtcoduser.setEnabled(true);
        txtname.setEnabled(true);
        txtname1.setEnabled(true);
        txtsenha.setEnabled(true);
        txtsenha1.setEnabled(true);
        cmbprofile.setEnabled(true);
        
        txtcoduser.setText("");
        txtname.setText("");
        txtname1.setText("");
        txtsenha.setText("");
        txtsenha.setText("");
        txtsenha1.setText("");
        cmbprofile.setSelectedIndex(0);
        txtcoduser.requestFocusInWindow();
        cmdnovo=true;
        loadTable();
        
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
//VALDIDAR USERS:
        if(txtcoduser.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CÓDIGO PARA REALIZAR SEU CADASTRO");
            txtcoduser.requestFocusInWindow();
            return;
        }
        if(cmbprofile.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE O PERFIL PARA REALIZAR SEU CADASTRO");
            cmbprofile.requestFocusInWindow();
            return;
        }
        if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O NOME PARA REALIZAR SEU CADASTRO");
            txtname.requestFocusInWindow();
            return;
        }
        if(txtname1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O SOBRENOME PARA REALIZAR SEU CADASTRO");
            txtname1.requestFocusInWindow();
            return;
        }
        
        String ssenha= new String (txtsenha.getPassword());
        String ssenha1= new String (txtsenha1.getPassword());
        
        if(ssenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE A SENHA PARA REALIZAR SEU CADASTRO");
            txtsenha.requestFocusInWindow();
            return;
        }
        if(ssenha1.equals("")){
            JOptionPane.showMessageDialog(rootPane, "CONFRIME A SENHA PARA REALIZAR SEU CADASTRO");
            txtsenha1.requestFocusInWindow();
            return;
        }
        if(!ssenha.equals(ssenha1)){
            JOptionPane.showMessageDialog(rootPane, "AS SENHAS NÃO COINCIDEM!!");
            txtsenha.requestFocusInWindow();
            return;
        }
        int posline=clsDados.LUser(txtcoduser.getText());
        if(cmdnovo){
            if (posline != -1){
            JOptionPane.showMessageDialog(rootPane, "CADASTRO EXISTENTE");
            txtcoduser.requestFocusInWindow();
            return;
        }
        }
        else{
            if (posline == -1){
                JOptionPane.showMessageDialog(rootPane, "CADASTRO INEXISTENTE");
                txtcoduser.requestFocusInWindow();
                return;
            }
        }
        Users mmusers= new Users(txtcoduser.getText(), txtname.getText(), txtname1.getText(), ssenha,  cmbprofile.getSelectedIndex());
        String msg;
        if(cmdnovo){
            msg=clsDados.cadUser(mmusers);
        }else{
            msg=clsDados.edUser(mmusers, posline);
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
        loadTable();
        atualuser=0;
        viewCad();
        clsDados.Cg();

// BOTÃO SALVAR:
        
        cmdf.setEnabled(true);
        cmdl.setEnabled(true);
        cmdp.setEnabled(true);
        cmdn.setEnabled(true);
        cmdedit.setEnabled(true);
        cmdadd.setEnabled(true);
        cmdcancel.setEnabled(false);
        cmdsave.setEnabled(false);
        cmdsearch.setEnabled(true);
        
        txtcoduser.setEnabled(false);
        txtname.setEnabled(false);
        txtname1.setEnabled(false);
        txtsenha.setEnabled(false);
        txtsenha1.setEnabled(false);
        cmbprofile.setEnabled(false);
        
        txtcoduser.setText("");
        txtname.setText("");
        txtname1.setText("");
        txtsenha.setText("");
        txtsenha.setText("");
        txtsenha1.setText("");
        cmbprofile.setSelectedIndex(0);
    
    }//GEN-LAST:event_cmdsaveActionPerformed

    private void cmdcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelActionPerformed
        // BOTÃO CANCELAR
        cmdf.setEnabled(true);
        cmdl.setEnabled(true);
        cmdp.setEnabled(true);
        cmdn.setEnabled(true);
        cmdedit.setEnabled(true);
        cmdadd.setEnabled(true);
        cmdcancel.setEnabled(false);
        cmdsave.setEnabled(false);
        cmdsearch.setEnabled(true);
        
        
        txtcoduser.setEnabled(false);
        txtname.setEnabled(false);
        txtname1.setEnabled(false);
        txtsenha.setEnabled(false);
        txtsenha1.setEnabled(false);
        cmbprofile.setEnabled(false);
        
        txtcoduser.setText("");
        txtname.setText("");
        txtname1.setText("");
        txtsenha.setText("");
        txtsenha.setText("");
        txtsenha1.setText("");
        cmbprofile.setSelectedIndex(0);
    }//GEN-LAST:event_cmdcancelActionPerformed

    private void txtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname1ActionPerformed

    private void cmdeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditActionPerformed
        // BOTAO EDITAR:
        cmdf.setEnabled(false);
        cmdl.setEnabled(false);
        cmdp.setEnabled(false);
        cmdn.setEnabled(false);
        cmdedit.setEnabled(false);
        cmdadd.setEnabled(false);
        cmdcancel.setEnabled(true);
        cmdsave.setEnabled(true);
        cmdsearch.setEnabled(false);
        
        
        txtname.setEnabled(true);
        txtname1.setEnabled(true);
        txtsenha.setEnabled(true);
        txtsenha1.setEnabled(true);
        cmbprofile.setEnabled(true);
        
        
        cmdnovo=false;
        txtname.requestFocusInWindow();
    }//GEN-LAST:event_cmdeditActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        viewCad();
        loadTable();
    }//GEN-LAST:event_formInternalFrameOpened
    private void viewCad(){
        txtcoduser.setText(clsDados.getUsuarios()[atualuser].getCodusuario());
        txtname.setText(clsDados.getUsuarios()[atualuser].getNome());
        txtname1.setText(clsDados.getUsuarios()[atualuser].getSobrenome());
        txtsenha.setText(clsDados.getUsuarios()[atualuser].getSenha());
        txtsenha1.setText(clsDados.getUsuarios()[atualuser].getSenha());
        cmbprofile.setSelectedIndex(clsDados.getUsuarios()[atualuser].getPerfil());
        
        txtcoduser.setEnabled(false);
        txtname.setEnabled(false);
        txtname1.setEnabled(false);
        txtsenha.setEnabled(false);
        txtsenha1.setEnabled(false);
        cmbprofile.setEnabled(false);
    }
    private void loadTable(){
        String header[]={"Cod Usuário","Nome","Sobrenome","Perfil"};
        String regcad[]= new String [4];
        UserTable= new DefaultTableModel(null, header);
        for(int i=0; i<clsDados.nuser(); i++){
            regcad[0]=clsDados.getUsuarios()[i].getCodusuario();
            regcad[1]=clsDados.getUsuarios()[i].getNome();
            regcad[2]=clsDados.getUsuarios()[i].getSobrenome();
            regcad[3]=Pfl(clsDados.getUsuarios()[i].getPerfil());
            
            UserTable.addRow(regcad);
            
        }
        mtable.setModel(UserTable);   
    }
    private String Pfl(int idprofile){
        switch(idprofile){
            case 1: return "ADMINISTRADOR";
            case 2: return "FUNCIONÁRIO";
            
            default: return "SEM PERFIL"; 
        }
    }
    
    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void cmdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdfActionPerformed
        // BOTAO PRIEMIRO REGISTRO
        atualuser =0;
        viewCad();
    }//GEN-LAST:event_cmdfActionPerformed

    private void cmdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlActionPerformed
        // BOTÃO ÚLTIMO REGISTRO
        atualuser= clsDados.nuser()-1;
        viewCad();
    }//GEN-LAST:event_cmdlActionPerformed

    private void cmdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnActionPerformed
        // BOTAO PROXIMO
        atualuser++;
        if(atualuser==clsDados.nuser()){
            atualuser=0;
        }
        viewCad();
    }//GEN-LAST:event_cmdnActionPerformed

    private void cmdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpActionPerformed
        // BOTAO ANTERIOR
        atualuser--;
        if(atualuser==-1){
            atualuser=clsDados.nuser()-1;
        }
        viewCad();
    }//GEN-LAST:event_cmdpActionPerformed

    private void cmddelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddelActionPerformed
        // BOTAO DELETAR CADASTRO
        int delete=JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESSE CADASTRO?");
        if(delete!=0){
            return;
        }
        String msg;
        msg=clsDados.delUser(atualuser);
        JOptionPane.showMessageDialog(rootPane, msg);
        atualuser=0;
        viewCad();
        loadTable();
    }//GEN-LAST:event_cmddelActionPerformed

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
        // BOTAO BUSCAR
        String us= JOptionPane.showInputDialog("DIGITE O CÓDIGO DO USUÁRIO QUE DESEJA BUSCAR");
        if(us.equals("")){
            return;
        }
        int pl=clsDados.LUser(us);
        if (pl==-1){
            JOptionPane.showMessageDialog(rootPane,"NÃO FOI POSSIVEL ACHAR ESSE CADASTRO");
            return;
        }
        atualuser=pl;
        viewCad();
    }//GEN-LAST:event_cmdsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbprofile;
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmdcancel;
    private javax.swing.JButton cmddel;
    private javax.swing.JButton cmdedit;
    private javax.swing.JButton cmdf;
    private javax.swing.JButton cmdl;
    private javax.swing.JButton cmdn;
    private javax.swing.JButton cmdp;
    private javax.swing.JButton cmdsave;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mtable;
    private javax.swing.JTextField txtcoduser;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JPasswordField txtsenha1;
    // End of variables declaration//GEN-END:variables
}
