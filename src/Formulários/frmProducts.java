package Formulários;

import Classes.Dados;
import Classes.Products;
import Classes.Utility;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmProducts extends javax.swing.JInternalFrame {
private Dados clsDados;
private int atualproduct =0;
private boolean cmdnovo=false;
private DefaultTableModel UserTable;


public void setDados(Dados clsDados){
    this.clsDados=clsDados;
}

    public frmProducts() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodproduct = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        cmbtx = new javax.swing.JComboBox<>();
        cmdn = new javax.swing.JButton();
        cmdp = new javax.swing.JButton();
        cmdf = new javax.swing.JButton();
        cmdl = new javax.swing.JButton();
        cmdadd = new javax.swing.JButton();
        cmdedit = new javax.swing.JButton();
        cmdsave = new javax.swing.JButton();
        cmdsearch = new javax.swing.JButton();
        cmdcancel = new javax.swing.JButton();
        cmddel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();
        txtobs = new javax.swing.JTextField();

        setClosable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
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
        jLabel1.setText("Cód. Produto: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Obs.:");

        txtcodproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodproductActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Taxa");

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        txtdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescActionPerformed(evt);
            }
        });

        cmbtx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Taxa", "10%", "15%", "20%" }));
        cmbtx.setEnabled(false);
        cmbtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtxActionPerformed(evt);
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
        cmdadd.setToolTipText("Adicionar Produto");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        cmdedit.setToolTipText("Editar Produto");
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
        cmdsearch.setToolTipText("Buscar Produto");
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

        cmddel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove1.png"))); // NOI18N
        cmddel.setToolTipText("Deletar Produto");
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

        txtobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcodproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdesc)
                                    .addComponent(txtobs))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmdedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmdadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmdsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmddel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmdsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmdcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cmdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbtx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtcodproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtobs)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdcancel)
                            .addComponent(cmdadd)
                            .addComponent(cmdsearch))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmddel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdedit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(cmdp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtxActionPerformed

    private void txtcodproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodproductActionPerformed

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
        
        txtcodproduct.setEnabled(true);
        txtprice.setEnabled(true);
        txtdesc.setEnabled(true);
        txtobs.setEnabled(true);
        cmbtx.setEnabled(true);
        
        txtcodproduct.setText("");
        txtprice.setText("");
        txtdesc.setText("");
        txtobs.setText("");
        txtobs.setText("");
        
        cmbtx.setSelectedIndex(0);
        txtcodproduct.requestFocusInWindow();
        cmdnovo=true;
        loadTable();
        
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
//VALDIDAR PRODUCTS:
        if(txtcodproduct.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CÓDIGO PARA COMPLETAR O CADASTRO");
            txtcodproduct.requestFocusInWindow();
            return;
        }
        if(cmbtx.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UMA TAXA");
            cmbtx.requestFocusInWindow();
            return;
        }
        if(txtprice.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O PREÇO PARA COMPLETAR O CADASTRO");
            txtprice.requestFocusInWindow();
            return;
        }
        if(txtdesc.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ADICIONE A DESCRIÇÃO DO PRODUTO PARA COMPLETAR O CADASTRO");
            txtdesc.requestFocusInWindow();
            return;
        }
        if(txtobs.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "ADICIONE A OBSERVAÇÃO DO PRODUTO PARA COMPLETAR O CADASTRO");
            txtdesc.requestFocusInWindow();
            return;
        }
        
        if(Utility.isNum(txtprice.getText())){    
        }else{
            JOptionPane.showMessageDialog(rootPane, "ESTE CAMPO ACEITA APENAS NÚMEROS");
            txtprice.requestFocusInWindow();
            return;  
        }
        
        int pr= Integer.parseInt(txtprice.getText());
        if (pr<=0){
            JOptionPane.showMessageDialog(rootPane, "VALOR INVÁLIDO");
            txtprice.requestFocusInWindow();
            return;
        }
                      
        int posline=clsDados.LProd(txtcodproduct.getText());
        if(cmdnovo){
            if (posline != -1){
            JOptionPane.showMessageDialog(rootPane, "CADASTRO EXISTENTE");
            txtcodproduct.requestFocusInWindow();
            return;
        }
        }else{
            if (posline == -1){
                JOptionPane.showMessageDialog(rootPane, "CADASTRO INEXISTENTE");
                txtcodproduct.requestFocusInWindow();
                return;
            }
        }
        
        Products mprodutcts = new Products(txtcodproduct.getText(), txtdesc.getText(),txtobs.getText(), pr, cmbtx.getSelectedIndex());
        String msg;
        if(cmdnovo){
            msg=clsDados.cadProd(mprodutcts);
        }else{
            msg=clsDados.edProd(mprodutcts, posline);
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
        loadTable();

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
        
        txtcodproduct.setEnabled(false);
        txtprice.setEnabled(false);
        txtdesc.setEnabled(false);
        txtobs.setEnabled(false);
        cmbtx.setEnabled(false);     
        
        atualproduct=0;
        viewCad();
        clsDados.Cg();
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
        
        
        txtcodproduct.setEnabled(false);
        txtprice.setEnabled(false);
        txtdesc.setEnabled(false);
        txtobs.setEnabled(false);
        cmbtx.setEnabled(false);        
    }//GEN-LAST:event_cmdcancelActionPerformed

    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescActionPerformed

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
        
        
        txtcodproduct.setEnabled(false);
        txtprice.setEnabled(true);
        txtdesc.setEnabled(true);
        txtobs.setEnabled(true);
        cmbtx.setEnabled(true);
        
        
        cmdnovo=false;
        txtprice.requestFocusInWindow();
        loadTable();
    }//GEN-LAST:event_cmdeditActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        viewCad();
        loadTable();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void viewCad(){
        txtcodproduct.setText(clsDados.getProducts()[atualproduct].getCodproduct());
        txtprice.setText(""+clsDados.getProducts()[atualproduct].getPrice());
        txtdesc.setText(clsDados.getProducts()[atualproduct].getDescproduct());
        txtobs.setText(clsDados.getProducts()[atualproduct].getObs());
        cmbtx.setSelectedIndex(clsDados.getProducts()[atualproduct].getTxproduct());
        
        txtcodproduct.setEnabled(false);
        txtprice.setEnabled(false);
        txtdesc.setEnabled(false);
        txtobs.setEnabled(false);
        cmbtx.setEnabled(false);
    }
    private void loadTable(){
        String header[]={"Cód. Produto","Descrição","Preço","Taxa", "Obs"};
        String regcad[]= new String [5];
        UserTable= new DefaultTableModel(null, header);
        for(int i=0; i<clsDados.nprod(); i++){
            regcad[0]=clsDados.getProducts()[i].getCodproduct();
            regcad[1]=clsDados.getProducts()[i].getDescproduct();
            regcad[2]=""+clsDados.getProducts()[i].getPrice();
            regcad[3]=PflTx(clsDados.getProducts()[i].getTxproduct());
            regcad[4]=clsDados.getProducts()[i].getObs();
            
            
            UserTable.addRow(regcad);
            
        }
        mtable.setModel(UserTable);   
    }
    
    private String PflTx(int idtaxa){
        switch(idtaxa){
            case 0: return "0%";
            case 1: return "10%";
            case 2: return "15%";
            case 3: return "20%";
            default: return "SEM TAXA"; 
        }
    }
    
    private void cmdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdfActionPerformed
