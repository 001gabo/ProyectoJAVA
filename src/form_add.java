
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto
 */
public class form_add extends javax.swing.JFrame {
  
    
  JComboBox combo_categoria; 
  JComboBox combo_author;
   JComboBox combo_editorial;
  Connection con;
  PreparedStatement pst;//query
  ResultSet rs=null;//rsultado
  
  
  
    public form_add() {
        initComponents();
        mostrar();
        setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        in_desc = new javax.swing.JTextField();
        in_anio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        in_cantidad = new javax.swing.JTextField();
        in_cod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        in_author = new javax.swing.JTextField();
        in_observacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        in_edicion = new javax.swing.JTextField();
        in_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        in_editorial = new javax.swing.JTextField();
        in_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_author = new javax.swing.JButton();
        btn_editorial = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        in_categoria = new javax.swing.JTextField();
        btn_categorianew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        in_desc.setName("in_descripción"); // NOI18N

        in_anio.setName("in_editorial"); // NOI18N

        jLabel3.setText("Descripción");

        jLabel9.setText("codigo");
        jLabel9.setName("in_anio"); // NOI18N

        in_cantidad.setName("in_cantidad"); // NOI18N

        in_cod.setName("in_codigo"); // NOI18N

        jLabel4.setText("cantidad");

        jLabel11.setText("Observación");
        jLabel11.setName("in_anio"); // NOI18N

        in_author.setName("in_autor"); // NOI18N

        in_observacion.setName("in_observacion"); // NOI18N

        jLabel5.setText("Autor");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        in_edicion.setName("in_edicion"); // NOI18N

        in_id.setName("in_id"); // NOI18N

        jLabel6.setText("Edición");

        jLabel1.setText("Identificador");
        jLabel1.setName("lb_id"); // NOI18N

        in_editorial.setName("in_editorial"); // NOI18N

        in_name.setName("in_namelib"); // NOI18N

        jLabel7.setText("Editorial");

        jLabel2.setText("Nombre de libro");
        jLabel2.setToolTipText("");

        jLabel8.setText("Año ");
        jLabel8.setName("in_anio"); // NOI18N

        btn_author.setText("new");
        btn_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_authorActionPerformed(evt);
            }
        });

        btn_editorial.setText("new");
        btn_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editorialActionPerformed(evt);
            }
        });

        jLabel10.setText("Categoria");
        jLabel10.setToolTipText("");

        in_categoria.setName("in_namelib"); // NOI18N
        in_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_categoriaActionPerformed(evt);
            }
        });

        btn_categorianew.setText("new");
        btn_categorianew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categorianewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(in_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(in_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(in_desc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(in_edicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(in_cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(in_author, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(in_editorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(in_anio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(in_categoria, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_author, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_categorianew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_editorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(in_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(in_name, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton1)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(in_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(in_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_categorianew)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btn_author))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(in_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editorial))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(in_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(in_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(in_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void mostrar(){    
        
//        variables a esconder
        in_categoria.setVisible(false);   
        in_author.setVisible(false);
        in_editorial.setVisible(false);

   //     JOptionPane.showMessageDialog(null,in_editorial.getLocation());   
        try{
            
            
//      combo_box Categoria     
           combo_categoria=new JComboBox();
           combo_categoria.removeAllItems(); 
           con=conexion_mysql.getConnection();
           Statement s= con.createStatement();         
           rs=s.executeQuery("select cat_categorias from categoria");
           while(rs.next())
            { 
            this.combo_categoria.addItem(rs.getString(1));
            getContentPane().add(combo_categoria); 
            }
       
          combo_categoria.setBounds(222, 139, 100, 25);
       
 //        combo_box Autor
       
           combo_author=new JComboBox();
           combo_author.removeAllItems(); 
        
           String sql="select aut_name,aut_lastname from autor";
           con=conexion_mysql.getConnection();
           s= con.createStatement();         
           rs=s.executeQuery(sql);
           while(rs.next())
            { 
            this.combo_author.addItem(rs.getString(1)+" "+rs.getString(2));
            getContentPane().add(combo_author); 
            }
           combo_author.setBounds(222, 213, 100, 25);
//       Combo_box editorial
           
           
           combo_editorial=new JComboBox();
           combo_editorial.removeAllItems(); 
           con=conexion_mysql.getConnection();
           s= con.createStatement();         
           rs=s.executeQuery("select ed_name from editoriales");
           while(rs.next())
            { 
            this.combo_editorial.addItem(rs.getString(1));
            getContentPane().add(combo_editorial); 
            }
       
          combo_editorial.setBounds(222, 293, 100, 25);
       
       con.close();
        }
        catch(Exception ex){
        
            JOptionPane.showMessageDialog(null,("error"+ex));
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_categorianewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categorianewActionPerformed
      in_categoria.setVisible(true);
      combo_categoria.setVisible(false);
      btn_categorianew.setVisible(false);
    }//GEN-LAST:event_btn_categorianewActionPerformed

    private void in_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_categoriaActionPerformed

    private void btn_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_authorActionPerformed
      in_author.setVisible(true);
      combo_author.setVisible(false);
      btn_author.setVisible(false);
    }//GEN-LAST:event_btn_authorActionPerformed

    private void btn_editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editorialActionPerformed
      in_editorial.setVisible(true);
      combo_editorial.setVisible(false);
      btn_editorial.setVisible(false);
    }//GEN-LAST:event_btn_editorialActionPerformed

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
            java.util.logging.Logger.getLogger(form_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_author;
    private javax.swing.JButton btn_categorianew;
    private javax.swing.JButton btn_editorial;
    private javax.swing.JTextField in_anio;
    private javax.swing.JTextField in_author;
    private javax.swing.JTextField in_cantidad;
    private javax.swing.JTextField in_categoria;
    private javax.swing.JTextField in_cod;
    private javax.swing.JTextField in_desc;
    private javax.swing.JTextField in_edicion;
    private javax.swing.JTextField in_editorial;
    private javax.swing.JTextField in_id;
    private javax.swing.JTextField in_name;
    private javax.swing.JTextField in_observacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
