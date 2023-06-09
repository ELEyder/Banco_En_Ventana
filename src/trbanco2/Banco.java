/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trbanco2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Eyder
 */
public class Banco extends javax.swing.JFrame{

    int intentos = 3, contador = 0;
    Inicio ini = new Inicio();
    LinkedList<Cuenta> cuentas = new LinkedList<>();
    Operaciones ope = new Operaciones(cuentas);
    CrearCuenta crear = new CrearCuenta();
    Titulo tit = new Titulo();
    Movimientos movi = new Movimientos();
    java.util.Date fecha;

    /**
     * Creates new form Banco2
     */
    public Banco() {
        initComponents();
        tit.setSize(400, 212);
        tit.setLocation(0, 0);
        content.removeAll();
        content.add(tit, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        cuentas.add(new Cuenta("admin", "admin", "admin"));
        this.getContentPane().setBackground(Color.blue);
        this.setResizable(false);
        btnRetirar.setVisible(false);
        btnVer.setVisible(false);
        btnMovi.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        btnIni = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnMovi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perú Bank");
        setBackground(new java.awt.Color(0, 51, 255));
        setMaximumSize(new java.awt.Dimension(420, 316));
        setMinimumSize(new java.awt.Dimension(420, 316));
        setName("Perú Bank"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡Nuevo Perú Bank!");

        content.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        btnIni.setText("Login");
        btnIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear Cuenta");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnVer.setText("Ver Saldo");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnMovi.setText("Movimiento");
        btnMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(62, 62, 62)
                .addComponent(btnMovi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnIni)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetirar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnVer)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMovi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIni)
                    .addComponent(btnCrear)
                    .addComponent(btnRetirar)
                    .addComponent(btnVer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        // TODO add your handling code here:
        ope.lblMonto.setVisible(true);
        ope.lblMonto.setText("Monto a retirar: ");
        ope.txtEntrada.setVisible(true);
        ope.txtEntrada.setText("");
        btnRetirar.setVisible(false);
        btnMovi.setVisible(false);
        btnVer.setVisible(false);
        btnIni.setText("Hecho");
        btnCrear.setText("Regresar");
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        JOptionPane.showConfirmDialog(null, cuentas.get(contador).mostrarSaldo());
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoviActionPerformed
        movi.setSize(400, 212);
        movi.setLocation(0, 0);
        content.removeAll();
        content.add(movi, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        String text=cuentas.get(contador).getRegistro();
        movi.txtAreaRegistro.setText(text);
        btnIni.setVisible(false);
        btnRetirar.setVisible(false);
        btnVer.setVisible(false);
        btnMovi.setVisible(false);
        btnCrear.setText("Regresar");
    }//GEN-LAST:event_btnMoviActionPerformed

    

    private void btnIniActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnIniActionPerformed

        if ("Login".equals(btnIni.getText())) {
            ini.setSize(400, 212);
            ini.setLocation(0, 0);
            content.removeAll();
            content.add(ini, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
            // btnCrear.setText("");
            btnIni.setText("Iniciar Sesión");
        } else if ("Iniciar Sesión".equals(btnIni.getText())) {
            String dni = ini.txtDNIIni.getText();
            String contra = ini.txtContraIni.getText();

            if ("".equals(dni) || "".equals(contra)) {
                JOptionPane.showMessageDialog(null, "Cliente no Encontrado. Uno de los campos no fue rellenado.");
                ini.txtDNIIni.setText("");
                ini.txtContraIni.setText("");
            } else {
                contador = 0;
               
                for (int t = 0; t < cuentas.size(); t++) {
                    Cuenta x = cuentas.get(t);
                    // Verificando si usuario existe en la lista.
                    if (dni.equals(x.getDni())) {
                        if (contra.equals(x.getContra())) {
                            JOptionPane.showMessageDialog(null, "Bienvenido(a) " + x.getUsuario());
                            intentos = 3;
                            ope.setSize(400, 212);
                            ope.setLocation(0, 0);
                   
                            content.removeAll();
                            content.add(ope, BorderLayout.CENTER);
                            content.revalidate();
                            content.repaint();
                            btnIni.setText("Depositar");
                            btnCrear.setText("Cancelar");
                            btnRetirar.setVisible(true);
                            btnVer.setVisible(true);
                            btnMovi.setVisible(true);
                            break;
                            
                        } else {
                            intentos--;
                            JOptionPane.showMessageDialog(null,
                                    "Contraseña incorrecta. Te quedam " + intentos + " intentos");
                            ini.txtContraIni.setText("");
                        }

                    } else {
                        contador++;
                    }
                    if (intentos == 0) {
                        JOptionPane.showMessageDialog(null, "Saliendo del programa");
                        System.exit(0);
                    } else if (contador == cuentas.size()) {
                        JOptionPane.showMessageDialog(null, "No se encontró la cuenta.");
                        ini.txtContraIni.setText("");
                    }

                }
            }
        } else if ("Cancelar".equals(btnIni.getText())) {
            String dni = crear.txtDNICrear.getText();
            String usuario = crear.txtUsuCrear.getText();
            String contra = crear.txtContraCrear.getText();
            tit.setSize(400, 212);
            tit.setLocation(0, 0);
            content.removeAll();
            content.add(tit, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
            btnCrear.setText("Crear Cuenta");
            btnIni.setText("Login");
        } else if ( "Depositar".equals(btnIni.getText())) {
            ope.lblMonto.setVisible(true);
            ope.txtEntrada.setVisible(true);
            ope.txtEntrada.setText("");
            btnRetirar.setVisible(false);
            btnVer.setVisible(false);
            btnIni.setText("Confirmar");
            btnCrear.setText("Regresar");
        }else if("Confirmar".equals(btnIni.getText())){
            double saldo=Double.parseDouble(ope.txtEntrada.getText());
            cuentas.get(contador).deposito(saldo);
            JOptionPane.showConfirmDialog(rootPane,"Se depositó con éxito");
            fecha = new Date();
            cuentas.get(contador).aumentarRegistro("Deposito: S/ "+saldo+"  ("+fecha+")");
            ope.lblMonto.setVisible(false);
            ope.txtEntrada.setVisible(false);
            btnRetirar.setVisible(true);
            btnVer.setVisible(true);
            btnIni.setText("Depositar");
            btnCrear.setText("Cancelar");
            
        }else if("Hecho".equals(btnIni.getText())){
            double saldo=Double.parseDouble(ope.txtEntrada.getText());
            cuentas.get(contador).retiro(saldo);
            JOptionPane.showConfirmDialog(rootPane,"Se retiró con éxito");
            fecha = new Date();
            cuentas.get(contador).aumentarRegistro("Retiro: S/ "+saldo+"  ("+fecha+")");
            ope.lblMonto.setVisible(false);
            ope.txtEntrada.setVisible(false);
            btnRetirar.setVisible(true);
            btnVer.setVisible(true);
            btnIni.setText("Depositar");
            btnCrear.setText("Cancelar");
            btnMovi.setVisible(true);
        }
    }// GEN-LAST:event_btnIniActionPerformed
    
    

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCrearActionPerformed
        if (btnCrear.getText() == "Crear Cuenta") {
            crear.setSize(400, 212);
            crear.setLocation(0, 0);
            content.removeAll();
            content.add(crear, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
            btnCrear.setText("Aceptar");
            btnIni.setText("Cancelar");
        } else if (btnCrear.getText() == "Aceptar") {
            String dni = crear.txtDNICrear.getText();
            String usuario = crear.txtUsuCrear.getText();
            String contra = crear.txtContraCrear.getText();
            cuentas.add(new Cuenta(dni, usuario, contra));
            JOptionPane.showMessageDialog(null, "Cuenta creada Correcatmente :)");
            crear.txtDNICrear.setText("");
            crear.txtUsuCrear.setText("");
            crear.txtContraCrear.setText("");
            tit.setSize(400, 212);
            tit.setLocation(0, 0);
            content.removeAll();
            content.add(tit, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
            btnIni.setVisible(true);
            btnCrear.setText("Crear Cuenta");
            btnIni.setText("Login");
        } else if (btnCrear.getText() == "Cancelar") {

            tit.setSize(400, 212);
            tit.setLocation(0, 0);
            content.removeAll();
            content.add(tit, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
            btnIni.setVisible(true);
            btnCrear.setText("Crear Cuenta");
            btnIni.setText("Login");
            btnRetirar.setVisible(false);
            btnVer.setVisible(false);
            btnMovi.setVisible(false);
            ini.txtDNIIni.setText("");
            ini.txtContraIni.setText("");
            
        }else if(btnCrear.getText()=="Regresar"){
            crear.setSize(400, 212);
            crear.setLocation(0, 0);
            content.removeAll();
            content.add(ope, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
            btnRetirar.setVisible(true);
            btnVer.setVisible(true);
            btnIni.setVisible(true);
            btnMovi.setVisible(true);
            ope.lblMonto.setVisible(false);
            ope.txtEntrada.setVisible(false);
            btnIni.setText("Depositar");
            btnCrear.setText("Cancelar");
        }

    }// GEN-LAST:event_btnCrearActionPerformed

    /**
     * @param args the command line arguments
     */
   

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
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
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnIni;
    private javax.swing.JButton btnMovi;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnVer;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