// BOTAO PRIEMIRO REGISTRO
        atualproduct =0;
        viewCad();
    }//GEN-LAST:event_cmdfActionPerformed

    private void cmdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlActionPerformed
// BOTÃO ÚLTIMO REGISTRO
        atualproduct= clsDados.nprod()-1;
        viewCad();
    }//GEN-LAST:event_cmdlActionPerformed

    private void cmdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnActionPerformed
// BOTAO PROXIMO
        atualproduct++;
        if(atualproduct==clsDados.nprod()){
            atualproduct=0;
        }
        viewCad();
    }//GEN-LAST:event_cmdnActionPerformed

    private void cmdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpActionPerformed
        // BOTAO ANTERIOR
        atualproduct--;
        if(atualproduct==-1){
            atualproduct=clsDados.nprod()-1;
        }
        viewCad();
    }//GEN-LAST:event_cmdpActionPerformed

    private void cmddelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddelActionPerformed
// BOTAO DELETAR PRODUTO:
        int delete=JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESSE PRODUTO?");
        if(delete!=0){
            return;
        }
        String msg;
        msg=clsDados.delProd(atualproduct);
        JOptionPane.showMessageDialog(rootPane, msg);
        atualproduct=0;
        viewCad();
        loadTable();
    }//GEN-LAST:event_cmddelActionPerformed

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
// BOTAO BUSCAR:
        String pro= JOptionPane.showInputDialog("DIGITE O CÓDIGO DO PRODUTO QUE DESEJA BUSCAR");
        if(pro.equals("")){
            return;
        }
        int pl=clsDados.LProd(pro);
        if (pl==-1){
            JOptionPane.showMessageDialog(rootPane,"NÃO FOI POSSIVEL LOCALIZAR ESSE PRODUTO");
            return;
        }
        atualproduct=pl;
        viewCad();
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtobsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbtx;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mtable;
    private javax.swing.JTextField txtcodproduct;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtobs;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
