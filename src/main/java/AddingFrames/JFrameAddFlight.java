package AddingFrames;
import javax.swing.DefaultComboBoxModel;
import source.Bag;
import source.Flight;

public class JFrameAddFlight extends javax.swing.JInternalFrame {

    public JFrameAddFlight() {
        initComponents();
        var bag = Bag.getInstance();
        var companies = bag.getCompany().values();
        
        var items = companies.stream().map(company -> company.toStringBag()).toArray();
        cmbCompanies.setModel(new DefaultComboBoxModel(items));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitleFlights = new javax.swing.JLabel();
        lblIdFlight = new javax.swing.JLabel();
        lblFlightOrigin = new javax.swing.JLabel();
        lblTravelPrice = new javax.swing.JLabel();
        lblReservedSeats = new javax.swing.JLabel();
        lblMaximumPassengers = new javax.swing.JLabel();
        lblFlightDetination = new javax.swing.JLabel();
        btnAddFlight = new javax.swing.JButton();
        txtTravelPrice = new javax.swing.JTextField();
        txtReservedSeats = new javax.swing.JTextField();
        txtMaximumPassengers = new javax.swing.JTextField();
        txtFlightOrigin = new javax.swing.JTextField();
        txtFlightDestination = new javax.swing.JTextField();
        txtIdFlight = new javax.swing.JTextField();
        lblCompanies = new javax.swing.JLabel();
        cmbCompanies = new javax.swing.JComboBox<>();
        lblCompanyOption = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblTitleFlights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleFlights.setText("Añadir un nuevo vuelo");

        lblIdFlight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdFlight.setText("Id del vuelo:");

        lblFlightOrigin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFlightOrigin.setText("Vuelo de origen:");

        lblTravelPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTravelPrice.setText("Costo del vuelo:");

        lblReservedSeats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReservedSeats.setText("Asientos reservados:");

        lblMaximumPassengers.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaximumPassengers.setText("Maximo de pasajeros:");

        lblFlightDetination.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFlightDetination.setText("Destino del vuelo:");
        lblFlightDetination.setMaximumSize(new java.awt.Dimension(64, 22));
        lblFlightDetination.setMinimumSize(new java.awt.Dimension(64, 22));
        lblFlightDetination.setPreferredSize(new java.awt.Dimension(64, 22));

        btnAddFlight.setText("Guardar");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        lblCompanies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanies.setText("Compañias");

        lblCompanyOption.setText("Escoja la compania a la que desea añadir el vuelo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFlightDetination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblReservedSeats)
                                    .addComponent(lblMaximumPassengers)
                                    .addComponent(lblTravelPrice)
                                    .addComponent(lblFlightOrigin))
                                .addGap(134, 134, 134)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTravelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtReservedSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaximumPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlightOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFlightDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(txtIdFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCompanyOption)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(lblTitleFlights))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(lblCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmbCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblFlightDetination, lblFlightOrigin, lblIdFlight, lblMaximumPassengers, lblReservedSeats, lblTravelPrice});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFlightDestination, txtFlightOrigin, txtIdFlight, txtMaximumPassengers, txtReservedSeats, txtTravelPrice});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCompanies, lblTitleFlights});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCompanies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCompanyOption)
                .addGap(11, 11, 11)
                .addComponent(cmbCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lblTitleFlights)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdFlight))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFlightOrigin))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFlightDetination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaximumPassengers)
                    .addComponent(txtMaximumPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReservedSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReservedSeats))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTravelPrice)
                    .addComponent(txtTravelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFlightDestination, txtFlightOrigin, txtIdFlight, txtMaximumPassengers, txtReservedSeats, txtTravelPrice});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblFlightDetination, lblFlightOrigin, lblIdFlight, lblMaximumPassengers, lblReservedSeats, lblTravelPrice});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        var idFlight = this.txtIdFlight.getText();
        var flightOrigin = this.txtFlightOrigin.getText();
        var flightDestination = this.txtFlightDestination.getText();
        int travelPrice = Integer.parseInt(this.txtTravelPrice.getText());
        var maximumPassengers = Integer.parseInt(this.txtMaximumPassengers.getText());
        var reservedSeats = Integer.parseInt(this.txtReservedSeats.getText());      
        Flight flight = new Flight(idFlight, flightOrigin, flightDestination, travelPrice, maximumPassengers, reservedSeats);
        
        var bag = Bag.getInstance();
        var selectedCompany = (String) cmbCompanies.getSelectedItem();
        
        var companyComponents = selectedCompany.split(":");
        var companyId = companyComponents[0];
        var company = bag.getCompany().get(companyId);
        company.addFlight(flight);
        
        bag.addFlight(flight);
        
        setDefaultCloseOperation(JFrameAddFlight.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddFlightActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbCompanies;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblCompanies;
    private javax.swing.JLabel lblCompanyOption;
    private javax.swing.JLabel lblFlightDetination;
    private javax.swing.JLabel lblFlightOrigin;
    private javax.swing.JLabel lblIdFlight;
    private javax.swing.JLabel lblMaximumPassengers;
    private javax.swing.JLabel lblReservedSeats;
    private javax.swing.JLabel lblTitleFlights;
    private javax.swing.JLabel lblTravelPrice;
    private javax.swing.JTextField txtFlightDestination;
    private javax.swing.JTextField txtFlightOrigin;
    private javax.swing.JTextField txtIdFlight;
    private javax.swing.JTextField txtMaximumPassengers;
    private javax.swing.JTextField txtReservedSeats;
    private javax.swing.JTextField txtTravelPrice;
    // End of variables declaration//GEN-END:variables
}
