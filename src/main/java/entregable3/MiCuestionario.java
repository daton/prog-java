/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable3;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T101
 */
public class MiCuestionario extends javax.swing.JFrame {

    //DEclaramos un arrayList
    List<JRadioButton> radios;
    List<Opcion> opciones;

    public MiCuestionario() {
        initComponents();
        radios = new ArrayList<>();
        //LLenamos este list cpon los darios buttons
        radios.add(r1);
        radios.add(r2);
        radios.add(r3);
        radios.add(r4);
        //Iteramos estyos junto con la pregunta
        labelTitulo.setText(obtenerPregunta().getTitulo());
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setText(obtenerPregunta().getOpciones().get(i).getTitulo());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        checar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(r1);
        r1.setText("jRadioButton1");
        r1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(r2);
        r2.setText("jRadioButton2");
        r2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(r3);
        r3.setText("jRadioButton3");
        r3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        buttonGroup1.add(r4);
        r4.setText("jRadioButton4");
        r4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        checar.setText("Checar Respuesta");
        checar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r4)
                .addGap(18, 18, 18)
                .addComponent(checar)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarActionPerformed
        // TODO add your handling code here:

     if(checarAcierto())JOptionPane.showMessageDialog(this,"Muy bien!,correcto!");
     else JOptionPane.showMessageDialog(this,"Mal, reprobado!!", "REPROBADO!!", JOptionPane.ERROR_MESSAGE );
    }//GEN-LAST:event_checarActionPerformed

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
            java.util.logging.Logger.getLogger(MiCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiCuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    // End of variables declaration//GEN-END:variables

    public Pregunta obtenerPregunta() {
        //Generamos las opciones
        Opcion op1 = new Opcion();
        op1.setTitulo("Popocatepetl");
        op1.setCorrecta(false);

        Opcion op2 = new Opcion();
        op2.setTitulo("Pico de Orizaba");
        op2.setCorrecta(false);

        Opcion op3 = new Opcion();
        op3.setTitulo("Everest");
        op3.setCorrecta(true);

        Opcion op4 = new Opcion();
        op4.setTitulo("Aconcahua");
        op4.setCorrecta(false);
        //Las agregamos a un list
        opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        //Generamos la pregunta:
        Pregunta p1 = new Pregunta();
        p1.setTitulo("Cual es la montaña mas alta del mundo?");
        p1.setOpciones(opciones);
        return p1;
    }

    public boolean checarAcierto() {
        //Paso 1 obtener el indice seleccionado por el usuario
        //Del list que se llama radios y obtener el indice de la opcion 
        //correcta
        boolean esCorrecta = false;
        for (int i = 0; i < opciones.size(); i++) {
            if (opciones.get(i).isCorrecta() && radios.get(i).isSelected()) {
                System.out.println("ES correcta");
                esCorrecta = true;
                break; //Rompe el ciclo for si se cumple la condicion
            }

        }

        return esCorrecta;
    }

}
