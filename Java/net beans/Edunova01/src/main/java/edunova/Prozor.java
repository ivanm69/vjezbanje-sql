/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class Prozor extends javax.swing.JFrame {

    /**
     * Creates new form Prozor
     */
    public Prozor() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHello = new javax.swing.JButton();
        txtIme = new javax.swing.JTextField();
        btnIme = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));

        btnHello.setBackground(java.awt.Color.lightGray);
        btnHello.setForeground(new java.awt.Color(255, 255, 255));
        btnHello.setText("Reci hello");
        btnHello.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnHello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelloActionPerformed(evt);
            }
        });

        btnIme.setText("jButton1");
        btnIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImeActionPerformed(evt);
            }
        });

        lblPoruka.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIme)
                    .addComponent(btnHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(btnIme)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnHello, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIme))
                .addGap(92, 92, 92)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelloActionPerformed
    
JOptionPane.showMessageDialog(rootPane, "evo me Pooooooozzz");
// TODO add your handling code here:
    }//GEN-LAST:event_btnHelloActionPerformed

    private void btnImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImeActionPerformed
 //       System.out.println("Dobar dan "+txtIme.getText());
   //     JOptionPane.showMessageDialog(rootPane, "Dobar dan "+txtIme.getText());
        // TODO add your handling code here:
        lblPoruka.setText("Pozdrav"+txtIme.getText());
    }//GEN-LAST:event_btnImeActionPerformed

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHello;
    private javax.swing.JButton btnIme;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JTextField txtIme;
    // End of variables declaration//GEN-END:variables
}
