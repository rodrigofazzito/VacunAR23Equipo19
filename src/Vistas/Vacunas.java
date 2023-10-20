package Vistas;

import java.awt.Color;
import javax.swing.table.JTableHeader;


public class Vacunas extends javax.swing.JInternalFrame {

 
    public Vacunas() {
        initComponents();
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaVacuna = new javax.swing.JTable();
        jbNuevaVacuna = new javax.swing.JButton();
        jBannerVacuna = new javax.swing.JLabel();
        jMedida = new javax.swing.JLabel();
        jVencimiento = new javax.swing.JLabel();
        jNSerie = new javax.swing.JLabel();
        jVacuna = new javax.swing.JLabel();
        jLaboratorio = new javax.swing.JLabel();
        jTMarca = new javax.swing.JTextField();
        jTLaboratorio = new javax.swing.JTextField();
        jTNSerie = new javax.swing.JTextField();
        jDcVenciemiento = new com.toedter.calendar.JDateChooser();
        jCVacunas = new javax.swing.JComboBox<>();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jCMedida = new javax.swing.JComboBox<>();
        jMarca = new javax.swing.JLabel();

        setResizable(true);
        setAlignmentX(200.0F);
        setAlignmentY(40.0F);
        setPreferredSize(new java.awt.Dimension(880, 590));

        jPBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPBackground.setForeground(new java.awt.Color(180, 0, 0));
        jPBackground.setAlignmentX(200.0F);
        jPBackground.setAlignmentY(40.0F);
        jPBackground.setPreferredSize(new java.awt.Dimension(880, 590));
        jPBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtTablaVacuna.setBackground(new java.awt.Color(255, 255, 255));
        jtTablaVacuna.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true));
        jtTablaVacuna.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtTablaVacuna.setForeground(new java.awt.Color(0, 0, 0));
        jtTablaVacuna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NroDeSerie", "Marca", "medida", "fechadeVencimiento"
            }
        ));
        jtTablaVacuna.setGridColor(new java.awt.Color(180, 0, 0));
        jtTablaVacuna.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jtTablaVacuna.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtTablaVacuna);

        jPBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 850, 80));

        jbNuevaVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/disco-flexible-50.png"))); // NOI18N
        jbNuevaVacuna.setToolTipText("GUARDAR");
        jbNuevaVacuna.setOpaque(false);
        jPBackground.add(jbNuevaVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 60, 60));

        jBannerVacuna.setBackground(new java.awt.Color(180, 0, 0));
        jBannerVacuna.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBannerVacuna.setForeground(new java.awt.Color(255, 255, 255));
        jBannerVacuna.setText("  Vacunas");
        jBannerVacuna.setOpaque(true);
        jPBackground.add(jBannerVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 780, 50));

        jMedida.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMedida.setForeground(new java.awt.Color(180, 0, 0));
        jMedida.setText("Medida:");
        jPBackground.add(jMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jVencimiento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jVencimiento.setForeground(new java.awt.Color(180, 0, 0));
        jVencimiento.setText("Vencimiento");
        jPBackground.add(jVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 30));

        jNSerie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jNSerie.setForeground(new java.awt.Color(180, 0, 0));
        jNSerie.setText("Nro Serie:");
        jPBackground.add(jNSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 20));

        jVacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jVacuna.setForeground(new java.awt.Color(180, 0, 0));
        jVacuna.setText("Vacuna:");
        jPBackground.add(jVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, 30));

        jLaboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLaboratorio.setForeground(new java.awt.Color(180, 0, 0));
        jLaboratorio.setText("Laboratorio:");
        jPBackground.add(jLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, 40));

        jTMarca.setBackground(java.awt.Color.white);
        jTMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTMarca.setForeground(new java.awt.Color(255, 255, 255));
        jTMarca.setDisabledTextColor(new java.awt.Color(180, 0, 0));
        jTMarca.setEnabled(false);
        jTMarca.setOpaque(false);
        jPBackground.add(jTMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, 40));

        jTLaboratorio.setBackground(java.awt.Color.white);
        jTLaboratorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTLaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        jTLaboratorio.setDisabledTextColor(new java.awt.Color(180, 0, 0));
        jTLaboratorio.setEnabled(false);
        jTLaboratorio.setOpaque(false);
        jPBackground.add(jTLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 380, 40));

        jTNSerie.setBackground(java.awt.Color.white);
        jTNSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTNSerie.setForeground(new java.awt.Color(0, 0, 0));
        jTNSerie.setOpaque(false);
        jPBackground.add(jTNSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 240, 40));

        jDcVenciemiento.setBackground(java.awt.Color.white);
        jDcVenciemiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true));
        jDcVenciemiento.setForeground(new java.awt.Color(0, 0, 0));
        jDcVenciemiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jDcVenciemiento.setOpaque(false);
        jPBackground.add(jDcVenciemiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 170, 30));

        jCVacunas.setBackground(java.awt.Color.white);
        jCVacunas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCVacunas.setForeground(new java.awt.Color(0, 0, 0));
        jCVacunas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCVacunas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(180, 0, 0))); // NOI18N
        jCVacunas.setOpaque(false);
        jPBackground.add(jCVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, 40));

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
        jPBackground.add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 50));

        jFondoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logotipo.png"))); // NOI18N
        jPBackground.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 450, 120));

        jBanerLogoVacunar.setBackground(new java.awt.Color(180, 0, 0));
        jBanerLogoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logo-45.png"))); // NOI18N
        jBanerLogoVacunar.setOpaque(true);
        jPBackground.add(jBanerLogoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jCMedida.setBackground(java.awt.Color.white);
        jCMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCMedida.setForeground(new java.awt.Color(0, 0, 0));
        jCMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.3", "0.5", "0.9" }));
        jCMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(180, 0, 0))); // NOI18N
        jCMedida.setOpaque(false);
        jPBackground.add(jCMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 80, 40));

        jMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMarca.setForeground(new java.awt.Color(180, 0, 0));
        jMarca.setText("Marca:");
        jPBackground.add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseClicked
                                             
        // Boton Cerrar
        System.exit(0);
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
    private javax.swing.JComboBox<String> jCMedida;
    private javax.swing.JComboBox<String> jCVacunas;
    private com.toedter.calendar.JDateChooser jDcVenciemiento;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLaboratorio;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jMedida;
    private javax.swing.JLabel jNSerie;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTLaboratorio;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTNSerie;
    private javax.swing.JLabel jVacuna;
    private javax.swing.JLabel jVencimiento;
    private javax.swing.JLabel jX;
    private javax.swing.JButton jbNuevaVacuna;
    private javax.swing.JTable jtTablaVacuna;
    // End of variables declaration//GEN-END:variables
}

