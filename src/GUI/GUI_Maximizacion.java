/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Factory.Factory;
import Procesos.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author roban
 */
public class GUI_Maximizacion extends javax.swing.JFrame {

    private static Factory factory;
    public double Matriz[][];
    public int restricciones = 0, variables = 0, iter = 0, iteracion = 0;
    public Object array[] = null;
    public Object EtiquetaX[] = null, EtiquetaY[] = null;

    /**
     * Creates new form GUI_Maximizacion
     */
    public GUI_Maximizacion() {
        factory = new Factory();
        initComponents();
        this.jPanel_IngresoFuncion.setVisible(false);
        this.jPanel_Solucion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_SeleccionRestricciones = new javax.swing.JPanel();
        lbl_nRestricciones = new javax.swing.JLabel();
        lbl_nVariables = new javax.swing.JLabel();
        spnner_restricciones = new javax.swing.JSpinner();
        spnner_variables = new javax.swing.JSpinner();
        btn_aceptar = new javax.swing.JButton();
        lbl_problemaLineal = new javax.swing.JLabel();
        jPanel_IngresoFuncion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_funcionLimitaciones = new javax.swing.JTable();
        lbl_IngreseFuncion = new javax.swing.JLabel();
        btn_solucionar = new javax.swing.JButton();
        btn_iteraciones = new javax.swing.JButton();
        jPanel_Solucion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_solucion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nRestricciones.setText("N° de Restricciones");

        lbl_nVariables.setText("N° de Variables");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        lbl_problemaLineal.setText("Problema Lineal");

        javax.swing.GroupLayout jPanel_SeleccionRestriccionesLayout = new javax.swing.GroupLayout(jPanel_SeleccionRestricciones);
        jPanel_SeleccionRestricciones.setLayout(jPanel_SeleccionRestriccionesLayout);
        jPanel_SeleccionRestriccionesLayout.setHorizontalGroup(
            jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SeleccionRestriccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_problemaLineal)
                        .addGroup(jPanel_SeleccionRestriccionesLayout.createSequentialGroup()
                            .addComponent(lbl_nVariables)
                            .addGap(38, 38, 38)
                            .addComponent(spnner_variables, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_SeleccionRestriccionesLayout.createSequentialGroup()
                        .addComponent(lbl_nRestricciones)
                        .addGap(18, 18, 18)
                        .addComponent(spnner_restricciones)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_SeleccionRestriccionesLayout.setVerticalGroup(
            jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SeleccionRestriccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_problemaLineal)
                .addGroup(jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SeleccionRestriccionesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btn_aceptar))
                    .addGroup(jPanel_SeleccionRestriccionesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nVariables)
                            .addComponent(spnner_variables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_SeleccionRestriccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nRestricciones)
                            .addComponent(spnner_restricciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable_funcionLimitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_funcionLimitaciones);

        lbl_IngreseFuncion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_IngreseFuncion.setText("Ingrese la función objetivo, y sus limitaciones");

        btn_solucionar.setText("Solucionar");
        btn_solucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solucionarActionPerformed(evt);
            }
        });

        btn_iteraciones.setText("Iteraciones");
        btn_iteraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iteracionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_IngresoFuncionLayout = new javax.swing.GroupLayout(jPanel_IngresoFuncion);
        jPanel_IngresoFuncion.setLayout(jPanel_IngresoFuncionLayout);
        jPanel_IngresoFuncionLayout.setHorizontalGroup(
            jPanel_IngresoFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_IngresoFuncionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_IngresoFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                    .addGroup(jPanel_IngresoFuncionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel_IngresoFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_IngreseFuncion, javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IngresoFuncionLayout.createSequentialGroup()
                                .addComponent(btn_iteraciones)
                                .addGap(18, 18, 18)
                                .addComponent(btn_solucionar)))))
                .addContainerGap())
        );
        jPanel_IngresoFuncionLayout.setVerticalGroup(
            jPanel_IngresoFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_IngresoFuncionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_IngreseFuncion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_IngresoFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_solucionar)
                    .addComponent(btn_iteraciones))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTable_solucion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable_solucion);

        javax.swing.GroupLayout jPanel_SolucionLayout = new javax.swing.GroupLayout(jPanel_Solucion);
        jPanel_Solucion.setLayout(jPanel_SolucionLayout);
        jPanel_SolucionLayout.setHorizontalGroup(
            jPanel_SolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel_SolucionLayout.setVerticalGroup(
            jPanel_SolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Solucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_SeleccionRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_IngresoFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel_SeleccionRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_IngresoFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel_Solucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        try {
            this.jPanel_IngresoFuncion.setVisible(true);
            restricciones = (Integer) this.spnner_restricciones.getValue();
            variables = (Integer) this.spnner_variables.getValue();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setRowCount(restricciones + 1);
            modelo.setColumnCount(variables + restricciones + 2);
            array = new Object[variables + restricciones + 2];
            EtiquetaX = new Object[variables + restricciones];
            for (int i = 1; i < array.length - 1; i++) {
                if (i < variables + 1) {
                    array[i] = "X" + i;
                    EtiquetaX[i - 1] = "X" + i;
                } else {
                    array[i] = "S" + (i - variables);
                    EtiquetaX[i - 1] = "S" + (i - variables);
                }
            }
            //---------------------
            EtiquetaY = new Object[restricciones + 1];
            for (int i = 0; i < restricciones; i++) {
                modelo.setValueAt("S" + (i + 1), i, 0);
                EtiquetaY[i] = "S" + (i + 1);
            }
            modelo.setValueAt("Z", restricciones, 0);
            EtiquetaY[restricciones] = "Z";
            //----------------------
            array[array.length - 1] = "soluc";
            modelo.setColumnIdentifiers(array);
            this.jTable_funcionLimitaciones.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_solucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solucionarActionPerformed
        this.jPanel_Solucion.setVisible(true);
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    this.Matriz[i][j] = Double.parseDouble(this.jTable_funcionLimitaciones.getValueAt(i, j + 1).toString());
                }
            }
            while (this.ComprobarResultado() != true) {
                EtiquetaY[this.FilaPivote()] = EtiquetaX[this.ColumnaPivote()];
                this.NuevaTabla(this.FilaPivote(), this.ColumnaPivote());
                modeloSolucion.setColumnCount(restricciones + variables + 2);
                modeloSolucion.setRowCount(restricciones + 1);
                //--------------------------
                modeloSolucion.setColumnIdentifiers(array);
                //---------------------------
                for (int i = 0; i < (restricciones + 1); i++) {
                    modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                    for (int j = 0; j < (restricciones + variables + 1); j++) {
                        modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                    }
                }
                this.jTable_solucion.setModel(modeloSolucion);
                iteracion++;
            }
            this.btn_solucionar.setEnabled(false);
            this.btn_iteraciones.setEnabled(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_btn_solucionarActionPerformed

    private void btn_iteracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iteracionesActionPerformed
        try {
            DefaultTableModel modeloSolucion = new DefaultTableModel();
            Matriz = new double[restricciones + 1][restricciones + variables + 1];
            for (int i = 0; i < (restricciones + 1); i++) {
                for (int j = 0; j < (restricciones + variables + 1); j++) {
                    Matriz[i][j] = Double.parseDouble(this.jTable_funcionLimitaciones.getValueAt(i, j + 1).toString());
                }
            }
            int k = 0;
            iter++;
            if (iter <= iteracion) {
                //lbl_Iteraccion.setText(": " + iter);
                while (iter > k) {
                    EtiquetaY[this.FilaPivote()] = EtiquetaX[this.ColumnaPivote()];
                    this.NuevaTabla(this.FilaPivote(), this.ColumnaPivote());
                    modeloSolucion.setColumnCount(restricciones + variables + 2);
                    modeloSolucion.setRowCount(restricciones + 1);
                    //--------------------------
                    modeloSolucion.setColumnIdentifiers(array);
                    //---------------------------
                    for (int i = 0; i < (restricciones + 1); i++) {
                        modeloSolucion.setValueAt(EtiquetaY[i], i, 0);
                        for (int j = 0; j < (restricciones + variables + 1); j++) {
                            modeloSolucion.setValueAt(Matriz[i][j], i, j + 1);
                        }
                    }
                    this.jTable_solucion.setModel(modeloSolucion);
                    k++;
                }
            } else {
                iter = 0;
                iteracion = 0;
                //lbl_Iteraccion.setText("Final");
                this.btn_solucionar.setEnabled(true);
                this.btn_iteraciones.setEnabled(false);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }//GEN-LAST:event_btn_iteracionesActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Maximizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Maximizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Maximizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Maximizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Maximizacion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_iteraciones;
    private javax.swing.JButton btn_solucionar;
    private javax.swing.JPanel jPanel_IngresoFuncion;
    private javax.swing.JPanel jPanel_SeleccionRestricciones;
    private javax.swing.JPanel jPanel_Solucion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_funcionLimitaciones;
    private javax.swing.JTable jTable_solucion;
    private javax.swing.JLabel lbl_IngreseFuncion;
    private javax.swing.JLabel lbl_nRestricciones;
    private javax.swing.JLabel lbl_nVariables;
    private javax.swing.JLabel lbl_problemaLineal;
    private javax.swing.JSpinner spnner_restricciones;
    private javax.swing.JSpinner spnner_variables;
    // End of variables declaration//GEN-END:variables

    public int ColumnaPivote() {
        int pos = 0;
        double aux = Matriz[restricciones][0];
        for (int i = 1; i < restricciones + variables; i++) {
            if (aux > Matriz[restricciones][i]) {
                aux = Matriz[restricciones][i];
                pos = i;
            }
        }
        return pos;
    }

    public int FilaPivote() {
        int columna = this.ColumnaPivote();
        double temp = 0, razon = Matriz[0][variables + restricciones] / Matriz[0][columna];
        int pos = 0;
        for (int i = 1; i < restricciones; i++) {
            if (Matriz[i][columna] != 0) {
                temp = Matriz[i][variables + restricciones] / Matriz[i][columna];
                if (razon > temp && temp >= 0) {
                    razon = temp;
                    pos = i;
                }
            }

        }
        return pos;
    }

    public void NuevaTabla(int Fila, int Columna) {
        double pivote = Matriz[Fila][Columna], temp = 0;//--
        for (int i = 0; i < restricciones + variables + 1; i++) {
            Matriz[Fila][i] = Matriz[Fila][i] / pivote;
        }
        for (int i = 0; i < restricciones + 1; i++) {
            temp = Matriz[i][Columna];
            for (int j = 0; j < variables + restricciones + 1; j++) {
                if (i != Fila) {
                    Matriz[i][j] = Matriz[i][j] - temp * Matriz[Fila][j];
                } else {
                    break;
                }
            }
        }
    }

    public boolean ComprobarResultado() {
        boolean result = true;
        for (int i = 0; i < restricciones + variables; i++) {
            if (Matriz[restricciones][i] < 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}