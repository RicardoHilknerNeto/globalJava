/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Bianca
 */
public class inicio_GUI extends javax.swing.JFrame {

    inicio_GUI enviadados;
    
    /**
     * Creates new form inicio
     */
    
    public inicio_GUI() {
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

        btnbusca = new javax.swing.JButton();
        btnrios1 = new javax.swing.JButton();
        btnoceanos1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbusca.setText("Busca");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, 40));

        btnrios1.setText("Rios");
        btnrios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrios1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnrios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, 40));

        btnoceanos1.setText("Oceanos");
        btnoceanos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoceanos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnoceanos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menubg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        String opt = JOptionPane.showInputDialog(null, "Digite 1 para buscar rios\nDigite 2 para buscar oceanos");
        int number = Integer.parseInt(opt);
        if(number == 1){
            JOptionPane.showMessageDialog(null, "Amazonas\nParaná\nSão Francisco\nTocantins\nMadeira");
        }else if(number == 2){
            JOptionPane.showMessageDialog(null, "Ártico\nAtlântico\nPacífico\nÍndico\nAntártico");
        }else{
            System.out.println("opt invalida");
        }
    }//GEN-LAST:event_btnbuscaActionPerformed

    private void btnrios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrios1ActionPerformed
        Controller.Database.Rivers();
        dispose();
        new Rios_GUI().setVisible(true);
    }//GEN-LAST:event_btnrios1ActionPerformed

    private void btnoceanos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoceanos1ActionPerformed
        Controller.Database.Oceans();
        dispose();
        new Oceanos_GUI().setVisible(true);
    }//GEN-LAST:event_btnoceanos1ActionPerformed

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
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btnoceanos1;
    private javax.swing.JButton btnrios1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
