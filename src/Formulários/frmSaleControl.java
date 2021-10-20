package Formulários;
import Classes.Options;
import Classes.Dados;
import Classes.Utility;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class frmSaleControl extends javax.swing.JInternalFrame {
    private Dados clsDados;
    private DefaultTableModel UserTable;
    
    public void setDados(Dados clsDados){
        this.clsDados=clsDados;
    }
    public frmSaleControl() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdt = new javax.swing.JTextField();
        cmbclient = new javax.swing.JComboBox<>();
        cmbproduct = new javax.swing.JComboBox<>();
        txtqtde = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsale = new javax.swing.JTable();
        cmdadd = new javax.swing.JButton();
        cmdremov = new javax.swing.JButton();
        cmdcanc = new javax.swing.JButton();
        cmdaddp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtvaltot = new javax.swing.JTextField();
        txtqtdetotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Vendas");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Data:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Quantidade:");

        txtdt.setEnabled(false);
        txtdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtActionPerformed(evt);
            }
        });

        cmbclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbclientActionPerformed(evt);
            }
        });

        cmbproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbproductActionPerformed(evt);
            }
        });

        txtqtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdeActionPerformed(evt);
            }
        });

        tblsale.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsale.setEnabled(false);
        jScrollPane1.setViewportView(tblsale);

        cmdadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        cmdadd.setToolTipText("Adicionar");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdremov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove1.png"))); // NOI18N
        cmdremov.setToolTipText("Cancelar Venda");
        cmdremov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdremovActionPerformed(evt);
            }
        });

        cmdcanc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        cmdcanc.setToolTipText("Deletar Produto");
        cmdcanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancActionPerformed(evt);
            }
        });

        cmdaddp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        cmdaddp.setToolTipText("Salvar Venda");
        cmdaddp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("QTDE TOTAL:");

        txtvaltot.setEnabled(false);

        txtqtdetotal.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("VALOR TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdcanc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdremov)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdaddp)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtqtdetotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(txtvaltot, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtqtde, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbclient, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtqtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmdadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdcanc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdaddp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdremov, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtvaltot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtqtdetotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtActionPerformed

    private void txtqtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdeActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Options opc = new Options("","Selecione um Cliente");
        cmbclient.addItem(""+opc);
        for (int i = 0; i < clsDados.ncli(); i++){
            opc=new Options(clsDados.getCli()[i].getCodclient(), clsDados.getCli()[i].getName()+" "+clsDados.getCli()[i].getSname());
            cmbclient.addItem(""+opc);
        }
        
        opc = new Options("","Selecione um Produto");
        cmbproduct.addItem(""+opc);
        for (int i = 0; i < clsDados.nprod(); i++){
            opc=new Options(clsDados.getProducts()[i].getCodproduct(), clsDados.getProducts()[i].getDescproduct());
            cmbproduct.addItem(""+opc);
        }
        txtdt.setText(Utility.fDt(new Date()));
        txtqtdetotal.setText("0");
        txtvaltot.setText("0");
        loadTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbclientActionPerformed

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed
// BOTÃO ADICIONAR:
        if(cmbproduct.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"SELECIONE UM PRODUTO");
            cmbproduct.requestFocusInWindow();
            return;   
        }
        if(txtqtde.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"DIGITE UMA QUANTIDADE");
            txtqtde.requestFocusInWindow();
            return; 
        }
        if(!Utility.isNum(txtqtde.getText())){
            JOptionPane.showMessageDialog(rootPane,"DIGITE UM VALOR NUMÉRICO");
            txtqtde.setText("");
            txtqtde.requestFocusInWindow();
            return; 
        }
        int quantia = Integer.parseInt(txtqtde.getText());
        if(quantia<=0){
            JOptionPane.showMessageDialog(rootPane,"DIGITE VALORES MAIORES DO QUE ZERO");
            txtqtde.setText("");
            txtqtde.requestFocusInWindow();
            return;
        }
        int pos=cmbproduct.getSelectedIndex()-1;
        String regcad[]= new String[5];
        regcad[0]=clsDados.getProducts()[pos].getCodproduct();
        regcad[1]=clsDados.getProducts()[pos].getDescproduct();
        regcad[2]=""+clsDados.getProducts()[pos].getPrice();
        regcad[3]=""+quantia;
        regcad[4]=""+(quantia*clsDados.getProducts()[pos].getPrice());
        UserTable.addRow(regcad);
        
        cmbproduct.setSelectedIndex(0);
        txtqtde.setText("");
        cmbproduct.requestFocusInWindow();
        
        DefaultTableCellRenderer tbl= new DefaultTableCellRenderer();
        tbl.setHorizontalAlignment(SwingConstants.RIGHT);
        tblsale.getColumnModel().getColumn(2).setCellRenderer(tbl);
        tblsale.getColumnModel().getColumn(3).setCellRenderer(tbl);
        tblsale.getColumnModel().getColumn(4).setCellRenderer(tbl);
        totais();
         
    }//GEN-LAST:event_cmdaddActionPerformed
   
    private void cmbproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbproductActionPerformed

    private void cmdaddpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddpActionPerformed
