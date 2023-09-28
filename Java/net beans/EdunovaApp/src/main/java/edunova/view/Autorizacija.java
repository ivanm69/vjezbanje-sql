/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import edunova.controller.ObradaOperater;
import edunova.model.Operater;
import edunova.util.Alati;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;


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
        lblemailPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Email");

        txtemail.setText("oper@edunova.hr");
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
        });

        jLabel2.setText("Lozinka");

        txtlozinka.setText("oper");
        txtlozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlozinkaKeyPressed(evt);
            }
        });

        btnAutoriziraj.setText("Autoriziraj");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblemailPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblemailPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnAutoriziraj, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAutorizirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizirajActionPerformed
        reset();
        var email = txtemail.getText().trim();
        if(email.isEmpty()){
            lblemailPoruka.setText(" tekst nije email");
            postaviGresku(txtemail);
        return;
        }
        if(!EmailValidator.getInstance().isValid(txtemail.getText().trim())){
            lblemailPoruka.setText("Email obavezno upisti");
            return;
        }
        
        
        
        if(txtlozinka.getPassword().length==0){
   
         postaviGresku(txtlozinka);
         return;
       }
        
        Operater o = obrada.autoriziraj(email, new String (txtlozinka.getPassword()));
        
        if (o==null){
            JOptionPane.showMessageDialog(getRootPane(), "Neispravna kombinacija email i lozinka");
            return;
        }
        
        Operater logiran=new Operater();
        logiran.setIme(o.getIme());
        logiran.setPrezime(o.getPrezime());
        logiran.setUloga(o.getUloga());
        
        Alati.OPERATER=logiran;
        
        
        new Izbornik().setVisible(true);
        dispose();
       
        
        
    }//GEN-LAST:event_btnAutorizirajActionPerformed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if(txtemail.getText().length()>0){
            txtemail.setBackground(Color.WHITE);
        }
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            btnAutorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_txtemailKeyPressed

    private void txtlozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlozinkaKeyPressed
        if(txtlozinka.getPassword().length>0){
            txtlozinka.setBackground(Color.WHITE);
          }
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            btnAutorizirajActionPerformed(null);
        }
    }//GEN-LAST:event_txtlozinkaKeyPressed
    
    private void postaviGresku(JComponent c){
        c.setBackground(Color.RED);
        c.requestFocus();
        
    }
    private void reset(){
        lblemailPoruka.setText("");
        txtemail.setBackground(Color.WHITE);
        txtlozinka.setBackground(Color.WHITE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoriziraj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblemailPoruka;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtlozinka;
    // End of variables declaration//GEN-END:variables
}