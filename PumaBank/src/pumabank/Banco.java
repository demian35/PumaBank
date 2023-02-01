/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pumabank;

/**
 *
 * @author josed
 */
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Banco extends javax.swing.JFrame {

    //Creamos la tablita en donde guardaremos los datos del movimiento realizado
    DefaultTableModel modeloMov= new DefaultTableModel();
    /**
     * Para regristrar clientes los guardaremos en un ArrayList
     * para que cuando se quiera registrar una nueva cuenta se pueda acceder
     * a los clientrs registrados
     */
    ArrayList<Cliente> clientesRegistrados= new ArrayList<Cliente>();
    ArrayList<String> tiposDeCuentas=new ArrayList<String>();
    
    /**
     * Creates new form Banco
     */
    public Banco() {
        initComponents();
        this.setTitle("Banco Puma"); //titulo del programa nombre del programa
        Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pngpumas.png")); //imagen que usaremos
        //ajustaremos el logo para que se vea bien
        lblpuma.setIcon(new ImageIcon(img.getScaledInstance(lblpuma.getWidth(), lblpuma.getHeight(), Image.SCALE_SMOOTH)));
        //ponemos el icono en la miniatura de la ventana
        this.setIconImage(img);
        //codigo para que el programa salga en la mitad de la pantalla
        this.setLocationRelativeTo(null);
        //le damos nombre a cada columna de la tabla
        modeloMov.addColumn("Cuenta");
        modeloMov.addColumn("Fecha");
        modeloMov.addColumn("Tipo de Movimiento");
        modeloMov.addColumn("Monto");
        //asignamos la tabla a la que acabamos de crear
        tblmovimientos.setModel(modeloMov);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpuma = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnameclient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtphoneclient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtadressclient = new javax.swing.JTextField();
        btnsubmitclient = new javax.swing.JButton();
        borraCampos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbocuentaClient = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbotipoCuenta = new javax.swing.JComboBox<>();
        btnagregarTipoCuenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtmontoInicial = new javax.swing.JTextField();
        btnsubmitCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cboconsultaClient = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboconsultatipoCuenta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtmontoMovimiento = new javax.swing.JTextField();
        btnsubmitMovimiento = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblnombreclient = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbltelefonoclient = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbldireccionclient = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbltipocuenta = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblmontoInicial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmovimientos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngpumas.png"))); // NOI18N
        getContentPane().add(lblpuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 180, 170));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("BancoPuma");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, -1));

        txtnameclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameclientActionPerformed(evt);
            }
        });
        jPanel1.add(txtnameclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));
        jPanel1.add(txtphoneclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 70, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, -1));
        jPanel1.add(txtadressclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, 60));

        btnsubmitclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmitclient.setText("Agregar Cliente");
        btnsubmitclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitclientActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmitclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        borraCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        borraCampos.setText("Borrar Campos");
        borraCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraCamposActionPerformed(evt);
            }
        });
        jPanel1.add(borraCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 240, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Cuenta"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cliente");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel2.add(cbocuentaClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 130, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tipo Cuenta");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cbotipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipoCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(cbotipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, 50));

        btnagregarTipoCuenta.setText("+");
        btnagregarTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarTipoCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnagregarTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 30, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Monto Inicial");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel2.add(txtmontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, -1));

        btnsubmitCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmitCuenta.setText("Crear Cuenta");
        btnsubmitCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmitCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 260, 270));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 800, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cliente");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel4.add(cboconsultaClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tipo de Cuenta");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        cboconsultatipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboconsultatipoCuentaActionPerformed(evt);
            }
        });
        jPanel4.add(cboconsultatipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 100, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Operacion");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 20));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposito", "Retiro" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 110, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Monto");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        txtmontoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoMovimientoActionPerformed(evt);
            }
        });
        jPanel4.add(txtmontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 150, -1));

        btnsubmitMovimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubmitMovimiento.setText("Realizar Operacion");
        btnsubmitMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitMovimientoActionPerformed(evt);
            }
        });
        jPanel4.add(btnsubmitMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 160, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 770, 90));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Cuenta"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Nombre");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblnombreclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(lblnombreclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 160, 40));

        jLabel14.setText("Telefono");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbltelefonoclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(lbltelefonoclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 160, 20));

        jLabel16.setText("Direccion");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lbldireccionclient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(lbldireccionclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 50));

        jLabel18.setText("Tipo de Cuenta");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbltipocuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(lbltipocuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, 30));

        jLabel20.setText("Monto Inicial");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblmontoInicial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel5.add(lblmontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 260, 260));

        tblmovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblmovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 510, 200));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Saldo: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 60, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("$10,000,000.00 MXN");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameclientActionPerformed

    private void btnsubmitclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitclientActionPerformed
        // TODO add your handling code here:
        //para registrar nada mas intanciamos al cliente
        //Y recibimos la entrada que el cliente ponga en los campos de registro
        Cliente c = new Cliente();
        c.setNombre(txtnameclient.getText());
        c.setTelefono(txtphoneclient.getText());
        c.setDireccion(txtadressclient.getText());
        //agregamos al cliente a la lista
        clientesRegistrados.add(c);
        borraFormularioCliente();
        llenacomboClientes();
    }//GEN-LAST:event_btnsubmitclientActionPerformed
    
    //reestablecemos los campos 
    public void borraFormularioCliente(){
        txtnameclient.setText("");
        txtphoneclient.setText("");
        txtadressclient.setText("");
    }
    
    public void llenacomboClientes(){
        //creamos arreglo en donde guardaremos los clientes que contendra el combo
        Object clientes[]= new Object[clientesRegistrados.size()];
        int i=0;
        //recorremos el arreglo
        for(Cliente c : clientesRegistrados){
            clientes[i]=c.getNombre();
            i++;
        }
        cbocuentaClient.setModel(new DefaultComboBoxModel(clientes));
        cboconsultaClient.setModel(new DefaultComboBoxModel(clientes));
        
    }
    
    
    private void btnagregarTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarTipoCuentaActionPerformed
        // TODO add your handling code here:
        String tipodeCuenta=JOptionPane.showInputDialog(this,"TIPO DE CUENTA");
        tiposDeCuentas.add(tipodeCuenta);
        llenacomboCuenta();
    }//GEN-LAST:event_btnagregarTipoCuentaActionPerformed

    public void llenacomboCuenta(){
        //creamos un arreglo en donde almacenaremos los tipos de cuentas que el cliente tiene disponibles
        Object tipoCuentas[]= new Object[tiposDeCuentas.size()];
        int i=0;
        //recorremos el arreglo
        for(String tipo: tiposDeCuentas){
            tipoCuentas[i]=tipo;
            i++;
        }
        cbotipoCuenta.setModel(new DefaultComboBoxModel(tipoCuentas));
        cboconsultatipoCuenta.setModel(new DefaultComboBoxModel(tipoCuentas));
    }
    
    private void btnsubmitCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitCuentaActionPerformed

    private void cboconsultatipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboconsultatipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboconsultatipoCuentaActionPerformed

    private void txtmontoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoMovimientoActionPerformed

    private void btnsubmitMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitMovimientoActionPerformed

    private void borraCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraCamposActionPerformed
        // TODO add your handling code here:
        borraFormularioCliente();
    }//GEN-LAST:event_borraCamposActionPerformed

    private void cbotipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipoCuentaActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borraCampos;
    private javax.swing.JButton btnagregarTipoCuenta;
    private javax.swing.JButton btnsubmitCuenta;
    private javax.swing.JButton btnsubmitMovimiento;
    private javax.swing.JButton btnsubmitclient;
    private javax.swing.JComboBox<String> cboconsultaClient;
    private javax.swing.JComboBox<String> cboconsultatipoCuenta;
    private javax.swing.JComboBox<String> cbocuentaClient;
    private javax.swing.JComboBox<String> cbotipoCuenta;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldireccionclient;
    private javax.swing.JLabel lblmontoInicial;
    private javax.swing.JLabel lblnombreclient;
    private javax.swing.JLabel lblpuma;
    private javax.swing.JLabel lbltelefonoclient;
    private javax.swing.JLabel lbltipocuenta;
    private javax.swing.JTable tblmovimientos;
    private javax.swing.JTextField txtadressclient;
    private javax.swing.JTextField txtmontoInicial;
    private javax.swing.JTextField txtmontoMovimiento;
    private javax.swing.JTextField txtnameclient;
    private javax.swing.JTextField txtphoneclient;
    // End of variables declaration//GEN-END:variables
}
