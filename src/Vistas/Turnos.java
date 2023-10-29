/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import Acceso_A_Datos.CitaVacunaData;
import Acceso_A_Datos.CiudadanoData;
import Acceso_A_Datos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author familia maida
 */
public class Turnos extends javax.swing.JInternalFrame {
    CitaVacunaData citaData = new CitaVacunaData();
    CitaVacunacion cita = new CitaVacunacion();
    DefaultListModel modelo =  new DefaultListModel();
    DefaultListModel Model = new DefaultListModel();
    CiudadanoData ciuData = new CiudadanoData();
    Ciudadano ciu = new Ciudadano();
    VacunaData vacData = new VacunaData();
    
 
    public Turnos() {
        initComponents();
        jCalendario.setDate(null); 
        jCalendario.setMinSelectableDate(new Date());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel1 = new javax.swing.JPanel();
        jLFechasDeVacunacion = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jBannerVacuna = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JLabel();
        jBAsistido1 = new javax.swing.JLabel();
        jListTurnos = new javax.swing.JList<>();
        jCalendario = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jBLVacuna = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 590));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFechasDeVacunacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLFechasDeVacunacion.setForeground(new java.awt.Color(180, 0, 0));
        jLFechasDeVacunacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFechasDeVacunacion.setText("Fecha de vacunacion");
        jPanel1.add(jLFechasDeVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 250, 30));

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
        jPanel1.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 450, 120));

        jBCancelar.setBackground(new java.awt.Color(180, 0, 0));
        jBCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBCancelar.setText("CANCELAR");
        jBCancelar.setToolTipText("Cancelar");
        jBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelar.setOpaque(true);
        jBCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBCancelarMouseExited(evt);
            }
        });
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 130, 40));

        jBAsistido1.setBackground(new java.awt.Color(180, 0, 0));
        jBAsistido1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBAsistido1.setForeground(java.awt.Color.white);
        jBAsistido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBAsistido1.setText("ASISTIDO");
        jBAsistido1.setToolTipText("ASISTIDO");
        jBAsistido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAsistido1.setOpaque(true);
        jBAsistido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAsistido1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAsistido1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAsistido1MouseExited(evt);
            }
        });
        jPanel1.add(jBAsistido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 40));

        jListTurnos.setBackground(new java.awt.Color(255, 255, 255));
        jListTurnos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(180, 0, 0)));
        jListTurnos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jListTurnos.setForeground(new java.awt.Color(180, 0, 0));
        jListTurnos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListTurnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jListTurnos.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jListTurnos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jListTurnos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTurnosValueChanged(evt);
            }
        });
        jPanel1.add(jListTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 480, 200));

        jCalendario.setDateFormatString("yyyy-MM-dd");
        jCalendario.setMaxSelectableDate(new java.util.Date(1797048079000L));
        jCalendario.setMinSelectableDate(new java.util.Date(-62135755138000L));
        jCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarioPropertyChange(evt);
            }
        });
        jPanel1.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 160, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(180, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turnos del dia seleccionado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jBLVacuna.setBackground(new java.awt.Color(180, 0, 0));
        jBLVacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBLVacuna.setForeground(java.awt.Color.white);
        jBLVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBLVacuna.setText("Listar Vacunatorios");
        jBLVacuna.setToolTipText("ASISTIDO");
        jBLVacuna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLVacuna.setOpaque(true);
        jBLVacuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLVacunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBLVacunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBLVacunaMouseExited(evt);
            }
        });
        jPanel1.add(jBLVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jX.setBackground(Color.white);
        jX.setForeground(new Color(180, 0, 0));
        
    }//GEN-LAST:event_jXMouseEntered

    private void jXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMouseExited
        // Tremarcado de boton X
        jX.setBackground(new Color(180, 0, 0));
        jX.setForeground(Color.WHITE);

    }//GEN-LAST:event_jXMouseExited

    private void jBCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseEntered
        jBCancelar.setBackground(Color.white);
        jBCancelar.setForeground(new Color(180, 0, 0));

    }//GEN-LAST:event_jBCancelarMouseEntered

    private void jBCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseExited
        jBCancelar.setBackground(new Color(180, 0, 0));
        jBCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jBCancelarMouseExited

    private void jBAsistido1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido1MouseEntered
        jBAsistido1.setBackground(Color.white);
        jBAsistido1.setForeground(new Color(180, 0, 0));

    }//GEN-LAST:event_jBAsistido1MouseEntered

    private void jBAsistido1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido1MouseExited
        jBAsistido1.setBackground(new Color(180, 0, 0));
        jBAsistido1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jBAsistido1MouseExited

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked
        ciu = new Ciudadano();
        CharSequence Sdni = (jListTurnos.getSelectedValue().subSequence(0, 8));
        int dni = Integer.parseInt((String) Sdni);
        cita = citaData.obtenerCita(dni);
        cita.setCancelada(true);
        citaData.cancelarCita(cita);
        cita.setHoraCita("Cancelada");
        cita.setVacuna(null);
        citaData.modificarCita(cita);
        JOptionPane.showMessageDialog(null, "La cita se cancelo");
        Model.remove(jListTurnos.getSelectedIndex());
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jCalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarioPropertyChange
        // calendario comparador
        LimpiarListas();
        CargarListaTurnos();
    }//GEN-LAST:event_jCalendarioPropertyChange

    private void jBAsistido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido1MouseClicked
        // Boton asistido baja una vacuna del stock
        ciu = new Ciudadano();
        CharSequence Sdni = (jListTurnos.getSelectedValue().subSequence(0, 8));
        int dni = Integer.parseInt((String) Sdni);
        cita = citaData.obtenerCita(dni);
            if(cita.getDosis() < 3){
                cita.setHoraCita("Asistido");
                citaData.modificarCita(cita);
                cita.getVacuna().setColocada(true);
                vacData.modificarColocada(cita.getVacuna());
                citaData.modificardosis(cita);
                cita.setHoraCita("Asistido");
                citaData.modificarCita(cita);
            }else{
                JOptionPane.showMessageDialog(null, "Ya tiene todas las dosis dadas");
            }
        Model.remove(jListTurnos.getSelectedIndex());
        
    }//GEN-LAST:event_jBAsistido1MouseClicked

    private void jListTurnosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTurnosValueChanged

    }//GEN-LAST:event_jListTurnosValueChanged

    private void jBLVacunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLVacunaMouseClicked
        centroVacunacion verVacuna = new centroVacunacion();
        verVacuna.setVisible(true);
        //Citas.this.dispose();
    }//GEN-LAST:event_jBLVacunaMouseClicked

    private void jBLVacunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLVacunaMouseEntered
        jBLVacuna.setBackground(Color.white);
        jBLVacuna.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jBLVacunaMouseEntered

    private void jBLVacunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLVacunaMouseExited
        jBLVacuna.setBackground(new Color(180, 0, 0));
        jBLVacuna.setForeground(Color.white);

    }//GEN-LAST:event_jBLVacunaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBAsistido1;
    private javax.swing.JLabel jBCancelar;
    private javax.swing.JLabel jBLVacuna;
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerVacuna;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLFechasDeVacunacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListTurnos;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jX;
    // End of variables declaration//GEN-END:variables

 private void CargarListaTurnos(){
     SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        List<CitaVacunacion> citas = citaData.listaCitas();
        for (CitaVacunacion cit : citas) {
            if(cit.getHoraCita().length() == 5){
            if(jCalendario.getDate() != null){
                if (formato.format(jCalendario.getDate()).compareToIgnoreCase(cit.getFechaColoca().toString()) == 0) {
                    if(cit.isCancelada()== false){
                Model.addElement(cit.getCiudadano().getDni()+"/ "+cit.getCiudadano().getNombreComp() + "/ Vacuna: " + cit.getVacuna().getMarca() + "/ " + cit.getHoraCita() + "/ Dosis " + cit.getDosis());
                    }
            }
        }
            }
        jListTurnos.setModel(Model);
    }
 }
 private void LimpiarListas(){
     Model.clear();
     jListTurnos.setModel(Model);
 }
}

