package AddingFrames;

import static MethodsFrames.MDIPrincipal.desktopPane;

public class JFrameAddAirport extends javax.swing.JInternalFrame {

    public JFrameAddAirport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAirports = new javax.swing.JLabel();
        lblAirportType = new javax.swing.JLabel();
        cmbAirportType = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblAirports.setText("Aeropuertos");

        lblAirportType.setText("Escoga el tipo de Aeropuerto que desea añadir:");

        cmbAirportType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aeropuerto Privado", "Aeropuerto Publico" }));
        cmbAirportType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAirportTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblAirportType)
                .addGap(18, 18, 18)
                .addComponent(cmbAirportType, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 214, Short.MAX_VALUE)
                .addComponent(lblAirports)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAirports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirportType)
                    .addComponent(cmbAirportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAirportTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAirportTypeActionPerformed
        String desition = (String) cmbAirportType.getSelectedItem();
        switch(desition) {
            case "Aeropuerto Publico" -> {
                JFramePublicAriport publicAirport = new JFramePublicAriport();
                desktopPane.add(publicAirport);
                publicAirport.toFront();
                publicAirport.show();
            }
            case "Aeropuerto Privado" -> {
                JFramePrivateAirport privateAirport = new JFramePrivateAirport();
                desktopPane.add(privateAirport);
                privateAirport.toFront();
                privateAirport.show();
            }
        }
    }//GEN-LAST:event_cmbAirportTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAirportType;
    private javax.swing.JLabel lblAirportType;
    private javax.swing.JLabel lblAirports;
    // End of variables declaration//GEN-END:variables
}
