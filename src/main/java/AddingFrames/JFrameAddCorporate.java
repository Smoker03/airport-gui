package AddingFrames;

import javax.swing.DefaultComboBoxModel;
import source.Bag;
import source.Corporate;

public class JFrameAddCorporate extends javax.swing.JInternalFrame {

    public JFrameAddCorporate() {
        initComponents();
        
        var bag = Bag.getInstance();
        var privateAirports = bag.getPrivateAirport().values();
        
        var items = privateAirports.stream().map(PrivateAirport -> PrivateAirport.toStringBag()).toArray();
        cmbPrivateAirport.setModel(new DefaultComboBoxModel(items));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCorporate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorporateName = new javax.swing.JTextField();
        lblCorporateName = new javax.swing.JLabel();
        txtIdCorporate = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        lblCost1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnAddCorporate = new javax.swing.JButton();
        lblPrivateAirports = new javax.swing.JLabel();
        lblChoosePrivateAirport = new javax.swing.JLabel();
        cmbPrivateAirport = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblCorporate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorporate.setText("Añadir empresa");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Id de la empresa:");

        lblCorporateName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorporateName.setText("Nombre de la empresa:");

        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Direccion:");

        lblCost1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCost1.setText("Costo de la empresa:");

        btnAddCorporate.setText("Guardar");
        btnAddCorporate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCorporateActionPerformed(evt);
            }
        });

        lblPrivateAirports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrivateAirports.setText("Aeropuertos Privados");

        lblChoosePrivateAirport.setText("Seleccione el aeropuerto privado al que quiera añadir la empresa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCorporateName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorporateName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdCorporate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddCorporate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cmbPrivateAirport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblCorporate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrivateAirports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(187, 187, 187))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChoosePrivateAirport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtCorporateName, txtCost, txtIdCorporate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblPrivateAirports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(lblChoosePrivateAirport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cmbPrivateAirport)
                .addGap(19, 19, 19)
                .addComponent(lblCorporate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtIdCorporate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorporateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCorporateName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCost1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addComponent(btnAddCorporate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCorporateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCorporateActionPerformed
        var id = this.txtIdCorporate.getText();
        var name = this.txtCorporateName.getText();
        var cost = Double.parseDouble(this.txtCost.getText());
        var address = this.txtAddress.getText();
        var corporate = new Corporate(id, name, cost, address);
        
        var bag = Bag.getInstance();
        
        var selectedPrivateAirport = (String) cmbPrivateAirport.getSelectedItem();
        var privateAirportComponents = selectedPrivateAirport.split(":");
        var privateAirportID = privateAirportComponents[0];
        var privateAirport = bag.getPrivateAirport().get(privateAirportID);

        privateAirport.addCorporate(corporate);
        bag.addCorporate(corporate);
        setDefaultCloseOperation(JFrameAddCompany.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_btnAddCorporateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCorporate;
    private javax.swing.JComboBox<String> cmbPrivateAirport;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblChoosePrivateAirport;
    private javax.swing.JLabel lblCorporate;
    private javax.swing.JLabel lblCorporateName;
    private javax.swing.JLabel lblCost1;
    private javax.swing.JLabel lblPrivateAirports;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCorporateName;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtIdCorporate;
    // End of variables declaration//GEN-END:variables
}
