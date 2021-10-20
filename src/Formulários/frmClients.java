package Formulários;

import Classes.Clients;
import Classes.Dados;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class frmClients extends javax.swing.JInternalFrame {
private Dados clsDados;
private int atualclient =0;
private boolean cmdnovo=false;
private DefaultTableModel UserTable;


public void setDados(Dados clsDados){
    this.clsDados=clsDados;
}

    public frmClients() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodclient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        cmbid = new javax.swing.JComboBox<>();
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
        txtname1 = new javax.swing.JTextField();
        caldate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtende = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nascdate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        cmbcity = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/client.png"))); // NOI18N
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
        jLabel1.setText("Cód. Cliente: ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Data:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Sobrenome:");

        txtcodclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodclientActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Identifcação:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        cmbid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o ID", "CPF", "CNPJ" }));
        cmbid.setEnabled(false);
        cmbid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbidActionPerformed(evt);
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
        cmdadd.setToolTipText("Adicionar Cliente");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        cmdedit.setToolTipText("Editar Cliente");
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
        cmdsearch.setToolTipText("Buscar Cliente");
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
        cmddel.setToolTipText("Deletar Cliente");
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

        txtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Endereço: ");

        txtende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendeActionPerformed(evt);
            }
        });

        txttel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Telefone:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Email:");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setText("Data de Nasc.:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Cidade:");

        cmbcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Cidade", "Aquiraz", "Eusébio", "Fortaleza" }));
        cmbcity.setEnabled(false);
        cmbcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodclient, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caldate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtname1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdadd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmddel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdsave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nascdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtende))
                                .addContainerGap())))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmdadd, cmdcancel, cmddel, cmdedit, cmdf, cmdl, cmdn, cmdp, cmdsave, cmdsearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(txtcodclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(caldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(nascdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdp, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(cmdn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdadd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmddel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdsave, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(93, 93, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmdadd, cmdcancel, cmddel, cmdedit, cmdf, cmdl, cmdn, cmdp, cmdsave, cmdsearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbidActionPerformed

    private void txtcodclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodclientActionPerformed
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
        
        txtcodclient.setEnabled(true);
        txtname.setEnabled(true);
        txtname1.setEnabled(true);
        txttel.setEnabled(true);
        txtemail.setEnabled(true);
        txtende.setEnabled(true);
        cmbid.setEnabled(true);
        cmbcity.setEnabled(true);
        nascdate.setEnabled(true);
        caldate.setEnabled(true);
        
        txtcodclient.setText("");
        txtname.setText("");
        txtname1.setText("");
        txttel.setText("");
        txtemail.setText("");
        txtende.setText("");
        cmbid.setSelectedIndex(0);
        cmbcity.setSelectedIndex(0);
        nascdate.setDate(new Date());
        caldate.setDate(new Date());
        
        cmbid.setSelectedIndex(0);
        txtcodclient.requestFocusInWindow();
        cmdnovo=true;
        loadTable();
        
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
//VALDIDAR PRODUCTS:
        if(txtcodclient.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O CÓDIGO PARA COMPLETAR O CADASTRO");
            txtcodclient.requestFocusInWindow();
            return;
        }
        if(txttel.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O TELEFONE PARA COMPLETAR O CADASTRO");
            txttel.requestFocusInWindow();
            return;
        }
        if(txtemail.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O EMAIL PARA COMPLETAR O CADASTRO");
            txtemail.requestFocusInWindow();
            return;
        }
        if(cmbid.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UMA IDENTIFICAÇÃO");
            cmbid.requestFocusInWindow();
            return;
        }
        if(cmbcity.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE UMA CIDADE");
            cmbcity.requestFocusInWindow();
            return;
        }        
        if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O NOME PARA COMPLETAR O CADASTRO");
            txtname.requestFocusInWindow();
            return;
        }
        if(txtname1.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O SOBRENOME PARA COMPLETAR O CADASTRO");
            txtname1.requestFocusInWindow();
            return;
        }
        if(txtende.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "DIGITE O ENDEREÇO PARA COMPLETAR O CADASTRO");
            txtende.requestFocusInWindow();
            return;
        }
        if(caldate.getDate()==null){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE A DATA DE VENDA PARA COMPLETAR O CADASTRO");
            caldate.requestFocusInWindow();
            return;
        }
        if(nascdate.getDate()==null){
            JOptionPane.showMessageDialog(rootPane, "SELECIONE A DATA DE NASCIMENTO PARA COMPLETAR O CADASTRO");
            nascdate.requestFocusInWindow();
            return;
        }
                        
        if(nascdate.getDate().after(new Date())){
            JOptionPane.showMessageDialog(rootPane, "DATA DE NASCIMENTO INVÁLIDA");
            nascdate.requestFocusInWindow();
            return;
        }
                  
        int posline=clsDados.LCli(txtcodclient.getText());
        if(cmdnovo){
            if (posline != -1){
            JOptionPane.showMessageDialog(rootPane, "CADASTRO EXISTENTE");
            txtcodclient.requestFocusInWindow();
            return;
        }
        }else{
            if (posline == -1){
                JOptionPane.showMessageDialog(rootPane, "CADASTRO INEXISTENTE");
                txtcodclient.requestFocusInWindow();
                return;
            }
        }
        
        Clients mclients = new Clients(txtcodclient.getText(),cmbid.getSelectedIndex(),txtname.getText(),txtname1.getText(),txtende.getText(), txttel.getText(),cmbcity.getSelectedIndex(), caldate.getDate(),nascdate.getDate(),txtemail.getText());
        
        String msg;
        if(cmdnovo){
            msg=clsDados.cadCli(mclients);
        }else{
            msg=clsDados.edCli(mclients, posline);
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
        atualclient=0;
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
        
        txtcodclient.setEnabled(false);
        txtname.setEnabled(false);
        txtname1.setEnabled(false);
        txttel.setEnabled(false);
        txtemail.setEnabled(false);
        txtende.setEnabled(false);
        cmbid.setEnabled(false);
        cmbcity.setEnabled(false);
        nascdate.setEnabled(false);     
        
        atualclient=0;
        loadTable();
        
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
        
        
        txtcodclient.setEnabled(false);
        txtname.setEnabled(false);
        txtname1.setEnabled(false);
        txttel.setEnabled(false);
        txtemail.setEnabled(false);
        txtende.setEnabled(false);
        cmbid.setEnabled(false);
        cmbcity.setEnabled(false);
        nascdate.setEnabled(false);      
    }//GEN-LAST:event_cmdcancelActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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
        
        
        txtcodclient.setEnabled(false);
        txtname.setEnabled(true);
        txtname1.setEnabled(true);
        txttel.setEnabled(true);
        txtemail.setEnabled(true);
        txtende.setEnabled(true);
        cmbid.setEnabled(true);
        cmbcity.setEnabled(true);
        nascdate.setEnabled(true);
        caldate.setEnabled(true);
        
        
        cmdnovo=false;
        cmbid.requestFocusInWindow();
        loadTable();
    }//GEN-LAST:event_cmdeditActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        viewCad();
        loadTable();
    }//GEN-LAST:event_formInternalFrameOpened
    
    private void viewCad(){
        txtcodclient.setText(clsDados.getCli()[atualclient].getCodclient());
        txtname.setText(clsDados.getCli()[atualclient].getName());
        txtname1.setText(clsDados.getCli()[atualclient].getSname());
        txtende.setText(clsDados.getCli()[atualclient].getEndereco());
        txttel.setText(clsDados.getCli()[atualclient].getTel());
        txtemail.setText(clsDados.getCli()[atualclient].getEmail());
        caldate.setDate(clsDados.getCli()[atualclient].getSalesd());
        nascdate.setDate(clsDados.getCli()[atualclient].getNascd());
        cmbid.setSelectedIndex(clsDados.getCli()[atualclient].getIdentclient());
        cmbcity.setSelectedIndex(clsDados.getCli()[atualclient].getCity());
        
        txtcodclient.setEnabled(false);
        txtname.setEnabled(false);
        txtname1.setEnabled(false);
        txttel.setEnabled(false);
        txtemail.setEnabled(false);
        txtende.setEnabled(false);
        cmbid.setEnabled(false);
        cmbcity.setEnabled(false);
        nascdate.setEnabled(false);
        caldate.setEnabled(false);
        
        
    }
    private void loadTable(){
        String header[]={"Cód. Cliente","Identificação","Nome", "Sobrenome","Endereço","Telefone","Cidade","Data de Nascimento","Data", "Email"};
        String regcad[]= new String [10];
        UserTable= new DefaultTableModel(null, header);
        for(int i=0; i<clsDados.ncli(); i++){
            regcad[0]=clsDados.getCli()[i].getCodclient();
            regcad[1]=PfId(clsDados.getCli()[i].getIdentclient());
            regcad[2]=clsDados.getCli()[i].getName();
            regcad[3]=clsDados.getCli()[i].getSname();
            regcad[4]=clsDados.getCli()[i].getEndereco();
            regcad[5]=clsDados.getCli()[i].getTel();
            regcad[6]=PfCt(clsDados.getCli()[i].getCity());
            regcad[7]=""+clsDados.getCli()[i].getNascd();
            regcad[8]=""+clsDados.getCli()[i].getSalesd();
            regcad[9]=clsDados.getCli()[i].getEmail();
            
            
            UserTable.addRow(regcad);
            
        }
        mtable.setModel(UserTable);   
    }
    
    private String PfId(int idcli){
        switch(idcli){
            case 1: return "CPF";
            case 2: return "CNPJ";
            
            default: return "SEM ID"; 
        }
    }
    private String PfCt(int idct){
        switch(idct){
            case 1: return "Aquiraz";
            case 2: return "Eusébio";
            case 3: return "Fortaleza";
            
            default: return "SEM CIDADE"; 
        }
    }
    
    private void cmdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdfActionPerformed
// BOTAO PRIEMIRO REGISTRO
        atualclient=0;
        viewCad();
    }//GEN-LAST:event_cmdfActionPerformed

    private void cmdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlActionPerformed
