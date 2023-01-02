package AddingFrames;

import source.Bag;
import source.PrivateAirport;

public class JFramePrivateAirport extends javax.swing.JInternalFrame {

    public JFramePrivateAirport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrivateAirport = new javax.swing.JLabel();
        btnAddPrivateAirport = new javax.swing.JButton();
        lblIdAirport = new javax.swing.JLabel();
        lblCityLocated = new javax.swing.JLabel();
        txtIdAiroport = new javax.swing.JTextField();
        lblAirportName = new javax.swing.JLabel();
        txtAirportName = new javax.swing.JTextField();
        lblCountryLocated = new javax.swing.JLabel();
        txtCityLocated = new javax.swing.JTextField();
        txtCountryLocated = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblPrivateAirport.setText("Aeropuerto Privado");

        btnAddPrivateAirport.setText("Guardar");
        btnAddPrivateAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPrivateAirportActionPerformed(evt);
            }
        });

        lblIdAirport.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdAirport.setText("Id del Aeropuerto:");

        lblCityLocated.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityLocated.setText("Ciudad Ubicada:");

        lblAirportName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAirportName.setText("Nombre del Aeropuerto:");

        lblCountryLocated.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCountryLocated.setText("Pais Ubicada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrivateAirport)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCityLocated)
                    .addComponent(lblAirportName)
                    .addComponent(lblCountryLocated)
                    .addComponent(lblIdAirport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPrivateAirport)
                    .addComponent(txtAirportName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCityLocated, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCountryLocated, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAiroport, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAirportName, lblCityLocated, lblCountryLocated, lblIdAirport});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPrivateAirport)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIdAirport)
                        .addGap(31, 31, 31)
                        .addComponent(lblAirportName)
                        .addGap(31, 31, 31)
                        .addComponent(lblCityLocated)
                        .addGap(31, 31, 31)
                        .addComponent(lblCountryLocated))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdAiroport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtAirportName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtCityLocated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtCountryLocated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(btnAddPrivateAirport)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPrivateAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPrivateAirportActionPerformed
        var idAirport = this.txtIdAiroport.getText();
        var nameAirport = this.txtAirportName.getText();
        var cityLocated = this.txtCityLocated.getText();
        var countryLocated = this.txtCountryLocated.getText();
        PrivateAirport privateAirport = new PrivateAirport(idAirport, nameAirport, cityLocated, countryLocated);
        
        var bag = Bag.getInstance();
        bag.addAirport(privateAirport);
        
        setDefaultCloseOperation(JFramePrivateAirport.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddPrivateAirportActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPrivateAirport;
    private javax.swing.JLabel lblAirportName;
    private javax.swing.JLabel lblCityLocated;
    private javax.swing.JLabel lblCountryLocated;
    private javax.swing.JLabel lblIdAirport;
    private javax.swing.JLabel lblPrivateAirport;
    private javax.swing.JTextField txtAirportName;
    private javax.swing.JTextField txtCityLocated;
    private javax.swing.JTextField txtCountryLocated;
    private javax.swing.JTextField txtIdAiroport;
    // End of variables declaration//GEN-END:variables
}
