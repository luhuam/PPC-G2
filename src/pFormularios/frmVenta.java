/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import javax.swing.table.TableColumn;
import pClases.ArregloFacturas;

/**
 *
 * @author ASUS
 */
public class frmVenta extends javax.swing.JFrame {
    ArregloFacturas f = new ArregloFacturas();
    int num = 0;
    /**
     * Creates new form frmVenta
     */
    public frmVenta() {
        initComponents();
        DefinirAnchos();
        asignaFechas();
        habilitaCajas(false);
        btnRegistrar.setVisible(false);
        btnModificar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNF = new javax.swing.JTextField();
        txtFe = new javax.swing.JTextField();
        txtNV = new javax.swing.JTextField();
        txtMR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFacturas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE VENTAS (FACTURACIÓN)");

        txtNF.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Factura"));

        txtFe.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Actual"));

        txtNV.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Vendedor"));

        txtMR.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto a Registrar"));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        btnListado.setText("Listado");

        tFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° Factura", "Fecha de venta", "Vendedor", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tFacturas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFe, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnListado)
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMR)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNV)
                    .addComponent(txtMR))
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnConsultar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnListado))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        txtNF.setText(""+generaNumero());
        asignaFecha();
        txtNV.requestFocus();
	
       habilitaCajas(true);
       txtNV.setEditable(true);
       txtMR.setEditable(true);
       
        txtNV.setText("");
        txtMR.setText("");

        btnRegistrar.setVisible(false);
        btnGrabarIngreso.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    void DefinirAnchos(){
        TableColumn columna;
        columna = tFacturas.getColumnModel().getColumn(0);
        columna.setPreferredWidth(30);
        columna = tFacturas.getColumnModel().getColumn(1);
        columna.setPreferredWidth(50);
        columna = tFacturas.getColumnModel().getColumn(2);
        columna.setPreferredWidth(150);
        columna = tFacturas.getColumnModel().getColumn(3);
        columna.setPreferredWidth(70);
        tFacturas.getTableHeader().setReorderingAllowed(false);
        tFacturas.getTableHeader().setResizingAllowed(false);
    }
    
    void habilitaCajas(boolean opcion){
        txtNF.setEditable(opcion);
        txtNV.setEditable(opcion);
        txtMR.setEditable(opcion);
        txtFe.setEditable(opcion);
   }
    
    void limpiarCajas(){
        txtNF.setText("");
        txtNV.setText("");
        txtMR.setText("");
        txtFe.setText("");
    }
    
    void limpiaMatriz(){
        for(int i=0; i<10; i++){
            tFacturas.setValueAt("", i, 0);
            tFacturas.setValueAt("", i, 1);
            tFacturas.setValueAt("", i, 2);
            tFacturas.setValueAt("", i, 3);
        }
    }
    
    public int generaNumero()
    {
        num++;
        return num;
    }
    public int getNumFact(){
        return Integer.parseInt(txtNF.getText());
    }
    public 
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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFacturas;
    private javax.swing.JTextField txtFe;
    private javax.swing.JTextField txtMR;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtNV;
    // End of variables declaration//GEN-END:variables
}
