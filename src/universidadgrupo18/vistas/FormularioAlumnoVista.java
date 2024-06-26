
package universidadgrupo18.vistas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadgrupo18.accesoADatos.AlumnoData;
import universidadgrupo18.entidadess.Alumno;


public class FormularioAlumnoVista extends javax.swing.JInternalFrame {
    
    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;
    
    
    public FormularioAlumnoVista() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jBExit = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        jRBstate = new javax.swing.JRadioButton();
        jBNew = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFdni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBSearch = new javax.swing.JButton();
        jDCfecha = new com.toedter.calendar.JDateChooser();

        jTextField2.setText("jTextField2");

        setResizable(true);

        jBExit.setText("Salir");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        jBSave.setText("Guardar");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        jBDelete.setText("Eliminar");
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });

        jRBstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBstateActionPerformed(evt);
            }
        });

        jBNew.setText("Nuevo");
        jBNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("Estado:");

        jLabel4.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel2.setText("Documento:");

        jLabel1.setText("ALUMNO");

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        jBSearch.setIconTextGap(1);
        jBSearch.setMaximumSize(new java.awt.Dimension(80, 65));
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jBExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBstate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBNew, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFap, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFdni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDCfecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jBNew)
                .addGap(34, 34, 34)
                .addComponent(jBDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jBSave)
                .addGap(29, 29, 29)
                .addComponent(jBExit)
                .addGap(52, 52, 52))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)))
                .addGap(90, 90, 90)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTFname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRBstate)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDCfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTFap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBstate)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExit)
                    .addComponent(jBSave)
                    .addComponent(jBNew)
                    .addComponent(jBDelete))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
        try {
        
            Integer dni = Integer.parseInt(jTFdni.getText());
            alumnoActual = aluData.buscarAlumnoPorDni(dni);
            if (alumnoActual != null) {
                jTFname.setText(alumnoActual.getNombre());
                jTFap.setText(alumnoActual.getApellido());
                jRBstate.setSelected(alumnoActual.isEstado());
                LocalDate ld = alumnoActual.getFechaNacimiento();
                java.util.Date date = java.util.Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jDCfecha.setDate(date);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe Ingresar Un Alumno Valido!");
            
            
        }
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        alumnoActual = null;
        
    }//GEN-LAST:event_jBNewActionPerformed

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
        // TODO add your handling code here:
        if(alumnoActual!=null){
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual=null;
            limpiarCampos();
        }else{
        JOptionPane.showMessageDialog(this,"no hay alumno seleccionado");
        }
    }//GEN-LAST:event_jBDeleteActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        // TODO add your handling code here:
        try {
            Integer dni = Integer.parseInt(jTFdni.getText());
            String apellido = jTFap.getText();
            String nombre = jTFname.getText();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Puede Haber Campos Vacios!");
                return;
            } 
            java.util.Date sfecha = jDCfecha.getDate();
            LocalDate fechanac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jRBstate.isSelected();
            if (alumnoActual == null) {
                alumnoActual = new Alumno(dni, apellido, nombre , fechanac, estado);
                aluData.guardarAlumno(alumnoActual);
                limpiarCampos();
            } else {
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNacimiento(fechanac);
                alumnoActual.setEstado(estado);
                aluData.modificarAlumno(alumnoActual);
                limpiarCampos();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar Un DNI Valido!");
        }
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBExitActionPerformed

    private void jRBstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBstateActionPerformed
        // TODO add your handling code here:
        if(alumnoActual.isEstado() != true){
            alumnoActual.setEstado(true);
        }
        else{
            alumnoActual.setEstado(false);
        }
        
    }//GEN-LAST:event_jRBstateActionPerformed

    private void limpiarCampos(){
        jTFdni.setText("");
        jTFname.setText("");
        jTFap.setText("");
        jRBstate.setSelected(false);
        jDCfecha.setDate(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBNew;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jBSearch;
    private com.toedter.calendar.JDateChooser jDCfecha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRBstate;
    private javax.swing.JTextField jTFap;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFname;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
