package front;

import back.Barberia;
import javax.swing.JOptionPane;

public class VentanaDatos extends javax.swing.JFrame {

    VentanaBarberia VtnBar = null;
    Barberia barber = new Barberia();

    public VentanaDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlBoton = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblBarberos = new javax.swing.JLabel();
        txtBarberos = new javax.swing.JTextField();
        lblClientes = new javax.swing.JLabel();
        txtClientes = new javax.swing.JTextField();
        pnlTitulo = new javax.swing.JPanel();
        lblInstrucciones = new javax.swing.JLabel();
        lblRequerimientos = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBoton.setBackground(new java.awt.Color(0, 0, 0));

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlBoton.add(btnGuardar);

        pnlFondo.add(pnlBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        pnlDatos.setBackground(new java.awt.Color(0, 0, 0));
        pnlDatos.setLayout(new java.awt.GridLayout(2, 2, 6, 6));

        lblBarberos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblBarberos.setForeground(new java.awt.Color(255, 255, 255));
        lblBarberos.setText("¿Cuántos barberos desea tener?");
        pnlDatos.add(lblBarberos);
        pnlDatos.add(txtBarberos);

        lblClientes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setText("¿Cuántos clientes desea tener?");
        pnlDatos.add(lblClientes);
        pnlDatos.add(txtClientes);

        pnlFondo.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        pnlTitulo.setBackground(new java.awt.Color(0, 0, 0));
        pnlTitulo.setLayout(new javax.swing.BoxLayout(pnlTitulo, javax.swing.BoxLayout.Y_AXIS));

        lblInstrucciones.setBackground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setText("Favor de ingresar los datos solicitados");
        pnlTitulo.add(lblInstrucciones);

        lblRequerimientos.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        lblRequerimientos.setForeground(new java.awt.Color(255, 255, 255));
        lblRequerimientos.setText("*3 barberos y 15 clientes como maximo*");
        pnlTitulo.add(lblRequerimientos);

        pnlFondo.add(pnlTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 350, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/istockphoto-1194246093-170667a.jpg"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        camposVacios();
        if (camposVacios() == true) {
            JOptionPane.showMessageDialog(this, "Complete los campos vacios.");
        } else {
            barber.setBarberos(Integer.parseInt(txtBarberos.getText()));
            barber.setClientes(Integer.parseInt(txtClientes.getText()));
            requerimientos();
            if (requerimientos() == false) {
                JOptionPane.showMessageDialog(this, "Maxima cantidad alcanzada\nFavor de ingresarlos como se pide.");
                limpiarCasillas();
            } else {
                JOptionPane.showMessageDialog(this, "Datos almacenados.");

                if (VtnBar == null) {
                    VtnBar = new VentanaBarberia(this, barber);
                }
                this.setVisible(false);
                VtnBar.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void limpiarCasillas(){
        txtBarberos.setText("");
        txtClientes.setText("");
    }
    
    public boolean camposVacios() {
        if (txtBarberos.getText().isEmpty()) {
            return true;
        } else if (txtClientes.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean requerimientos() {
        barber.maxBarberos();
        barber.maxClientes();
        if (barber.maxBarberos() == 0 && barber.maxClientes() == 0) {
            return true;
        } else {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblBarberos;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblRequerimientos;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtBarberos;
    private javax.swing.JTextField txtClientes;
    // End of variables declaration//GEN-END:variables
}
