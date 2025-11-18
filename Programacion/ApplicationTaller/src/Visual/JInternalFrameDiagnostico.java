/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Visual;

import Lista.Listado;
import java.awt.event.KeyEvent; // ✅ Import necesario
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Lista.Listavehiculo;
import java.util.ArrayList;

/**
 *
 * @author Jhon fonseca
 */
public class JInternalFrameDiagnostico extends javax.swing.JInternalFrame {

    private int buscarVehiculoPorPlaca(String placa) {
        for (int i = 0; i < ListadeVehiculo.size(); i++) {
            if (ListadeVehiculo.get(i).getPlacaV().equalsIgnoreCase(placa)) {
                return i;
            }
        }
        return -1; // No encontrado
    }

    ArrayList<Listavehiculo> ListadeVehiculo = new ArrayList<>();

    ArrayList<Listado> ListaDiagnostico = new ArrayList<>();

    public JInternalFrameDiagnostico() {
        initComponents();
    }

    private void LimpiarCampos() {
        this.jTextFieldDiagnostico.setText(""); // Metod set para asignar el valor vacio al campo de texto
        this.jTextFieldModelo.setText("");
        this.jTextFieldPlaca.setText("");
        this.jTextTipo.setText("");
        this.jTextFieldSituacion.setText("");
        this.jTextFieldDueño.setText("");
    }

    private void llenarTabla() {
        DefaultTableModel list = new DefaultTableModel();
        // Arreglo con nombre de columnas de la tabla
        String[] columnas = {"Dueño", "Tipo",
            "Placa", "Modelo", "Mecanico", "Diagnostico", "Situacion"};

        //Establece los nombres definidos de las columnas
        list.setColumnIdentifiers(columnas);
        //ciclo para recorrer la lista de productos
        for (Listado pro : ListaDiagnostico) {
            //Agrega cada elemento de la lista a un arreglo
            //Utiliza un objeto pro del tipo clase Producto para obtener 
            //datos del cada atribito, atraaves de metodo get
            String[] renglon = {pro.getDueño(),
                pro.getTipo(), pro.getPlaca(), pro.getModelo(),
                pro.getMecanico(), pro.getDiagnostico(), pro.getSituacion()};

            list.addRow(renglon);
        }
        //Agrega todos los elementos del arreglo renglona al tabla productos
        jTableDiagnostico.setModel(list);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonActulizar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextTipo = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        jComboBoxMecanico = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDueño = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldSituacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDiagnostico = new javax.swing.JTable();
        jTextFieldDiagnostico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonActulizar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonActulizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActulizar.setText("Actualizar");
        jButtonActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActulizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonActulizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 10));

        jLabel2.setText("Vehiculo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Obregon");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mecanica");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel5.setText("Garantia");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cerrar");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 50, 50));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setText("Reporte y");
        jButton3.setBorder(null);
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 50));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setText("   Registrar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 50));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Añadir");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 40));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setText("Crear cliente");
        jButton4.setBorder(null);
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 50));

        jButton6.setBackground(new java.awt.Color(0, 0, 153));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Dianostico");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 60, 50));

        jLabel11.setText("Proceso");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Mecanico:");

        jLabel7.setText("Modelo:");

        jLabel8.setText("Tipo:");

        jLabel9.setText("Placa:");

        jTextTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTipoKeyTyped(evt);
            }
        });

        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });
        jTextFieldModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldModeloKeyTyped(evt);
            }
        });

        jTextFieldPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPlacaKeyTyped(evt);
            }
        });

        jComboBoxMecanico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "jhon", "fonseca", "pineda" }));

        jLabel12.setText("Dueño:");

        jButtonBuscar.setBackground(new java.awt.Color(51, 153, 0));
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel13.setText("Situacion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldDueño, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscar))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldSituacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 230));

        jTableDiagnostico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableDiagnostico);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 410, 263));

        jTextFieldDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiagnosticoActionPerformed(evt);
            }
        });
        jTextFieldDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDiagnosticoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 180, 30));

        jLabel10.setText("Diagnostico");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(51, 153, 0));
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        LimpiarCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTipoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') // para validar
                && car != 'á'
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á'
                && car != 'É'
                && car != 'I'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'Ü'
                && car != 'ü'
                && car != 'Ñ'
                && car != 'ñ'
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTipoKeyTyped

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jTextFieldModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldModeloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloKeyTyped

    private void jTextFieldPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPlacaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlacaKeyTyped

    private void jTextFieldDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiagnosticoActionPerformed

    private void jTextFieldDiagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDiagnosticoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') // para validar
                && car != 'á'
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á'
                && car != 'É'
                && car != 'I'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'Ü'
                && car != 'ü'
                && car != 'Ñ'
                && car != 'ñ'
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiagnosticoKeyTyped

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
//validar campos
        if ((jTextFieldDiagnostico.getText().equals(""))
                || (jTextFieldDueño.getText().equals(""))
                || (jTextFieldModelo.getText().equals(""))
                || (jTextFieldPlaca.getText().equals(""))
                || (jTextFieldSituacion.getText().equals(""))
                || (jTextTipo.getText().equals(""))) {
            //Mostrar un mensaje de algunos campos estan vacios
            JOptionPane.showMessageDialog(null, "Algunos campos estan vacios",
                    "Revise tods los campos",
                    JOptionPane.WARNING_MESSAGE);
            // get para octener un valor
        }else{

            String DiagnosticoV = this.jTextFieldDiagnostico.getText();
            String ModeloV = this.jTextFieldModelo.getText();
            String PlacaV = this.jTextFieldPlaca.getText();
            String TipoV = this.jTextTipo.getText();
            String DueñoV = this.jTextFieldDueño.getText();
            String SituacionV = this.jTextFieldSituacion.getText();
            String MecanicoV = this.jComboBoxMecanico.getSelectedItem().toString();

            try {//Bloqueo llamado try (intentar) - catch (capturar) para capturar errores
                // Declarando un objeto de la clase Listado
                //Crea un objeto de clase Listado
                //llama al metodo constructor de clase LIsta
                Listado prod = new Listado(
                        DueñoV,
                        TipoV,
                        PlacaV,
                        ModeloV,
                        MecanicoV,
                        DiagnosticoV,
                        SituacionV
                );

                ListaDiagnostico.add(prod);

                this.LimpiarCampos();// llama al metodo limpiar campos

                llenarTabla();

                JOptionPane.showMessageDialog(null, "Datos agregados");

            } catch (Exception e) {//camptura el error
                JOptionPane.showMessageDialog(null, "Datos no agregados",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String placaBuscar = jTextFieldPlaca.getText().trim();

        if (placaBuscar.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese una placa",
                    "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Buscar en la lista
        int pos = buscarVehiculoPorPlaca(placaBuscar);

        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "Vehículo no encontrado",
                    "No existe", JOptionPane.WARNING_MESSAGE);
        } else {

            // Obtener el objeto encontrado
            Listavehiculo veh = ListadeVehiculo.get(pos);

            // Llenar los campos
            jTextFieldDueño.setText(veh.getNombreV());
            jTextTipo.setText(veh.getTipov());
            jTextFieldModelo.setText(veh.getModelov());

            JOptionPane.showMessageDialog(this, "Vehículo encontrado");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActulizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActulizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonActulizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxMecanico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDiagnostico;
    private javax.swing.JTextField jTextFieldDiagnostico;
    private javax.swing.JTextField jTextFieldDueño;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldSituacion;
    private javax.swing.JTextField jTextTipo;
    // End of variables declaration//GEN-END:variables

}
