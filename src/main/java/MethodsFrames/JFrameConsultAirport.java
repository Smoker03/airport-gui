/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package MethodsFrames;
import source.Bag;

/**
 *
 * @author joses
 */
public class JFrameConsultAirport extends javax.swing.JInternalFrame {

    /**
     * Creates new form JFrameConsultAirport
     */
    public JFrameConsultAirport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblAirportManager = new javax.swing.JLabel();
        lblConsultAirport = new javax.swing.JLabel();
        txtConsultAirport = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblFound = new javax.swing.JLabel();
        btnSearchAirport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txpFoundAirports = new javax.swing.JTextPane();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblAirportManager.setText("Manejo de Aeropuertos");

        lblConsultAirport.setText("Ingrese el tipo de aeropuerto (Privado o Publico):");

        lblFound.setText("Los aeropuertos " + txtConsultAirport.getText() + "son:");

        btnSearchAirport.setText("Buscar");
        btnSearchAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirportActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txpFoundAirports);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAirportManager)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConsultAirport)
                                    .addComponent(jLabel1))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearchAirport)
                                    .addComponent(txtConsultAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblFound)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(btnSearchAirport))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAirportManager)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConsultAirport)
                            .addComponent(txtConsultAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblConsultAirport, txtConsultAirport});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirportActionPerformed
        var type = txtConsultAirport.getText().trim();
        var bag = Bag.getInstance();
        var found = bag.consultAirport(type);
        txpFoundAirports.setText(found);        
    }//GEN-LAST:event_btnSearchAirportActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchAirport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAirportManager;
    private javax.swing.JLabel lblConsultAirport;
    private javax.swing.JLabel lblFound;
    private javax.swing.JTextPane txpFoundAirports;
    private javax.swing.JTextField txtConsultAirport;
    // End of variables declaration//GEN-END:variables
}
