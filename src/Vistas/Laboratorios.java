
package Vistas;


import Acceso_A_Datos.LaboratorioData;
import Entidades.Laboratorio;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Laboratorios extends javax.swing.JInternalFrame {
Laboratorio lab ;
LaboratorioData labD ;

public DefaultTableModel modelo = new DefaultTableModel(){
     
     
    public boolean isCellEditable(int f, int c) {
        return false;
 }
 };
 
public Laboratorios() {
      initComponents();
      lab = new Laboratorio();
      labD = new LaboratorioData();
      armarCabecera();

      
    }
    
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCuit = new javax.swing.JTextField();
        jStock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JButton();
        jDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLaboratorio = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jBannerVacuna = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPaisKeyTyped(evt);
            }
        });
        jPanel1.add(jPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 200, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(180, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 30));

        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 310, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(180, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("País:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/buscar-50.png"))); // NOI18N
        jButton1.setToolTipText("Buscar");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCuitKeyTyped(evt);
            }
        });
        jPanel1.add(jCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, 30));

        jStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jStockKeyTyped(evt);
            }
        });
        jPanel1.add(jStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(180, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cuit:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(180, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 100, 30));

        jGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/disco-flexible-50.png"))); // NOI18N
        jGuardar.setToolTipText("Guardar");
        jGuardar.setBorder(null);
        jGuardar.setOpaque(false);
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(180, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Stock:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, 30));

        jLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/eliminar-50.png"))); // NOI18N
        jLimpiar.setToolTipText("Limpiar");
        jLimpiar.setBorder(null);
        jLimpiar.setOpaque(false);
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, -1));
        jPanel1.add(jDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 290, 30));

        jtLaboratorio.setBackground(new java.awt.Color(255, 255, 255));
        jtLaboratorio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(180, 0, 0)));
        jtLaboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtLaboratorio.setForeground(new java.awt.Color(0, 0, 0));
        jtLaboratorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLaboratorio.setAutoscrolls(false);
        jtLaboratorio.setGridColor(new java.awt.Color(180, 0, 0));
        jtLaboratorio.setOpaque(false);
        jtLaboratorio.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jtLaboratorio.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtLaboratorio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtLaboratorio);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 870, 90));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logotipo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 460, 120));

        jBannerVacuna.setBackground(new java.awt.Color(180, 0, 0));
        jBannerVacuna.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBannerVacuna.setForeground(new java.awt.Color(255, 255, 255));
        jBannerVacuna.setText("Laboratorio");
        jBannerVacuna.setOpaque(true);
        jPanel1.add(jBannerVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 790, 50));

        jBanerLogoVacunar.setBackground(new java.awt.Color(180, 0, 0));
        jBanerLogoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logo-45.png"))); // NOI18N
        jBanerLogoVacunar.setOpaque(true);
        jPanel1.add(jBanerLogoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jX.setBackground(new java.awt.Color(180, 0, 0));
        jX.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jX.setForeground(new java.awt.Color(255, 255, 255));
        jX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jX.setText("X");
        jX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jX.setOpaque(true);
        jX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jXMouseExited(evt);
            }
        });
        jPanel1.add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 884, 497);
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
   if (jCuit.getText().isEmpty() || jNombre.getText().isEmpty() || jPais.getText().isEmpty() || jDireccion.getText().isEmpty() || jStock.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
       }
          if (Long.parseLong(jCuit.getText()) == 11 && jNombre.getText().length() < 80 && jPais.getText().length() < 80 && jDireccion.getText().length() < 80 ) {
          lab.setCuit(Long.parseLong(jCuit.getText()));
            lab.setNomLaboratorio(jNombre.getText());
            lab.setPais(jPais.getText());
            lab.setDomComercial(jDireccion.getText());
            lab.setStockVacuna(Integer.parseInt(jStock.getText()));
            
            labD.GuardarLaboratorio(lab);
            jLimpiarActionPerformed(evt);
      } 

        if (jNombre.getText().length() >= 80) {
            
        JOptionPane.showMessageDialog(null, "El nombre de Laboratorio debe ser menor a 80 caracteres");
        }
        if (jPais.getText().length() >= 80) {
           JOptionPane.showMessageDialog(null, "El Pais de Laboratorio debe ser menor a 80 caracteres"); 
        }
        if (jDireccion.getText().length() >= 80 ) {
            JOptionPane.showMessageDialog(null, "La direccion de Laboratorio debe ser menor a 80 caracteres"); 
        }

         jLimpiarActionPerformed(evt); 
        
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
       jCuit.setText("");
        jNombre.setText("");
         jPais.setText("");
          jDireccion.setText("");
          jStock.setText("");
          modelo.removeRow(0);
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCuitKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
    }//GEN-LAST:event_jCuitKeyTyped
    }
    private void jStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jStockKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
    };
    }//GEN-LAST:event_jStockKeyTyped

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
         char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jNombreKeyTyped

    private void jPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPaisKeyTyped
         char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jPaisKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Buscar Laboratorio
        if (Long.parseLong(jCuit.getText()) == 11) {
            JOptionPane.showMessageDialog(null,"El numero de serie debe ser igual a 11 digitos");
        }
        else{
        long cuit = Long.parseLong(jCuit.getText());
    LaboratorioData LabD = new LaboratorioData();
    List<Laboratorio> lab = LabD.BuscarLaboratorioCuit(cuit);
     modelo.setRowCount(0);
    for (Laboratorio laboratorio : lab) {
        modelo.addRow(new Object[]{laboratorio.getCuit(),laboratorio.getNomLaboratorio(),laboratorio.getPais(),laboratorio.getDomComercial(),laboratorio.getStockVacuna()});
    }
    jtLaboratorio.setModel(modelo); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseClicked

        // Boton Cerrar
        this.dispose();
    }//GEN-LAST:event_jXMouseClicked

    private void jXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseEntered
        // Efecto de posicion

        jX.setBackground(new Color(180, 0, 0));
        jX.setForeground(Color.WHITE);
    }//GEN-LAST:event_jXMouseEntered

    private void jXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseExited
        // Tremarcado de boton X

        jX.setBackground(Color.white);
        jX.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jXMouseExited
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerVacuna;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCuit;
    private javax.swing.JTextField jDireccion;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jStock;
    private javax.swing.JLabel jX;
    public javax.swing.JTable jtLaboratorio;
    // End of variables declaration//GEN-END:variables
 public void armarCabecera() {
        
        modelo.addColumn("Cuit");
        modelo.addColumn("Nombre");
        modelo.addColumn("Pais");
        modelo.addColumn("Direccion");
        modelo.addColumn("Stock");
        
        jtLaboratorio.setModel(modelo);
       
    }

}
