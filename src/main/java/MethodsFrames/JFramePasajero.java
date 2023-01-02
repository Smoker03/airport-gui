package MethodsFrames;

import javax.swing.DefaultComboBoxModel;
import source.Bag;
import source.Passenger;

public class JFramePasajero extends javax.swing.JInternalFrame {

    public JFramePasajero() {
        initComponents();
        var bag = Bag.getInstance();
        
        var flights = bag.getFlights().values();
        var items = flights.stream().map(flight -> flight.toStringBag()).toArray();
        
        cmbFlights.setModel(new DefaultComboBoxModel(items));   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitelPassenger = new javax.swing.JLabel();
        nameP = new javax.swing.JLabel();
        numberP = new javax.swing.JLabel();
        nationalityP = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPassportNumber = new javax.swing.JTextField();
        btnAddPassenger = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblVuelos = new javax.swing.JLabel();
        cmbFlights = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblTitelPassenger.setText("Registro de pasajero");

        nameP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameP.setText("Nombre:");

        numberP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        numberP.setText("Numero de pasaporte:");

        nationalityP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nationalityP.setText("Nacionalidad:");

        btnAddPassenger.setText("Guardar");
        btnAddPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPassengerActionPerformed(evt);
            }
        });

        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellido.setText("Apellido:");

        lblVuelos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVuelos.setText("Vuelos disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitelPassenger))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberP)
                    .addComponent(nationalityP)
                    .addComponent(nameP)
                    .addComponent(lblApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPassenger)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNationality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassportNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblApellido, nameP, nationalityP, numberP});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellido, txtName, txtNationality, txtPassportNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblVuelos)
                .addGap(18, 18, 18)
                .addComponent(cmbFlights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblTitelPassenger)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameP)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberP)
                    .addComponent(txtPassportNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityP)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnAddPassenger)
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtApellido, txtName, txtNationality, txtPassportNumber});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPassengerActionPerformed
        var firstName = txtName.getText();
        var lastName = txtApellido.getText();
        var passportNumber = txtPassportNumber.getText();
        var nationality = txtNationality.getText();
        var passenger = new Passenger(firstName, lastName, passportNumber, nationality);
        
        var selectedFlight = (String) cmbFlights.getSelectedItem();
        
        var flightComponents = selectedFlight.split(":");
        var flightId = flightComponents[0];
        
        var bag = Bag.getInstance();
        var flight = bag.getFlights().get(flightId);
        
        flight.addPassenger(passenger);
        
        bag.addFlight(flight);
        
        setDefaultCloseOperation(JFramePasajero.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnAddPassengerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPassenger;
    public static javax.swing.JComboBox<String> cmbFlights;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblTitelPassenger;
    private javax.swing.JLabel lblVuelos;
    private javax.swing.JLabel nameP;
    private javax.swing.JLabel nationalityP;
    private javax.swing.JLabel numberP;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtNationality;
    public static javax.swing.JTextField txtPassportNumber;
    // End of variables declaration//GEN-END:variables
}
