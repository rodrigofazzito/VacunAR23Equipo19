/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import Acceso_A_Datos.CitaVacunaData;
import Acceso_A_Datos.CiudadanoData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import java.awt.Color;
import java.text.SimpleDateFormat;

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
    
 
    public Turnos() {
        initComponents();
        CargarLista();
        jCalendario.setDate(null); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel1 = new javax.swing.JPanel();
        jLFechasDeVacunacion = new javax.swing.JLabel();
        jDni = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jBannerVacuna = new javax.swing.JLabel();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JLabel();
        jListTurnos = new javax.swing.JList<>();
        jTdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCalendario = new com.toedter.calendar.JDateChooser();
        jListCiudadano = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBAsistido3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 590));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFechasDeVacunacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLFechasDeVacunacion.setForeground(new java.awt.Color(180, 0, 0));
        jLFechasDeVacunacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFechasDeVacunacion.setText("Fecha de vacunacion");
        jPanel1.add(jLFechasDeVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 30));

        jDni.setBackground(new java.awt.Color(255, 255, 255));
        jDni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jDni.setForeground(new java.awt.Color(180, 0, 0));
        jDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDni.setText("DNI:");
        jDni.setToolTipText("Nombre del Paciente");
        jDni.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(180, 0, 0)));
        jPanel1.add(jDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 50, 30));
        jDni.getAccessibleContext().setAccessibleDescription("Dni paciente");

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
        jPanel1.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 450, 120));

        jBCancelar.setBackground(new java.awt.Color(180, 0, 0));
        jBCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jBCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBCancelar.setText("CANCELAR");
        jBCancelar.setToolTipText("ASISTIDO");
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
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 130, 40));

        jListTurnos.setBackground(new java.awt.Color(255, 255, 255));
        jListTurnos.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(180, 0, 0)));
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
        jPanel1.add(jListTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 290, 240));

        jTdni.setBackground(new java.awt.Color(204, 204, 204));
        jTdni.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTdni.setForeground(new java.awt.Color(0, 0, 0));
        jTdni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTdni.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(180, 0, 0)));
        jTdni.setDisabledTextColor(new java.awt.Color(255, 153, 153));
        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdniKeyPressed(evt);
            }
        });
        jPanel1.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 250, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(180, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar por DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 160, 30));

        jCalendario.setBackground(new java.awt.Color(255, 255, 255));
        jCalendario.setForeground(new java.awt.Color(0, 0, 0));
        jCalendario.setDateFormatString("yyyy-MM-dd");
        jCalendario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCalendario.setMinSelectableDate(new java.util.Date(-62135755138000L));
        jCalendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarioPropertyChange(evt);
            }
        });
        jPanel1.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 40));

        jListCiudadano.setBackground(new java.awt.Color(255, 255, 255));
        jListCiudadano.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(180, 0, 0)));
        jListCiudadano.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jListCiudadano.setForeground(new java.awt.Color(180, 0, 0));
        jListCiudadano.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCiudadano.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jListCiudadano.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jListCiudadano, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 290, 240));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(180, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turnos del dia seleccionado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(180, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(180, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(180, 0, 0)));
        jSeparator1.setEnabled(false);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 100, -1, 300));

        jBAsistido3.setBackground(new java.awt.Color(180, 0, 0));
        jBAsistido3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBAsistido3.setForeground(new java.awt.Color(255, 255, 255));
        jBAsistido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBAsistido3.setText("ASISTIDO");
        jBAsistido3.setToolTipText("ASISTIDO");
        jBAsistido3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBAsistido3.setOpaque(true);
        jBAsistido3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAsistido3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBAsistido3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBAsistido3MouseExited(evt);
            }
        });
        jPanel1.add(jBAsistido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 130, 40));

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

    private void jBCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCancelarMouseClicked

        }
    }//GEN-LAST:event_jBCancelarMouseClicked

    private void jCalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarioPropertyChange
        // calendario comparador
        LimpiarListas();
        CargarListaTurnos();
    }//GEN-LAST:event_jCalendarioPropertyChange

    private void jListTurnosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTurnosValueChanged
        
        System.out.println(jListTurnos.getSelectedValue());
    }//GEN-LAST:event_jListTurnosValueChanged

    private void jBAsistido3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAsistido3MouseClicked

    private void jBAsistido3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAsistido3MouseEntered

    private void jBAsistido3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAsistido3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAsistido3MouseExited

    private void jTdniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyPressed
        char c = (char) evt.getKeyCode();
        if (c == evt.VK_ENTER) {
            if (jTdni.getText().length() == 8) {
                List<CitaVacunacion> citas = citaData.listaCitas();
                int dosis = 0;
                String cancelada = null;
                for (CitaVacunacion cit : citas) {
                    dosis = cit.getDosis();
                    if(cit.getVacuna().isColocada() == true){
                        modelo.addElement(cit.getFechaColoca()+" se coloco");
                    }
                    modelo.addElement(cit.getFechaColoca());
                    if (cit.isCancelada() == true) {
                        cancelada = "Cita Cancelada";
                        modelo.addElement(cancelada);

                    }
                }
                ciu = ciuData.buscarCiudadano(Integer.parseInt(jTdni.getText()));
                citaData.obtenerCita(Integer.parseInt(jTdni.getText()));
                if (dosis >= 1) {
                    modelo.addElement(dosis + " dosis");
                }
                modelo.addElement(ciu.getNombreComp());
                modelo.addElement(ciu.getEmail());
                modelo.addElement(ciu.getCelular());
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un Dni valido");
            }
        }
    }//GEN-LAST:event_jTdniKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBAsistido3;
    private javax.swing.JLabel jBCancelar;
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerVacuna;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JLabel jDni;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLFechasDeVacunacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListCiudadano;
    private javax.swing.JList<String> jListTurnos;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTdni;
    private javax.swing.JLabel jX;
    // End of variables declaration//GEN-END:variables
 private void CargarLista(){
     //lista de ciudadano por dni
    jListCiudadano.setModel(modelo);
    }
 private void CargarListaTurnos(){
     SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        List<CitaVacunacion> citas = citaData.listaCitas();
        for (CitaVacunacion cit : citas) {
            if(jCalendario.getDate() != null){
                if (formato.format(jCalendario.getDate()).compareToIgnoreCase(cit.getFechaColoca().toString()) == 0) {
                Model.addElement(cit.getCiudadano().getNombreComp() + " Vacuna: " + cit.getVacuna().getMarca() + " " + cit.getHoraCita() + " Dosis " + cit.getDosis());
            }
            }
        }
        jListTurnos.setModel(Model);
    }
 private void LimpiarListas(){
     Model.clear();
     jListTurnos.setModel(Model);
 }
}

