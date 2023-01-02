package MethodsFrames;

import javax.swing.JOptionPane;
import source.Bag;
import source.Flight;

public class JFrameShowFlightById extends javax.swing.JInternalFrame {

    public JFrameShowFlightById() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFlights = new javax.swing.JLabel();
        lblIdFlight = new javax.swing.JLabel();
        txtIdFLight = new javax.swing.JTextField();
        lblFLightFound = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblFlights.setText("Vuelos");

        lblIdFlight.setText("Ingrese el Id del vuelo:");

        lblFLightFound.setText("Vuelos encontrados:");

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id", "Origen", "Destino"
            }
        ));
        jScrollPane1.setViewportView(tblFlights);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFLightFound)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIdFlight)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFlights)
                                    .addComponent(btnSearch)
                                    .addComponent(txtIdFLight)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFlights)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdFlight)
                    .addComponent(txtIdFLight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addGap(7, 7, 7)
                .addComponent(lblFLightFound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        var flightId = txtIdFLight.getText();
        var bag = Bag.getInstance();
        
        var flight = bag.getFlightById(flightId);
        
        if (flight.isPresent()) {
            var flightsModel = flight.stream().toArray();
            
            String[] headers = {"Id", "Origen", "Destino"};
            var model = new Object[flightsModel.length][3];
            
            for(var i = 0; i < flightsModel.length; i++) {
                model[i][0] = ((Flight) flightsModel[0]).getIdFlights();
                model[i][1] = ((Flight) flightsModel[0]).getFlightOrigin();
                model[i][2] = ((Flight) flightsModel[0]).getFlightDestination();
            }
            
            tblFlights.setModel(new javax.swing.table.DefaultTableModel(model, headers));
        } else {
            JOptionPane.showMessageDialog(null, "La compania no fue encontrada", "Error", JOptionPane.WARNING_MESSAGE); 
        }    
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFLightFound;
    private javax.swing.JLabel lblFlights;
    private javax.swing.JLabel lblIdFlight;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTextField txtIdFLight;
    // End of variables declaration//GEN-END:variables
}
