/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Interface.RMIDAO;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jcalp
 */
public class SeccionBolsos extends javax.swing.JFrame {

    /**
     * Creates new form SeccionBolsos
     */
    //variable de tipo static
    private static SeccionBolsos instancia;
    
    //constructor privado
    private SeccionBolsos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int x=0;
    int y=0;
    //metodo que incicia el singleton
    public static SeccionBolsos getInstancia(){
        if (instancia == null)
            instancia = new SeccionBolsos();
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        jLabel2.setBackground(new java.awt.Color(249, 240, 227));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/bolsoNegro.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(jLabel2);

        jPanel7.setBackground(new java.awt.Color(249, 240, 227));
        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 37, 34));
        jLabel7.setText("Bolso elegante mujer");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel7.add(jLabel7);

        jComboBox3.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox3.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Azul", "Rojo", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox3);

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(41, 37, 34));
        jLabel11.setText("Precio: 389.000$");
        jPanel7.add(jLabel11);

        jButton1.setBackground(new java.awt.Color(41, 37, 34));
        jButton1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Comprar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton1.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        jPanel3.add(jPanel7);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1));

        jLabel6.setBackground(new java.awt.Color(249, 240, 227));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/bolsoVerde.png"))); // NOI18N
        jPanel4.add(jLabel6);

        jPanel8.setBackground(new java.awt.Color(249, 240, 227));
        jPanel8.setLayout(new java.awt.GridLayout(0, 1));

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(41, 37, 34));
        jLabel12.setText("Bolso brillante mujer");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel12.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel8.add(jLabel12);

        jComboBox4.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox4.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verde", "Cafe", "Blanco", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox4);

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(41, 37, 34));
        jLabel14.setText("Precio: 256.000$");
        jPanel8.add(jLabel14);

        jButton2.setBackground(new java.awt.Color(41, 37, 34));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Comprar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton2.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        jPanel4.add(jPanel8);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        jLabel9.setBackground(new java.awt.Color(249, 240, 227));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/bolsocafe.png"))); // NOI18N
        jPanel5.add(jLabel9);

        jPanel9.setBackground(new java.awt.Color(249, 240, 227));
        jPanel9.setLayout(new java.awt.GridLayout(0, 1));

        jLabel24.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(41, 37, 34));
        jLabel24.setText("Bolso casual Hombre");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel24.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel9.add(jLabel24);

        jComboBox5.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox5.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuegro grueso", "Cuero fino", "Cuero estandar" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel9.add(jComboBox5);

        jLabel26.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(41, 37, 34));
        jLabel26.setText("Precio: 142.000$");
        jPanel9.add(jLabel26);

        jButton6.setBackground(new java.awt.Color(41, 37, 34));
        jButton6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Comprar");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton6.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6);

        jPanel5.add(jPanel9);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        jLabel10.setBackground(new java.awt.Color(249, 240, 227));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/bolsohombre.png"))); // NOI18N
        jPanel6.add(jLabel10);

        jPanel10.setBackground(new java.awt.Color(249, 240, 227));
        jPanel10.setLayout(new java.awt.GridLayout(0, 1));

        jLabel27.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(41, 37, 34));
        jLabel27.setText("Bolso formal hombre");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel27.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel10.add(jLabel27);

        jComboBox6.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox6.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Cafe", "Gris" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox6);

        jComboBox7.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox7.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuegro grueso", "Cuero fino", "Cuero estandar" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox7);

        jLabel29.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(41, 37, 34));
        jLabel29.setText("Precio: 315.000$");
        jPanel10.add(jLabel29);

        jButton7.setBackground(new java.awt.Color(41, 37, 34));
        jButton7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Comprar");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton7.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7);

        jPanel6.add(jPanel10);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar2.setBackground(new java.awt.Color(163, 144, 129));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar2.setOpaque(true);

        jMenu5.setText("Principal");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Pag Principal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Mujer");

        jMenuItem5.setText("Ropa");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("Hombre");

        jMenuItem6.setText("Ropa");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Bolsos");

        jMenuItem7.setText("Ropa");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem7);

        jMenuBar2.add(jMenu8);

        jMenu10.setText("Carrito");
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Ver Carrito");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenuItem10.setText("Vaciar Carrito");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenuItem11.setText("Ver Carrito I");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem11);

        jMenuBar2.add(jMenu10);

        jMenu1.setText("Usuario");

        jMenuItem2.setText("Ver usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Actualizar Información");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            x=9; 
            y=8;
            
            String talla = "";
            String color = String.valueOf(this.jComboBox3.getSelectedItem());
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.Compras(x,y,talla,color); 
            JOptionPane.showMessageDialog(null,metodo);
            
        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            x=10; 
            y=9;
            
            String talla = "";
            String color = String.valueOf(this.jComboBox4.getSelectedItem());
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.Compras(x,y,talla,color); 
            JOptionPane.showMessageDialog(null,metodo);
            
            JOptionPane.showMessageDialog(null,metodo);
            
        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            x=11; 
            y=10;
            
            String talla = "";
            String color = String.valueOf(this.jComboBox5.getSelectedItem());
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.Compras(x,y,talla,color); 
            JOptionPane.showMessageDialog(null,metodo);
            
        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            x=12; 
            y=11;
            
            String talla = String.valueOf(this.jComboBox7.getSelectedItem());
            String color = String.valueOf(this.jComboBox6.getSelectedItem());
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.Compras(x,y,talla,color); 
            JOptionPane.showMessageDialog(null,metodo);
            
        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        //MenuPrincipal
        PaginaPrincipal a=PaginaPrincipal.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        //Menu mujeres
        SeccionMujeres a=SeccionMujeres.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        //Menu Hombres
        SeccionHombres a=SeccionHombres.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        //Menu bolsos
        SeccionBolsos a=SeccionBolsos.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.VerCarrito();
            String a="Carrito";
            JOptionPane.showMessageDialog(null,metodo,a,1);

        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.VaciarCarrito();

            JOptionPane.showMessageDialog(null,metodo);

        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Carrito a= Carrito.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Usuario a= Usuario.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ActualizarInfo a= ActualizarInfo.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
  /**  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /**   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeccionBolsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeccionBolsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeccionBolsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeccionBolsos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
   /**     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeccionBolsos().setVisible(true);
            }
        });
    }
    **/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
