package MethodsFrames;

import source.Bag;
import source.Flight;

public class JFrameListCompanies extends javax.swing.JInternalFrame {

    public JFrameListCompanies() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblInsertCompanyName = new javax.swing.JLabel();
        lblFoundFlights = new javax.swing.JLabel();
        lblListFlights = new javax.swing.JLabel();
        txtCompanyName = new javax.swing.JTextField();
        btnSearchFlightsbyCompanyName = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblInsertCompanyName.setText("Ingrese el nombre de la compania:");

        lblFoundFlights.setText("Vuelos encontrados");

        lblListFlights.setText("Manejo de Aeropuertos");

        btnSearchFlightsbyCompanyName.setText("Buscar");
        btnSearchFlightsbyCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightsbyCompanyNameActionPerformed(evt);
            }
        });

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Origen", "Destino"
            }
        ));
        jScrollPane3.setViewportView(tblFlights);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoundFlights)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInsertCompanyName)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchFlightsbyCompanyName)
                            .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblListFlights)
                        .addGap(192, 192, 192))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListFlights)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInsertCompanyName)
                    .addComponent(txtCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchFlightsbyCompanyName)
                .addGap(18, 18, 18)
                .addComponent(lblFoundFlights)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFlightsbyCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightsbyCompanyNameActionPerformed
        var companyName = txtCompanyName.getText().trim();
        var bag = Bag.getInstance();
        // var found = bag.listFlightsByCompanyName(companyName);
        // txpFoundFlights.setText(found);
        
        var flights = bag.listFlightsByCompanyName(companyName);
        
            String[] headers = {"Origen", "Destino"};
            var model = new Object[flights.length][2];
            
            for(var i = 0; i < flights.length; i++) {
                model[i][0] = ((Flight) flights[i]).getFlightOrigin();
                model[i][1] = ((Flight) flights[i]).getFlightDestination();
            }
            
            tblFlights.setModel(new javax.swing.table.DefaultTableModel(model, headers));
        
//        if (company.isPresent()) {
//            var flights = company.get().getFlights().toArray();
//            
//            String[] headers = {"Origen", "Destino"};
//            var model = new Object[flights.length][2];
//            
//            for(var i = 0; i < flights.length; i++) {
//                model[i][0] = ((Flight) flights[0]).getFlightOrigin();
//                model[i][1] = ((Flight) flights[0]).getFlightDestination();
//            }
//            
//            tblFlights.setModel(new javax.swing.table.DefaultTableModel(model, headers));
//        } else {
//            JOptionPane.showMessageDialog(null, "La compania no fue encontrada", "Error", JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btnSearchFlightsbyCompanyNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchFlightsbyCompanyName;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFoundFlights;
    private javax.swing.JLabel lblInsertCompanyName;
    private javax.swing.JLabel lblListFlights;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTextField txtCompanyName;
    // End of variables declaration//GEN-END:variables
}
