/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Acceso_A_Datos.CiudadanoData;
import Entidades.Ciudadano;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author familia maida
 */
public class Paciente extends javax.swing.JInternalFrame {

    Ciudadano ciu;
    CiudadanoData ciuData;
    public Paciente() {
        initComponents();
        ciu = new Ciudadano();
        ciuData = new CiudadanoData();
        inicializarBotones();
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
        jBannerPaciente = new javax.swing.JLabel();
        jDni = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jCelular = new javax.swing.JLabel();
        jcbEsencial = new javax.swing.JCheckBox();
        jtDni = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jtNombreCompleto = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jX = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jAsterisco1 = new javax.swing.JLabel();
        jAsterisco2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();

        setBorder(null);
        setAlignmentX(200.0F);
        setAlignmentY(40.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(870, 570));
        setRequestFocusEnabled(false);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 590));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBannerPaciente.setBackground(new java.awt.Color(180, 0, 0));
        jBannerPaciente.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBannerPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jBannerPaciente.setText(" Paciente");
        jBannerPaciente.setOpaque(true);
        jBannerPaciente.setPreferredSize(new java.awt.Dimension(167, 47));
        jBannerPaciente.setRequestFocusEnabled(false);
        jPanel1.add(jBannerPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 780, 50));

        jDni.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDni.setForeground(new java.awt.Color(180, 0, 0));
        jDni.setText("DNI:");
        jPanel1.add(jDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 40, 40));

        jNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jNombre.setForeground(new java.awt.Color(180, 0, 0));
        jNombre.setText("Nombre Completo:");
        jPanel1.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 40));

        jEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jEmail.setForeground(new java.awt.Color(180, 0, 0));
        jEmail.setText("E-Mail:");
        jPanel1.add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 232, -1, 40));

        jCelular.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jCelular.setForeground(new java.awt.Color(180, 0, 0));
        jCelular.setText("Celular:");
        jPanel1.add(jCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, 40));

        jcbEsencial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jcbEsencial.setForeground(new java.awt.Color(180, 0, 0));
        jcbEsencial.setText("Esencial");
        jcbEsencial.setOpaque(false);
        jPanel1.add(jcbEsencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jtDni.setForeground(new java.awt.Color(180, 0, 0));
        jtDni.setOpaque(false);
        jtDni.setSelectedTextColor(new java.awt.Color(180, 0, 0));
        jtDni.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 220, 40));

        jtCelular.setForeground(new java.awt.Color(180, 0, 0));
        jtCelular.setOpaque(false);
        jtCelular.setSelectedTextColor(new java.awt.Color(180, 0, 0));
        jtCelular.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 200, 40));

        jtNombreCompleto.setForeground(new java.awt.Color(180, 0, 0));
        jtNombreCompleto.setOpaque(false);
        jtNombreCompleto.setSelectedTextColor(new java.awt.Color(180, 0, 0));
        jtNombreCompleto.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtNombreCompleto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreCompletoKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 480, 40));

        jtEmail.setForeground(new java.awt.Color(180, 0, 0));
        jtEmail.setOpaque(false);
        jtEmail.setSelectedTextColor(new java.awt.Color(180, 0, 0));
        jtEmail.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEmailKeyTyped(evt);
            }
        });
        jPanel1.add(jtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 330, 40));

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/buscar-50.png"))); // NOI18N
        jBBuscar.setToolTipText("Buscar");
        jBBuscar.setBorder(null);
        jBBuscar.setOpaque(false);
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 60, 60));

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/disco-flexible-50.png"))); // NOI18N
        jbGuardar.setToolTipText("Guardar");
        jbGuardar.setBorder(null);
        jbGuardar.setOpaque(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 60, 60));

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

        jBanerLogoVacunar.setBackground(new java.awt.Color(180, 0, 0));
        jBanerLogoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logo-45.png"))); // NOI18N
        jBanerLogoVacunar.setOpaque(true);
        jPanel1.add(jBanerLogoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jFondoVacunar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Vacunar-Logotipo.png"))); // NOI18N
        jPanel1.add(jFondoVacunar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 450, 120));

        jAsterisco1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jAsterisco1.setForeground(new java.awt.Color(180, 0, 0));
        jAsterisco1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAsterisco1.setText("*");
        jPanel1.add(jAsterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 20, 40));

        jAsterisco2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jAsterisco2.setForeground(new java.awt.Color(180, 0, 0));
        jAsterisco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAsterisco2.setText("*");
        jPanel1.add(jAsterisco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 20, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(180, 0, 0));
        jLabel1.setText("(*) Campos Opcionales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 200, 30));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/eliminar-50.png"))); // NOI18N
        jbLimpiar.setToolTipText("Limpiar");
        jbLimpiar.setBorder(null);
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 60, 60));

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/Modificar50.png"))); // NOI18N
        jbModificar.setToolTipText("Modificar");
        jbModificar.setBorder(null);
        jbModificar.setOpaque(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 877, 520);
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

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            if (jtDni.getText().isEmpty() || jtNombreCompleto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            } else {
                if (jtDni.getText().length() == 8 ) {
                    
                    int nuevoDni = Integer.parseInt(jtDni.getText());
                    if (nuevoDni != ciu.getDni()) {
                        ciu.setDni(nuevoDni);
                        if (jtNombreCompleto.getText().length()<30) {
                            ciu.setNombreComp(jtNombreCompleto.getText());
                        }else{
                         JOptionPane.showMessageDialog(null, "ingrese un nombre menor de 30 digitos");
                         return;
                        }
                        

                        // Verificar si jtEmail y jtCelular están vacíos antes de asignarlos
                        if (!jtEmail.getText().isEmpty()) {
                            if (jtEmail.getText().length() < 30) {
                                ciu.setEmail(jtEmail.getText());
                            } else {
                                JOptionPane.showMessageDialog(null, "ingrese un email menor de 30 digitos");
                                return;
                            }
                        }

                        if (!jtCelular.getText().isEmpty()) {
                            if (jtCelular.getText().length() < 18) {
                                ciu.setCelular(Long.parseLong(jtCelular.getText()));
                            } else {
                                JOptionPane.showMessageDialog(null, "ingrese un numero menor de 18 digitos");
                                return;
                            }

                        }

                        if (jcbEsencial.isSelected()) {
                            ciu.setEsencial(true);
                        } else {
                            ciu.setEsencial(false);
                        }

                        ciuData.GuardarCiudadano(ciu);
                        jbLimpiarActionPerformed(evt);
                        
                        JOptionPane.showMessageDialog(null, "Ciudadano cargado con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese un DNI diferente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El DNI debe tener 8 dígitos");
                    jbLimpiarActionPerformed(evt);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el guardar ciudadano");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtDni.setText("");
        jtNombreCompleto.setText("");
        jtEmail.setText("");
        jtCelular.setText("");
        jcbEsencial.setSelected(false);
        jcbEsencial.setSelected(false);
        jtDni.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       // Crear una instancia de Ciudadano
 ciu = new Ciudadano();

        try {
            if (jtDni.getText().isEmpty() || jtNombreCompleto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se puede modificar, DNI o nombre completo están vacíos");
            } else {
                int nuevoDni = Integer.parseInt(jtDni.getText());

                // Comprobar si el nuevo DNI es diferente del DNI actual
                if (nuevoDni != ciu.getDni()) {
                    ciu.setDni(Integer.parseInt(jtDni.getText()));
                    
                      if (jtNombreCompleto.getText().length()<30) {
                            ciu.setNombreComp(jtNombreCompleto.getText());
                        }else{
                         JOptionPane.showMessageDialog(null, "ingrese un nombre menor de 30 digitos");
                         return;
                        }
                        
                    

                    // Validar el campo celular
                    if (jtCelular.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El campo celular no puede quedar vacío, si no desea numero ingresar 0");
                        return; // Salir del método si el celular está vacío
                    } else if (jtCelular.getText().length()<18) {
                        ciu.setCelular(Long.parseLong(jtCelular.getText()));
                        
                    }else{
                    JOptionPane.showMessageDialog(null, "ingrese un numero menor de 18 digitos");
                    return;
                    }
                    if (jtEmail.getText().length()<30) {
                        ciu.setEmail(jtEmail.getText());
                       
                    }else{
                     JOptionPane.showMessageDialog(null, "ingrese un email menor de 30 digitos");
                     return;
                    }
                    
                    ciu.setEsencial(jcbEsencial.isSelected());

                    // Llamar al método para modificar al paciente
                    ciuData.modificarCiudadano(ciu);
                    JOptionPane.showMessageDialog(null, "Paciente modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "No ha ingresado un nuevo DNI");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato de los campos");
        }
   

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();}
    }//GEN-LAST:event_jtDniKeyTyped

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String dniText = jtDni.getText();
    if (dniText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Complete el campo DNI");
    } else if (dniText.length() != 8) {
        JOptionPane.showMessageDialog(null, "Ingrese un DNI correcto (8 dígitos)");
        jbLimpiarActionPerformed(evt);
    } else {
        try {
            int dni = Integer.parseInt(dniText);
            Ciudadano paciente = ciuData.buscarCiudadano(dni);
            if (paciente != null) {
                // Paciente encontrado, actualizamos los campos
                jtNombreCompleto.setText(paciente.getNombreComp());
                jtEmail.setText(paciente.getEmail());
                jtCelular.setText(String.valueOf(paciente.getCelular()));

                // Actualizamos el estado del CheckBox basado en el paciente
                jcbEsencial.setSelected(paciente.isEsencial());
            } else {
                // No se encontró al paciente
                JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con el DNI proporcionado");
                              
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el formato del DNI");
        }
    }
               
               activarOdesactivarBotonGuardarOModificar();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyReleased
        activarOdesactivarBotonGuardarOModificar();
    }//GEN-LAST:event_jtDniKeyReleased

    private void jtNombreCompletoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreCompletoKeyTyped
         char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();}
    }//GEN-LAST:event_jtNombreCompletoKeyTyped

    private void jtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEmailKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();}
    }//GEN-LAST:event_jtEmailKeyTyped

    private void jtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCelularKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();}
    }//GEN-LAST:event_jtCelularKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAsterisco1;
    private javax.swing.JLabel jAsterisco2;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerPaciente;
    private javax.swing.JLabel jCelular;
    private javax.swing.JLabel jDni;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jX;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcbEsencial;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNombreCompleto;
    // End of variables declaration//GEN-END:variables
private void inicializarBotones(){
jbGuardar.setEnabled(false);
jbModificar.setEnabled(false);
}
private void activarOdesactivarBotonGuardarOModificar() {
    try {
            String dniText = jtDni.getText();
            if (dniText.isEmpty()) {
                jbGuardar.setEnabled(false);
                jbModificar.setEnabled(false);
            } else {
                int dni = Integer.parseInt(dniText);
                Ciudadano paciente = ciuData.buscarCiudadano(dni);
                if (paciente != null) {
                    // Paciente encontrado, desactivamos el botón Guardar y activamos el botón Modificar
                    jbGuardar.setEnabled(false);
                    jbModificar.setEnabled(true);
                } else {
                    // No se encontró al paciente, activamos el botón Guardar y desactivamos el botón Modificar
                    jbGuardar.setEnabled(true);
                    jbModificar.setEnabled(false);
                }
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Ingrese un DNI válido");
        }
    }
}