// BOTÃO ÚLTIMO REGISTRO
        atualclient= clsDados.ncli()-1;
        viewCad();
    }//GEN-LAST:event_cmdlActionPerformed

    private void cmdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnActionPerformed
// BOTAO PROXIMO
        atualclient++;
        if(atualclient==clsDados.ncli()){
            atualclient=0;
        }
        viewCad();
    }//GEN-LAST:event_cmdnActionPerformed

    private void cmdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpActionPerformed
// BOTAO ANTERIOR
        atualclient--;
        if(atualclient==-1){
            atualclient=clsDados.ncli()-1;
        }
        viewCad();
    }//GEN-LAST:event_cmdpActionPerformed

    private void cmddelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddelActionPerformed
// BOTAO DELETAR:
        int delete=JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE DELETAR ESSE CLIENTE?");
        if(delete!=0){
            return;
        }
        String msg;
        msg=clsDados.delProd(atualclient);
        JOptionPane.showMessageDialog(rootPane, msg);
        atualclient=0;
        viewCad();
        loadTable();
    }//GEN-LAST:event_cmddelActionPerformed

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
// BOTAO BUSCAR:
        String cli= JOptionPane.showInputDialog("DIGITE O CÓDIGO DO CLIENTE QUE DESEJA BUSCAR");
        if(cli.equals("")){
            return;
        }
        int pl=clsDados.LCli(cli);
        if (pl==-1){
            JOptionPane.showMessageDialog(rootPane,"NÃO FOI POSSIVEL LOCALIZAR ESSE CLIENTE");
            return;
        }
        atualclient=pl;
        viewCad();
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void txtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname1ActionPerformed

    private void txtendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtendeActionPerformed

    private void txttelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void cmbcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser caldate;
    private javax.swing.JComboBox<String> cmbcity;
    private javax.swing.JComboBox<String> cmbid;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mtable;
    private com.toedter.calendar.JDateChooser nascdate;
    private javax.swing.JTextField txtcodclient;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtende;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
