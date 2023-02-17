package front;
import back.Barberia;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class VentanaBarberia extends javax.swing.JFrame {
    VentanaDatos VtnData = null;
    Barberia barber = null;
    private Timer mTimer;
    private String cronometro1;
    private String cronometro2;
    private String cronometro3;
    private int segundosC1 ;
    private int segundosC2 ;
    private int segundosC3 ;
    Random tiempo = new Random();

    public VentanaBarberia() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public VentanaBarberia(VentanaDatos VtnData, Barberia barber) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.VtnData = VtnData;
        this.barber = barber;
        llamarCola();
        mostrarPrimero();
        mostrarFila();
        mTimer = new Timer (1000, (ActionEvent e) -> {
            iniciarCronometro();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBotones = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlTitleBackground = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlProximo = new javax.swing.JPanel();
        btnAñadirCola = new javax.swing.JButton();
        lblProximo = new javax.swing.JLabel();
        txtNumeroEspera = new javax.swing.JTextField();
        pnlBarberia = new javax.swing.JPanel();
        pnlLugar1 = new javax.swing.JPanel();
        lblBarbero1 = new javax.swing.JLabel();
        pnlLugar2 = new javax.swing.JPanel();
        lblBarbero2 = new javax.swing.JLabel();
        pnlLugar3 = new javax.swing.JPanel();
        lblBarbero3 = new javax.swing.JLabel();
        pnlCronometros = new javax.swing.JPanel();
        lblCronometro1 = new javax.swing.JLabel();
        lblCronometro2 = new javax.swing.JLabel();
        lblCronometro3 = new javax.swing.JLabel();
        lblFila = new javax.swing.JLabel();
        txtListaClientes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlBotones.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        btnAbrir.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAbrir.setText("ABRIR BARBERIA");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        pnlBotones.add(btnAbrir);

        btnCerrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCerrar.setText("CERRAR BARBERIA");
        btnCerrar.setEnabled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCerrar);

        pnlTitleBackground.setBackground(new java.awt.Color(0, 0, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Isem's BarberShop");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/598barberpole_100227.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/598barberpole_100227.png"))); // NOI18N

        javax.swing.GroupLayout pnlTitleBackgroundLayout = new javax.swing.GroupLayout(pnlTitleBackground);
        pnlTitleBackground.setLayout(pnlTitleBackgroundLayout);
        pnlTitleBackgroundLayout.setHorizontalGroup(
            pnlTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(194, 194, 194)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTitleBackgroundLayout.setVerticalGroup(
            pnlTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleBackgroundLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addGroup(pnlTitleBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        btnAñadirCola.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAñadirCola.setText("AGREGAR A COLA");
        btnAñadirCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirColaActionPerformed(evt);
            }
        });
        pnlProximo.add(btnAñadirCola);

        lblProximo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblProximo.setText("proximo en pasar :");
        pnlProximo.add(lblProximo);

        txtNumeroEspera.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtNumeroEspera.setEnabled(false);
        pnlProximo.add(txtNumeroEspera);

        pnlBarberia.setLayout(new java.awt.GridLayout(1, 3));

        pnlLugar1.setBackground(new java.awt.Color(0, 0, 0));

        lblBarbero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarbero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silla-de-barbero2.0.png"))); // NOI18N
        lblBarbero1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlLugar1Layout = new javax.swing.GroupLayout(pnlLugar1);
        pnlLugar1.setLayout(pnlLugar1Layout);
        pnlLugar1Layout.setHorizontalGroup(
            pnlLugar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarbero1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        pnlLugar1Layout.setVerticalGroup(
            pnlLugar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarbero1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pnlBarberia.add(pnlLugar1);

        pnlLugar2.setBackground(new java.awt.Color(0, 0, 0));

        lblBarbero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarbero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silla-de-barbero2.0.png"))); // NOI18N

        javax.swing.GroupLayout pnlLugar2Layout = new javax.swing.GroupLayout(pnlLugar2);
        pnlLugar2.setLayout(pnlLugar2Layout);
        pnlLugar2Layout.setHorizontalGroup(
            pnlLugar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarbero2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        pnlLugar2Layout.setVerticalGroup(
            pnlLugar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarbero2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pnlBarberia.add(pnlLugar2);

        pnlLugar3.setBackground(new java.awt.Color(0, 0, 0));

        lblBarbero3.setBackground(new java.awt.Color(0, 0, 0));
        lblBarbero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBarbero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silla-de-barbero2.0.png"))); // NOI18N

        javax.swing.GroupLayout pnlLugar3Layout = new javax.swing.GroupLayout(pnlLugar3);
        pnlLugar3.setLayout(pnlLugar3Layout);
        pnlLugar3Layout.setHorizontalGroup(
            pnlLugar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarbero3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        pnlLugar3Layout.setVerticalGroup(
            pnlLugar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBarbero3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pnlBarberia.add(pnlLugar3);

        pnlCronometros.setLayout(new java.awt.GridLayout(1, 3, 20, 0));

        lblCronometro1.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        lblCronometro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro1.setText("0s");
        pnlCronometros.add(lblCronometro1);

        lblCronometro2.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        lblCronometro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro2.setText("0s");
        lblCronometro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlCronometros.add(lblCronometro2);

        lblCronometro3.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        lblCronometro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro3.setText("0s");
        pnlCronometros.add(lblCronometro3);

        lblFila.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblFila.setForeground(new java.awt.Color(204, 0, 0));
        lblFila.setText("F I L A");

        txtListaClientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        txtListaClientes.setForeground(new java.awt.Color(102, 0, 0));
        txtListaClientes.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitleBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtListaClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(lblFila, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(pnlProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBarberia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCronometros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTitleBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtListaClientes))
                    .addComponent(pnlProximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlBarberia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCronometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirColaActionPerformed
        barber.agregarElemento();
        mostrarFila();
    }//GEN-LAST:event_btnAñadirColaActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        switch (barber.getBarberos()){
            case 1:
                segundosC1 = (tiempo.nextInt(15-5+1)+5); 
                break;
            case 2:
                segundosC1 = (tiempo.nextInt(15-5+1)+5);
                segundosC2 = (tiempo.nextInt(15-5+1)+5);
                break;
            case 3:
                segundosC1 = (tiempo.nextInt(15-5+1)+5); 
                segundosC2 = (tiempo.nextInt(15-5+1)+5); 
                segundosC3 = (tiempo.nextInt(15-5+1)+5); 
                break;
        }
        if (!barber.colaVacia() == true) {
            pasarPrimerosClientes();
        } else if (barber.colaVacia() == true) {
            JOptionPane.showMessageDialog(this, "No hay clientes esperando.");
        }
        mTimer.start();
        btnAbrir.setEnabled(false);
        btnCerrar.setEnabled(true);
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        if (lblCronometro1.getText().contains("0s") && lblCronometro2.getText().contains("0s") && lblCronometro3.getText().contains("0s")) {
            mTimer.stop();
            btnCerrar.setEnabled(false);
            btnAbrir.setEnabled(true);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed
    
    public void llamarCola() {
        barber.crearCola();
    }

    public void mostrarPrimero(){
        txtNumeroEspera.setText(String.valueOf(barber.mostrarPrimeroEnFila()));
    }
    
    public void mostrarFila(){
        txtListaClientes.setText(barber.mostrarFila());
    }
    
    public void reiniciarCronometro1(){
        segundosC1 = 0;
        lblCronometro1.setText("0s");
    }
    
    public void reiniciarCronometro2(){
        segundosC2 = 0;
        lblCronometro2.setText("0s");
    }
    
    public void reiniciarCronometro3(){
        segundosC3 = 0;
        lblCronometro3.setText("0s");
    }
    
    public void iniciarCronometro(){
        actualizarTiempo();
        actualizarLabel();
        mostrarPrimero();
        mostrarFila();
        imagenBarbero();
        
        detenerCronometro1();
        detenerCronometro2();
        detenerCronometro3();
    }
    
    public void pasarPrimerosClientes(){
        switch (barber.getBarberos()) {
            case 1:
                barber.quitarElemento();
                break;
            case 2:
                barber.quitarElemento();
                barber.quitarElemento();
                break;
            case 3:
                barber.quitarElemento();
                barber.quitarElemento();
                barber.quitarElemento();
                break;
        }
    }
    
    public void actualizarTiempo(){
        switch (barber.getBarberos()){
            case 1:
                segundosC1--;
                if (segundosC1 == -1) {
                    reiniciarCronometro1();
                    if (!barber.colaVacia() == true) {
                        segundosC1 = (tiempo.nextInt(15-5+1)+5);
                        barber.quitarElemento();
                    }
                }
                break;
            case 2:
                segundosC1--;
                segundosC2--;
                if (segundosC1 == -1) {
                    reiniciarCronometro1();
                    if (!barber.colaVacia() == true) {
                        segundosC1 = (tiempo.nextInt(15-5+1)+5);
                        barber.quitarElemento();
                    }
                }
                if (segundosC2 == -1) {
                    reiniciarCronometro2();
                    if (!barber.colaVacia() == true) {
                        segundosC2 = (tiempo.nextInt(15-5+1)+5);
                        barber.quitarElemento();
                    }
                }
                break;
            case 3:
                segundosC1--;
                segundosC2--;
                segundosC3--;
                if (segundosC1 == -1) {
                    reiniciarCronometro1();
                    if (!barber.colaVacia() == true) {
                        segundosC1 = (tiempo.nextInt(15-5+1)+5);
                        barber.quitarElemento();
                    }
                }
                if (segundosC2 == -1) {
                    reiniciarCronometro2();
                    if (!barber.colaVacia() == true) {
                        segundosC2 = (tiempo.nextInt(15-5+1)+5);
                        barber.quitarElemento();
                    }
                }
                if (segundosC3 == -1) {
                    reiniciarCronometro3();
                    if (!barber.colaVacia() == true) {
                        segundosC3 = (tiempo.nextInt(15-5+1)+5);
                        barber.quitarElemento();
                    }
                }
                break;    
        }
    }
    
    public void actualizarLabel(){
        cronometro1 = segundosC1 + "s";
        cronometro2 = segundosC2 + "s";
        cronometro3 = segundosC3 + "s";
        
        switch  (barber.cantidadDeCronometros()){
            case 1: 
                lblCronometro1.setText(cronometro1);
                break;
            case 2: 
                lblCronometro1.setText(cronometro1);
                lblCronometro2.setText(cronometro2);
                break;
            case 3: 
                lblCronometro1.setText(cronometro1);
                lblCronometro2.setText(cronometro2);
                lblCronometro3.setText(cronometro3);
                break;
        }
    }
    
    public void imagenBarbero(){
        Icon icono;
        if (!lblCronometro1.getText().contentEquals("0s")) {
            icono = new ImageIcon(getClass().getResource("/images/corte_de_pelo2.0.png"));
            lblBarbero1.setIcon(icono);
        } else if (lblCronometro1.getText().contentEquals("0s")) {
            icono = new ImageIcon(getClass().getResource("/images/silla-de-barbero2.0.png"));
            lblBarbero1.setIcon(icono);
        }
        
        if (!lblCronometro2.getText().contentEquals("0s")) {
            icono = new ImageIcon(getClass().getResource("/images/corte_de_pelo2.0.png"));
            lblBarbero2.setIcon(icono);
        } else if (lblCronometro2.getText().contentEquals("0s")) {
            icono = new ImageIcon(getClass().getResource("/images/silla-de-barbero2.0.png"));
            lblBarbero2.setIcon(icono);
        }
        
        if (!lblCronometro3.getText().contentEquals("0s")) {
            icono = new ImageIcon(getClass().getResource("/images/corte_de_pelo2.0.png"));
            lblBarbero3.setIcon(icono);
        } else if (lblCronometro3.getText().contentEquals("0s")){
            icono = new ImageIcon (getClass().getResource("/images/silla-de-barbero2.0.png"));
            lblBarbero3.setIcon(icono);
        }
    }

    public void detenerCronometro1(){
        if (barber.colaVacia() == true) {
            if (segundosC1 == -1) {
                segundosC1 = 0;
            }
        }
    }
    
    public void detenerCronometro2(){
        if (barber.colaVacia() == true) {
            if (segundosC2 == -1) {
                segundosC2 = 0;
            }
        }
    }
    
    public void detenerCronometro3(){
        if (barber.colaVacia() == true) {
            if (segundosC3 == -1) {
                segundosC3 = 0;
            }
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
            java.util.logging.Logger.getLogger(VentanaBarberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBarberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBarberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBarberia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBarberia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAñadirCola;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBarbero1;
    private javax.swing.JLabel lblBarbero2;
    private javax.swing.JLabel lblBarbero3;
    private javax.swing.JLabel lblCronometro1;
    private javax.swing.JLabel lblCronometro2;
    private javax.swing.JLabel lblCronometro3;
    private javax.swing.JLabel lblFila;
    private javax.swing.JLabel lblProximo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBarberia;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCronometros;
    private javax.swing.JPanel pnlLugar1;
    private javax.swing.JPanel pnlLugar2;
    private javax.swing.JPanel pnlLugar3;
    private javax.swing.JPanel pnlProximo;
    private javax.swing.JPanel pnlTitleBackground;
    private javax.swing.JTextField txtListaClientes;
    private javax.swing.JTextField txtNumeroEspera;
    // End of variables declaration//GEN-END:variables
}
