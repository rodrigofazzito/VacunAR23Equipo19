package Vistas;

import Acceso_A_Datos.LaboratorioData;
import Acceso_A_Datos.VacunaData;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Vacunas extends javax.swing.JInternalFrame {

 private DefaultTableModel modelo=new DefaultTableModel();
    public Vacunas() {
        initComponents();
        armarCabecera();
        cargarComboBox();
        comboBoxMedidas();
        ((JTextFieldDateEditor)(jdcFechaVencimiento.getDateEditor())).setEditable(false); // Deshabilitar edición de fecha , solo deja que el usuario seleccione en el calendario
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaVacuna = new javax.swing.JTable();
        jbGuardarVacuna = new javax.swing.JButton();
        jBannerVacuna = new javax.swing.JLabel();
        jMedida = new javax.swing.JLabel();
        jVencimiento = new javax.swing.JLabel();
        jNSerie = new javax.swing.JLabel();
        jLaboratorio = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jtNroSerie = new javax.swing.JTextField();
        jdcFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jX = new javax.swing.JLabel();
        jFondoVacunar = new javax.swing.JLabel();
        jBanerLogoVacunar = new javax.swing.JLabel();
        jcMedida = new javax.swing.JComboBox<>();
        jMarca = new javax.swing.JLabel();
        jcbListaLaboratorio = new javax.swing.JComboBox<>();

        setAlignmentX(200.0F);
        setAlignmentY(40.0F);
        setPreferredSize(new java.awt.Dimension(880, 590));

        jPBackground.setBackground(new java.awt.Color(255, 255, 255));
        jPBackground.setForeground(new java.awt.Color(180, 0, 0));
        jPBackground.setAlignmentX(200.0F);
        jPBackground.setAlignmentY(40.0F);
        jPBackground.setPreferredSize(new java.awt.Dimension(880, 590));
        jPBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtablaVacuna.setBackground(new java.awt.Color(255, 255, 255));
        jtablaVacuna.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true));
        jtablaVacuna.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtablaVacuna.setForeground(new java.awt.Color(0, 0, 0));
        jtablaVacuna.setModel(new javax.swing.table.DefaultTableModel(
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
        jtablaVacuna.setGridColor(new java.awt.Color(180, 0, 0));
        jtablaVacuna.setSelectionBackground(new java.awt.Color(180, 0, 0));
        jtablaVacuna.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtablaVacuna);

        jPBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 850, 80));

        jbGuardarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/disco-flexible-50.png"))); // NOI18N
        jbGuardarVacuna.setToolTipText("GUARDAR");
        jbGuardarVacuna.setOpaque(false);
        jbGuardarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarVacunaActionPerformed(evt);
            }
        });
        jPBackground.add(jbGuardarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 60, 60));

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

        jLaboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLaboratorio.setForeground(new java.awt.Color(180, 0, 0));
        jLaboratorio.setText("Laboratorio:");
        jPBackground.add(jLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 40));

        jtMarca.setBackground(java.awt.Color.white);
        jtMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtMarca.setForeground(new java.awt.Color(0, 0, 0));
        jtMarca.setDisabledTextColor(new java.awt.Color(180, 0, 0));
        jtMarca.setOpaque(false);
        jtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMarcaKeyTyped(evt);
            }
        });
        jPBackground.add(jtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, 40));

        jtNroSerie.setBackground(java.awt.Color.white);
        jtNroSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtNroSerie.setForeground(new java.awt.Color(0, 0, 0));
        jtNroSerie.setOpaque(false);
        jtNroSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNroSerieKeyTyped(evt);
            }
        });
        jPBackground.add(jtNroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 240, 40));

        jdcFechaVencimiento.setBackground(java.awt.Color.white);
        jdcFechaVencimiento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true));
        jdcFechaVencimiento.setForeground(new java.awt.Color(0, 0, 0));
        jdcFechaVencimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jdcFechaVencimiento.setOpaque(false);
        jPBackground.add(jdcFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 170, 30));

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

        jcMedida.setBackground(java.awt.Color.white);
        jcMedida.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jcMedida.setForeground(new java.awt.Color(0, 0, 0));
        jcMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.3", "0.5", "0.9" }));
        jcMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(180, 0, 0), 1, true), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(180, 0, 0))); // NOI18N
        jcMedida.setOpaque(false);
        jPBackground.add(jcMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 80, 40));

        jMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMarca.setForeground(new java.awt.Color(180, 0, 0));
        jMarca.setText("Marca:");
        jPBackground.add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 30));

        jPBackground.add(jcbListaLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 230, 40));

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

    private void jbGuardarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarVacunaActionPerformed
       try {
    Vacuna vacu = new Vacuna();
    String num = jtNroSerie.getText().trim();// Eliminar espacios en blanco

    if (jtMarca.getText().isEmpty() || num.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se deben dejar campos vacíos");
    
    } else if (num.length() != 11 || !num.matches("\\d{11}")) {// El método matches verifica si una cadena completa coincide con una expresión regular. 
                    ///////////////////////////////////////////dentro de ella ingreso el string "\\d{11}" que verifica que la cadena contenga 11 dígitos numéricos.
        JOptionPane.showMessageDialog(null, "Ingrese un número de serie válido (debe tener 11 caracteres numéricos)");
    
    } else {
        VacunaData v = new VacunaData();
        // usamos el metodo existenumero de serie 
        if (v.existeNumeroSerie(Long.parseLong(num))) {
            JOptionPane.showMessageDialog(null, "El número de serie ya existe en la base de datos");
        
        } else {
            if (jdcFechaVencimiento.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha válida o seleccióne una fecha            en el calendario");
            } else {
                vacu.setMarca(jtMarca.getText());
                String medidaSeleccionada = (String) jcMedida.getSelectedItem();
                double medida = Double.parseDouble(medidaSeleccionada);
                vacu.setMedida(medida);
                java.util.Date fecha = jdcFechaVencimiento.getDate();
                LocalDate Fech = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                vacu.setFechaCaduca(Fech);
                vacu.setColocada(false);
                vacu.setNumSerie(Long.parseLong(num));
                Laboratorio laboratorioSeleccionado = (Laboratorio) jcbListaLaboratorio.getSelectedItem();
                vacu.setLaboratorio(laboratorioSeleccionado);
                v.GuardarVacuna(vacu);
                Limpiar();
                JOptionPane.showMessageDialog(null, "Vacuna cargada con éxito!");
                // Agregar la nueva vacuna al modelo de la tabla
                DefaultTableModel modelo = (DefaultTableModel) jtablaVacuna.getModel();
                modelo.addRow(new Object[]{vacu.getNumSerie(), vacu.getMarca(), vacu.getMedida(), vacu.getFechaCaduca()});
            }
        }
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Error al entrar en vacuna: " + e.getMessage());
}

    }//GEN-LAST:event_jbGuardarVacunaActionPerformed

    private void jtNroSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNroSerieKeyTyped
        char c = evt.getKeyChar();
   if (!Character.isDigit(c) ) {
    evt.consume();}
    }//GEN-LAST:event_jtNroSerieKeyTyped

    private void jtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyTyped
        char c = evt.getKeyChar();
   if (Character.isDigit(c) ) {
    evt.consume();}
    }//GEN-LAST:event_jtMarcaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBanerLogoVacunar;
    private javax.swing.JLabel jBannerVacuna;
    private javax.swing.JLabel jFondoVacunar;
    private javax.swing.JLabel jLaboratorio;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jMedida;
    private javax.swing.JLabel jNSerie;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jVencimiento;
    private javax.swing.JLabel jX;
    private javax.swing.JButton jbGuardarVacuna;
    private javax.swing.JComboBox<String> jcMedida;
    private javax.swing.JComboBox<Laboratorio> jcbListaLaboratorio;
    private com.toedter.calendar.JDateChooser jdcFechaVencimiento;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtNroSerie;
    private javax.swing.JTable jtablaVacuna;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("NroDeSerie");
        modelo.addColumn("Marca");
        modelo.addColumn("Medida");
        modelo.addColumn("fechadeVencimiento");
        jtablaVacuna.setModel(modelo);
        jtablaVacuna.setDefaultEditor(Object.class, null);
    }
    private void cargarComboBox() {
    LaboratorioData labData=new LaboratorioData();
   
    List<Laboratorio>laboratorios=labData.listaLaboratorio();
    DefaultComboBoxModel<Laboratorio> comboBoxModel = new DefaultComboBoxModel<>();
      
        for (Laboratorio lab : laboratorios) {
            comboBoxModel.addElement(lab);
        }
        jcbListaLaboratorio.setModel(comboBoxModel);
}
   private void Limpiar(){
          jtMarca.setText("");
           jcMedida.setSelectedIndex(0);
           jtNroSerie.setText("");
           jcbListaLaboratorio.setSelectedIndex(0);
            jdcFechaVencimiento.setDate(null);
          
   }
private void comboBoxMedidas() {
    String[] medidas = {"0.3", "0.5", "0.9"};
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

    for (String medida : medidas) {
        comboBoxModel.addElement(medida);
    }

    jcMedida.setModel(comboBoxModel);
}

}

