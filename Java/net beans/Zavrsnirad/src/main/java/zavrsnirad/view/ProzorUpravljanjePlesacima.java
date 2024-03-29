/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsnirad.view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import zavrsnirad.controller.ObradaPlesac;
import zavrsnirad.model.Plesac;
import zavrsnirad.util.Alati;


/**
 *
 * @author Ivan
 */
public class ProzorUpravljanjePlesacima extends javax.swing.JFrame {

        private ProzorTecaj prozorTecaj;
        private ObradaPlesac obradaPlesac;
    /**
     * Creates new form ProzorUpravljanjePlesacima
     */
    public ProzorUpravljanjePlesacima() {
        initComponents();
    }
 public ProzorUpravljanjePlesacima(ProzorTecaj prozorTecaj) {
        initComponents();
        this.prozorTecaj = prozorTecaj;
        obradaPlesac = new ObradaPlesac();
        setTitle(Alati.NAZIV_APP + " | Plesaci, " + prozorTecaj.getobradaTecaj().getEntitet().getNaziv());

        DefaultListModel<Plesac> m = new DefaultListModel<>();
        m.addAll(prozorTecaj.getobradaTecaj().getEntitet().getPlesaci());
        lstPlesaciNaTecaju.setModel(m);
        lstPlesaciNaTecaju.repaint();
        
        btnTraziActionPerformed(null);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlesaciNaTecaju = new javax.swing.JList<>();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPlesaciUBazi = new javax.swing.JList<>();
        chbPrikaziClanoveTecaja = new javax.swing.JCheckBox();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Plesaci na tecaju");

        lstPlesaciNaTecaju.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lstPlesaciNaTecaju);

        btnDodaj.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnDodaj.setText("<<");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnObrisi.setText(">>");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lstPlesaciUBazi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstPlesaciUBazi);

        chbPrikaziClanoveTecaja.setText("Prikaži plesace na tecaju");
        chbPrikaziClanoveTecaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPrikaziClanoveTecajaActionPerformed(evt);
            }
        });

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel2.setText("Svi plesaci");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTrazi))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbPrikaziClanoveTecaja, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrazi))
                        .addGap(5, 5, 5)
                        .addComponent(chbPrikaziClanoveTecaja)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        if (lstPlesaciUBazi.getSelectedValue() == null) {
            return;
        }

        var p = lstPlesaciUBazi.getSelectedValue();

        boolean mozeDodati = true;
        DefaultListModel<Plesac> m = (DefaultListModel<Plesac>) lstPlesaciNaTecaju.getModel();
        List<Plesac>plesaci = new ArrayList<>();
        for (int i = 0; i < m.size(); i++) {
            if (p.getSifra().equals(m.get(i).getSifra())) {
                mozeDodati = false;
                break;
            }
            plesaci.add(m.get(i));
        }

        if (!mozeDodati) {
            return;
        }

        m.addElement(p);
        plesaci.add(p);

        prozorTecaj.getobradaTecaj().getEntitet().setPlesaci(plesaci);

        try {
            prozorTecaj.getobradaTecaj().update();
        } catch (Exception e) {
        }

        prozorTecaj.popuniView();
        lstPlesaciNaTecaju.repaint();

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed

        if(lstPlesaciNaTecaju.getSelectedValue()==null){
            return;
        }

        DefaultListModel<Plesac> m = (DefaultListModel<Plesac>) lstPlesaciNaTecaju.getModel();
        m.removeElementAt(lstPlesaciNaTecaju.getSelectedIndex());

        List<Plesac> plesaci = new ArrayList<>();
        for (int i = 0; i < m.size(); i++) {
            plesaci.add(m.get(i));
        }

        prozorTecaj.getobradaTecaj().getEntitet().setPlesaci(plesaci);

        try {
            prozorTecaj.getobradaTecaj().update();
        } catch (Exception e) {
        }

        prozorTecaj.popuniView();
        lstPlesaciNaTecaju.repaint();

        btnTraziActionPerformed(null);

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void chbPrikaziClanoveTecajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPrikaziClanoveTecajaActionPerformed
        btnTraziActionPerformed(evt);
    }//GEN-LAST:event_chbPrikaziClanoveTecajaActionPerformed

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnTraziActionPerformed(null);
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        DefaultListModel<Plesac> m = new DefaultListModel<>();

        List<Plesac> plesaciIzBaze = obradaPlesac.read(txtUvjet.getText(), 1000);
        if (!chbPrikaziClanoveTecaja.isSelected()) {
            DefaultListModel<Plesac> png = (DefaultListModel<Plesac>) lstPlesaciNaTecaju.getModel();

            boolean postoji;
            for (Plesac p : plesaciIzBaze) {
                postoji = false;
                for (int i = 0; i < png.getSize(); i++) {
                    if (p.getSifra().equals(png.get(i).getSifra())) {
                        postoji = true;
                        break;
                    }
                }
                if (!postoji) {
                    m.addElement(p);
                }
            }
        } else {
            m.addAll(plesaciIzBaze);
        }
        
        lstPlesaciUBazi.setModel(m);
        lstPlesaciUBazi.repaint();
    }//GEN-LAST:event_btnTraziActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JCheckBox chbPrikaziClanoveTecaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Plesac> lstPlesaciNaTecaju;
    private javax.swing.JList<Plesac> lstPlesaciUBazi;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
