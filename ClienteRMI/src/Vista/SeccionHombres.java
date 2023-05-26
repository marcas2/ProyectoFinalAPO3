/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Vista.SeccionMujeres;
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
 * @author maria
 */
public class SeccionHombres extends javax.swing.JFrame {

    /**
     * Creates new form SeccionHombres
     */
    //variable de tipo static
    private static SeccionHombres instancia;
    
    //constructor privado
    private SeccionHombres() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //metodo que incicia el singleton
    public static SeccionHombres getInstancia(){
        if (instancia == null)
            instancia = new SeccionHombres();
        return instancia;
    }

   
    
    //SeccionMujeres II= new SeccionMujeres();
    
    String [][] seccionH={
        {"01","Camiseta conjunto primavera","57.000",""},
        {"02","Short conjunto primavera","79.000",""},
        {"03","Hoodie conjunto primavera","120.000",""},
        {"04","Zapatos conjunto primavera","315.000",""}
    };
    int [] cantidad= new int[4];
    int x,y;
    
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/camiseta (2).png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.add(jLabel2);

        jPanel7.setBackground(new java.awt.Color(249, 240, 227));
        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(77, 97, 96));
        jLabel7.setText("Camiseta conjunto primavera");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel7.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel7.add(jLabel7);

        jComboBox1.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox1.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox1);

        jComboBox2.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox2.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beige", "Verde claro", "Azul cielo", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox2);

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(77, 97, 96));
        jLabel11.setText("Precio: 57.000$");
        jPanel7.add(jLabel11);

        jButton1.setBackground(new java.awt.Color(77, 97, 96));
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
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/short (1).png"))); // NOI18N
        jPanel4.add(jLabel6);

        jPanel8.setBackground(new java.awt.Color(249, 240, 227));
        jPanel8.setLayout(new java.awt.GridLayout(0, 1));

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(77, 97, 96));
        jLabel15.setText("Short conjunto primavera");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel15.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel8.add(jLabel15);

        jComboBox4.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox4.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox4);

        jComboBox3.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox3.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verde claro", "Azul cielo", " " }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox3);

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(77, 97, 96));
        jLabel17.setText("Precio: 79.00$");
        jPanel8.add(jLabel17);

        jButton3.setBackground(new java.awt.Color(77, 97, 96));
        jButton3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Comprar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton3.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3);

        jPanel4.add(jPanel8);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        jLabel9.setBackground(new java.awt.Color(249, 240, 227));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/saco (1).png"))); // NOI18N
        jPanel5.add(jLabel9);

        jPanel9.setBackground(new java.awt.Color(249, 240, 227));
        jPanel9.setLayout(new java.awt.GridLayout(0, 1));

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(77, 97, 96));
        jLabel18.setText("Hoodie conjunto Primavera");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel18.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel9.add(jLabel18);

        jComboBox5.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox5.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla S", "Talla M", "Talla L", "Talla XL" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel9.add(jComboBox5);

        jComboBox6.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox6.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verde", "Rosa", "Amarillo", "Cafe", "Azul", "Negro", "Blanco", " " }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel9.add(jComboBox6);

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(77, 97, 96));
        jLabel20.setText("Precio: 120.000$");
        jPanel9.add(jLabel20);

        jButton4.setBackground(new java.awt.Color(77, 97, 96));
        jButton4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Comprar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton4.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4);

        jPanel5.add(jPanel9);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        jLabel10.setBackground(new java.awt.Color(249, 240, 227));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Archivos/zapato (1).png"))); // NOI18N
        jPanel6.add(jLabel10);

        jPanel10.setBackground(new java.awt.Color(249, 240, 227));
        jPanel10.setLayout(new java.awt.GridLayout(0, 1));

        jLabel21.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(77, 97, 96));
        jLabel21.setText("Zapatos conjunto Primavera");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel21.setMaximumSize(new java.awt.Dimension(20, 10));
        jPanel10.add(jLabel21);

        jComboBox7.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox7.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Talla 38", "Talla 39", "Talla 40", "Talla 41" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox7);

        jComboBox9.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox9.setForeground(new java.awt.Color(77, 97, 96));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Verdes", "Blanco", "Naranja/negro", "Amarillo/morado", " " }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox9);

        jLabel23.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(77, 97, 96));
        jLabel23.setText("Precio: 315.000$");
        jPanel10.add(jLabel23);

        jButton5.setBackground(new java.awt.Color(77, 97, 96));
        jButton5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Comprar");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton5.setMaximumSize(new java.awt.Dimension(10, 20));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5);

        jPanel6.add(jPanel10);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar6.setBackground(new java.awt.Color(163, 144, 129));
        jMenuBar6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar6.setOpaque(true);

        jMenu9.setText("Principal");
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });

        jMenuItem10.setText("Pag Principal");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenuBar6.add(jMenu9);

        jMenu10.setText("Mujer");

        jMenuItem5.setText("Ropa");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem5);

        jMenuBar6.add(jMenu10);

        jMenu11.setText("Hombre");

        jMenuItem6.setText("Ropa");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem6);

        jMenuBar6.add(jMenu11);

        jMenu12.setText("Bolsos");

        jMenuItem11.setText("Ropa");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem11);

        jMenuBar6.add(jMenu12);

        jMenu13.setText("Carrito");
        jMenu13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu13ActionPerformed(evt);
            }
        });

        jMenuItem12.setText("Ver Carrito");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem12);

        jMenuItem13.setText("Vaciar Carrito");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem13);

        jMenuItem14.setText("Ver Carrito I");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem14);

        jMenuBar6.add(jMenu13);

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

        jMenuBar6.add(jMenu1);

        setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

         try {
            // TODO add your handling code here:==
            x=01;
            y=0;
            String talla = String.valueOf(this.jComboBox1.getSelectedItem());
            String color = String.valueOf(this.jComboBox2.getSelectedItem());
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.Compras(x,y,talla,color); 
            JOptionPane.showMessageDialog(null,metodo);
            
            
        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         String []info = new String [3];
         info[0]= "01";
         info[1]= "Camiseta ";
         info[2]=  "50.000";
         
         Carrito.carro.addRow(info);
         
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            x=01;
            y=1;
            String talla = String.valueOf(this.jComboBox4.getSelectedItem());
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:==
            x=01;
            y=2;
            String talla = String.valueOf(this.jComboBox5.getSelectedItem());
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       try {
            // TODO add your handling code here:==
            x=03;
            y=3;
            
            String talla = String.valueOf(this.jComboBox7.getSelectedItem());
            String color = String.valueOf(this.jComboBox9.getSelectedItem());
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String metodo=interfaz.Compras(x,y,talla,color); 
            JOptionPane.showMessageDialog(null,metodo);

            
        } catch (RemoteException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(SeccionHombres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        //MenuPrincipal
        PaginaPrincipal a=PaginaPrincipal.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu9ActionPerformed

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

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        //Menu bolsos
        SeccionBolsos a=SeccionBolsos.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
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
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
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
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Carrito a= Carrito.getInstancia();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu13ActionPerformed

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
  /**   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /**  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeccionHombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeccionHombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeccionHombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeccionHombres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     /**    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeccionHombres().setVisible(true);
            }
        });
    }
    **/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
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
