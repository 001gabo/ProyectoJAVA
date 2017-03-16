
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roberto
 */
public class crud_libros extends javax.swing.JFrame {
  
  Connection con;
  PreparedStatement pst;//query
   ResultSet rs=null;//rsultado
  
    
   
   public crud_libros() {
        initComponents();
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
   jtregistros.setModel(modelo);
   String sql="";
  if(palabra.equals("")){ 
  sql="select id_lib, lib_descrip, lib_name, lib_cantidad, lib_categoria, lib_autor, lib_edicion,lib_editorial  from libros";
  
  }
  else{ 
   sql="select id_lib, lib_descrip, lib_name, lib_cantidad, lib_categoria, lib_autor, lib_edicion,lib_editorial  from libros where id_lib  LIKE '%"+palabra+"%' or lib_name LIKE '%"+palabra+"%'";
  } 
   
   String []array = new String[8];
   con=conexion_mysql.getConnection();
   Statement s= con.createStatement();
   rs=s.executeQuery(sql);
        while(rs.next())
        { 
        array[0]=rs.getString(1);
        array[1]=rs.getString(2);
        array[2]=rs.getString(3);
        array[3]=rs.getString(4);
        array[4]=rs.getString(5);
        array[5]=rs.getString(6);
        array[6]=rs.getString(7);
        array[7]=rs.getString(8);
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
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        in_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtregistros = new javax.swing.JTable();

        jPopupMenu1.setName("Modificar"); // NOI18N

        jMenu1.setText("Modificar");
        jPopupMenu1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\roberto\\Documents\\ciclo ix\\java\\Poyecto\\ProyectoJAVA\\build\\classes\\icon\\add.png")); // NOI18N
        btn_add.setText("Agregar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, -1, -1));

        btn_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\roberto\\Documents\\ciclo ix\\java\\Poyecto\\ProyectoJAVA\\build\\classes\\icon\\clear.png")); // NOI18N
        btn_delete.setText("Eliminar");
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 21, -1, -1));

        btn_update.setText("modificar");
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 89, -1));

        btn_search.setText("search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 22, -1, -1));
        getContentPane().add(in_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 23, 198, -1));

        jtregistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtregistros.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jtregistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 631, 407));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
    
   mostrar(in_search.getText());
    }//GEN-LAST:event_btn_searchActionPerformed

    
    
   
    
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
      new form_add().setVisible(true);
      this.setVisible(false);
          
      
    }//GEN-LAST:event_btn_addActionPerformed

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
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField in_search;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtregistros;
    // End of variables declaration//GEN-END:variables
}