// BOTAO SALVAR:
        if(cmbclient.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"SELECIONE UM CLIENTE");
            cmbclient.requestFocusInWindow();
            return;   
        }
        int tqde = new Integer(txtqtdetotal.getText());
        if (tqde==0) {
            JOptionPane.showMessageDialog(rootPane,"INFORME UMA QUANTIDADE");
            txtqtde.requestFocusInWindow();
            return;
        }
        int delete=JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE SALVAR ESTA VENDA?");
        if(delete!=0){
            return;
        }
        
        int numvd =clsDados.getNvendas()+1;
        FileWriter fw=null;
        PrintWriter pw=null;
        try{
            fw = new FileWriter("BD/sales.txt");
            pw = new PrintWriter(fw);
            String aux ="1-"+numvd+"-"+(cmbclient.getSelectedItem())+"-"+txtdt.getText();
            
            pw.println(aux);
            int num = tblsale.getRowCount();
            for (int i = 0; i < num; i++) {
                aux="2-"
                        + Utility.objToSt(tblsale.getValueAt(i, 0))+"-"
                        + Utility.objToSt(tblsale.getValueAt(i, 1))+"-"
                        + Utility.objToSt(tblsale.getValueAt(i, 2))+"-"
                        + Utility.objToSt(tblsale.getValueAt(i, 3))+"-"
                        + Utility.objToSt(tblsale.getValueAt(i, 4));
                        pw.println(aux);
        }   
        }catch(Exception e1){
            e1.printStackTrace(); 
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();            
            }
        }
        clsDados.Cg();
        JOptionPane.showMessageDialog(rootPane,"VENDA "+numvd+":"+" VENDA SALVA COM SUCESSO!");
        clsDados.setNvendas(numvd);
        cmbclient.setSelectedIndex(0);
        cleanTable();
        totais();
        cmbclient.requestFocusInWindow();
        
    }//GEN-LAST:event_cmdaddpActionPerformed

    private void cmdremovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdremovActionPerformed
// BOTÃO REMOVER:
        int delete=JOptionPane.showConfirmDialog(rootPane, "DESEJA REALMENTE REMOVER ESTA VENDA?");
        if(delete!=0){
            return;
        }
        cleanTable();
        totais();
    }//GEN-LAST:event_cmdremovActionPerformed

    private void cmdcancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancActionPerformed
// BOTÃO CANCELAR:
        if(cmbproduct.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane,"SELECIONE UM PRODUTO");
            cmbproduct.requestFocusInWindow();
            return;   
        }

        try{
            DefaultTableModel md = (DefaultTableModel)tblsale.getModel();
            int line=tblsale.getRowCount();
            for (int i = 0; line > i; i++) {
                String idtbl = Utility.objToSt(tblsale.getValueAt(i,1));
                String idcmbb = ""+cmbproduct.getSelectedItem();
                
                if(idtbl.equals(idcmbb)){
                    md.removeRow(i);
                    
                    totais();
                    return;
                }
                                               
            }
        }catch(Exception e){
            e.printStackTrace();
        } 
        totais();
    }//GEN-LAST:event_cmdcancActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbclient;
    private javax.swing.JComboBox<String> cmbproduct;
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmdaddp;
    private javax.swing.JButton cmdcanc;
    private javax.swing.JButton cmdremov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsale;
    private javax.swing.JTextField txtdt;
    private javax.swing.JTextField txtqtde;
    private javax.swing.JTextField txtqtdetotal;
    private javax.swing.JTextField txtvaltot;
    // End of variables declaration//GEN-END:variables

    private void loadTable(){
        String header[]={"Cód. Produto","Descrição","Preço", "Qtde","Valor",};
        String regcad[]= new String [5];
        UserTable= new DefaultTableModel(null, header);
        
        tblsale.setModel(UserTable);   
    }
    private void cleanTable(){
        try{
            DefaultTableModel md = (DefaultTableModel)tblsale.getModel();
            int line=tblsale.getRowCount();
            for (int i = 0; line > i; i++) {
                md.removeRow(0);                                
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    private void totais(){
        int num = tblsale.getRowCount();
        int sumqtde=0, sumvalor=0;
        
        for (int i = 0; i < num; i++) {
            sumqtde += Utility.objToInt(tblsale.getValueAt(i, 3));
            sumvalor += Utility.objToInt(tblsale.getValueAt(i, 4));
        }
        txtqtdetotal.setText(""+sumqtde);
        txtvaltot.setText(""+sumvalor);
    }
}
