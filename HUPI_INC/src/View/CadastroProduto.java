/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Banco.Conexao;
import Controller.ModeloTabela;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Home
 */
public class CadastroProduto extends javax.swing.JFrame {
            Connection con1 = Conexao.getConnection();
            PreparedStatement stmt1 = null ;
            ResultSet rs1 =null ;
         
    public CadastroProduto() {
        initComponents();
        jLabel_kg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_desc_pesq = new javax.swing.JTextField();
        jButton_buscar = new javax.swing.JButton();
        jTextField_desc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_KG = new javax.swing.JRadioButton();
        jRadioButton_unidade = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_preco = new javax.swing.JTextField();
        jButton_salvar = new javax.swing.JButton();
        jTextField_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_preencher = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_venda = new javax.swing.JTable();
        jLabel_kg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Produto");

        jTextField_desc_pesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_desc_pesqActionPerformed(evt);
            }
        });
        jTextField_desc_pesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_desc_pesqKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_desc_pesqKeyReleased(evt);
            }
        });

        jButton_buscar.setText("buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jTextField_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_descActionPerformed(evt);
            }
        });

        jLabel2.setText("descrição");

        jRadioButton_KG.setText("KG");
        jRadioButton_KG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_KGActionPerformed(evt);
            }
        });

        jRadioButton_unidade.setText("Unidade");
        jRadioButton_unidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_unidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("medida");

        jLabel4.setText("preço");

        jTextField_preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_precoActionPerformed(evt);
            }
        });

        jButton_salvar.setText("salvar");
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });

        jTextField_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codigoActionPerformed(evt);
            }
        });

        jLabel5.setText("codigo");

        jButton_preencher.setText("preencher");
        jButton_preencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_preencherActionPerformed(evt);
            }
        });

        jTable_venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_venda.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable_vendaComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_venda);

        jLabel_kg.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_kg.setText("/ kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton_KG)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_unidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel_kg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_salvar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_preencher))
                            .addComponent(jTextField_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_desc_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_buscar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_desc_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_preencher))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_KG)
                    .addComponent(jRadioButton_unidade)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar)
                    .addComponent(jLabel_kg))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_vendaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable_vendaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_vendaComponentAdded

    private void jTextField_desc_pesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_desc_pesqActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jTextField_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codigoActionPerformed

    private void jButton_preencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_preencherActionPerformed
                try {
                    pesq();
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton_preencherActionPerformed

    private void jTextField_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_descActionPerformed

    private void jRadioButton_KGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_KGActionPerformed
        if(jRadioButton_KG.isSelected()){
           jRadioButton_unidade.setSelected(false);
           jLabel_kg.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton_KGActionPerformed

    private void jRadioButton_unidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_unidadeActionPerformed
        if(jRadioButton_unidade.isSelected()){
           jRadioButton_KG.setSelected(false);
           jLabel_kg.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton_unidadeActionPerformed

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salvarActionPerformed

    private void jTextField_precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_precoActionPerformed

    public void PreencherTabela() {
        
    
        ArrayList dados = new ArrayList();
        
        String [] Colunas = new String[]{"Codigo","Descrição"};
    
       
        try {
             stmt1 = con1.prepareStatement("select * from lista WHERE descricao like '"+ jTextField_desc_pesq.getText().trim() +"%'");
               rs1 = stmt1.executeQuery();
         while(rs1.next()){
             
              String descricao, id = String.valueOf(rs1.getInt("id"));
              descricao = rs1.getString("descricao");
                  dados.add(new Object[]{id, descricao }) ;
             
         }
           } catch (SQLException ex) {
              Logger.getLogger(CadastroProduto.class.getName()).log(Level.SEVERE, null, ex);
          }
        
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
    
     
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    public void ApagaTabela(){
      String [] Colunas = new String[]{"Codigo","Descrição"};
    
       
         ArrayList dados = new ArrayList();
                 
             
         
         
        
            
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTable_venda.setModel(modelo);
        jTable_venda.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTable_venda.getColumnModel().getColumn(0).setResizable(false);
        jTable_venda.getColumnModel().getColumn(1).setPreferredWidth(265);
        jTable_venda.getColumnModel().getColumn(1).setResizable(false);
    
     
        jTable_venda.getTableHeader().setReorderingAllowed(false);
        jTable_venda.setAutoResizeMode(jTable_venda.AUTO_RESIZE_OFF);
        jTable_venda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
    }
    
    
    @SuppressWarnings("empty-statement")
    private void jTextField_desc_pesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
              
      }  
    }//GEN-LAST:event_jTextField_desc_pesqKeyPressed

    private void jTextField_desc_pesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_desc_pesqKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && jTextField_desc_pesq.getText().equals("")){
          ApagaTabela(); 
        }else{
       
            PreencherTabela();
        }
             
    }//GEN-LAST:event_jTextField_desc_pesqKeyReleased

  public void pesq() throws SQLException{
             stmt1 = con1.prepareStatement("select * from lista WHERE id = '"+ jTextField_codigo.getText().trim() +"'");
             rs1 = stmt1.executeQuery(); 
             
             if(rs1.next()){
                 jTextField_preco.setText((String.valueOf(rs1.getDouble("preco"))));
                 jTextField_desc.setText(rs1.getString("descricao"));
                 String medida = rs1.getString("medida") ;
                 
                 if(medida.equals("unidade")){
                     jRadioButton_unidade.setSelected(true);
                     jRadioButton_KG.setSelected(false);
                     jLabel_kg.setVisible(false);
                 }else{
                     jRadioButton_KG.setSelected(true);
                     jRadioButton_unidade.setSelected(false);
                     jLabel_kg.setVisible(true);
                 }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_preencher;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_kg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_KG;
    private javax.swing.JRadioButton jRadioButton_unidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_venda;
    private javax.swing.JTextField jTextField_codigo;
    private javax.swing.JTextField jTextField_desc;
    private javax.swing.JTextField jTextField_desc_pesq;
    private javax.swing.JTextField jTextField_preco;
    // End of variables declaration//GEN-END:variables
}
