/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



/**
 *
 * @author Rodrigo Fazzito
 */
public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    
    public Principal() {
        initComponents();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                jHora.setText(formateador.format(LocalDateTime.now()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
};
Thread hilo = new Thread(runnable);
hilo.start();
        SetDate();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jBanner = new javax.swing.JPanel();
        bVacuna = new javax.swing.JPanel();
        jVacuna = new javax.swing.JLabel();
        bPaciente = new javax.swing.JPanel();
        jPaciente = new javax.swing.JLabel();
        bCita = new javax.swing.JPanel();
        jCita = new javax.swing.JLabel();
        bLabo = new javax.swing.JPanel();
        jLabo = new javax.swing.JLabel();
        jHora = new javax.swing.JLabel();
        bTurnos = new javax.swing.JPanel();
        jTurnos = new javax.swing.JLabel();
        jBannerBajo = new javax.swing.JLabel();
        jBannerHora = new javax.swing.JLabel();
        Bx = new javax.swing.JPanel();
        jX = new javax.swing.JLabel();
        jEscritorio = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(null);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setMinimumSize(new java.awt.Dimension(1080, 720));
        Fondo.setPreferredSize(new java.awt.Dimension(1080, 720));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBanner.setBackground(new java.awt.Color(180, 0, 0));
        jBanner.setPreferredSize(new java.awt.Dimension(200, 550));
        jBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bVacuna.setBackground(new java.awt.Color(180, 0, 0));
        bVacuna.setForeground(new java.awt.Color(255, 255, 255));
        bVacuna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bVacuna.setPreferredSize(new java.awt.Dimension(200, 63));

        jVacuna.setBackground(new java.awt.Color(180, 0, 0));
        jVacuna.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jVacuna.setForeground(new java.awt.Color(255, 255, 255));
        jVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jVacuna.setText("VACUNA");
        jVacuna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVacuna.setOpaque(true);
        jVacuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jVacunaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jVacunaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jVacunaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bVacunaLayout = new javax.swing.GroupLayout(bVacuna);
        bVacuna.setLayout(bVacunaLayout);
        bVacunaLayout.setHorizontalGroup(
            bVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bVacunaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bVacunaLayout.setVerticalGroup(
            bVacunaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bVacunaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBanner.add(bVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 179, -1, -1));

        bPaciente.setBackground(new java.awt.Color(180, 0, 0));
        bPaciente.setForeground(new java.awt.Color(255, 255, 255));
        bPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPaciente.setBackground(new java.awt.Color(180, 0, 0));
        jPaciente.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPaciente.setText("PACIENTE");
        jPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPaciente.setOpaque(true);
        jPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPacienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bPacienteLayout = new javax.swing.GroupLayout(bPaciente);
        bPaciente.setLayout(bPacienteLayout);
        bPacienteLayout.setHorizontalGroup(
            bPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bPacienteLayout.setVerticalGroup(
            bPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBanner.add(bPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 200, -1));

        bCita.setBackground(new java.awt.Color(180, 0, 0));
        bCita.setForeground(new java.awt.Color(255, 255, 255));
        bCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bCita.setPreferredSize(new java.awt.Dimension(200, 63));

        jCita.setBackground(new java.awt.Color(180, 0, 0));
        jCita.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jCita.setForeground(new java.awt.Color(255, 255, 255));
        jCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCita.setText("CITA");
        jCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCita.setOpaque(true);
        jCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCitaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bCitaLayout = new javax.swing.GroupLayout(bCita);
        bCita.setLayout(bCitaLayout);
        bCitaLayout.setHorizontalGroup(
            bCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCita, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        bCitaLayout.setVerticalGroup(
            bCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCita, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBanner.add(bCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 253, -1, -1));

        bLabo.setBackground(new java.awt.Color(180, 0, 0));
        bLabo.setForeground(new java.awt.Color(255, 255, 255));
        bLabo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bLabo.setPreferredSize(new java.awt.Dimension(200, 63));

        jLabo.setBackground(new java.awt.Color(180, 0, 0));
        jLabo.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabo.setForeground(new java.awt.Color(255, 255, 255));
        jLabo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabo.setText("LABORATORIO");
        jLabo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabo.setOpaque(true);
        jLabo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLaboMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLaboMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLaboMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bLaboLayout = new javax.swing.GroupLayout(bLabo);
        bLabo.setLayout(bLaboLayout);
        bLaboLayout.setHorizontalGroup(
            bLaboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bLaboLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bLaboLayout.setVerticalGroup(
            bLaboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bLaboLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabo))
        );

        jBanner.add(bLabo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 50));

        jHora.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jHora.setForeground(new java.awt.Color(255, 255, 255));
        jHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBanner.add(jHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 150, 50));

        bTurnos.setBackground(new java.awt.Color(180, 0, 0));
        bTurnos.setForeground(new java.awt.Color(255, 255, 255));
        bTurnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bTurnos.setPreferredSize(new java.awt.Dimension(200, 63));

        jTurnos.setBackground(new java.awt.Color(180, 0, 0));
        jTurnos.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jTurnos.setForeground(new java.awt.Color(255, 255, 255));
        jTurnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTurnos.setText("TURNOS");
        jTurnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTurnos.setOpaque(true);
        jTurnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTurnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTurnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTurnosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bTurnosLayout = new javax.swing.GroupLayout(bTurnos);
        bTurnos.setLayout(bTurnosLayout);
        bTurnosLayout.setHorizontalGroup(
            bTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bTurnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bTurnosLayout.setVerticalGroup(
            bTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTurnos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jBanner.add(bTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 327, -1, 50));

        Fondo.add(jBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 740));

        jBannerBajo.setBackground(new java.awt.Color(224, 0, 0));
        jBannerBajo.setForeground(new java.awt.Color(255, 255, 255));
        jBannerBajo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBannerBajo.setText("       ");
        jBannerBajo.setOpaque(true);
        Fondo.add(jBannerBajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 790, 90));

        jBannerHora.setBackground(new java.awt.Color(224, 0, 0));
        jBannerHora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBannerHora.setForeground(new java.awt.Color(255, 255, 255));
        jBannerHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBannerHora.setOpaque(true);
        Fondo.add(jBannerHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 290, 90));

        Bx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bx.setOpaque(false);
        Bx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BxMouseDragged(evt);
            }
        });
        Bx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BxMousePressed(evt);
            }
        });

        jX.setBackground(new java.awt.Color(255, 255, 255));
        jX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jX.setForeground(new java.awt.Color(218, 0, 0));
        jX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jX.setText("X");
        jX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jX.setMaximumSize(new java.awt.Dimension(30, 30));
        jX.setMinimumSize(new java.awt.Dimension(30, 30));
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

        javax.swing.GroupLayout BxLayout = new javax.swing.GroupLayout(Bx);
        Bx.setLayout(BxLayout);
        BxLayout.setHorizontalGroup(
            BxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BxLayout.createSequentialGroup()
                .addContainerGap(1040, Short.MAX_VALUE)
                .addComponent(jX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BxLayout.setVerticalGroup(
            BxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BxLayout.createSequentialGroup()
                .addComponent(jX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(592, 592, 592))
        );

        Fondo.add(Bx, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 40));

        jEscritorio.setOpaque(false);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        Fondo.add(jEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 880, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BxMousePressed
    // Buscar la posicion del Mouse para el menu principal
        xMouse =  evt.getX();
        yMouse =  evt.getY();
    }//GEN-LAST:event_BxMousePressed

    private void BxMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BxMouseDragged
        // Arrastrar el menu principal
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BxMouseDragged

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

    private void jPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPacienteMouseEntered
        //Cambio de Color por posicion
        jPaciente.setBackground(Color.white);
        jPaciente.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jPacienteMouseEntered

    private void jPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPacienteMouseExited
        // Cambio de Color por posicion al salir
        jPaciente.setBackground(new Color(180, 0, 0));
        jPaciente.setForeground(Color.WHITE);
    }//GEN-LAST:event_jPacienteMouseExited

    private void jVacunaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVacunaMouseEntered
        //Cambio de Color por posicion
        jVacuna.setBackground(Color.white);
        jVacuna.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jVacunaMouseEntered

    private void jVacunaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVacunaMouseExited
        // Cambio de Color por posicion al salir
        jVacuna.setBackground(new Color(180, 0, 0));
        jVacuna.setForeground(Color.WHITE);
    }//GEN-LAST:event_jVacunaMouseExited

    private void jCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCitaMouseEntered
        //Cambio de Color por posicion
        jCita.setBackground(Color.white);
        jCita.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jCitaMouseEntered

    private void jCitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCitaMouseExited
        // Cambio de Color por posicion al salir
        jCita.setBackground(new Color(180, 0, 0));
        jCita.setForeground(Color.WHITE);
    }//GEN-LAST:event_jCitaMouseExited

    private void jLaboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLaboMouseEntered
        //Cambio de Color por posicion
        jLabo.setBackground(Color.white);
        jLabo.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jLaboMouseEntered

    private void jLaboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLaboMouseExited
        // Cambio de Color por posicion al salir
        jLabo.setBackground(new Color(180, 0, 0));
        jLabo.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLaboMouseExited

    private void jPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPacienteMouseClicked
        // boton paciente
        jEscritorio.removeAll();
        Paciente paciente = new Paciente();
        paciente.setVisible(true);
        jEscritorio.add(paciente);
        paciente.moveToFront();
        
        
        
    }//GEN-LAST:event_jPacienteMouseClicked

    private void jLaboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLaboMouseClicked
        // boton laboratorio
        jEscritorio.removeAll();
        Laboratorios laboratorios = new Laboratorios();
        laboratorios.setVisible(true);
        jEscritorio.add(laboratorios);
        laboratorios.moveToFront();
        
    }//GEN-LAST:event_jLaboMouseClicked

    private void jCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCitaMouseClicked
        //boton cita
        jEscritorio.removeAll();
        Citas citas = new Citas();
        citas.setVisible(true);
        jEscritorio.add(citas);
        citas.moveToFront();
    }//GEN-LAST:event_jCitaMouseClicked

    private void jTurnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurnosMouseClicked
        // boton laboratorio
        jEscritorio.removeAll();
        Turnos turnos = new Turnos();
        turnos.setVisible(true);
        jEscritorio.add(turnos);
        turnos.moveToFront();
    }//GEN-LAST:event_jTurnosMouseClicked

    private void jTurnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurnosMouseEntered
        //Cambio de Color por posicion
        jTurnos.setBackground(Color.white);
        jTurnos.setForeground(new Color(180, 0, 0));
    }//GEN-LAST:event_jTurnosMouseEntered

    private void jTurnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTurnosMouseExited
        // Cambio de Color por posicion al salir
        jTurnos.setBackground(new Color(180, 0, 0));
        jTurnos.setForeground(Color.WHITE);
    }//GEN-LAST:event_jTurnosMouseExited

    private void jVacunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jVacunaMouseClicked
        jEscritorio.removeAll();
        Vacunas vacunas = new Vacunas();
        vacunas.setVisible(true);
        jEscritorio.add(vacunas);
        vacunas.moveToFront();
    }//GEN-LAST:event_jVacunaMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bx;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel bCita;
    private javax.swing.JPanel bLabo;
    private javax.swing.JPanel bPaciente;
    private javax.swing.JPanel bTurnos;
    private javax.swing.JPanel bVacuna;
    private javax.swing.JPanel jBanner;
    private javax.swing.JLabel jBannerBajo;
    private javax.swing.JLabel jBannerHora;
    private javax.swing.JLabel jCita;
    public javax.swing.JPanel jEscritorio;
    private javax.swing.JLabel jHora;
    private javax.swing.JLabel jLabo;
    private javax.swing.JLabel jPaciente;
    private javax.swing.JLabel jTurnos;
    private javax.swing.JLabel jVacuna;
    private javax.swing.JLabel jX;
    // End of variables declaration//GEN-END:variables

    private void SetDate() { // Fecha en Barra 
       
         LocalDate now = LocalDate.now();
        int anio = now.getYear();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        jBannerHora.setText("Hoy es " + dia + " de " + meses[mes - 1] + " de " + anio);
        
    }
}




   

          

  
    
    
    

    
    
    

