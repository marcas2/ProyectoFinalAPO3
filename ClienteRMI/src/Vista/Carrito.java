/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Interface.RMIDAO;
import Vista.ActualizarInfo;
import Vista.PaginaPrincipal;
import Vista.SeccionBolsos;
import Vista.SeccionHombres;
import Vista.SeccionMujeres;
import Vista.Usuario;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maria
 */
public class Carrito extends javax.swing.JFrame {

  
    public static DefaultTableModel carro = new DefaultTableModel();


    /**
     * Creates new form Carrito
     */
   String metodo=null;
    
    private Carrito() {
        initComponents();
        this.setLocationRelativeTo(null);
        carro.addColumn("id");
        carro.addColumn("Nombre");
        carro.addColumn("precio");

        this.tabla.setModel(carro);
    }
    private static Carrito instancia;
    
    //metodo que incicia el singleton
    public static Carrito getInstancia(){
        if (instancia == null)
            instancia = new Carrito();
        return instancia;
    }
    
    String carrito (){
    try {
        // TODO add your handling code here:==
        Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
        RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
        String metodo=interfaz.VerCarrito();
        return metodo; 
    } catch (RemoteException ex) {
        Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NotBoundException ex) {
        Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null; 
}

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        panel3 = new java.awt.Panel();
        jButton1 = new javax.swing.JButton();
        panel4 = new java.awt.Panel();
        panel7 = new java.awt.Panel();
        panel8 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Vaciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel6 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        panel9 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
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
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 240, 227));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panel3.setBackground(new java.awt.Color(249, 240, 227));
        panel3.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(163, 144, 129));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel3.add(jButton1, java.awt.BorderLayout.SOUTH);

        panel4.setBackground(new java.awt.Color(249, 240, 227));
        panel4.setLayout(new java.awt.GridLayout(0, 1));

        panel7.setLayout(new java.awt.GridLayout(0, 1));

        panel8.setBackground(new java.awt.Color(8, 25, 28));
        panel8.setLayout(new java.awt.GridLayout(0, 1));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Metodos De Pago");
        panel8.add(jLabel6);

        panel7.add(panel8);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/MetodosPago1.png"))); // NOI18N
        panel7.add(jLabel3);

        panel4.add(panel7);

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Vaciar todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel4.add(jButton4);

        Vaciar.setBackground(new java.awt.Color(204, 204, 204));
        Vaciar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Vaciar.setText("Eliminar item");
        Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarActionPerformed(evt);
            }
        });
        panel4.add(Vaciar);

        jButton2.setBackground(new java.awt.Color(163, 144, 129));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jButton2.setText("Ir a pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2);

        panel3.add(panel4, java.awt.BorderLayout.EAST);

        panel6.setBackground(new java.awt.Color(249, 240, 227));
        panel6.setLayout(new java.awt.GridLayout(0, 1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/Logo.png"))); // NOI18N
        panel6.add(jLabel5);

        panel5.setBackground(new java.awt.Color(8, 25, 28));
        panel5.setMaximumSize(new java.awt.Dimension(910, 150));
        panel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/CarroCompras.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(910, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(910, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(910, 50));
        panel5.add(jLabel8);

        panel6.add(panel5);

        panel9.setLayout(new java.awt.GridLayout(1, 0));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        panel9.add(jScrollPane1);

        panel6.add(panel9);

        panel3.add(panel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel3);

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

        jMenu2.setText("Vaciar Fila I");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenu2);

        jMenu3.setText("Vaciar Carrito I");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenu3);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PaginaPrincipal a=PaginaPrincipal.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            int comp=1;
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            int metodo=interfaz.añadirCompra(comp);
            JOptionPane.showMessageDialog(null,"Se ha añadido una compra");
            interfaz.ArchivoBinarioCarrito("Juan12","Juan Calpa","Cra2");
            interfaz.LeerBinarioCarrito();

            

        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getRowCount();
        
        for(int x = fila-1; x >= 0; x--){
            carro.removeRow(x);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarActionPerformed
        // TODO add your handling code here:
        int fila = tabla.getSelectedRow();
            
        if(fila >= 0){
            carro.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "seleccionar fila");
        }
    }//GEN-LAST:event_VaciarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vaciar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
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
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private java.awt.Panel panel9;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
