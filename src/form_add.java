
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
  Connection con;
  PreparedStatement pst;//query
  ResultSet rs=null;//rsultado
  Statement s;
  crud_libros open;
 
  
  
  
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
        in_observacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        in_edicion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        in_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_editorial = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_estado = new javax.swing.JButton();
        combo_categoria = new javax.swing.JComboBox();
        combo_author = new javax.swing.JComboBox();
        combo_editorial = new javax.swing.JComboBox();
        combo_estados = new javax.swing.JComboBox();
        btn_author = new javax.swing.JButton();
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

        in_observacion.setName("in_observacion"); // NOI18N

        jLabel5.setText("Autor");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        in_edicion.setName("in_edicion"); // NOI18N

        jLabel6.setText("Edición");

        in_name.setName("in_namelib"); // NOI18N

        jLabel7.setText("Editorial");

        jLabel2.setText("Nombre de libro");
        jLabel2.setToolTipText("");

        jLabel8.setText("Año ");
        jLabel8.setName("in_anio"); // NOI18N

        btn_editorial.setText("new");
        btn_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editorialActionPerformed(evt);
            }
        });

        jLabel10.setText("Categoria");
        jLabel10.setToolTipText("");

        jLabel12.setText("Estado");
        jLabel12.setName("in_anio"); // NOI18N

        btn_estado.setText("new");
        btn_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadoActionPerformed(evt);
            }
        });

        combo_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_author.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_editorial.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_estados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_author.setText("new");
        btn_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_authorActionPerformed(evt);
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(in_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(in_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_author, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(in_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(in_name, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(combo_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(in_observacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(in_cod, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(in_anio, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(combo_estados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_categorianew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(in_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(in_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_categorianew))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(in_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_author)
                            .addComponent(combo_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_editorial)
                                    .addComponent(combo_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(in_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(in_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(in_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_estados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_estado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void mostrar(){    
        
        
//        variables a esconder y desabilitar
       
        
       
        combo_author.removeAllItems(); 
        combo_categoria.removeAllItems();  
        combo_editorial.removeAllItems(); 
        combo_estados.removeAllItems(); 
        
     //  JOptionPane.showMessageDialog(null,in_estado.getLocation());   
        try{
            
            
//      combo_box Categoria     
          
           con=conexion_mysql.getConnection();
           s= con.createStatement();         
           rs=s.executeQuery("select cat_categorias from categoria");
           while(rs.next())
            { 
            this.combo_categoria.addItem(rs.getString(1));
            getContentPane().add(combo_categoria); 
            }
            
 //        combo_box Autor
            
           rs=s.executeQuery("select aut_name from autor");
           while(rs.next())
            { 
            combo_author.addItem(rs.getString(1));
            getContentPane().add(combo_author); 
            
            }
           
           
//       Combo_box editorial
                  
           rs=s.executeQuery("select ed_name from editoriales");
           while(rs.next())
            { 
            this.combo_editorial.addItem(rs.getString(1));
            getContentPane().add(combo_editorial); 
            }
           
          
 //        combo_box estados
          
           rs=s.executeQuery("select es_estados from estados");
           while(rs.next())
            { 
            this.combo_estados.addItem(rs.getString(1));
            getContentPane().add(combo_estados); 
            }
           
       con.close();
        }
        catch(Exception ex){
        
            JOptionPane.showMessageDialog(null,("error"+ex));
        }
    }
    
    
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
          con=conexion_mysql.getConnection();
          s= con.createStatement();
          
          //          encontrando el id de la tabla categora 
          int id_categoria=0;
          rs=s.executeQuery("select id_categoria from categoria where cat_categorias='"+(combo_categoria.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_categoria=rs.getInt(1);
            }
          

     //          encontrando el id de la tabla autor 
//          String pivote=combo_author.getSelectedItem().toString();
//          int valor=pivote.indexOf(" "); 
//          String nombre=pivote.substring(0,valor); 
          int id_autor=0;
          
          rs=s.executeQuery("select id_autor from autor where aut_name='"+(combo_author.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_autor=rs.getInt(1);
            }
          
     //          encontrando el id de la editorial
         int id_editorial=0;
          rs=s.executeQuery("select id_editorial from editoriales where ed_name='"+(combo_editorial.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_editorial=rs.getInt(1);
            }
          
          
     //          encontrando el id del estado  
         int id_estado=0;
          rs=s.executeQuery("select id_estados from estados where es_estados='"+(combo_estados.getSelectedItem().toString())+"'");
          while(rs.next())
            { 
            id_estado=rs.getInt(1);
            } 
          
          
   // Ahora haremos el insert principal
          
        
          
       
        pst=con.prepareStatement("insert into libros(lib_descrip, lib_name, lib_cantidad, lib_categoria, lib_autor, lib_edicion,lib_editorial,lib_year,lib_codigo,lib_observacion,lib_estado) values(?,?,?,?,?,?,?,?,?,?,?)");
       
        pst.setString(1,in_desc.getText());
        pst.setString(2,in_name.getText());
        pst.setInt(3,Integer.parseInt(in_cantidad.getText()));
        pst.setInt(4,id_categoria);
        pst.setInt(5,id_autor);
        pst.setString(6,in_edicion.getText());
        pst.setInt(7,id_editorial);
        pst.setInt(8,Integer.parseInt(in_anio.getText()));
        pst.setString(9,in_cod.getText());
        pst.setString(10,in_observacion.getText());
        pst.setInt(11,id_estado);
        
        pst.executeUpdate();
        con.close();
        open =new crud_libros();
        open.setVisible(true);
        this.setVisible(false);
        
        
        
        }
        catch(Exception ex){
            
            JOptionPane.showMessageDialog(null,("error"+ex));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_categorianewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categorianewActionPerformed
    JFrame frame = new JFrame("Nueva Categoria");
    try{
    String categoria = JOptionPane.showInputDialog(frame,"Ingrese una nueva categoria");
    if(categoria==null){
    frame.dispose();
    }else{      
    con=conexion_mysql.getConnection();   
    pst=con.prepareStatement("insert into categoria(cat_categorias) values(?)");
    pst.setString(1,categoria);
    pst.executeUpdate();
    con.close();
    combo_categoria.addItem(categoria);
    getContentPane().add(combo_categoria); 
     
    }
    
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
   
    
    }//GEN-LAST:event_btn_categorianewActionPerformed

    private void btn_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_authorActionPerformed
    JFrame frame2 = new JFrame("Nuevo Autor");
    try{
    
    String name = JOptionPane.showInputDialog(frame2,"Ingrese un nombre y un apellido del autor a registrar");
    if(name==null){
    frame2.dispose();
    }else{      
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("insert into autor(aut_name) values(?)");
        pst.setString(1,name);
        pst.executeUpdate();
        con.close();
        combo_author.addItem(name);
        getContentPane().add(combo_author);  
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
   
      
    }//GEN-LAST:event_btn_authorActionPerformed

    private void btn_editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editorialActionPerformed
  JFrame frame3 = new JFrame("Nueva Editorial");
    try{
    String edit = JOptionPane.showInputDialog(frame3,"Ingrese una editorial");
    if(edit==null){
    frame3.dispose();
    }else{      
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("insert into editoriales(ed_name) values(?)");
        pst.setString(1,edit);
        pst.executeUpdate();
        con.close();
        combo_editorial.addItem(edit);
        getContentPane().add(combo_editorial); 
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
     
    
    }//GEN-LAST:event_btn_editorialActionPerformed

    private void btn_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadoActionPerformed
    
    
    JFrame frame4 = new JFrame("Nuevo estado");
    try{
    String state = JOptionPane.showInputDialog(frame4,"Ingrese un nuevo estado del libro");
    if(state==null){
    frame4.dispose();
    }else{      
        con=conexion_mysql.getConnection();   
        pst=con.prepareStatement("insert into estados(es_estados) values(?)");
        pst.setString(1,state);
        pst.executeUpdate();
        con.close();
        combo_estados.addItem(state);
        getContentPane().add(combo_estados); 
        }
    }
    catch (Exception ex){
      JOptionPane.showMessageDialog(null,("error"+ex));
    }
    }//GEN-LAST:event_btn_estadoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
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
    private javax.swing.JButton btn_estado;
    private javax.swing.JComboBox combo_author;
    private javax.swing.JComboBox combo_categoria;
    private javax.swing.JComboBox combo_editorial;
    private javax.swing.JComboBox combo_estados;
    private javax.swing.JTextField in_anio;
    private javax.swing.JTextField in_cantidad;
    private javax.swing.JTextField in_cod;
    private javax.swing.JTextField in_desc;
    private javax.swing.JTextField in_edicion;
    private javax.swing.JTextField in_name;
    private javax.swing.JTextField in_observacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
