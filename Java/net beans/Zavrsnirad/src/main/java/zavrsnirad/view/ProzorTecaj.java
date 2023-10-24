/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import javax.swing.DefaultComboBoxModel;
import zavrsnirad.controller.ObradaTecaj;
import zavrsnirad.util.Alati;
import zavrsnirad.model.Tecaj;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import zavrsnirad.controller.ObradaInstruktor;
import zavrsnirad.controller.ObradaStil;
import zavrsnirad.model.Instruktor;
import zavrsnirad.model.Plesac;
import zavrsnirad.model.Stil;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ProzorTecaj extends javax.swing.JFrame implements TecajPlesaViewSucelje {

    private ObradaTecaj obrada;
    

    /**
     * Creates new form Tecaj
     */
    public ProzorTecaj() {
        initComponents();
        setTitle(Alati.NAZIV_APP + "| Tecaj");

        obrada = new ObradaTecaj();
        ucitajStilove();
        ucitajInstruktore();
        ucitaj();
    }

    public ObradaTecaj getobradaTecaj() {
        return obrada;
    }
    private void ucitajStilove(){
        DefaultComboBoxModel<Stil> m = new DefaultComboBoxModel<>();
        
        Stil s = new Stil();
        s.setSifra(0);
        s.setNaziv("Odaberi stil");
        
        m.addAll(new ObradaStil().read());
        
        cmbStilovi.setModel(m);
        cmbStilovi.repaint();
    }
private void ucitajInstruktore(){
    DefaultComboBoxModel<Instruktor>m = new DefaultComboBoxModel<>();
    
    Instruktor n= new Instruktor();
    n.setSifra(0);
    n.setIme("Odaberite");
    n.setPrezime("instruktor");
    m.addElement(n);
    m.addAll(new ObradaInstruktor().read());
    
    cmbInstruktori.setModel(m);
    cmbInstruktori.repaint();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbStilovi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbInstruktori = new javax.swing.JComboBox<>();
        btnDodaj1 = new javax.swing.JButton();
        btnPromjena1 = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnUpravljajPolaznicima = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPlesac = new javax.swing.JList<>();
        lblPlesaciNaTecaju = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Naziv");

        jLabel3.setText("Stil");

        jLabel4.setText("Insturktor");

        btnDodaj1.setText("Dodaj");
        btnDodaj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodaj1ActionPerformed(evt);
            }
        });

        btnPromjena1.setText("Promjeni");
        btnPromjena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjena1ActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnUpravljajPolaznicima.setText("Upravljaj polaznicima");
        btnUpravljajPolaznicima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpravljajPolaznicimaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstPlesac);

        lblPlesaciNaTecaju.setText("Polaznici na grupi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj1)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromjena1)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisi))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStilovi, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbInstruktori, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnUpravljajPolaznicima, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPlesaciNaTecaju, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlesaciNaTecaju)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnUpravljajPolaznicima))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStilovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbInstruktori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj1)
                            .addComponent(btnPromjena1)
                            .addComponent(btnObrisi))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged

        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        popuniView();
        
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodaj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodaj1ActionPerformed

        obrada.setEntitet(new Tecaj());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());

        }
        obrada.refresh();
    }//GEN-LAST:event_btnDodaj1ActionPerformed

    private void btnPromjena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjena1ActionPerformed
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        var e = lstPodaci.getSelectedValue();

        obrada.setEntitet(e);
        popuniModel();

        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
//            
            obrada.refresh();
        }

    }//GEN-LAST:event_btnPromjena1ActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        var e = lstPodaci.getSelectedValue();

        if (JOptionPane.showConfirmDialog(getRootPane(), e, "Sigurno obrisati?",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
            return;
        }

        obrada.setEntitet(e);

        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
        obrada.refresh();
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnUpravljajPolaznicimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpravljajPolaznicimaActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        new ProzorUpravljanjePlesacima(this).setVisible(true);
    }//GEN-LAST:event_btnUpravljajPolaznicimaActionPerformed

    @Override
    public void ucitaj() {
        DefaultListModel<Tecaj> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
        
    }

    @Override
    public void popuniModel() {
        var e = obrada.getEntitet();
        e.setNaziv(txtNaziv.getText());
        e.setStil((Stil)cmbStilovi.getSelectedItem());
        e.setInstruktor((Instruktor)cmbInstruktori.getSelectedItem());
    }

    @Override
    public void popuniView() {
        var e = obrada.getEntitet();
        txtNaziv.setText(e.getNaziv());
        cmbStilovi.setSelectedItem(e.getStil());
        if(e.getInstruktor()==null){
            cmbInstruktori.setSelectedIndex(0);
        }else{
            cmbInstruktori.setSelectedItem(e.getInstruktor());
        }     
    

        
        DefaultListModel<Plesac> m = new DefaultListModel<>();
        m.addAll(e.getPlesaci());
        lstPlesac.setModel(m);
        lstPlesac.repaint();
        
        lblPlesaciNaTecaju.setText("Plesaci na tecaju (" + e.getPlesaci().size() + ")");
       
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj1;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena1;
    private javax.swing.JButton btnUpravljajPolaznicima;
    private javax.swing.JComboBox<Instruktor> cmbInstruktori;
    private javax.swing.JComboBox<Stil> cmbStilovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPlesaciNaTecaju;
    private javax.swing.JList<Plesac> lstPlesac;
    private javax.swing.JList<Tecaj> lstPodaci;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
