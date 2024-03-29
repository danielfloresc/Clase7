/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresYMatrices;

import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        cajaDeTexto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        salida = new javax.swing.JLabel();
        botonVector = new javax.swing.JButton();
        matriz = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaDeTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDeTextoActionPerformed(evt);
            }
        });
        jPanel1.add(cajaDeTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 60));

        list.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(list);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 210));

        salida.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jPanel1.add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 230, 390));

        botonVector.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botonVector.setText("Mi boton tipo vector");
        botonVector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVectorActionPerformed(evt);
            }
        });
        jPanel1.add(botonVector, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, -1));

        matriz.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        matriz.setText("Matriz");
        matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizActionPerformed(evt);
            }
        });
        jPanel1.add(matriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jButton1.setText("Recuperar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaDeTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDeTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDeTextoActionPerformed
    private int contadorNombres = 0;
    private void botonVectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVectorActionPerformed
        String nombreObtenido = cajaDeTexto.getText();
        String[] nombres = new String[50];
        nombres[contadorNombres] = nombreObtenido;
        contadorNombres++;
        String contenidoCompleto="";
        for(String nombresSeparados : nombres){
            if(nombresSeparados != null){
                contenidoCompleto =  salida.getText() + "<html><alig>" +  nombresSeparados + ", ";
                salida.setText(contenidoCompleto);
                list.removeAll();
            }
        }
    }//GEN-LAST:event_botonVectorActionPerformed
    private final DefaultListModel modelo = new DefaultListModel();
    private void matrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizActionPerformed
        String[][] matriz = new String[5][5];
        modelo.clear();
        list.setModel(modelo);
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                String mostrar = cajaDeTexto.getText()+"["+i+"]"+"["+j+"]";
                matriz[i][j] = mostrar;
                modelo.addElement(mostrar);
                //JOptionPane.showMessageDialog(null, mostrar);
            }
        }
    }//GEN-LAST:event_matrizActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int e = modelo.getSize();
         String restaurar = "";
         for(int i = 0; i<e; i++){
         Object a = "<html><alig>" + modelo.getElementAt(i) +", ";
             restaurar += a;
         }
         salida.setText(restaurar);
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
    private javax.swing.JButton botonVector;
    private javax.swing.JTextField cajaDeTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JButton matriz;
    private javax.swing.JLabel salida;
    // End of variables declaration//GEN-END:variables
}
