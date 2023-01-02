package MethodsFrames;

import source.Bag;
import source.Corporate;

public class JFrameShowCorporates extends javax.swing.JInternalFrame {

    public JFrameShowCorporates() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCorporates = new javax.swing.JLabel();
        lblShowCorporates = new javax.swing.JLabel();
        btnShowCorporates = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCorporates = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblCorporates.setText("Empresas");

        lblShowCorporates.setText("Mostrar todas las empresas:");

        btnShowCorporates.setText("Mostrar");
        btnShowCorporates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCorporatesActionPerformed(evt);
            }
        });

        tblCorporates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nombre", "Direccion"
            }
        ));
        jScrollPane2.setViewportView(tblCorporates);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblShowCorporates)
                        .addGap(66, 66, 66)
                        .addComponent(btnShowCorporates))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblCorporates, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCorporates)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblShowCorporates)
                    .addComponent(btnShowCorporates))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowCorporatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCorporatesActionPerformed
        var bag = Bag.getInstance();
       
        var corporates = bag.showCorporates();
            String headers[] = {"Nombre", "Direccion"};
            var model = new Object[corporates.length][2];
        
            for (var i = 0; i < corporates.length; i++) {
                    model[i][0] = ((Corporate) corporates[i]).getName();
                    model[i][1] = ((Corporate) corporates[i]).getAddress();
                }
            tblCorporates.setModel(new javax.swing.table.DefaultTableModel(model, headers));     
    }//GEN-LAST:event_btnShowCorporatesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowCorporates;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCorporates;
    private javax.swing.JLabel lblShowCorporates;
    private javax.swing.JTable tblCorporates;
    // End of variables declaration//GEN-END:variables
}
