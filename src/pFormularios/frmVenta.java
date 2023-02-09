/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.ArregloFacturas;
import pClases.Factura;

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
        asignaFecha();
        habilitaCajas(false);
        btnGrabarIngreso.setVisible(false);
        btnGrabarModificado.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tFacturas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnGrabarIngreso = new javax.swing.JButton();
        btnGrabarModificado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE VENTAS (FACTURACIÓN)");

        txtNF.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Factura"));

        txtFe.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Actual"));

        txtNV.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Vendedor"));

        txtMR.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto a Registrar"));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/add.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/search.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/edit.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);

        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/list.png"))); // NOI18N
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListado);

        btnGrabarIngreso.setText("Guardar Ingreso");
        btnGrabarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIngresoActionPerformed(evt);
            }
        });

        btnGrabarModificado.setText("Guardar Modificado");
        btnGrabarModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarModificadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabarIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnGrabarModificado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFe, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMR)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFe))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGrabarIngreso)
                            .addComponent(btnGrabarModificado))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNV)
                    .addComponent(txtMR))
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        // TODO add your handling code here:
         try{
            limpiarCajas();
            limpiaMatriz();
            int buscoFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de Facturas: "));
            Factura fact=f.buscar(buscoFactura);
            if(fact!=null){
                tFacturas.setValueAt(fact.getnFactura(),0,0);
                tFacturas.setValueAt(fact.getFecha(),0,1);
                tFacturas.setValueAt(fact.getVendedor(),0,2);
                tFacturas.setValueAt(fact.getMonto(),0,3);
            }else
                JOptionPane.showMessageDialog(null,"Factura NO encontrada","Confirmacion",JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error de Entrada de Datos","Confirmacion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        // TODO add your handling code here:
         try {
        limpiarCajas();
        limpiaMatriz();
        
        btnModificar.setVisible(false);
        btnGrabarModificado.setVisible(true);
        
        int buscoFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de Factura:"));
        
        Factura fact=f.buscar(buscoFactura);
        if(fact!=null){
            tFacturas.setValueAt(fact.getnFactura(), 0, 0);
            tFacturas.setValueAt(fact.getFecha(), 0, 1);
            tFacturas.setValueAt(fact.getVendedor(), 0, 2);
            tFacturas.setValueAt(fact.getMonto(), 0, 3);
        
            txtNF.setText(""+fact.getnFactura());
            txtFe.setText(fact.getFecha());
            txtNV.setText(fact.getVendedor());
            txtMR.setText(""+fact.getMonto());
        
            habilitaCajas(true);
            txtNF.setEditable(false);
            txtFe.setEditable(false);
        }else
           JOptionPane.showMessageDialog(null,"Factura NO encontrada","Confirmacion",JOptionPane.ERROR_MESSAGE);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Factura NO encontrada","Confirmacion",JOptionPane.ERROR_MESSAGE);
        btnModificar.setVisible(true);
        btnGrabarModificado.setVisible(false);
    }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
        try{
        int buscoFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de Factura a Eliminar:"));
        
        Factura fact=f.buscar(buscoFactura);
        if(fact!=null){
            f.eliminar(fact);
            JOptionPane.showMessageDialog(null,"Factura Eliminada Correctamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
            listar();
        }else
        JOptionPane.showMessageDialog(null,"NO existe el numero de factura ingresada","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"NO existe el numeor de factura ingresada","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListado1ActionPerformed
        // TODO add your handling code here:
         listar();
    }//GEN-LAST:event_btnListado1ActionPerformed

    private void btnGrabarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIngresoActionPerformed
        // TODO add your handling code here:
        try{
        habilitaCajas(false);
        btnRegistrar.setVisible(true);
        btnGrabarIngreso.setVisible(false);
        
        Factura fact=new Factura(getNumFact(),getFecha(),getVendedor(),getMonto());
        
        f.agregar(fact);
        listar();
        JOptionPane.showMessageDialog(null,"Factura ingresada correctamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Error de Ingreso de Datos","Error",JOptionPane.ERROR_MESSAGE);
        num--;
    }
    }//GEN-LAST:event_btnGrabarIngresoActionPerformed

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        try{
            limpiarCajas();
            limpiaMatriz();
            int buscoFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de Facturas: "));
            Factura fact=f.buscar(buscoFactura);
            if(fact!=null){
                tFacturas.setValueAt(fact.getnFactura(),0,0);
                tFacturas.setValueAt(fact.getFecha(),0,1);
                tFacturas.setValueAt(fact.getVendedor(),0,2);
                tFacturas.setValueAt(fact.getMonto(),0,3);
            }else
                JOptionPane.showMessageDialog(null,"Factura NO encontrada","Confirmacion",JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error de Entrada de Datos","Confirmacion",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
         try {
        limpiarCajas();
        limpiaMatriz();
        
        btnModificar.setVisible(false);
        btnGrabarModificado.setVisible(true);
        
        int buscoFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de Factura:"));
        
        Factura fact=f.buscar(buscoFactura);
        if(fact!=null){
            tFacturas.setValueAt(fact.getnFactura(), 0, 0);
            tFacturas.setValueAt(fact.getFecha(), 0, 1);
            tFacturas.setValueAt(fact.getVendedor(), 0, 2);
            tFacturas.setValueAt(fact.getMonto(), 0, 3);
        
            txtNF.setText(""+fact.getnFactura());
            txtFe.setText(fact.getFecha());
            txtNV.setText(fact.getVendedor());
            txtMR.setText(""+fact.getMonto());
        
            habilitaCajas(true);
            txtNF.setEditable(false);
            txtFe.setEditable(false);
        }else
           JOptionPane.showMessageDialog(null,"Factura NO encontrada","Confirmacion",JOptionPane.ERROR_MESSAGE);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Factura NO encontrada","Confirmacion",JOptionPane.ERROR_MESSAGE);
        btnModificar.setVisible(true);
        btnGrabarModificado.setVisible(false);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         try{
        int buscoFactura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de Factura a Eliminar:"));
        
        Factura fact=f.buscar(buscoFactura);
        if(fact!=null){
            f.eliminar(fact);
            JOptionPane.showMessageDialog(null,"Factura Eliminada Correctamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
            listar();
        }else
        JOptionPane.showMessageDialog(null,"NO existe el numero de factura ingresada","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"NO existe el numeor de factura ingresada","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        // TODO add your handling code here:
         listar();
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnGrabarModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarModificadoActionPerformed
        // TODO add your handling code here:
        try{
            Factura fact=f.buscar(getNumFact());
            fact.setVendedor(getVendedor());
            fact.setMonto(getMonto());
            JOptionPane.showMessageDialog(null,"Factura Modificada Correctamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
            listar();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al intengtrar grabar","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
        }
        btnGrabarModificado.setVisible(false);
        btnModificar.setVisible(true);
    }//GEN-LAST:event_btnGrabarModificadoActionPerformed

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
    public String getFecha(){
        return txtFe.getText();
    }
    
    public String getVendedor(){
        return txtNV.getText();
    }
    
    public double getMonto(){
        return Double.parseDouble(txtMR.getText());
    }
    
    void listar(){
        if(f.getTamaño()>0){
            for(int i=0; i<f.getTamaño(); i++){
                Factura fact = f.obtener(i);
                tFacturas.setValueAt(fact.getnFactura(), i, 0);
                tFacturas.setValueAt(fact.getFecha(), i, 1);
                tFacturas.setValueAt(fact.getVendedor(), i, 2);
                tFacturas.setValueAt(fact.getMonto(), i, 3);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay facturas registradas", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            limpiaMatriz();
        }
    }
    
    void asignaFecha(){
        GregorianCalendar cal = new GregorianCalendar();
        txtFe.setText(cal.get(cal.DAY_OF_MONTH)+"/"
        +cal.MONTH+"/"+cal.get(cal.YEAR));
    }
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
    private javax.swing.JButton btnGrabarIngreso;
    private javax.swing.JButton btnGrabarModificado;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFacturas;
    private javax.swing.JTextField txtFe;
    private javax.swing.JTextField txtMR;
    private javax.swing.JTextField txtNF;
    private javax.swing.JTextField txtNV;
    // End of variables declaration//GEN-END:variables
}
