/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_A_Datos.CitaVacunaData;
import Acceso_A_Datos.CiudadanoData;
import Acceso_A_Datos.LaboratorioData;
import Acceso_A_Datos.VacunaData;
import Entidades.Ciudadano;
import Entidades.Vacuna;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

/**
 *
 * @author familia maida
 */
public class Turnos extends javax.swing.JInternalFrame {

// Turnos jLBotones = new Turnos();
// private int arcWidth = 20; // Ancho del arco
// private int arcHeight = 20; // Alto del arco
 
    public Turnos() {
        initComponents();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLFechasDeVacunacion = new javax.swing.JLabel();
        jDni = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jBannerVacuna = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JLabel();
        jBAsistido1 = new javax.swing.JLabel();
        jList1 = new javax.swing.JList<>();
        jCalendar2 = new com.toedter.calendar.JCalendar();

        setPreferredSize(new java.awt.Dimension(880, 590));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFechasDeVacunacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLFechasDeVacunacion.setForeground(new java.awt.Color(180, 0, 0));
        jLFechasDeVacunacion.setText("Fecha de vacunacion");
        jPanel1.add(jLFechasDeVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 260, 30));

        jDni.setBackground(new java.awt.Color(255, 255, 255));
        jDni.setForeground(new java.awt.Color(180, 0, 0));
        jDni.setText("DNI");
        jDni.setToolTipText("Nombre del Paciente");
        jDni.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(180, 0, 0)));
        jPanel1.add(jDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 300, 40));

        jBanerLogoVacunar.setBackground(new java.awt.Color(180, 0, 0));
        jBanerLogoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logo-45.png"))); // NOI18N
        jBanerLogoVacunar.setOpaque(true);
        jPanel1.add(jBanerLogoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jBannerVacuna.setBackground(new java.awt.Color(180, 0, 0));
        jBannerVacuna.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jBannerVacuna.setForeground(new java.awt.Color(255, 255, 255));
        jBannerVacuna.setText("  Turnos");
        jBannerVacuna.setOpaque(true);
        jPanel1.add(jBannerVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 780, 50));

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
        jPanel1.add(jX, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 50, 50));

        jFondoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logotipo.png"))); // NOI18N
        jPanel1.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 450, 120));

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setForeground(new java.awt.Color(180, 0, 0));
        jBCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBCancelar.setText("CANCELAR");
        jBCancelar.setToolTipText("ASISTIDO");
        jBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 130, 40));

        jBAsistido1.setBackground(new java.awt.Color(255, 255, 255));
        jBAsistido1.setForeground(new java.awt.Color(180, 0, 0));
        jBAsistido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBAsistido1.setText("ASISTIDO");
        jBAsistido1.setToolTipText("ASISTIDO");
        jBAsistido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAsistido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAsistido1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAsistido1MouseExited(evt);
            }
        });
        jPanel1.add(jBAsistido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 130, 40));

        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(180, 0, 0)));
        jList1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jList1.setForeground(new java.awt.Color(180, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jPanel1.add(jList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 159, 290, 240));

        jCalendar2.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar2.setDecorationBackgroundColor(new java.awt.Color(180, 0, 0));
        jCalendar2.setSundayForeground(new java.awt.Color(255, 102, 102));
        jCalendar2.setTodayButtonVisible(true);
        jCalendar2.setWeekdayForeground(new java.awt.Color(255, 255, 153));
        jPanel1.add(jCalendar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 400, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("turnos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        jX.setBackground(new Color(180, 0, 0));
        jX.setForeground(Color.WHITE);

    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        jX.setBackground(Color.white);
        jX.setForeground(new Color(180, 0, 0));

    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBAsistido1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido1MouseEntered
        jX.setBackground(new Color(180, 0, 0));
        jX.setForeground(Color.WHITE);

    }//GEN-LAST:event_jBAsistido1MouseEntered

    private void jBAsistido1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido1MouseExited
        jX.setBackground(Color.white);
        jX.setForeground(new Color(180, 0, 0));

    }//GEN-LAST:event_jBAsistido1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBAsistido1;
    private javax.swing.JLabel jBCancelar;
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerVacuna;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jDni;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLFechasDeVacunacion;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jX;
    // End of variables declaration//GEN-END:variables
 
}


   


