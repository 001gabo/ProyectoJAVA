
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roberto
 */
public class crud_libros extends javax.swing.JFrame {
  
  Connection con;
  PreparedStatement pst;//query
   ResultSet rs=null;//rsultado
  form_update actualizar =new form_update();
    
   
   public crud_libros() {
        initComponents();
        this.getContentPane().setBackground(new Color(26,35,126));
        
        mostrar("");
        setLocationRelativeTo(null);
        
    }

   private void mostrar(String palabra){
   try{     
   
//   ImageIcon icono=new ImageIcon(getClass().getResource("icon/add.png"));
//   btn_add.setIcon(icono);
   DefaultTableModel modelo= new DefaultTableModel();   
   modelo.addColumn("id");
   modelo.addColumn("nombre");
   modelo.addColumn("Descripción");
   modelo.addColumn("Cantidad"); 
   modelo.addColumn("Categoria");
   modelo.addColumn("Autor");
   modelo.addColumn("Edición");
   modelo.addColumn("Editorial");
   modelo.addColumn("año");
   modelo.addColumn("Observacion");
   modelo.addColumn("Codigo");
   jtregistros.setModel(modelo);
   this.jtregistros.setBackground(new Color(26,35,126));
   DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
   
   String sql="";
  if(palabra.equals("")){ 
  sql="call pa_crudprincipal";
  }
  else{ 
   sql="call pa_crudprincipalconwhere('"+palabra+"')";
  } 
   
   String []array = new String[11];
   con=conexion_mysql.getConnection();
   Statement s= con.createStatement();
   rs=s.executeQuery(sql);
        while(rs.next())
        { 
        
        array[0]=rs.getString(1);
        array[1]=rs.getString(3);
        array[2]=rs.getString(2);
        array[3]=rs.getString(4);
        array[4]=rs.getString(5);
        array[5]=rs.getString(6);
        array[6]=rs.getString(7);
        array[7]=rs.getString(8);
        array[8]=rs.getString(9);
        array[9]=rs.getString(10);
        array[10]=rs.getString(11);
        modelo.addRow(array);
        }
        jtregistros.setModel(modelo);
        con.close(); 
    }                                          

    catch(Exception ex){
     System.out.println("error"+ex);
    }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        btn_add = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        in_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtregistros = new javax.swing.JTable();

        jPopupMenu1.setName("Modificar"); // NOI18N

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem1.setText("Borrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(26, 35, 126));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setText("Agregar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        btn_search.setText("search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 22, -1, -1));
        getContentPane().add(in_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 23, 198, -1));

        jtregistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtregistros.setComponentPopupMenu(jPopupMenu1);
        jtregistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jtregistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 708, 407));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
    
   mostrar(in_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
      new form_add().setVisible(true);
      this.setVisible(false);
          
      
    }//GEN-LAST:event_btn_addActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       int filas=0;
       filas= this.jtregistros.getSelectedRow();
       if(filas>=0){
        actualizar.setVisible(true);
        this.setVisible(false);
        form_update.pivote.setText(jtregistros.getValueAt(filas,0).toString());
        form_update.in_cod.setText(jtregistros.getValueAt(filas,10).toString());
        form_update.in_name.setText(jtregistros.getValueAt(filas,1).toString());
        form_update.in_desc.setText(jtregistros.getValueAt(filas,2).toString());
        form_update.in_edicion.setText(jtregistros.getValueAt(filas,6).toString());
        form_update.in_cantidad.setText(jtregistros.getValueAt(filas,3).toString());
        form_update.in_anio.setText(jtregistros.getValueAt(filas,8).toString());
        form_update.in_observacion.setText(jtregistros.getValueAt(filas,9).toString());
       }
       else{
        JOptionPane.showMessageDialog(null,"Seleccionar registro a modificar");
       }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      int filas= jtregistros.getSelectedRow();
      try{
      if(filas>=0){
        
        String condicion=jtregistros.getValueAt(filas,0).toString();
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("call pa_cruddelete('"+condicion+"')");
        pst.executeUpdate();
        con.close();
        DefaultTableModel dtm = (DefaultTableModel) jtregistros.getModel(); //TableProducto es el nombre de mi tabla ;) 
        dtm.removeRow(jtregistros.getSelectedRow()); 
       }
       else{
        JOptionPane.showMessageDialog(null,"Seleccionar registro a modificar");
       }
      }
      catch(Exception ex){
       JOptionPane.showMessageDialog(null,"Error en: "+ex);
      }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(crud_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud_libros().setVisible(true);
                
            }
        });
    }

    
    
      
 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_search;
    private javax.swing.JTextField in_search;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtregistros;
    // End of variables declaration//GEN-END:variables
}
