
package universidadgrupo18.vistas;

import universidadgrupo18.accesoADatos.InscripcionData;
import universidadgrupo18.accesoADatos.MateriaData;
import universidadgrupo18.entidadess.Alumno;
import universidadgrupo18.entidadess.Inscripcion;
import universidadgrupo18.entidadess.Materia;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import universidadgrupo18.accesoADatos.AlumnoData;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;
    
    private InscripcionData insData;
    private MateriaData mData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    

    public FormularioInscripcion() {
        initComponents();
        
        aData = new AlumnoData();
        insData = new InscripcionData();
        listaA =aData.listarAlumnos();
        modelo = new DefaultTableModel();
        cargaAlumnos();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jCBalumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRBmatins = new javax.swing.JRadioButton();
        jRBnoins = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTlistains = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jBanular = new javax.swing.JButton();
        jBinscribir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setText("LISTADO DE MATERIA");

        jRBmatins.setText("Materia inscriptas");
        jRBmatins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmatinsActionPerformed(evt);
            }
        });

        jRBnoins.setText("Materia no inscriptas");
        jRBnoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBnoinsActionPerformed(evt);
            }
        });

        jTlistains.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTlistains);

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBanular.setText("Anular Inscripcion");
        jBanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularActionPerformed(evt);
            }
        });

        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });

        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jCBalumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBmatins, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBnoins, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBanular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBinscribir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jRBmatins)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBnoins)
                        .addGap(48, 48, 48))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jBinscribir)
                                .addGap(60, 60, 60)
                                .addComponent(jBanular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir)
                                .addGap(50, 50, 50)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(126, 126, 126))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jCBalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBmatins)
                    .addComponent(jRBnoins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBanular)
                    .addComponent(jBinscribir))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jRBmatinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmatinsActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jRBnoins.setSelected(false);
        cargaDatosInscriptas();
        jBanular.setEnabled(true);
        jBinscribir.setEnabled(false);
        
    }//GEN-LAST:event_jRBmatinsActionPerformed

    private void jRBnoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBnoinsActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        jRBmatins.setSelected(false);
        cargaDatosNoInscriptas();
        jBanular.setEnabled(false);
        jBinscribir.setEnabled(true);
    }//GEN-LAST:event_jRBnoinsActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTlistains.getSelectedRow();
        
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)jCBalumno.getSelectedItem();
            int idMateria = (Integer)modelo.getValueAt(filaSeleccionada,0);
            String nombreMateria = (String)modelo.getValueAt(filaSeleccionada,1);
            int anio = (Integer)modelo.getValueAt(filaSeleccionada,2);
            Materia m= new Materia(idMateria,nombreMateria,anio,true);
            Inscripcion i=new Inscripcion(a,m,0);
            insData.guardarInscripcion(i);
            borrarFilaTabla();
        }
        
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jTlistains.getSelectedRow();
        
        if(filaSeleccionada!=-1){
         Alumno a=(Alumno)jCBalumno.getSelectedItem();
         int idMateria = (Integer)modelo.getValueAt(filaSeleccionada,0);
         insData.borrarInscripcion(a.getIdAlumno(), idMateria);
         borrarFilaTabla();
        }
    }//GEN-LAST:event_jBanularActionPerformed

    
    private void cargaAlumnos(){
        for (Alumno aux : listaA) {
            jCBalumno.addItem(aux);
        }
    }
    
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTlistains.setModel(modelo);
    }
    
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptas(){
     Alumno selec = (Alumno)jCBalumno.getSelectedItem();
     listaM = (ArrayList)insData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAño()});
        }
    
    }
    
    private void cargaDatosInscriptas(){
    
    Alumno selec = (Alumno)jCBalumno.getSelectedItem();
    List <Materia> lista =(ArrayList) insData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAño()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBanular;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBalumno;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBmatins;
    private javax.swing.JRadioButton jRBnoins;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTlistains;
    // End of variables declaration//GEN-END:variables
}
