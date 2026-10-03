// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez

package front_end;

import back_end.Pila;
import back_end.Nodo;
import back_end.comandoEdicion;
import javax.swing.JOptionPane;



public class GUIVentanaPila extends javax.swing.JFrame {
    
    private Pila pila = new Pila();  
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUIVentanaPila.class.getName());

  
    public GUIVentanaPila() {
        initComponents();
        
        actualizarVisualizacion();
    }
    
    private void actualizarVisualizacion(){
        if(pila.isEmpty()){
        areaVisualizacion.setText("La pila esta vacia");
        lblEstado.setText("Elementos: 0 --- Estado: Vacía");
        return;
        }
        
        StringBuilder sb = new StringBuilder();
        Nodo actual = pila.getTope();
        
        while(actual != null){
        sb.append(actual.getDato().toString()).append("\n");
        actual = actual.getSiguiente();
        }
        
        areaVisualizacion.setText(sb.toString());
        lblEstado.setText("Elementos: " + pila.size() + " | Estado: Con datos");
    
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaVisualizacion = new javax.swing.JTextArea();
        lblEstado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnPush = new javax.swing.JButton();
        btnSize = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPeek = new javax.swing.JButton();
        btnIsEmpty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaVisualizacion.setEditable(false);
        areaVisualizacion.setColumns(20);
        areaVisualizacion.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        areaVisualizacion.setRows(5);
        jScrollPane1.setViewportView(areaVisualizacion);

        lblEstado.setText("Elementos: 0 | Estado: Vacía");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(lblEstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Accion");

        jLabel2.setText("Texto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAccion)
                    .addComponent(txtTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        btnPush.setText("Apilar / Push");
        btnPush.addActionListener(this::btnPushActionPerformed);

        btnSize.setText("Ver Tamaño");
        btnSize.addActionListener(this::btnSizeActionPerformed);

        jButton1.setText("Desapilar / Pop");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        btnClear.setText("Vaciar Pila");
        btnClear.addActionListener(this::btnClearActionPerformed);

        btnPeek.setText("Consultar Tope");
        btnPeek.addActionListener(this::btnPeekActionPerformed);

        btnIsEmpty.setText("¿Esta Vacia?");
        btnIsEmpty.addActionListener(this::btnIsEmptyActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPush, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(200, 200, 200)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIsEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPush)
                    .addComponent(jButton1)
                    .addComponent(btnPeek))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSize)
                    .addComponent(btnClear)
                    .addComponent(btnIsEmpty))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
    String accion = txtAccion.getText().trim();
    String texto = txtTexto.getText().trim();

    if (accion.isEmpty() || texto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Llena los dos campos para apilar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    comandoEdicion nuevoComando = new comandoEdicion(accion, texto);
    pila.push(nuevoComando);

    txtAccion.setText("");
    txtTexto.setText("");
    txtAccion.requestFocus();

    actualizarVisualizacion();
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
    javax.swing.JOptionPane.showMessageDialog(this, 
        "La pila tiene " + pila.size() + " elemento(s) guardado(s).", "Tamaño de Pila", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSizeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    comandoEdicion extraido = pila.pop();

    if (extraido == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "La pila esta vacia, no se puede desapilar.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
        actualizarVisualizacion();
        javax.swing.JOptionPane.showMessageDialog(this, "Se desapiló el elemento correctamente:\n" + extraido.toString(), "Exito.", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeekActionPerformed
    comandoEdicion tope = pila.peek();

    if (tope == null) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "La pila está vacía. No hay un tope aun.", "Aviso", javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "El elemento en el tope es:\n" + tope.toString(), "Exito", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnPeekActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    if (pila.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "La pila ya se encuentra vacía.", "Error", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
        pila.clear();
        actualizarVisualizacion();
        javax.swing.JOptionPane.showMessageDialog(this, "Se ha vaciado la pila correctamente.", "Pila Vaciada", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnIsEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsEmptyActionPerformed
    if (pila.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Si, la pila esta vacia.", "Pila vacia.", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "No, la pila contiene " + pila.size() + " elemento(s).", 
            "Estado de Pila", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnIsEmptyActionPerformed

   
    public static void main(String args[]) {
       
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(() -> new GUIVentanaPila().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaVisualizacion;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnIsEmpty;
    private javax.swing.JButton btnPeek;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnSize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
