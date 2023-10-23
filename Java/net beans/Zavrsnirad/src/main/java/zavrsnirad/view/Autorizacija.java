/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;
import zavrsnirad.controller.ObradaOperater;
import zavrsnirad.model.Operater;
import zavrsnirad.util.Alati;

/**
 *
 * @author Ivan
 */
public class Autorizacija extends javax.swing.JFrame {

    
    private ObradaOperater obrada;
    /**
     * Creates new form Autorizacija
     */
    public Autorizacija() {
        initComponents();
        obrada = new ObradaOperater();
        setTitle(Alati.NAZIV_APP);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtlozinka = new javax.swing.JPasswordField();
        btnAutoriziraj = new javax.swing.JButton();
        lblEmailPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email:");

        txtemail.setText("oper@edunova.hr");
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        jLabel2.setText("Lozinka:");

        txtlozinka.setText("oper");
        txtlozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlozinkaKeyPressed(evt);
            }
        });

        btnAutoriziraj.setLabel("Autoriziraj");
        btnAutoriziraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtlozinka)
                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(btnAutoriziraj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmailPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtlozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
       reset();
        
        var email = txtemail.getText().trim();
        
        if(email.isEmpty()){
            lblEmailPoruka.setText("Email obavezno");
            postaviGresku(txtemail);
            return;
        }
        
        if(!EmailValidator.getInstance().isValid(email)){
             lblEmailPoruka.setText("Upisani tekst nije email");
             postaviGresku(txtemail);
             return;
        }
        
        if(txtlozinka.getPassword().length==0){
            postaviGresku(txtlozinka);
            return;
        }
        
        // tu sam spreman ići provjeravati
        Operater o = obrada.autoriziraj(email, new String(txtlozinka.getPassword()));
        
        if(o==null){
            JOptionPane.showMessageDialog(getRootPane(), 
                    "Neispravna kombinacija email i lozinka");
            return;
        }
        Operater logiran =new Operater();
        logiran.setIme(o.getIme());
        logiran.setPrezime(o.getPrezime());
        logiran.setUloga(o.getUloga());
        
        Alati.OPERATER=logiran;
        
        
       new Izbornik().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
       if(txtemail.getText().length()>0){
           txtemail.setBackground(Color.white);
       }
       
       if(evt.getExtendedKeyCode()== KeyEvent.VK_ENTER){
           btnAutorizirajActionPerformed(null);
       }
       
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtlozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlozinkaKeyPressed
         if(txtlozinka.getPassword().length>0){
           txtlozinka.setBackground(Color.white);
       }
        
        if(evt.getExtendedKeyCode()== KeyEvent.VK_ENTER){
           btnAutorizirajActionPerformed(null);
       }
       
    }//GEN-LAST:event_txtlozinkaKeyPressed

    private void postaviGresku(JComponent c){
        c.setBackground(Color.red);
        c.requestFocus();
    }
  private void reset(){
      lblEmailPoruka.setText("");
      txtemail.setBackground(Color.white);
      txtlozinka.setBackground(Color.white);
             
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEmailPoruka;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtlozinka;
    // End of variables declaration//GEN-END:variables
}