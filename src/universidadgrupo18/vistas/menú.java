/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package universidadgrupo18.vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Candela
 */
public class menú extends javax.swing.JFrame {

    /**
     * Creates new form menú
     */
    public menú() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/recursos/fondoo.jpeg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        alumno = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        materia = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        notas = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        aluPorMat = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alumno.png"))); // NOI18N

        jMenuItem1.setText("Formulario Alumno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        alumno.add(jMenuItem1);

        jMenuBar1.add(alumno);

        materia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/materia.png"))); // NOI18N
        materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materiaActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Formulario Materia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        materia.add(jMenuItem2);

        jMenuBar1.add(materia);

        notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/administracion.png"))); // NOI18N
        notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Manejo de Inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        notas.add(jMenuItem3);

        jMenuItem4.setText("Manipulacion de notas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        notas.add(jMenuItem4);

        jMenuBar1.add(notas);

        aluPorMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/consultas.png"))); // NOI18N

        jMenuItem6.setText("Alumnos por Materia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        aluPorMat.add(jMenuItem6);

        jMenuBar1.add(aluPorMat);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/salida.png"))); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnoVista alumno = new FormularioAlumnoVista();
        alumno.setVisible(true);
        alumno.getContentPane().setBackground(Color.blue);
        escritorio.add(alumno);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materiaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria materia = new FormularioMateria();
        materia.setVisible(true);
        materia.getContentPane().setBackground(Color.blue);
        escritorio.add(materia);
    }//GEN-LAST:event_materiaActionPerformed

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioNotas notas = new FormularioNotas();
        notas.setVisible(true);
        notas.getContentPane().setBackground(Color.blue);
        escritorio.add(notas);
    }//GEN-LAST:event_notasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion inscripcion = new FormularioInscripcion();
        inscripcion.setVisible(true);
        inscripcion.getContentPane().setBackground(Color.blue);
        escritorio.add(inscripcion);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AlumnoPorMateriaVista alumnoPorMateria = new AlumnoPorMateriaVista();
        alumnoPorMateria.setVisible(true);
        alumnoPorMateria.getContentPane().setBackground(Color.blue);
        escritorio.add(alumnoPorMateria);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria materia = new FormularioMateria();
        materia.setVisible(true);
        materia.getContentPane().setBackground(Color.blue);
        escritorio.add(materia);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioNotas notas = new FormularioNotas();
        notas.setVisible(true);
        notas.getContentPane().setBackground(Color.blue);
        escritorio.add(notas);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menú().setVisible(true);
            }
        });
    }

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aluPorMat;
    private javax.swing.JMenu alumno;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu materia;
    private javax.swing.JMenu notas;
    // End of variables declaration//GEN-END:variables
}
