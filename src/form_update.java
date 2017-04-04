/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author roberto
 */
public class form_update extends javax.swing.JFrame {

    /**
     * Creates new form form_update
     */
  Connection con;
  PreparedStatement pst;//query
  ResultSet rs=null;//rsultado
  Statement s;
  crud_libros open;
    
    public form_update() {
        initComponents();
        pivote.setVisible(false);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(26,35,126));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_desc = new javax.swing.JTextField();
        in_anio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        in_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        in_cantidad = new javax.swing.JTextField();
        in_edicion = new javax.swing.JTextField();
        in_cod = new javax.swing.JTextField();
        in_observacion = new javax.swing.JTextField();
        pivote = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(in_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));

        in_anio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_anioKeyTyped(evt);
            }
        });
        getContentPane().add(in_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, -1));

        jLabel3.setBackground(new java.awt.Color(26, 35, 126));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setBackground(new java.awt.Color(26, 35, 126));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel11.setBackground(new java.awt.Color(26, 35, 126));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Observación");
        jLabel11.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(26, 35, 126));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, 30));

        jLabel6.setBackground(new java.awt.Color(26, 35, 126));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edición");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        in_name.setName("in_namelib"); // NOI18N
        getContentPane().add(in_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 130, -1));

        jLabel2.setBackground(new java.awt.Color(26, 35, 126));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de libro");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setBackground(new java.awt.Color(26, 35, 126));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año ");
        jLabel8.setName("in_anio"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        in_cantidad.setName("in_cantidad"); // NOI18N
        in_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_cantidadKeyTyped(evt);
            }
        });
        getContentPane().add(in_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        in_edicion.setName("in_edicion"); // NOI18N
        getContentPane().add(in_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, -1));

        in_cod.setName("in_cod"); // NOI18N
        getContentPane().add(in_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, -1));

        in_observacion.setName("in_observacion"); // NOI18N
        getContentPane().add(in_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, 40));

        pivote.setName("pivote"); // NOI18N
        getContentPane().add(pivote, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            con=conexion_mysql.getConnection();
            
            String condicion=pivote.getText();
             if(in_cod.getText().matches("[A-Z]{2}+[/-]{1}+[0-9]{2}+[/-]{1}+[0-9]{1}")) {
            pst=con.prepareStatement("call pa_updatetable('"+(in_name.getText())+"','"+(in_desc.getText())+"','"+(Integer.parseInt(in_cantidad.getText()))+"','"+(in_edicion.getText())+"','"+(Integer.parseInt(in_anio.getText()))+"','"+(in_cod.getText())+"','"+(in_observacion.getText())+"','"+(condicion)+"')");
            pst.executeUpdate();
            con.close(); 
            open =new crud_libros();
            open.setVisible(true);
            this.setVisible(false);
             }
             else{
             JOptionPane.showMessageDialog(null, "El campo codigo esta mal, digitar de la siguiente manera ej: IM-01-1 donde IM es el tipo de estante,01 el número de estante y 1 es el nivel.");
        
             }
        }
        catch(Exception ex){

            JOptionPane.showMessageDialog(null,("error"+ex));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      crud_libros librosform =new crud_libros();
      librosform.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void in_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_cantidadKeyTyped
        char num=evt.getKeyChar();
        if(num<'0' || num>'9')   
        evt.consume();
    }//GEN-LAST:event_in_cantidadKeyTyped

    private void in_anioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_anioKeyTyped
      char num=evt.getKeyChar();
        if(num<'0' || num>'9')
        
        evt.consume();
    }//GEN-LAST:event_in_anioKeyTyped

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
            java.util.logging.Logger.getLogger(form_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField in_anio;
    public static javax.swing.JTextField in_cantidad;
    public static javax.swing.JTextField in_cod;
    public static javax.swing.JTextField in_desc;
    public static javax.swing.JTextField in_edicion;
    public static javax.swing.JTextField in_name;
    public static javax.swing.JTextField in_observacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel pivote;
    // End of variables declaration//GEN-END:variables
}
