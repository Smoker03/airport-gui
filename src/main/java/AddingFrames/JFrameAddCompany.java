package AddingFrames;

import javax.swing.DefaultComboBoxModel;
import source.Bag;
import source.Company;

public class JFrameAddCompany extends javax.swing.JInternalFrame {

    public JFrameAddCompany() {
        initComponents();
        
        var bag = Bag.getInstance();
        var airports = bag.getAirport().values();
        
        var items = airports.stream().map(airport -> airport.toStringBag()).toArray();
        
        cmbAirports.setModel(new DefaultComboBoxModel(items));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompany = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        btnAddCompany = new javax.swing.JButton();
        lblIdCompany = new javax.swing.JLabel();
        txtIdCompany = new javax.swing.JTextField();
        lblbAirport = new javax.swing.JLabel();
        lblChooseAiroport = new javax.swing.JLabel();
        cmbAirports = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompany.setText("Añadir compania");

        jLabel1.setText("Nombre de la compania:");

        btnAddCompany.setText("Guardar");
        btnAddCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCompanyActionPerformed(evt);
            }
        });

        lblIdCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdCompany.setText("Id de la compania:");

        lblbAirport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbAirport.setText("Aeropuertos");

        lblChooseAiroport.setText("Escoja el aeropuerto que desea añadir el vuelo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblbAirport)
                            .addComponent(lblCompany)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblChooseAiroport))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(cmbAirports, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCompany, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCompany)
                            .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, lblIdCompany});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCompany, lblbAirport});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblbAirport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChooseAiroport)
                .addGap(22, 22, 22)
                .addComponent(cmbAirports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCompany)
                    .addComponent(txtIdCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAddCompany)
                .addGap(28, 28, 28))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCompany, lblbAirport});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCompanyActionPerformed
        var idCompany = this.txtIdCompany.getText();
        var companyName = this.txtCompanyName.getText();
        Company company = new Company(idCompany, companyName);       

        var bag = Bag.getInstance();
        var selectedAirport = (String) cmbAirports.getSelectedItem();
        var airportComponents = selectedAirport.split(":");
        var airportId = airportComponents[0];
        var airport = bag.getAirport().get(airportId);
        airport.addCompany(company);
        bag.addCompany(company);
        
        setDefaultCloseOperation(JFrameAddCompany.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_btnAddCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCompany;
    private javax.swing.JComboBox<String> cmbAirports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblChooseAiroport;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblIdCompany;
    private javax.swing.JLabel lblbAirport;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtIdCompany;
    // End of variables declaration//GEN-END:variables
}
