import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*; //import para que funcione sql
import java.util.logging.Level;
import java.util.logging.Logger;
public class Login extends javax.swing.JFrame {
 
    public Login() {   
        initComponents();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        PWpass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesion");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel2.setText("  Usuario");

        jLabel3.setText("Contraseña");

        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        PWpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PWpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWpassActionPerformed(evt);
            }
        });

        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3))
                            .addComponent(PWpass)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnIniciar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(PWpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(275, 226));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if(txtUser.getText().equals("") || String.valueOf(PWpass.getPassword()).equals("")){
            JOptionPane.showMessageDialog(this,"Existen campos vacios");
        }else{
            //Metodo para la conexion a la bdd
            Connection con;
            PreparedStatement ps;
            ResultSet rs; 

            String usuario,pass;
            usuario = txtUser.getText();
            pass=String.valueOf(PWpass.getPassword());

            try{  
                con=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
                ps = con.prepareStatement("SELECT `id_user` `us_pass` FROM `usuario` WHERE  `id_user`=? AND`us_pass`= ?;");
                ps.setString(1,usuario);
                ps.setString(2,pass);
                rs= ps.executeQuery();
                if(rs.next()){
                     JOptionPane.showMessageDialog(this,"Bienvenido");  
                     //con esto se va de una pantalla a otra
                     this.setVisible(false);
                     new Principal().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrecto.");
                }
                con.close();
            }catch(SQLException ex){ 
                JOptionPane.showMessageDialog(this,"Ocurrio un error: "+ex); 
            } 
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void PWpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWpassActionPerformed
       
    }//GEN-LAST:event_PWpassActionPerformed
    
    
    public static void main(String args[]) { 
        Login login = new Login();
        login.setTitle("Inicio de sesion");  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PWpass;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
