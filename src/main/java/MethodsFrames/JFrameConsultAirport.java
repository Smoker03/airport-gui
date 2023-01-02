package MethodsFrames;

import source.Airport;
import source.Bag;

public class JFrameConsultAirport extends javax.swing.JInternalFrame {

    public JFrameConsultAirport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblAirportManager = new javax.swing.JLabel();
        lblConsultAirport = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblFound = new javax.swing.JLabel();
        cmbConsultAirport = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAirports = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblAirportManager.setText("Manejo de Aeropuertos");

        lblConsultAirport.setText("Escoja el tipo de aeropuerto (Privado o Publico):");

        lblFound.setText("Los aeropuertos encontrados son:");

        cmbConsultAirport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Privado", "Publico" }));
        cmbConsultAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultAirportActionPerformed(evt);
            }
        });

        tblAirports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nombre", "Ciudad Localizada", "Pais Localizado"
            }
        ));
        jScrollPane3.setViewportView(tblAirports);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFound)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConsultAirport)
                                    .addComponent(jLabel1))
                                .addGap(39, 39, 39)
                                .addComponent(cmbConsultAirport, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 60, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAirportManager)
                        .addGap(209, 209, 209))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblAirportManager)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultAirport)
                    .addComponent(cmbConsultAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFound)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbConsultAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultAirportActionPerformed
        lblFound.setText("Los aeropuertos " + (String) cmbConsultAirport.getSelectedItem().toString().concat("s").toLowerCase() + " son:");
        
        var airportType = (String) cmbConsultAirport.getSelectedItem();
        var bag = Bag.getInstance();
        
        var airport = bag.consultAirport(airportType);
        
        String[] headers = {"Nombre", "Ciudad localizada", "Pais localizado"};
        var model = new Object[airport.length][3];
        for(var i = 0; i < airport.length; i++) {
                model[i][0] = ((Airport) airport[i]).getName();
                model[i][1] = ((Airport) airport[i]).getCityLocated();
                model[i][2] = ((Airport) airport[i]).getCountryLocated();
            }
        tblAirports.setModel(new javax.swing.table.DefaultTableModel(model, headers));
    }//GEN-LAST:event_cmbConsultAirportActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbConsultAirport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAirportManager;
    private javax.swing.JLabel lblConsultAirport;
    private javax.swing.JLabel lblFound;
    private javax.swing.JTable tblAirports;
    // End of variables declaration//GEN-END:variables
}
